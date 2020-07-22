package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.impl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import javax.annotation.PostConstruct;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.RowMapperClass;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.Sp;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BBankingWithdrawConditionsOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCWDWC3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCWDWC3Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCCWC4Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCCWC4Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICWDWC2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICWDWC2Response;

@Repository
public class BBankingWithdrawConditionsOperationDaoImpl implements BBankingWithdrawConditionsOperationDao {
	private SimpleJdbcCall egcwdwc3sjc;
	private SimpleJdbcCall eicccwc4sjc;
	private SimpleJdbcCall eicwdwc2sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGCWDWC3sjc() {
		egcwdwc3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCWDWC3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_USRBRANCH", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_ACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_EXTCUSTID", Types.DECIMAL),
				new SqlOutParameter("PO_CNDDESC", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egcwdwc3sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEICCCWC4sjc() {
		eicccwc4sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EICCCWC4)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_ETRNSSTATUS", Types.SMALLINT),
				new SqlParameter("PI_USRBRANCH", Types.INTEGER),
				new SqlParameter("PI_ACCNO", Types.DECIMAL),
				new SqlParameter("PI_OPERATIONID", Types.VARCHAR)
			);
	}
	private void initEICWDWC2sjc() {
		eicwdwc2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EICWDWC2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_CONFIRMTYPE", Types.SMALLINT),
				new SqlParameter("PI_CATEGORYCODE", Types.SMALLINT),
				new SqlParameter("PI_TOTALCATSIGN", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_PINTCUSTID", Types.INTEGER),
				new SqlParameter("PI_EXPIREDATE", Types.INTEGER),
				new SqlParameter("PI_NATIONALCODE", Types.VARCHAR),
				new SqlParameter("PI_OPERATIONID", Types.VARCHAR),
				new SqlParameter("PI_NAME", Types.VARCHAR),
				new SqlParameter("PI_FAMILY", Types.VARCHAR)
			);
	}
	@PostConstruct
	private void init() {
		initEGCWDWC3sjc();
		initEICCCWC4sjc();
		initEICWDWC2sjc();
	}
	public EGCWDWC3Response EGCWDWC3(EGCWDWC3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_USRBRANCH", request.getUsrbranch());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egcwdwc3sjc.execute(inParamMap);
	
		EGCWDWC3Response response = new EGCWDWC3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setAccno((result.get("PO_ACCNO") == null) ? null : new BigDecimal(result.get("PO_ACCNO").toString()).setScale(0));
			response.setExtcustid((result.get("PO_EXTCUSTID") == null) ? null : new BigDecimal(result.get("PO_EXTCUSTID").toString()).setScale(0));
			response.setCnddesc((result.get("PO_CNDDESC") == null) ? null : result.get("PO_CNDDESC").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EICCCWC4Response EICCCWC4(EICCCWC4Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_ETRNSSTATUS", request.getEtrnsstatus());
		inParamMap.put("PI_USRBRANCH", request.getUsrbranch());
		inParamMap.put("PI_ACCNO", request.getAccno());
		inParamMap.put("PI_OPERATIONID", AppUtil.convert1256To1252(request.getOperationid()));
	
		Map<String, Object> result = eicccwc4sjc.execute(inParamMap);
	
		EICCCWC4Response response = new EICCCWC4Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
	public EICWDWC2Response EICWDWC2(EICWDWC2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_CONFIRMTYPE", request.getConfirmtype());
		inParamMap.put("PI_CATEGORYCODE", request.getCategorycode());
		inParamMap.put("PI_TOTALCATSIGN", request.getTotalcatsign());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_PINTCUSTID", request.getPintcustid());
		inParamMap.put("PI_EXPIREDATE", request.getExpiredate());
		inParamMap.put("PI_NATIONALCODE", AppUtil.convert1256To1252(request.getNationalcode()));
		inParamMap.put("PI_OPERATIONID", AppUtil.convert1256To1252(request.getOperationid()));
		inParamMap.put("PI_NAME", AppUtil.convert1256To1252(request.getName()));
		inParamMap.put("PI_FAMILY", AppUtil.convert1256To1252(request.getFamily()));
	
		Map<String, Object> result = eicwdwc2sjc.execute(inParamMap);
	
		EICWDWC2Response response = new EICWDWC2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
}

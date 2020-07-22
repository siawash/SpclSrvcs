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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BBankingCustomerAmntOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBCSAM1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBCSAM1Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUACSMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUACSMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;

@Repository
public class BBankingCustomerAmntOperationDaoImpl implements BBankingCustomerAmntOperationDao {
	private SimpleJdbcCall egbcsam1sjc;
	private SimpleJdbcCall euacsmn2sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGBCSAM1sjc() {
		egbcsam1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBCSAM1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICETYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_STEP", Types.SMALLINT),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_ACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_OWNERNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egbcsam1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEUACSMN2sjc() {
		euacsmn2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUACSMN2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICECODE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_ACCNO", Types.DECIMAL),
				new SqlParameter("PI_MAXPAYAMNT", Types.DECIMAL),
				new SqlParameter("PI_USERID", Types.VARCHAR)
			);
	}
	@PostConstruct
	private void init() {
		initEGBCSAM1sjc();
		initEUACSMN2sjc();
	}
	public EGBCSAM1Response EGBCSAM1(EGBCSAM1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICETYPE", request.getServicetype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egbcsam1sjc.execute(inParamMap);
	
		EGBCSAM1Response response = new EGBCSAM1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setStep((result.get("PO_STEP") == null) ? null : Short.valueOf(result.get("PO_STEP").toString()));
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setAccno((result.get("PO_ACCNO") == null) ? null : new BigDecimal(result.get("PO_ACCNO").toString()).setScale(0));
			response.setOwnername((result.get("PO_OWNERNAME") == null) ? null : result.get("PO_OWNERNAME").toString());
	
			response.setResultset0(result.get("resultset0"));
		//} else {
			response.setStep(Short.valueOf(result.get("PO_STEP").toString()));
		//}
	
		return response;
	}
	public EUACSMN2Response EUACSMN2(EUACSMN2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICECODE", request.getServicecode());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_ACCNO", request.getAccno());
		inParamMap.put("PI_MAXPAYAMNT", request.getMaxpayamnt());
		inParamMap.put("PI_USERID", AppUtil.convert1256To1252(request.getUserid()));
	
		Map<String, Object> result = euacsmn2sjc.execute(inParamMap);
	
		EUACSMN2Response response = new EUACSMN2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
}

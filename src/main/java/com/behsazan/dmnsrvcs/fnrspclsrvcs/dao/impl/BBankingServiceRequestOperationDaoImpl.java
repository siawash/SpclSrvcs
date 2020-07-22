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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BBankingServiceRequestOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBASG2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBASG2Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSS2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSS2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGBS1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGBS1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGES1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGES1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBSEB1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBSEB1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIIASGN7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIIASGN7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUENTBK3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUENTBK3Response;

@Repository
public class BBankingServiceRequestOperationDaoImpl implements BBankingServiceRequestOperationDao {
	private SimpleJdbcCall egbbasg2sjc;
	private SimpleJdbcCall egbbcss2sjc;
	private SimpleJdbcCall egbbgbs1sjc;
	private SimpleJdbcCall egbbges1sjc;
	private SimpleJdbcCall egbbseb1sjc;
	private SimpleJdbcCall eiiasgn7sjc;
	private SimpleJdbcCall euentbk3sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGBBASG2sjc() {
		egbbasg2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBBASG2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL)
			);
		egbbasg2sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGBBCSS2sjc() {
		egbbcss2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBBCSS2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_ACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_NATIONALCODE", Types.DECIMAL),
				new SqlOutParameter("PO_OWNERNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egbbcss2sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGBBGBS1sjc() {
		egbbgbs1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBBGBS1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER)
			);
		egbbgbs1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGBBGES1sjc() {
		egbbges1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBBGES1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_OWNERNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egbbges1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGBBSEB1sjc() {
		egbbseb1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBBSEB1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICECODE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_FROMDATE", Types.INTEGER),
				new SqlParameter("PI_TODATE", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL)
			);
		egbbseb1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEIIASGN7sjc() {
		eiiasgn7sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EIIASGN7)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICEGROUPCODE", Types.SMALLINT),
				new SqlParameter("PI_SERVICECODE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_SETSERVICEDATE", Types.INTEGER),
				new SqlParameter("PI_LASTROWFLAG", Types.INTEGER),
				new SqlParameter("PI_EXPIREDATE", Types.INTEGER),
				new SqlParameter("PI_STARTDATE", Types.INTEGER),
				new SqlParameter("PI_NATIONALCODE", Types.DECIMAL),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlParameter("PI_COMMISIONFEE", Types.DECIMAL),
				new SqlParameter("PI_TOTALCOMMISIONFEE", Types.DECIMAL),
				new SqlParameter("PI_USERID", Types.CHAR),
				new SqlParameter("PI_COMPANYNAME", Types.VARCHAR),
				new SqlOutParameter("PO_FOLLOWID", Types.DECIMAL)
			);
	}
	private void initEUENTBK3sjc() {
		euentbk3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUENTBK3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICEGROUPCODE", Types.SMALLINT),
				new SqlParameter("PI_SERVICECODE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_EXPIREDATE", Types.INTEGER),
				new SqlParameter("PI_STARTDATE", Types.INTEGER),
				new SqlParameter("PI_LASTROWFLAG", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlParameter("PI_COMMISIONFEE", Types.DECIMAL),
				new SqlParameter("PI_TOTALCOMMISIONFEE", Types.DECIMAL),
				new SqlParameter("PI_USERID", Types.VARCHAR),
				new SqlOutParameter("PO_FOLLOWID", Types.DECIMAL)
			);
	}
	@PostConstruct
	private void init() {
		initEGBBASG2sjc();
		initEGBBCSS2sjc();
		initEGBBGBS1sjc();
		initEGBBGES1sjc();
		initEGBBSEB1sjc();
		initEIIASGN7sjc();
		initEUENTBK3sjc();
	}
	public EGBBASG2Response EGBBASG2(EGBBASG2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egbbasg2sjc.execute(inParamMap);
	
		EGBBASG2Response response = new EGBBASG2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGBBCSS2Response EGBBCSS2(EGBBCSS2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egbbcss2sjc.execute(inParamMap);
	
		EGBBCSS2Response response = new EGBBCSS2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setAccno((result.get("PO_ACCNO") == null) ? null : new BigDecimal(result.get("PO_ACCNO").toString()).setScale(0));
			response.setNationalcode((result.get("PO_NATIONALCODE") == null) ? null : new BigDecimal(result.get("PO_NATIONALCODE").toString()).setScale(0));
			response.setOwnername((result.get("PO_OWNERNAME") == null) ? null : result.get("PO_OWNERNAME").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGBBGBS1Response EGBBGBS1(EGBBGBS1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
	
		Map<String, Object> result = egbbgbs1sjc.execute(inParamMap);
	
		EGBBGBS1Response response = new EGBBGBS1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGBBGES1Response EGBBGES1(EGBBGES1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egbbges1sjc.execute(inParamMap);
	
		EGBBGES1Response response = new EGBBGES1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setOwnername((result.get("PO_OWNERNAME") == null) ? null : result.get("PO_OWNERNAME").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGBBSEB1Response EGBBSEB1(EGBBSEB1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICECODE", request.getServicecode());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_FROMDATE", request.getFromdate());
		inParamMap.put("PI_TODATE", request.getTodate());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egbbseb1sjc.execute(inParamMap);
	
		EGBBSEB1Response response = new EGBBSEB1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EIIASGN7Response EIIASGN7(EIIASGN7Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICEGROUPCODE", request.getServicegroupcode());
		inParamMap.put("PI_SERVICECODE", request.getServicecode());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_SETSERVICEDATE", request.getSetservicedate());
		inParamMap.put("PI_LASTROWFLAG", request.getLastrowflag());
		inParamMap.put("PI_EXPIREDATE", request.getExpiredate());
		inParamMap.put("PI_STARTDATE", request.getStartdate());
		inParamMap.put("PI_NATIONALCODE", request.getNationalcode());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
		inParamMap.put("PI_COMMISIONFEE", request.getCommisionfee());
		inParamMap.put("PI_TOTALCOMMISIONFEE", request.getTotalcommisionfee());
		inParamMap.put("PI_USERID", AppUtil.convert1256To1252(request.getUserid()));
		inParamMap.put("PI_COMPANYNAME", AppUtil.convert1256To1252(request.getCompanyname()));
	
		Map<String, Object> result = eiiasgn7sjc.execute(inParamMap);
	
		EIIASGN7Response response = new EIIASGN7Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setFollowid((result.get("PO_FOLLOWID") == null) ? null : new BigDecimal(result.get("PO_FOLLOWID").toString()).setScale(0));
		//}
	
		return response;
	}
	public EUENTBK3Response EUENTBK3(EUENTBK3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICEGROUPCODE", request.getServicegroupcode());
		inParamMap.put("PI_SERVICECODE", request.getServicecode());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_EXPIREDATE", request.getExpiredate());
		inParamMap.put("PI_STARTDATE", request.getStartdate());
		inParamMap.put("PI_LASTROWFLAG", request.getLastrowflag());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
		inParamMap.put("PI_COMMISIONFEE", request.getCommisionfee());
		inParamMap.put("PI_TOTALCOMMISIONFEE", request.getTotalcommisionfee());
		inParamMap.put("PI_USERID", AppUtil.convert1256To1252(request.getUserid()));
	
		Map<String, Object> result = euentbk3sjc.execute(inParamMap);
	
		EUENTBK3Response response = new EUENTBK3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setFollowid((result.get("PO_FOLLOWID") == null) ? null : new BigDecimal(result.get("PO_FOLLOWID").toString()).setScale(0));
		//}
	
		return response;
	}
}

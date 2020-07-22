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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BBankingServiceOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.AGBBGSS2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.AGBBGSS2Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDCREGP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDCREGP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCAO1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCAO1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSL2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSL2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBSREX1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBSREX1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACCL5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACCL5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCRREP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCRREP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUCUS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUCUS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBEXSR1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBEXSR1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBMAMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBMAMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICREGP3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICREGP3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERWDCND3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERWDCND3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCADMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCADMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCUST1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCUST1Response;

@Repository
public class BBankingServiceOperationDaoImpl implements BBankingServiceOperationDao {
	private SimpleJdbcCall agbbgss2sjc;
	private SimpleJdbcCall edcregp2sjc;
	private SimpleJdbcCall egbbcao1sjc;
	private SimpleJdbcCall egbbcsl2sjc;
	private SimpleJdbcCall egbsrex1sjc;
	private SimpleJdbcCall egcaccl5sjc;
	private SimpleJdbcCall egcrrep2sjc;
	private SimpleJdbcCall egcucus3sjc;
	private SimpleJdbcCall eibexsr1sjc;
	private SimpleJdbcCall eibmamn2sjc;
	private SimpleJdbcCall eicregp3sjc;
	private SimpleJdbcCall erwdcnd3sjc;
	private SimpleJdbcCall eucadmn2sjc;
	private SimpleJdbcCall euccust1sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initAGBBGSS2sjc() {
		agbbgss2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.AGBBGSS2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_CURRENTDATE", Types.INTEGER),
				new SqlOutParameter("PO_STEP", Types.SMALLINT),
				new SqlOutParameter("PO_BBSTATUS", Types.SMALLINT),
				new SqlOutParameter("PO_EXPDATE", Types.INTEGER),
				new SqlOutParameter("PO_CNTALLSERVICE", Types.DECIMAL),
				new SqlOutParameter("PO_CNTSERVICEEXP", Types.DECIMAL)
			);
	}
	private void initEDCREGP2sjc() {
		edcregp2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EDCREGP2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_USERTYPE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_ROWID", Types.INTEGER)
			);
	}
	private void initEGBBCAO1sjc() {
		egbbcao1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBBCAO1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ACCNO", Types.DECIMAL)
			);
		egbbcao1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGBBCSL2sjc() {
		egbbcsl2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBBCSL2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICESTATUS", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_CURRENTDATE", Types.INTEGER)
			);
		egbbcsl2sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGBSREX1sjc() {
		egbsrex1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBSREX1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICECODE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_FROMDATE", Types.INTEGER),
				new SqlParameter("PI_TODATE", Types.INTEGER)
			);
		egbsrex1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGCACCL5sjc() {
		egcaccl5sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCACCL5)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_USERTYPE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_ORGNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egcaccl5sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGCRREP2sjc() {
		egcrrep2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCRREP2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_USERTYPE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_TODATE", Types.INTEGER)
			);
		egcrrep2sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGCUCUS3sjc() {
		egcucus3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCUCUS3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_USERTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_TRNSTIME", Types.INTEGER),
				new SqlOutParameter("PO_TRNSDATE", Types.INTEGER)
			);
		egcucus3sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEIBEXSR1sjc() {
		eibexsr1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EIBEXSR1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICECODE", Types.SMALLINT),
				new SqlParameter("PI_LASTROWFLAG", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_CURRENTDATE", Types.INTEGER),
				new SqlParameter("PI_ACCNO", Types.DECIMAL),
				new SqlParameter("PI_COMMISIONFEE", Types.DECIMAL),
				new SqlParameter("PI_TOTALCOMMISIONFEE", Types.DECIMAL),
				new SqlOutParameter("PO_SETSERVICETIME", Types.INTEGER),
				new SqlOutParameter("PO_TRANSNO", Types.INTEGER),
				new SqlOutParameter("PO_STEP", Types.INTEGER),
				new SqlOutParameter("PO_FOLLOWID", Types.DECIMAL),
				new SqlOutParameter("PO_TOTALAMOUNT", Types.DECIMAL)
			);
	}
	private void initEIBMAMN2sjc() {
		eibmamn2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EIBMAMN2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_SERVICEGROUPCODE", Types.SMALLINT),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_SERVICECODE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_TODAY", Types.INTEGER),
				new SqlParameter("PI_ACCNO", Types.DECIMAL),
				new SqlParameter("PI_AMOUNT", Types.DECIMAL),
				new SqlOutParameter("PO_STEP", Types.INTEGER),
				new SqlOutParameter("PO_TODAYSUM", Types.DECIMAL)
			);
	}
	private void initEICREGP3sjc() {
		eicregp3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EICREGP3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_DURATION", Types.SMALLINT),
				new SqlParameter("PI_USERTYPE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_PAYSTARTDATE", Types.INTEGER),
				new SqlParameter("PI_EXPIREDATE", Types.INTEGER),
				new SqlParameter("PI_SOURCEACCNO", Types.DECIMAL),
				new SqlParameter("PI_TARGETEXTACCNO", Types.DECIMAL),
				new SqlParameter("PI_PAYAMNT", Types.DECIMAL),
				new SqlParameter("PI_PAYERID", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE1", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE2", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE3", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE4", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE5", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE6", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE7", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE8", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE9", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE10", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE11", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE12", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE13", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE14", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE15", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE16", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE17", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE18", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE19", Types.DECIMAL),
				new SqlParameter("PI_NATIONALCODE20", Types.DECIMAL),
				new SqlParameter("PI_TRANSDESC", Types.VARCHAR),
				new SqlOutParameter("PO_ROWID", Types.INTEGER),
				new SqlOutParameter("PO_STEP", Types.INTEGER)
			);
	}
	private void initERWDCND3sjc() {
		erwdcnd3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.ERWDCND3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_USERTYPE", Types.SMALLINT),
				new SqlParameter("PI_ACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_DRAFTSTATUS", Types.SMALLINT)
			);
		erwdcnd3sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEUCADMN2sjc() {
		eucadmn2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUCADMN2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_USERTYPE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_NEWUSERNAME", Types.VARCHAR)
			);
	}
	private void initEUCCUST1sjc() {
		euccust1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUCCUST1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_TRANSFERDATE", Types.INTEGER),
				new SqlParameter("PI_TRANSFERTIME", Types.INTEGER),
				new SqlOutParameter("PO_STEP", Types.INTEGER)
			);
	}
	@PostConstruct
	private void init() {
		initAGBBGSS2sjc();
		initEDCREGP2sjc();
		initEGBBCAO1sjc();
		initEGBBCSL2sjc();
		initEGBSREX1sjc();
		initEGCACCL5sjc();
		initEGCRREP2sjc();
		initEGCUCUS3sjc();
		initEIBEXSR1sjc();
		initEIBMAMN2sjc();
		initEICREGP3sjc();
		initERWDCND3sjc();
		initEUCADMN2sjc();
		initEUCCUST1sjc();
	}
	public AGBBGSS2Response AGBBGSS2(AGBBGSS2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_CURRENTDATE", request.getCurrentdate());
	
		Map<String, Object> result = agbbgss2sjc.execute(inParamMap);
	
		AGBBGSS2Response response = new AGBBGSS2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setStep((result.get("PO_STEP") == null) ? null : Short.valueOf(result.get("PO_STEP").toString()));
			response.setBbstatus((result.get("PO_BBSTATUS") == null) ? null : Short.valueOf(result.get("PO_BBSTATUS").toString()));
			response.setExpdate((result.get("PO_EXPDATE") == null) ? null : Integer.valueOf(result.get("PO_EXPDATE").toString()));
			response.setCntallservice((result.get("PO_CNTALLSERVICE") == null) ? null : new BigDecimal(result.get("PO_CNTALLSERVICE").toString()).setScale(0));
			response.setCntserviceexp((result.get("PO_CNTSERVICEEXP") == null) ? null : new BigDecimal(result.get("PO_CNTSERVICEEXP").toString()).setScale(0));
		//} else {
			response.setStep(Short.valueOf(result.get("PO_STEP").toString()));
		//}
	
		return response;
	}
	public EDCREGP2Response EDCREGP2(EDCREGP2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_USERTYPE", request.getUsertype());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_ROWID", request.getRowid());
	
		Map<String, Object> result = edcregp2sjc.execute(inParamMap);
	
		EDCREGP2Response response = new EDCREGP2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
	public EGBBCAO1Response EGBBCAO1(EGBBCAO1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ACCNO", request.getAccno());
	
		Map<String, Object> result = egbbcao1sjc.execute(inParamMap);
	
		EGBBCAO1Response response = new EGBBCAO1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGBBCSL2Response EGBBCSL2(EGBBCSL2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICESTATUS", request.getServicestatus());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_CURRENTDATE", request.getCurrentdate());
	
		Map<String, Object> result = egbbcsl2sjc.execute(inParamMap);
	
		EGBBCSL2Response response = new EGBBCSL2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGBSREX1Response EGBSREX1(EGBSREX1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICECODE", request.getServicecode());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_FROMDATE", request.getFromdate());
		inParamMap.put("PI_TODATE", request.getTodate());
	
		Map<String, Object> result = egbsrex1sjc.execute(inParamMap);
	
		EGBSREX1Response response = new EGBSREX1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGCACCL5Response EGCACCL5(EGCACCL5Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_USERTYPE", request.getUsertype());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
	
		Map<String, Object> result = egcaccl5sjc.execute(inParamMap);
	
		EGCACCL5Response response = new EGCACCL5Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setOrgname((result.get("PO_ORGNAME") == null) ? null : result.get("PO_ORGNAME").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGCRREP2Response EGCRREP2(EGCRREP2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_USERTYPE", request.getUsertype());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_TODATE", request.getTodate());
	
		Map<String, Object> result = egcrrep2sjc.execute(inParamMap);
	
		EGCRREP2Response response = new EGCRREP2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGCUCUS3Response EGCUCUS3(EGCUCUS3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_USERTYPE", request.getUsertype());
	
		Map<String, Object> result = egcucus3sjc.execute(inParamMap);
	
		EGCUCUS3Response response = new EGCUCUS3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setTrnstime((result.get("PO_TRNSTIME") == null) ? null : Integer.valueOf(result.get("PO_TRNSTIME").toString()));
			response.setTrnsdate((result.get("PO_TRNSDATE") == null) ? null : Integer.valueOf(result.get("PO_TRNSDATE").toString()));
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EIBEXSR1Response EIBEXSR1(EIBEXSR1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICECODE", request.getServicecode());
		inParamMap.put("PI_LASTROWFLAG", request.getLastrowflag());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_CURRENTDATE", request.getCurrentdate());
		inParamMap.put("PI_ACCNO", request.getAccno());
		inParamMap.put("PI_COMMISIONFEE", request.getCommisionfee());
		inParamMap.put("PI_TOTALCOMMISIONFEE", request.getTotalcommisionfee());
	
		Map<String, Object> result = eibexsr1sjc.execute(inParamMap);
	
		EIBEXSR1Response response = new EIBEXSR1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setSetservicetime((result.get("PO_SETSERVICETIME") == null) ? null : Integer.valueOf(result.get("PO_SETSERVICETIME").toString()));
			response.setTransno((result.get("PO_TRANSNO") == null) ? null : Integer.valueOf(result.get("PO_TRANSNO").toString()));
			response.setStep((result.get("PO_STEP") == null) ? null : Integer.valueOf(result.get("PO_STEP").toString()));
			response.setFollowid((result.get("PO_FOLLOWID") == null) ? null : new BigDecimal(result.get("PO_FOLLOWID").toString()).setScale(0));
			response.setTotalamount((result.get("PO_TOTALAMOUNT") == null) ? null : new BigDecimal(result.get("PO_TOTALAMOUNT").toString()).setScale(0));
		//} else {
			response.setStep(Integer.valueOf(result.get("PO_STEP").toString()));
		//}
	
		return response;
	}
	public EIBMAMN2Response EIBMAMN2(EIBMAMN2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_SERVICEGROUPCODE", request.getServicegroupcode());
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_SERVICECODE", request.getServicecode());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_TODAY", request.getToday());
		inParamMap.put("PI_ACCNO", request.getAccno());
		inParamMap.put("PI_AMOUNT", request.getAmount());
	
		Map<String, Object> result = eibmamn2sjc.execute(inParamMap);
	
		EIBMAMN2Response response = new EIBMAMN2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setStep((result.get("PO_STEP") == null) ? null : Integer.valueOf(result.get("PO_STEP").toString()));
			response.setTodaysum((result.get("PO_TODAYSUM") == null) ? null : new BigDecimal(result.get("PO_TODAYSUM").toString()).setScale(0));
		//} else {
			response.setStep(Integer.valueOf(result.get("PO_STEP").toString()));
		//}
	
		return response;
	}
	public EICREGP3Response EICREGP3(EICREGP3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_DURATION", request.getDuration());
		inParamMap.put("PI_USERTYPE", request.getUsertype());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_PAYSTARTDATE", request.getPaystartdate());
		inParamMap.put("PI_EXPIREDATE", request.getExpiredate());
		inParamMap.put("PI_SOURCEACCNO", request.getSourceaccno());
		inParamMap.put("PI_TARGETEXTACCNO", request.getTargetextaccno());
		inParamMap.put("PI_PAYAMNT", request.getPayamnt());
		inParamMap.put("PI_PAYERID", request.getPayerid());
		inParamMap.put("PI_NATIONALCODE1", request.getNationalcode1());
		inParamMap.put("PI_NATIONALCODE2", request.getNationalcode2());
		inParamMap.put("PI_NATIONALCODE3", request.getNationalcode3());
		inParamMap.put("PI_NATIONALCODE4", request.getNationalcode4());
		inParamMap.put("PI_NATIONALCODE5", request.getNationalcode5());
		inParamMap.put("PI_NATIONALCODE6", request.getNationalcode6());
		inParamMap.put("PI_NATIONALCODE7", request.getNationalcode7());
		inParamMap.put("PI_NATIONALCODE8", request.getNationalcode8());
		inParamMap.put("PI_NATIONALCODE9", request.getNationalcode9());
		inParamMap.put("PI_NATIONALCODE10", request.getNationalcode10());
		inParamMap.put("PI_NATIONALCODE11", request.getNationalcode11());
		inParamMap.put("PI_NATIONALCODE12", request.getNationalcode12());
		inParamMap.put("PI_NATIONALCODE13", request.getNationalcode13());
		inParamMap.put("PI_NATIONALCODE14", request.getNationalcode14());
		inParamMap.put("PI_NATIONALCODE15", request.getNationalcode15());
		inParamMap.put("PI_NATIONALCODE16", request.getNationalcode16());
		inParamMap.put("PI_NATIONALCODE17", request.getNationalcode17());
		inParamMap.put("PI_NATIONALCODE18", request.getNationalcode18());
		inParamMap.put("PI_NATIONALCODE19", request.getNationalcode19());
		inParamMap.put("PI_NATIONALCODE20", request.getNationalcode20());
		inParamMap.put("PI_TRANSDESC", AppUtil.convert1256To1252(request.getTransdesc()));
	
		Map<String, Object> result = eicregp3sjc.execute(inParamMap);
	
		EICREGP3Response response = new EICREGP3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setRowid((result.get("PO_ROWID") == null) ? null : Integer.valueOf(result.get("PO_ROWID").toString()));
			response.setStep((result.get("PO_STEP") == null) ? null : Integer.valueOf(result.get("PO_STEP").toString()));
		//} else {
			response.setStep(Integer.valueOf(result.get("PO_STEP").toString()));
		//}
	
		return response;
	}
	public ERWDCND3Response ERWDCND3(ERWDCND3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_USERTYPE", request.getUsertype());
		inParamMap.put("PI_ACCNO", request.getAccno());
	
		Map<String, Object> result = erwdcnd3sjc.execute(inParamMap);
	
		ERWDCND3Response response = new ERWDCND3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setDraftstatus((result.get("PO_DRAFTSTATUS") == null) ? null : Short.valueOf(result.get("PO_DRAFTSTATUS").toString()));
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EUCADMN2Response EUCADMN2(EUCADMN2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_USERTYPE", request.getUsertype());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_NEWUSERNAME", AppUtil.convert1256To1252(request.getNewusername()));
	
		Map<String, Object> result = eucadmn2sjc.execute(inParamMap);
	
		EUCADMN2Response response = new EUCADMN2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
	public EUCCUST1Response EUCCUST1(EUCCUST1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_TRANSFERDATE", request.getTransferdate());
		inParamMap.put("PI_TRANSFERTIME", request.getTransfertime());
	
		Map<String, Object> result = euccust1sjc.execute(inParamMap);
	
		EUCCUST1Response response = new EUCCUST1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setStep((result.get("PO_STEP") == null) ? null : Integer.valueOf(result.get("PO_STEP").toString()));
		//} else {
			response.setStep(Integer.valueOf(result.get("PO_STEP").toString()));
		//}
	
		return response;
	}
}

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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.CustomerservicesMonitorDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCSRVC3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCSRVC3Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUSTS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUSTS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGSRVIF1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGSRVIF1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERCRCST3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERCRCST3Response;

@Repository
public class CustomerservicesMonitorDaoImpl implements CustomerservicesMonitorDao {
	private SimpleJdbcCall egcsrvc3sjc;
	private SimpleJdbcCall egcusts3sjc;
	private SimpleJdbcCall egsrvif1sjc;
	private SimpleJdbcCall ercrcst3sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGCSRVC3sjc() {
		egcsrvc3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCSRVC3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlOutParameter("PO_TYPEX", Types.SMALLINT),
				new SqlOutParameter("PO_PRCERRORCODE", Types.INTEGER),
				new SqlOutParameter("PO_MRETCHQCOUNT", Types.INTEGER),
				new SqlOutParameter("PO_RETCHQCOUNT", Types.INTEGER),
				new SqlOutParameter("PO_PRCCSTMRID", Types.DECIMAL),
				new SqlOutParameter("PO_IDCODE", Types.DECIMAL),
				new SqlOutParameter("PO_MSARRESIDAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_SARRESIDAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MMOAVAGHAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MMASHKOOKAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MALLDBTAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MOAVAGHAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MASHKOOKAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_ALLDBTMAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MOBILENO", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egcsrvc3sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGCUSTS3sjc() {
		egcusts3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCUSTS3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_TODAY", Types.INTEGER),
				new SqlOutParameter("PO_TYPEX", Types.SMALLINT),
				new SqlOutParameter("PO_CUSTTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_PRCERRORCODE", Types.INTEGER),
				new SqlOutParameter("PO_MRETCHQCOUNT", Types.INTEGER),
				new SqlOutParameter("PO_RETCHQCOUNT", Types.INTEGER),
				new SqlOutParameter("PO_IDCODE", Types.DECIMAL),
				new SqlOutParameter("PO_PRCCSTMRID", Types.DECIMAL),
				new SqlOutParameter("PO_VERIFCHQAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MSARRESIDAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_SARRESIDAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MMOAVAGHAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MMASHKOOKAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MALLDBTAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MOAVAGHAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MASHKOOKAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_ALLDBTMAMNT", Types.DECIMAL),
				new SqlOutParameter("PO_MOBILENO", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_EMAIL", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_SIGNDATA", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egcusts3sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGSRVIF1sjc() {
		egsrvif1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGSRVIF1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT)
			);
		egsrvif1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initERCRCST3sjc() {
		ercrcst3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.ERCRCST3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_EXTCUSTID", Types.DECIMAL),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_CURRENTGRADE", Types.SMALLINT),
				new SqlOutParameter("PO_AUTHORITY", Types.SMALLINT),
				new SqlOutParameter("PO_BRANCH", Types.INTEGER),
				new SqlOutParameter("PO_MOBILENO", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_EXTCUSTIDORACCNO", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_OWNERNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_EMAIL", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		ercrcst3sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	@PostConstruct
	private void init() {
		initEGCSRVC3sjc();
		initEGCUSTS3sjc();
		initEGSRVIF1sjc();
		initERCRCST3sjc();
	}
	public EGCSRVC3Response EGCSRVC3(EGCSRVC3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
	
		Map<String, Object> result = egcsrvc3sjc.execute(inParamMap);
	
		EGCSRVC3Response response = new EGCSRVC3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setTypex((result.get("PO_TYPEX") == null) ? null : Short.valueOf(result.get("PO_TYPEX").toString()));
			response.setPrcerrorcode((result.get("PO_PRCERRORCODE") == null) ? null : Integer.valueOf(result.get("PO_PRCERRORCODE").toString()));
			response.setMretchqcount((result.get("PO_MRETCHQCOUNT") == null) ? null : Integer.valueOf(result.get("PO_MRETCHQCOUNT").toString()));
			response.setRetchqcount((result.get("PO_RETCHQCOUNT") == null) ? null : Integer.valueOf(result.get("PO_RETCHQCOUNT").toString()));
			response.setPrccstmrid((result.get("PO_PRCCSTMRID") == null) ? null : new BigDecimal(result.get("PO_PRCCSTMRID").toString()).setScale(0));
			response.setIdcode((result.get("PO_IDCODE") == null) ? null : new BigDecimal(result.get("PO_IDCODE").toString()).setScale(0));
			response.setMsarresidamnt((result.get("PO_MSARRESIDAMNT") == null) ? null : new BigDecimal(result.get("PO_MSARRESIDAMNT").toString()).setScale(0));
			response.setSarresidamnt((result.get("PO_SARRESIDAMNT") == null) ? null : new BigDecimal(result.get("PO_SARRESIDAMNT").toString()).setScale(0));
			response.setMmoavaghamnt((result.get("PO_MMOAVAGHAMNT") == null) ? null : new BigDecimal(result.get("PO_MMOAVAGHAMNT").toString()).setScale(0));
			response.setMmashkookamnt((result.get("PO_MMASHKOOKAMNT") == null) ? null : new BigDecimal(result.get("PO_MMASHKOOKAMNT").toString()).setScale(0));
			response.setMalldbtamnt((result.get("PO_MALLDBTAMNT") == null) ? null : new BigDecimal(result.get("PO_MALLDBTAMNT").toString()).setScale(0));
			response.setMoavaghamnt((result.get("PO_MOAVAGHAMNT") == null) ? null : new BigDecimal(result.get("PO_MOAVAGHAMNT").toString()).setScale(0));
			response.setMashkookamnt((result.get("PO_MASHKOOKAMNT") == null) ? null : new BigDecimal(result.get("PO_MASHKOOKAMNT").toString()).setScale(0));
			response.setAlldbtmamnt((result.get("PO_ALLDBTMAMNT") == null) ? null : new BigDecimal(result.get("PO_ALLDBTMAMNT").toString()).setScale(0));
			response.setMobileno((result.get("PO_MOBILENO") == null) ? null : result.get("PO_MOBILENO").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGCUSTS3Response EGCUSTS3(EGCUSTS3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_TODAY", request.getToday());
	
		Map<String, Object> result = egcusts3sjc.execute(inParamMap);
	
		EGCUSTS3Response response = new EGCUSTS3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setTypex((result.get("PO_TYPEX") == null) ? null : Short.valueOf(result.get("PO_TYPEX").toString()));
			response.setCusttype((result.get("PO_CUSTTYPE") == null) ? null : Short.valueOf(result.get("PO_CUSTTYPE").toString()));
			response.setPrcerrorcode((result.get("PO_PRCERRORCODE") == null) ? null : Integer.valueOf(result.get("PO_PRCERRORCODE").toString()));
			response.setMretchqcount((result.get("PO_MRETCHQCOUNT") == null) ? null : Integer.valueOf(result.get("PO_MRETCHQCOUNT").toString()));
			response.setRetchqcount((result.get("PO_RETCHQCOUNT") == null) ? null : Integer.valueOf(result.get("PO_RETCHQCOUNT").toString()));
			response.setIdcode((result.get("PO_IDCODE") == null) ? null : new BigDecimal(result.get("PO_IDCODE").toString()).setScale(0));
			response.setPrccstmrid((result.get("PO_PRCCSTMRID") == null) ? null : new BigDecimal(result.get("PO_PRCCSTMRID").toString()).setScale(0));
			response.setVerifchqamnt((result.get("PO_VERIFCHQAMNT") == null) ? null : new BigDecimal(result.get("PO_VERIFCHQAMNT").toString()).setScale(0));
			response.setMsarresidamnt((result.get("PO_MSARRESIDAMNT") == null) ? null : new BigDecimal(result.get("PO_MSARRESIDAMNT").toString()).setScale(0));
			response.setSarresidamnt((result.get("PO_SARRESIDAMNT") == null) ? null : new BigDecimal(result.get("PO_SARRESIDAMNT").toString()).setScale(0));
			response.setMmoavaghamnt((result.get("PO_MMOAVAGHAMNT") == null) ? null : new BigDecimal(result.get("PO_MMOAVAGHAMNT").toString()).setScale(0));
			response.setMmashkookamnt((result.get("PO_MMASHKOOKAMNT") == null) ? null : new BigDecimal(result.get("PO_MMASHKOOKAMNT").toString()).setScale(0));
			response.setMalldbtamnt((result.get("PO_MALLDBTAMNT") == null) ? null : new BigDecimal(result.get("PO_MALLDBTAMNT").toString()).setScale(0));
			response.setMoavaghamnt((result.get("PO_MOAVAGHAMNT") == null) ? null : new BigDecimal(result.get("PO_MOAVAGHAMNT").toString()).setScale(0));
			response.setMashkookamnt((result.get("PO_MASHKOOKAMNT") == null) ? null : new BigDecimal(result.get("PO_MASHKOOKAMNT").toString()).setScale(0));
			response.setAlldbtmamnt((result.get("PO_ALLDBTMAMNT") == null) ? null : new BigDecimal(result.get("PO_ALLDBTMAMNT").toString()).setScale(0));
			response.setMobileno((result.get("PO_MOBILENO") == null) ? null : result.get("PO_MOBILENO").toString());
			response.setEmail((result.get("PO_EMAIL") == null) ? null : result.get("PO_EMAIL").toString());
			response.setSigndata((result.get("PO_SIGNDATA") == null) ? null : result.get("PO_SIGNDATA").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGSRVIF1Response EGSRVIF1(EGSRVIF1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
	
		Map<String, Object> result = egsrvif1sjc.execute(inParamMap);
	
		EGSRVIF1Response response = new EGSRVIF1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public ERCRCST3Response ERCRCST3(ERCRCST3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_EXTCUSTID", request.getExtcustid());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = ercrcst3sjc.execute(inParamMap);
	
		ERCRCST3Response response = new ERCRCST3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setCurrentgrade((result.get("PO_CURRENTGRADE") == null) ? null : Short.valueOf(result.get("PO_CURRENTGRADE").toString()));
			response.setAuthority((result.get("PO_AUTHORITY") == null) ? null : Short.valueOf(result.get("PO_AUTHORITY").toString()));
			response.setBranch((result.get("PO_BRANCH") == null) ? null : Integer.valueOf(result.get("PO_BRANCH").toString()));
			response.setMobileno((result.get("PO_MOBILENO") == null) ? null : result.get("PO_MOBILENO").toString());
			response.setExtcustidoraccno((result.get("PO_EXTCUSTIDORACCNO") == null) ? null : result.get("PO_EXTCUSTIDORACCNO").toString());
			response.setOwnername((result.get("PO_OWNERNAME") == null) ? null : result.get("PO_OWNERNAME").toString());
			response.setEmail((result.get("PO_EMAIL") == null) ? null : result.get("PO_EMAIL").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
}

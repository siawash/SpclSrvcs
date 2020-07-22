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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.CustomerInformationMonitorDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUSI7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUSI7Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUST5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUST5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCOGAC5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCOGAC5Response;

@Repository
public class CustomerInformationMonitorDaoImpl implements CustomerInformationMonitorDao {
	private SimpleJdbcCall egccusi7sjc;
	private SimpleJdbcCall egccust5sjc;
	private SimpleJdbcCall egcogac5sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGCCUSI7sjc() {
		egccusi7sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCCUSI7)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ACTION", Types.SMALLINT),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_TYPEX", Types.SMALLINT),
				new SqlOutParameter("PO_CUSTTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_BRANCH", Types.INTEGER),
				new SqlOutParameter("PO_IDCODE", Types.DECIMAL),
				new SqlOutParameter("PO_STATUSX", Types.CHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_MOBILENO", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_EXTCUSTID", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_CUSTOMERUID", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_ACCDESC", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_CUSTSPEC", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egccusi7sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGCCUST5sjc() {
		egccust5sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCCUST5)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlParameter("PI_EXTCUSTID", Types.DECIMAL),
				new SqlOutParameter("PO_TYPEX", Types.SMALLINT),
				new SqlOutParameter("PO_CURRENTGRADE", Types.SMALLINT),
				new SqlOutParameter("PO_CUSTTYPE", Types.DECIMAL),
				new SqlOutParameter("PO_CNDDESC", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egccust5sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGCOGAC5sjc() {
		egcogac5sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCOGAC5)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ACTION", Types.SMALLINT),
				new SqlParameter("PI_TODAY", Types.INTEGER),
				new SqlParameter("PI_USRBRANCH", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_MANDCOUNT", Types.SMALLINT),
				new SqlOutParameter("PO_OPTCOUNT", Types.SMALLINT),
				new SqlOutParameter("PO_ACCTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_TYPEX", Types.SMALLINT),
				new SqlOutParameter("PO_CUSTTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_SRVSTATUS", Types.SMALLINT),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_IDCODE", Types.DECIMAL),
				new SqlOutParameter("PO_ACCNO", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_EXTCUSTID", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_CUSTSPEC", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_CNDDESC", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egcogac5sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	@PostConstruct
	private void init() {
		initEGCCUSI7sjc();
		initEGCCUST5sjc();
		initEGCOGAC5sjc();
	}
	public EGCCUSI7Response EGCCUSI7(EGCCUSI7Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ACTION", request.getAction());
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egccusi7sjc.execute(inParamMap);
	
		EGCCUSI7Response response = new EGCCUSI7Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setTypex((result.get("PO_TYPEX") == null) ? null : Short.valueOf(result.get("PO_TYPEX").toString()));
			response.setCusttype((result.get("PO_CUSTTYPE") == null) ? null : Short.valueOf(result.get("PO_CUSTTYPE").toString()));
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setBranch((result.get("PO_BRANCH") == null) ? null : Integer.valueOf(result.get("PO_BRANCH").toString()));
			response.setIdcode((result.get("PO_IDCODE") == null) ? null : new BigDecimal(result.get("PO_IDCODE").toString()).setScale(0));
			response.setStatusx((result.get("PO_STATUSX") == null) ? null : result.get("PO_STATUSX").toString());
			response.setMobileno((result.get("PO_MOBILENO") == null) ? null : result.get("PO_MOBILENO").toString());
			response.setExtcustid((result.get("PO_EXTCUSTID") == null) ? null : result.get("PO_EXTCUSTID").toString());
			response.setCustomeruid((result.get("PO_CUSTOMERUID") == null) ? null : result.get("PO_CUSTOMERUID").toString());
			response.setAccdesc((result.get("PO_ACCDESC") == null) ? null : result.get("PO_ACCDESC").toString());
			response.setCustspec((result.get("PO_CUSTSPEC") == null) ? null : result.get("PO_CUSTSPEC").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGCCUST5Response EGCCUST5(EGCCUST5Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
		inParamMap.put("PI_EXTCUSTID", request.getExtcustid());
	
		Map<String, Object> result = egccust5sjc.execute(inParamMap);
	
		EGCCUST5Response response = new EGCCUST5Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setTypex((result.get("PO_TYPEX") == null) ? null : Short.valueOf(result.get("PO_TYPEX").toString()));
			response.setCurrentgrade((result.get("PO_CURRENTGRADE") == null) ? null : Short.valueOf(result.get("PO_CURRENTGRADE").toString()));
			response.setCusttype((result.get("PO_CUSTTYPE") == null) ? null : new BigDecimal(result.get("PO_CUSTTYPE").toString()).setScale(0));
			response.setCnddesc((result.get("PO_CNDDESC") == null) ? null : result.get("PO_CNDDESC").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGCOGAC5Response EGCOGAC5(EGCOGAC5Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ACTION", request.getAction());
		inParamMap.put("PI_TODAY", request.getToday());
		inParamMap.put("PI_USRBRANCH", request.getUsrbranch());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egcogac5sjc.execute(inParamMap);
	
		EGCOGAC5Response response = new EGCOGAC5Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setMandcount((result.get("PO_MANDCOUNT") == null) ? null : Short.valueOf(result.get("PO_MANDCOUNT").toString()));
			response.setOptcount((result.get("PO_OPTCOUNT") == null) ? null : Short.valueOf(result.get("PO_OPTCOUNT").toString()));
			response.setAcctype((result.get("PO_ACCTYPE") == null) ? null : Short.valueOf(result.get("PO_ACCTYPE").toString()));
			response.setTypex((result.get("PO_TYPEX") == null) ? null : Short.valueOf(result.get("PO_TYPEX").toString()));
			response.setCusttype((result.get("PO_CUSTTYPE") == null) ? null : Short.valueOf(result.get("PO_CUSTTYPE").toString()));
			response.setSrvstatus((result.get("PO_SRVSTATUS") == null) ? null : Short.valueOf(result.get("PO_SRVSTATUS").toString()));
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setIdcode((result.get("PO_IDCODE") == null) ? null : new BigDecimal(result.get("PO_IDCODE").toString()).setScale(0));
			response.setAccno((result.get("PO_ACCNO") == null) ? null : result.get("PO_ACCNO").toString());
			response.setExtcustid((result.get("PO_EXTCUSTID") == null) ? null : result.get("PO_EXTCUSTID").toString());
			response.setCustspec((result.get("PO_CUSTSPEC") == null) ? null : result.get("PO_CUSTSPEC").toString());
			response.setCnddesc((result.get("PO_CNDDESC") == null) ? null : result.get("PO_CNDDESC").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
}

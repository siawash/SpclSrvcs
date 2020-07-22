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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.ChangeBBankingCustomerInfoOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGICHAC5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGICHAC5Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUICPSW3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUICPSW3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUISTCM3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUISTCM3Response;

@Repository
public class ChangeBBankingCustomerInfoOperationDaoImpl implements ChangeBBankingCustomerInfoOperationDao {
	private SimpleJdbcCall egichac5sjc;
	private SimpleJdbcCall euicpsw3sjc;
	private SimpleJdbcCall euistcm3sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGICHAC5sjc() {
		egichac5sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGICHAC5)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_BBSTATUS", Types.SMALLINT),
				new SqlOutParameter("PO_SETSERVICEDATE", Types.INTEGER),
				new SqlOutParameter("PO_SETSERVICETIME", Types.INTEGER),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_CUSTTYPE", Types.DECIMAL),
				new SqlOutParameter("PO_NATIONALCODE", Types.DECIMAL),
				new SqlOutParameter("PO_IDCODE", Types.DECIMAL),
				new SqlOutParameter("PO_ADMINUSERNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_OWNERNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
	}
	private void initEUICPSW3sjc() {
		euicpsw3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUICPSW3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_USERID", Types.CHAR),
				new SqlParameter("PI_ADMINUSERNAME", Types.VARCHAR),
				new SqlParameter("PI_ADMINPASS", Types.VARCHAR)
			);
	}
	private void initEUISTCM3sjc() {
		euistcm3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUISTCM3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_BBSTATUS", Types.SMALLINT),
				new SqlParameter("PI_ACTIONTYPE", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_NATIONALCODE", Types.DECIMAL),
				new SqlParameter("PI_USERID", Types.CHAR),
				new SqlParameter("PI_ADMINPASS", Types.VARCHAR),
				new SqlParameter("PI_ADMINUSERNAME", Types.VARCHAR)
			);
	}
	@PostConstruct
	private void init() {
		initEGICHAC5sjc();
		initEUICPSW3sjc();
		initEUISTCM3sjc();
	}
	public EGICHAC5Response EGICHAC5(EGICHAC5Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egichac5sjc.execute(inParamMap);
	
		EGICHAC5Response response = new EGICHAC5Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setBbstatus((result.get("PO_BBSTATUS") == null) ? null : Short.valueOf(result.get("PO_BBSTATUS").toString()));
			response.setSetservicedate((result.get("PO_SETSERVICEDATE") == null) ? null : Integer.valueOf(result.get("PO_SETSERVICEDATE").toString()));
			response.setSetservicetime((result.get("PO_SETSERVICETIME") == null) ? null : Integer.valueOf(result.get("PO_SETSERVICETIME").toString()));
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setCusttype((result.get("PO_CUSTTYPE") == null) ? null : new BigDecimal(result.get("PO_CUSTTYPE").toString()).setScale(0));
			response.setNationalcode((result.get("PO_NATIONALCODE") == null) ? null : new BigDecimal(result.get("PO_NATIONALCODE").toString()).setScale(0));
			response.setIdcode((result.get("PO_IDCODE") == null) ? null : new BigDecimal(result.get("PO_IDCODE").toString()).setScale(0));
			response.setAdminusername((result.get("PO_ADMINUSERNAME") == null) ? null : result.get("PO_ADMINUSERNAME").toString());
			response.setOwnername((result.get("PO_OWNERNAME") == null) ? null : result.get("PO_OWNERNAME").toString());
		//}
	
		return response;
	}
	public EUICPSW3Response EUICPSW3(EUICPSW3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_USERID", AppUtil.convert1256To1252(request.getUserid()));
		inParamMap.put("PI_ADMINUSERNAME", AppUtil.convert1256To1252(request.getAdminusername()));
		inParamMap.put("PI_ADMINPASS", AppUtil.convert1256To1252(request.getAdminpass()));
	
		Map<String, Object> result = euicpsw3sjc.execute(inParamMap);
	
		EUICPSW3Response response = new EUICPSW3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
	public EUISTCM3Response EUISTCM3(EUISTCM3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_BBSTATUS", request.getBbstatus());
		inParamMap.put("PI_ACTIONTYPE", request.getActiontype());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_NATIONALCODE", request.getNationalcode());
		inParamMap.put("PI_USERID", AppUtil.convert1256To1252(request.getUserid()));
		inParamMap.put("PI_ADMINPASS", AppUtil.convert1256To1252(request.getAdminpass()));
		inParamMap.put("PI_ADMINUSERNAME", AppUtil.convert1256To1252(request.getAdminusername()));
	
		Map<String, Object> result = euistcm3sjc.execute(inParamMap);
	
		EUISTCM3Response response = new EUISTCM3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
}

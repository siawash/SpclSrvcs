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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BranchOTPTOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUNLC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUNLC1Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGHCUST5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGHCUST5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCANCU1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCANCU1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCDTCU3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCDTCU3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCHNGS1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCHNGS1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;

@Repository
public class BranchOTPTOperationDaoImpl implements BranchOTPTOperationDao {
	private SimpleJdbcCall egcunlc1sjc;
	private SimpleJdbcCall eghcust5sjc;
	private SimpleJdbcCall eucancu1sjc;
	private SimpleJdbcCall eucdtcu3sjc;
	private SimpleJdbcCall euchngs1sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGCUNLC1sjc() {
		egcunlc1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCUNLC1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_CARDID", Types.INTEGER),
				new SqlOutParameter("PO_EXTCUSTID", Types.DECIMAL),
				new SqlOutParameter("PO_UNLOCKCODE", Types.CHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_OWNERNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
	}
	private void initEGHCUST5sjc() {
		eghcust5sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGHCUST5)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_OTPTYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_TCHECK", Types.SMALLINT),
				new SqlOutParameter("PO_ACCTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_CUSTTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_CARDTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_TSTATUS", Types.SMALLINT),
				new SqlOutParameter("PO_MSTATUS", Types.SMALLINT),
				new SqlOutParameter("PO_CARDID", Types.INTEGER),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_IMMIGRATIONNO", Types.INTEGER),
				new SqlOutParameter("PO_NATIONALCODE", Types.DECIMAL),
				new SqlOutParameter("PO_IDCODE", Types.DECIMAL),
				new SqlOutParameter("PO_MOBILENO", Types.CHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_PASSPORTNO", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_FATHER", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_OWNERNAME", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
	}
	private void initEUCANCU1sjc() {
		eucancu1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUCANCU1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_CARDTYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_CARDID", Types.INTEGER)
			);
	}
	private void initEUCDTCU3sjc() {
		eucdtcu3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUCDTCU3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_CARDTYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_CARDID", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_TSTATUS", Types.SMALLINT),
				new SqlOutParameter("PO_CUSTOMERSTATUS", Types.SMALLINT),
				new SqlOutParameter("PO_FOLLOWID", Types.DECIMAL)
			);
	}
	private void initEUCHNGS1sjc() {
		euchngs1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUCHNGS1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_OTPTYPE", Types.SMALLINT),
				new SqlParameter("PI_CARDTYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_CARDID", Types.INTEGER),
				new SqlParameter("PI_MOBILENO", Types.CHAR)
			);
	}
	@PostConstruct
	private void init() {
		initEGCUNLC1sjc();
		initEGHCUST5sjc();
		initEUCANCU1sjc();
		initEUCDTCU3sjc();
		initEUCHNGS1sjc();
	}
	public EGCUNLC1Response EGCUNLC1(EGCUNLC1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_CARDID", request.getCardid());
	
		Map<String, Object> result = egcunlc1sjc.execute(inParamMap);
	
		EGCUNLC1Response response = new EGCUNLC1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setExtcustid((result.get("PO_EXTCUSTID") == null) ? null : new BigDecimal(result.get("PO_EXTCUSTID").toString()).setScale(0));
			response.setUnlockcode((result.get("PO_UNLOCKCODE") == null) ? null : result.get("PO_UNLOCKCODE").toString());
			response.setOwnername((result.get("PO_OWNERNAME") == null) ? null : result.get("PO_OWNERNAME").toString());
		//}
	
		return response;
	}
	public EGHCUST5Response EGHCUST5(EGHCUST5Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_OTPTYPE", request.getOtptype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = eghcust5sjc.execute(inParamMap);
	
		EGHCUST5Response response = new EGHCUST5Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setTcheck((result.get("PO_TCHECK") == null) ? null : Short.valueOf(result.get("PO_TCHECK").toString()));
			response.setAcctype((result.get("PO_ACCTYPE") == null) ? null : Short.valueOf(result.get("PO_ACCTYPE").toString()));
			response.setCusttype((result.get("PO_CUSTTYPE") == null) ? null : Short.valueOf(result.get("PO_CUSTTYPE").toString()));
			response.setCardtype((result.get("PO_CARDTYPE") == null) ? null : Short.valueOf(result.get("PO_CARDTYPE").toString()));
			response.setTstatus((result.get("PO_TSTATUS") == null) ? null : Short.valueOf(result.get("PO_TSTATUS").toString()));
			response.setMstatus((result.get("PO_MSTATUS") == null) ? null : Short.valueOf(result.get("PO_MSTATUS").toString()));
			response.setCardid((result.get("PO_CARDID") == null) ? null : Integer.valueOf(result.get("PO_CARDID").toString()));
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setImmigrationno((result.get("PO_IMMIGRATIONNO") == null) ? null : Integer.valueOf(result.get("PO_IMMIGRATIONNO").toString()));
			response.setNationalcode((result.get("PO_NATIONALCODE") == null) ? null : new BigDecimal(result.get("PO_NATIONALCODE").toString()).setScale(0));
			response.setIdcode((result.get("PO_IDCODE") == null) ? null : new BigDecimal(result.get("PO_IDCODE").toString()).setScale(0));
			response.setMobileno((result.get("PO_MOBILENO") == null) ? null : result.get("PO_MOBILENO").toString());
			response.setPassportno((result.get("PO_PASSPORTNO") == null) ? null : result.get("PO_PASSPORTNO").toString());
			response.setFather((result.get("PO_FATHER") == null) ? null : result.get("PO_FATHER").toString());
			response.setOwnername((result.get("PO_OWNERNAME") == null) ? null : result.get("PO_OWNERNAME").toString());
		//}
	
		return response;
	}
	public EUCANCU1Response EUCANCU1(EUCANCU1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_CARDTYPE", request.getCardtype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_CARDID", request.getCardid());
	
		Map<String, Object> result = eucancu1sjc.execute(inParamMap);
	
		EUCANCU1Response response = new EUCANCU1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
	public EUCDTCU3Response EUCDTCU3(EUCDTCU3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_CARDTYPE", request.getCardtype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_CARDID", request.getCardid());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = eucdtcu3sjc.execute(inParamMap);
	
		EUCDTCU3Response response = new EUCDTCU3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setTstatus((result.get("PO_TSTATUS") == null) ? null : Short.valueOf(result.get("PO_TSTATUS").toString()));
			response.setCustomerstatus((result.get("PO_CUSTOMERSTATUS") == null) ? null : Short.valueOf(result.get("PO_CUSTOMERSTATUS").toString()));
			response.setFollowid((result.get("PO_FOLLOWID") == null) ? null : new BigDecimal(result.get("PO_FOLLOWID").toString()).setScale(0));
		//}
	
		return response;
	}
	public EUCHNGS1Response EUCHNGS1(EUCHNGS1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_OTPTYPE", request.getOtptype());
		inParamMap.put("PI_CARDTYPE", request.getCardtype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_CARDID", request.getCardid());
		inParamMap.put("PI_MOBILENO", AppUtil.convert1256To1252(request.getMobileno()));
	
		Map<String, Object> result = euchngs1sjc.execute(inParamMap);
	
		EUCHNGS1Response response = new EUCHNGS1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
}

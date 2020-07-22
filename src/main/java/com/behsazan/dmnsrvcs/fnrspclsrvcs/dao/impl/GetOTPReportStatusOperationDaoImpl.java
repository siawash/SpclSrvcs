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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.GetOTPReportStatusOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;
import java.math.BigDecimal;

@Repository
public class GetOTPReportStatusOperationDaoImpl implements GetOTPReportStatusOperationDao {
	private SimpleJdbcCall erotpre3sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEROTPRE3sjc() {
		erotpre3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EROTPRE3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_OTPTYPE", Types.SMALLINT),
				new SqlParameter("PI_CARDID", Types.INTEGER),
				new SqlParameter("PI_MOBILNO", Types.VARCHAR),
				new SqlOutParameter("PO_STATUSX", Types.SMALLINT),
				new SqlOutParameter("PO_BRANCH", Types.INTEGER),
				new SqlOutParameter("PO_FIRSTASSIGNDATE", Types.INTEGER),
				new SqlOutParameter("PO_BRANCHASSIGNDATE", Types.INTEGER),
				new SqlOutParameter("PO_CUSTASSIGNDATE", Types.INTEGER),
				new SqlOutParameter("PO_REFUNDDATE", Types.INTEGER),
				new SqlOutParameter("PO_REVOKEDATE", Types.INTEGER),
				new SqlOutParameter("PO_LASTASSIGNDATE", Types.INTEGER),
				new SqlOutParameter("PO_EXTCUSTID", Types.DECIMAL)
			);
	}
	@PostConstruct
	private void init() {
		initEROTPRE3sjc();
	}
	public EROTPRE3Response EROTPRE3(EROTPRE3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_OTPTYPE", request.getOtptype());
		inParamMap.put("PI_CARDID", request.getCardid());
		inParamMap.put("PI_MOBILNO", AppUtil.convert1256To1252(request.getMobilno()));
	
		Map<String, Object> result = erotpre3sjc.execute(inParamMap);
	
		EROTPRE3Response response = new EROTPRE3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setStatusx((result.get("PO_STATUSX") == null) ? null : Short.valueOf(result.get("PO_STATUSX").toString()));
			response.setBranch((result.get("PO_BRANCH") == null) ? null : Integer.valueOf(result.get("PO_BRANCH").toString()));
			response.setFirstassigndate((result.get("PO_FIRSTASSIGNDATE") == null) ? null : Integer.valueOf(result.get("PO_FIRSTASSIGNDATE").toString()));
			response.setBranchassigndate((result.get("PO_BRANCHASSIGNDATE") == null) ? null : Integer.valueOf(result.get("PO_BRANCHASSIGNDATE").toString()));
			response.setCustassigndate((result.get("PO_CUSTASSIGNDATE") == null) ? null : Integer.valueOf(result.get("PO_CUSTASSIGNDATE").toString()));
			response.setRefunddate((result.get("PO_REFUNDDATE") == null) ? null : Integer.valueOf(result.get("PO_REFUNDDATE").toString()));
			response.setRevokedate((result.get("PO_REVOKEDATE") == null) ? null : Integer.valueOf(result.get("PO_REVOKEDATE").toString()));
			response.setLastassigndate((result.get("PO_LASTASSIGNDATE") == null) ? null : Integer.valueOf(result.get("PO_LASTASSIGNDATE").toString()));
			response.setExtcustid((result.get("PO_EXTCUSTID") == null) ? null : new BigDecimal(result.get("PO_EXTCUSTID").toString()).setScale(0));
		//}
	
		return response;
	}
}

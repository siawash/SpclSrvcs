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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.GetUnitOTPOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIISSU2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIISSU2Response;

@Repository
public class GetUnitOTPOperationDaoImpl implements GetUnitOTPOperationDao {
	private SimpleJdbcCall egiissu2sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGIISSU2sjc() {
		egiissu2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGIISSU2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_FROMDATE", Types.INTEGER),
				new SqlParameter("PI_TODATE", Types.INTEGER),
				new SqlParameter("PI_OTPTYPE", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER)
			);
		egiissu2sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	@PostConstruct
	private void init() {
		initEGIISSU2sjc();
	}
	public EGIISSU2Response EGIISSU2(EGIISSU2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_FROMDATE", request.getFromdate());
		inParamMap.put("PI_TODATE", request.getTodate());
		inParamMap.put("PI_OTPTYPE", request.getOtptype());
		inParamMap.put("PI_BRANCH", request.getBranch());
	
		Map<String, Object> result = egiissu2sjc.execute(inParamMap);
	
		EGIISSU2Response response = new EGIISSU2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
}

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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.ChannelCommonOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINTNM1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINTNM1Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;

@Repository
public class ChannelCommonOperationDaoImpl implements ChannelCommonOperationDao {
	private SimpleJdbcCall egintnm1sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGINTNM1sjc() {
		egintnm1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGINTNM1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_ACCTYPE", Types.INTEGER),
				new SqlOutParameter("PO_CONTROLPAYERID", Types.INTEGER),
				new SqlOutParameter("PO_ACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_EMAIL", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector()),
				new SqlOutParameter("PO_CUSTSPEC", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
	}
	@PostConstruct
	private void init() {
		initEGINTNM1sjc();
	}
	public EGINTNM1Response EGINTNM1(EGINTNM1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egintnm1sjc.execute(inParamMap);
	
		EGINTNM1Response response = new EGINTNM1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setAcctype((result.get("PO_ACCTYPE") == null) ? null : Integer.valueOf(result.get("PO_ACCTYPE").toString()));
			response.setControlpayerid((result.get("PO_CONTROLPAYERID") == null) ? null : Integer.valueOf(result.get("PO_CONTROLPAYERID").toString()));
			response.setAccno((result.get("PO_ACCNO") == null) ? null : new BigDecimal(result.get("PO_ACCNO").toString()).setScale(0));
			response.setEmail((result.get("PO_EMAIL") == null) ? null : result.get("PO_EMAIL").toString());
			response.setCustspec((result.get("PO_CUSTSPEC") == null) ? null : result.get("PO_CUSTSPEC").toString());
		//}
	
		return response;
	}
}

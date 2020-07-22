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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.CustomerCardInformationMonitorDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common.OutParamVarcharCorrector;

@Repository
public class CustomerCardInformationMonitorDaoImpl implements CustomerCardInformationMonitorDao {
	private SimpleJdbcCall egcacrc6sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGCACRC6sjc() {
		egcacrc6sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGCACRC6)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ACTION", Types.SMALLINT),
				new SqlParameter("PI_TODAY", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlOutParameter("PO_TYPEX", Types.SMALLINT),
				new SqlOutParameter("PO_CUSTTYPE", Types.SMALLINT),
				new SqlOutParameter("PO_CARDSTATUS", Types.SMALLINT),
				new SqlOutParameter("PO_CARDID", Types.INTEGER),
				new SqlOutParameter("PO_INTCUSTID", Types.INTEGER),
				new SqlOutParameter("PO_IDCODE", Types.DECIMAL),
				new SqlOutParameter("PO_CUSTSPEC", Types.VARCHAR, "VARCHAR", new OutParamVarcharCorrector())
			);
		egcacrc6sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	@PostConstruct
	private void init() {
		initEGCACRC6sjc();
	}
	public EGCACRC6Response EGCACRC6(EGCACRC6Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ACTION", request.getAction());
		inParamMap.put("PI_TODAY", request.getToday());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egcacrc6sjc.execute(inParamMap);
	
		EGCACRC6Response response = new EGCACRC6Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setTypex((result.get("PO_TYPEX") == null) ? null : Short.valueOf(result.get("PO_TYPEX").toString()));
			response.setCusttype((result.get("PO_CUSTTYPE") == null) ? null : Short.valueOf(result.get("PO_CUSTTYPE").toString()));
			response.setCardstatus((result.get("PO_CARDSTATUS") == null) ? null : Short.valueOf(result.get("PO_CARDSTATUS").toString()));
			response.setCardid((result.get("PO_CARDID") == null) ? null : Integer.valueOf(result.get("PO_CARDID").toString()));
			response.setIntcustid((result.get("PO_INTCUSTID") == null) ? null : Integer.valueOf(result.get("PO_INTCUSTID").toString()));
			response.setIdcode((result.get("PO_IDCODE") == null) ? null : new BigDecimal(result.get("PO_IDCODE").toString()).setScale(0));
			response.setCustspec((result.get("PO_CUSTSPEC") == null) ? null : result.get("PO_CUSTSPEC").toString());
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
}

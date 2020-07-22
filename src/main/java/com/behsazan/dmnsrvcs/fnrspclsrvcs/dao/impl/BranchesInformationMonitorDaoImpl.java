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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BranchesInformationMonitorDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Response;

@Repository
public class BranchesInformationMonitorDaoImpl implements BranchesInformationMonitorDao {
	private SimpleJdbcCall egbrach1sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGBRACH1sjc() {
		egbrach1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBRACH1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER)
			);
		egbrach1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	@PostConstruct
	private void init() {
		initEGBRACH1sjc();
	}
	public EGBRACH1Response EGBRACH1(EGBRACH1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_BRANCH", request.getBranch());
	
		Map<String, Object> result = egbrach1sjc.execute(inParamMap);
	
		EGBRACH1Response response = new EGBRACH1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
}

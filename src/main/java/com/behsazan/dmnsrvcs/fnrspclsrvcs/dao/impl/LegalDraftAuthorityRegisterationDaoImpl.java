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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.LegalDraftAuthorityRegisterationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICACAU1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICACAU1Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRDAU3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRDAU3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCRDS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCRDS3Response;

@Repository
public class LegalDraftAuthorityRegisterationDaoImpl implements LegalDraftAuthorityRegisterationDao {
	private SimpleJdbcCall eicacau1sjc;
	private SimpleJdbcCall eicrdau3sjc;
	private SimpleJdbcCall euccrds3sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEICACAU1sjc() {
		eicacau1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EICACAU1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_STATUSX", Types.SMALLINT),
				new SqlParameter("PI_TODAY", Types.INTEGER),
				new SqlParameter("PI_ACCNO", Types.DECIMAL)
			);
	}
	private void initEICRDAU3sjc() {
		eicrdau3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EICRDAU3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ENVCODE", Types.SMALLINT),
				new SqlParameter("PI_MANDCOUNT", Types.SMALLINT),
				new SqlParameter("PI_OPTCNT", Types.SMALLINT),
				new SqlParameter("PI_ACCKIND", Types.SMALLINT),
				new SqlParameter("PI_AUTH1", Types.SMALLINT),
				new SqlParameter("PI_AUTH2", Types.SMALLINT),
				new SqlParameter("PI_AUTH3", Types.SMALLINT),
				new SqlParameter("PI_AUTH4", Types.SMALLINT),
				new SqlParameter("PI_AUTH5", Types.SMALLINT),
				new SqlParameter("PI_TODAY", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID1", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID2", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID3", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID4", Types.INTEGER),
				new SqlParameter("PI_INTCUSTID5", Types.INTEGER),
				new SqlParameter("PI_CARDID1", Types.INTEGER),
				new SqlParameter("PI_CARDID2", Types.INTEGER),
				new SqlParameter("PI_CARDID3", Types.INTEGER),
				new SqlParameter("PI_CARDID4", Types.INTEGER),
				new SqlParameter("PI_CARDID5", Types.INTEGER),
				new SqlParameter("PI_ACCNO", Types.DECIMAL),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL),
				new SqlParameter("PI_USERID", Types.VARCHAR)
			);
	}
	private void initEUCCRDS3sjc() {
		euccrds3sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUCCRDS3)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_ACTION", Types.SMALLINT),
				new SqlParameter("PI_INTCUSTID", Types.INTEGER),
				new SqlParameter("PI_CARDID", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_TODAY", Types.INTEGER),
				new SqlParameter("PI_STATUSX", Types.DECIMAL),
				new SqlParameter("PI_USERID", Types.VARCHAR)
			);
	}
	@PostConstruct
	private void init() {
		initEICACAU1sjc();
		initEICRDAU3sjc();
		initEUCCRDS3sjc();
	}
	public EICACAU1Response EICACAU1(EICACAU1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_STATUSX", request.getStatusx());
		inParamMap.put("PI_TODAY", request.getToday());
		inParamMap.put("PI_ACCNO", request.getAccno());
	
		Map<String, Object> result = eicacau1sjc.execute(inParamMap);
	
		EICACAU1Response response = new EICACAU1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
	public EICRDAU3Response EICRDAU3(EICRDAU3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ENVCODE", request.getEnvcode());
		inParamMap.put("PI_MANDCOUNT", request.getMandcount());
		inParamMap.put("PI_OPTCNT", request.getOptcnt());
		inParamMap.put("PI_ACCKIND", request.getAcckind());
		inParamMap.put("PI_AUTH1", request.getAuth1());
		inParamMap.put("PI_AUTH2", request.getAuth2());
		inParamMap.put("PI_AUTH3", request.getAuth3());
		inParamMap.put("PI_AUTH4", request.getAuth4());
		inParamMap.put("PI_AUTH5", request.getAuth5());
		inParamMap.put("PI_TODAY", request.getToday());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_INTCUSTID1", request.getIntcustid1());
		inParamMap.put("PI_INTCUSTID2", request.getIntcustid2());
		inParamMap.put("PI_INTCUSTID3", request.getIntcustid3());
		inParamMap.put("PI_INTCUSTID4", request.getIntcustid4());
		inParamMap.put("PI_INTCUSTID5", request.getIntcustid5());
		inParamMap.put("PI_CARDID1", request.getCardid1());
		inParamMap.put("PI_CARDID2", request.getCardid2());
		inParamMap.put("PI_CARDID3", request.getCardid3());
		inParamMap.put("PI_CARDID4", request.getCardid4());
		inParamMap.put("PI_CARDID5", request.getCardid5());
		inParamMap.put("PI_ACCNO", request.getAccno());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
		inParamMap.put("PI_USERID", AppUtil.convert1256To1252(request.getUserid()));
	
		Map<String, Object> result = eicrdau3sjc.execute(inParamMap);
	
		EICRDAU3Response response = new EICRDAU3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
	public EUCCRDS3Response EUCCRDS3(EUCCRDS3Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_ACTION", request.getAction());
		inParamMap.put("PI_INTCUSTID", request.getIntcustid());
		inParamMap.put("PI_CARDID", request.getCardid());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_TODAY", request.getToday());
		inParamMap.put("PI_STATUSX", request.getStatusx());
		inParamMap.put("PI_USERID", AppUtil.convert1256To1252(request.getUserid()));
	
		Map<String, Object> result = euccrds3sjc.execute(inParamMap);
	
		EUCCRDS3Response response = new EUCCRDS3Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
}

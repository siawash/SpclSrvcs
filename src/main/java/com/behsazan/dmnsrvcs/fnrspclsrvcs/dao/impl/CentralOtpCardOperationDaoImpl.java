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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.CentralOtpCardOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBNRGN1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIBOTP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIBOTP1Response;
import java.math.BigDecimal;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIOTPR2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIOTPR2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGOTPOA1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGOTPOA1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIANOTP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIANOTP1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppUtil;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUANOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUANOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EULSOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EULSOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURETSR1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURETSR1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURMOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURMOTP2Response;

@Repository
public class CentralOtpCardOperationDaoImpl implements CentralOtpCardOperationDao {
	private SimpleJdbcCall egbnrgn1sjc;
	private SimpleJdbcCall egibotp1sjc;
	private SimpleJdbcCall egiotpr2sjc;
	private SimpleJdbcCall egotpoa1sjc;
	private SimpleJdbcCall eianotp1sjc;
	private SimpleJdbcCall euanotp2sjc;
	private SimpleJdbcCall eulsotp2sjc;
	private SimpleJdbcCall euretsr1sjc;
	private SimpleJdbcCall eurmotp2sjc;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Sp sp;

	@Value("${schema.tstshma}")
	private String TSTSHMA;


	private void initEGBNRGN1sjc() {
		egbnrgn1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGBNRGN1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER)
			);
		egbnrgn1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGIBOTP1sjc() {
		egibotp1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGIBOTP1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_STATUSX", Types.SMALLINT),
				new SqlParameter("PI_FROMDATE", Types.INTEGER),
				new SqlParameter("PI_TODATE", Types.INTEGER),
				new SqlParameter("PI_CARDID", Types.INTEGER),
				new SqlParameter("PI_EXTACCNO", Types.DECIMAL)
			);
		egibotp1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGIOTPR2sjc() {
		egiotpr2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGIOTPR2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_STATUSX", Types.SMALLINT),
				new SqlParameter("PI_FROMDATE", Types.INTEGER),
				new SqlParameter("PI_TODATE", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER)
			);
		egiotpr2sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEGOTPOA1sjc() {
		egotpoa1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EGOTPOA1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_STATUSX", Types.SMALLINT),
				new SqlParameter("PI_FROMDATE", Types.INTEGER),
				new SqlParameter("PI_TODATE", Types.INTEGER),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_RGNCODE", Types.INTEGER)
			);
		egotpoa1sjc.returningResultSet("resultset0", new RowMapperClass());
	}
	private void initEIANOTP1sjc() {
		eianotp1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EIANOTP1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_CARDTYPE", Types.SMALLINT),
				new SqlParameter("PI_SERIAL", Types.VARCHAR),
				new SqlParameter("PI_UNLOCKCODE", Types.VARCHAR)
			);
	}
	private void initEUANOTP2sjc() {
		euanotp2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EUANOTP2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_CARDTYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_FROMSERIAL", Types.INTEGER),
				new SqlParameter("PI_TOSERIAL", Types.INTEGER),
				new SqlParameter("PI_COUNT", Types.INTEGER),
				new SqlOutParameter("PO_COUNT", Types.INTEGER)
			);
	}
	private void initEULSOTP2sjc() {
		eulsotp2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EULSOTP2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_CARDTYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_FROMSERIAL", Types.INTEGER),
				new SqlParameter("PI_TOSERIAL", Types.INTEGER),
				new SqlParameter("PI_COUNT", Types.INTEGER),
				new SqlOutParameter("PO_SERIAL", Types.INTEGER)
			);
	}
	private void initEURETSR1sjc() {
		euretsr1sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EURETSR1)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_CARDTYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_FROMSERIAL", Types.INTEGER),
				new SqlParameter("PI_TOSERIAL", Types.INTEGER),
				new SqlParameter("PI_COUNT", Types.INTEGER),
				new SqlOutParameter("PO_COUNT", Types.INTEGER)
			);
	}
	private void initEURMOTP2sjc() {
		eurmotp2sjc = ctx.getBean("devsjc", SimpleJdbcCall.class)
			.withProcedureName(sp.EURMOTP2)
			.withSchemaName(TSTSHMA)
			.withoutProcedureColumnMetaDataAccess()
			.declareParameters(
				new SqlOutParameter("PO_ERROR", Types.INTEGER),
				new SqlParameter("PI_CARDTYPE", Types.SMALLINT),
				new SqlParameter("PI_BRANCH", Types.INTEGER),
				new SqlParameter("PI_FROMSERIAL", Types.INTEGER),
				new SqlParameter("PI_TOSERIAL", Types.INTEGER),
				new SqlParameter("PI_COUNT", Types.INTEGER),
				new SqlOutParameter("PO_SERIAL", Types.INTEGER)
			);
	}
	@PostConstruct
	private void init() {
		initEGBNRGN1sjc();
		initEGIBOTP1sjc();
		initEGIOTPR2sjc();
		initEGOTPOA1sjc();
		initEIANOTP1sjc();
		initEUANOTP2sjc();
		initEULSOTP2sjc();
		initEURETSR1sjc();
		initEURMOTP2sjc();
	}
	public EGBNRGN1Response EGBNRGN1() {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
	
		Map<String, Object> result = egbnrgn1sjc.execute(inParamMap);
	
		EGBNRGN1Response response = new EGBNRGN1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGIBOTP1Response EGIBOTP1(EGIBOTP1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_STATUSX", request.getStatusx());
		inParamMap.put("PI_FROMDATE", request.getFromdate());
		inParamMap.put("PI_TODATE", request.getTodate());
		inParamMap.put("PI_CARDID", request.getCardid());
		inParamMap.put("PI_EXTACCNO", request.getExtaccno());
	
		Map<String, Object> result = egibotp1sjc.execute(inParamMap);
	
		EGIBOTP1Response response = new EGIBOTP1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGIOTPR2Response EGIOTPR2(EGIOTPR2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_STATUSX", request.getStatusx());
		inParamMap.put("PI_FROMDATE", request.getFromdate());
		inParamMap.put("PI_TODATE", request.getTodate());
		inParamMap.put("PI_BRANCH", request.getBranch());
	
		Map<String, Object> result = egiotpr2sjc.execute(inParamMap);
	
		EGIOTPR2Response response = new EGIOTPR2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EGOTPOA1Response EGOTPOA1(EGOTPOA1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_STATUSX", request.getStatusx());
		inParamMap.put("PI_FROMDATE", request.getFromdate());
		inParamMap.put("PI_TODATE", request.getTodate());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_RGNCODE", request.getRgncode());
	
		Map<String, Object> result = egotpoa1sjc.execute(inParamMap);
	
		EGOTPOA1Response response = new EGOTPOA1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
	
			response.setResultset0(result.get("resultset0"));
		//}
	
		return response;
	}
	public EIANOTP1Response EIANOTP1(EIANOTP1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_CARDTYPE", request.getCardtype());
		inParamMap.put("PI_SERIAL", AppUtil.convert1256To1252(request.getSerial()));
		inParamMap.put("PI_UNLOCKCODE", AppUtil.convert1256To1252(request.getUnlockcode()));
	
		Map<String, Object> result = eianotp1sjc.execute(inParamMap);
	
		EIANOTP1Response response = new EIANOTP1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		return response;
	}
	public EUANOTP2Response EUANOTP2(EUANOTP2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_CARDTYPE", request.getCardtype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_FROMSERIAL", request.getFromserial());
		inParamMap.put("PI_TOSERIAL", request.getToserial());
		inParamMap.put("PI_COUNT", request.getCount());
	
		Map<String, Object> result = euanotp2sjc.execute(inParamMap);
	
		EUANOTP2Response response = new EUANOTP2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setCount((result.get("PO_COUNT") == null) ? null : Integer.valueOf(result.get("PO_COUNT").toString()));
		//}
	
		return response;
	}
	public EULSOTP2Response EULSOTP2(EULSOTP2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_CARDTYPE", request.getCardtype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_FROMSERIAL", request.getFromserial());
		inParamMap.put("PI_TOSERIAL", request.getToserial());
		inParamMap.put("PI_COUNT", request.getCount());
	
		Map<String, Object> result = eulsotp2sjc.execute(inParamMap);
	
		EULSOTP2Response response = new EULSOTP2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setSerial((result.get("PO_SERIAL") == null) ? null : Integer.valueOf(result.get("PO_SERIAL").toString()));
		//}
	
		return response;
	}
	public EURETSR1Response EURETSR1(EURETSR1Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_CARDTYPE", request.getCardtype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_FROMSERIAL", request.getFromserial());
		inParamMap.put("PI_TOSERIAL", request.getToserial());
		inParamMap.put("PI_COUNT", request.getCount());
	
		Map<String, Object> result = euretsr1sjc.execute(inParamMap);
	
		EURETSR1Response response = new EURETSR1Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setCount((result.get("PO_COUNT") == null) ? null : Integer.valueOf(result.get("PO_COUNT").toString()));
		//}
	
		return response;
	}
	public EURMOTP2Response EURMOTP2(EURMOTP2Request request) {
	
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("PI_CARDTYPE", request.getCardtype());
		inParamMap.put("PI_BRANCH", request.getBranch());
		inParamMap.put("PI_FROMSERIAL", request.getFromserial());
		inParamMap.put("PI_TOSERIAL", request.getToserial());
		inParamMap.put("PI_COUNT", request.getCount());
	
		Map<String, Object> result = eurmotp2sjc.execute(inParamMap);
	
		EURMOTP2Response response = new EURMOTP2Response();
		response.setErrorCode(Integer.valueOf(result.get("PO_ERROR").toString()));
	
		//if (response.getErrorCode() == 0) {
			response.setSerial((result.get("PO_SERIAL") == null) ? null : Integer.valueOf(result.get("PO_SERIAL").toString()));
		//}
	
		return response;
	}
}

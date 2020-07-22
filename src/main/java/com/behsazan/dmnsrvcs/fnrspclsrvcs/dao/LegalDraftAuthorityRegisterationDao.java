package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICACAU1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICACAU1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRDAU3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRDAU3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCRDS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCRDS3Response;

public interface LegalDraftAuthorityRegisterationDao {
	EICACAU1Response EICACAU1(EICACAU1Request request);
	EICRDAU3Response EICRDAU3(EICRDAU3Request request);
	EUCCRDS3Response EUCCRDS3(EUCCRDS3Request request);
}

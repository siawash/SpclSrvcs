package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICFRMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICFRMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRGMO3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRGMO3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EISACRD1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EISACRD1Response;

public interface MobileNoRegistrationDao {
	EICFRMN2Response EICFRMN2(EICFRMN2Request request);
	EICRGMO3Response EICRGMO3(EICRGMO3Request request);
	EISACRD1Response EISACRD1(EISACRD1Request request);
}

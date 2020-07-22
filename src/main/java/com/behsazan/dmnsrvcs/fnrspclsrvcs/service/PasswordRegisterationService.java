package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCPSW4Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCPSW4Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICNFRQ1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICNFRQ1Response;

public interface PasswordRegisterationService {
	EICCPSW4Response EICCPSW4(EICCPSW4Request request);
	EICNFRQ1Response EICNFRQ1(EICNFRQ1Request request);
}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSWRP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSWRP1Response;

public interface PasswordRequestOperationService {
	EGPSWRP1Response EGPSWRP1(EGPSWRP1Request request);
}

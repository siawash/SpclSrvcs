package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIISSU2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIISSU2Response;

public interface GetUnitOTPOperationService {
	EGIISSU2Response EGIISSU2(EGIISSU2Request request);
}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Response;

public interface GetOTPReportStatusOperationService {
	EROTPRE3Response EROTPRE3(EROTPRE3Request request);
}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Response;

public interface GetOTPReportStatusOperationDao {
	EROTPRE3Response EROTPRE3(EROTPRE3Request request);
}

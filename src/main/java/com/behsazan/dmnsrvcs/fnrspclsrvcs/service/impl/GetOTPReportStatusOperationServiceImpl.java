package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.GetOTPReportStatusOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.GetOTPReportStatusOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Response;

@Service
public class GetOTPReportStatusOperationServiceImpl implements GetOTPReportStatusOperationService {
	@Autowired
	private GetOTPReportStatusOperationDao GetOTPReportStatusOperationDao;


	@Override
	public EROTPRE3Response EROTPRE3(EROTPRE3Request request) {
		return GetOTPReportStatusOperationDao.EROTPRE3(request);
	}
}

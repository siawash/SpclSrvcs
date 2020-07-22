package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.CentralOtpCardOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.CentralOtpCardOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBNRGN1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIBOTP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIBOTP1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIOTPR2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIOTPR2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGOTPOA1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGOTPOA1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIANOTP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIANOTP1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUANOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUANOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EULSOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EULSOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURETSR1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURETSR1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURMOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURMOTP2Response;

@Service
public class CentralOtpCardOperationServiceImpl implements CentralOtpCardOperationService {
	@Autowired
	private CentralOtpCardOperationDao CentralOtpCardOperationDao;


	@Override
	public EGBNRGN1Response EGBNRGN1() {
		return CentralOtpCardOperationDao.EGBNRGN1();
	}
	@Override
	public EGIBOTP1Response EGIBOTP1(EGIBOTP1Request request) {
		return CentralOtpCardOperationDao.EGIBOTP1(request);
	}
	@Override
	public EGIOTPR2Response EGIOTPR2(EGIOTPR2Request request) {
		return CentralOtpCardOperationDao.EGIOTPR2(request);
	}
	@Override
	public EGOTPOA1Response EGOTPOA1(EGOTPOA1Request request) {
		return CentralOtpCardOperationDao.EGOTPOA1(request);
	}
	@Override
	public EIANOTP1Response EIANOTP1(EIANOTP1Request request) {
		return CentralOtpCardOperationDao.EIANOTP1(request);
	}
	@Override
	public EUANOTP2Response EUANOTP2(EUANOTP2Request request) {
		return CentralOtpCardOperationDao.EUANOTP2(request);
	}
	@Override
	public EULSOTP2Response EULSOTP2(EULSOTP2Request request) {
		return CentralOtpCardOperationDao.EULSOTP2(request);
	}
	@Override
	public EURETSR1Response EURETSR1(EURETSR1Request request) {
		return CentralOtpCardOperationDao.EURETSR1(request);
	}
	@Override
	public EURMOTP2Response EURMOTP2(EURMOTP2Request request) {
		return CentralOtpCardOperationDao.EURMOTP2(request);
	}
}

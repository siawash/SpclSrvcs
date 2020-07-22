package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.ChangeBBankingCustomerInfoOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.ChangeBBankingCustomerInfoOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGICHAC5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGICHAC5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUICPSW3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUICPSW3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUISTCM3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUISTCM3Response;

@Service
public class ChangeBBankingCustomerInfoOperationServiceImpl implements ChangeBBankingCustomerInfoOperationService {
	@Autowired
	private ChangeBBankingCustomerInfoOperationDao ChangeBBankingCustomerInfoOperationDao;


	@Override
	public EGICHAC5Response EGICHAC5(EGICHAC5Request request) {
		return ChangeBBankingCustomerInfoOperationDao.EGICHAC5(request);
	}
	@Override
	public EUICPSW3Response EUICPSW3(EUICPSW3Request request) {
		return ChangeBBankingCustomerInfoOperationDao.EUICPSW3(request);
	}
	@Override
	public EUISTCM3Response EUISTCM3(EUISTCM3Request request) {
		return ChangeBBankingCustomerInfoOperationDao.EUISTCM3(request);
	}
}

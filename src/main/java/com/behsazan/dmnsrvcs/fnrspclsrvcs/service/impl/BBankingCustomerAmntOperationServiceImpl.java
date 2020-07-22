package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BBankingCustomerAmntOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BBankingCustomerAmntOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBCSAM1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBCSAM1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUACSMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUACSMN2Response;

@Service
public class BBankingCustomerAmntOperationServiceImpl implements BBankingCustomerAmntOperationService {
	@Autowired
	private BBankingCustomerAmntOperationDao BBankingCustomerAmntOperationDao;


	@Override
	public EGBCSAM1Response EGBCSAM1(EGBCSAM1Request request) {
		return BBankingCustomerAmntOperationDao.EGBCSAM1(request);
	}
	@Override
	public EUACSMN2Response EUACSMN2(EUACSMN2Request request) {
		return BBankingCustomerAmntOperationDao.EUACSMN2(request);
	}
}

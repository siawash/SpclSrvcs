package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BBankingServiceRequestOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BBankingServiceRequestOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBASG2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBASG2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSS2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSS2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGBS1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGBS1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGES1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGES1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBSEB1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBSEB1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIIASGN7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIIASGN7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUENTBK3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUENTBK3Response;

@Service
public class BBankingServiceRequestOperationServiceImpl implements BBankingServiceRequestOperationService {
	@Autowired
	private BBankingServiceRequestOperationDao BBankingServiceRequestOperationDao;


	@Override
	public EGBBASG2Response EGBBASG2(EGBBASG2Request request) {
		return BBankingServiceRequestOperationDao.EGBBASG2(request);
	}
	@Override
	public EGBBCSS2Response EGBBCSS2(EGBBCSS2Request request) {
		return BBankingServiceRequestOperationDao.EGBBCSS2(request);
	}
	@Override
	public EGBBGBS1Response EGBBGBS1(EGBBGBS1Request request) {
		return BBankingServiceRequestOperationDao.EGBBGBS1(request);
	}
	@Override
	public EGBBGES1Response EGBBGES1(EGBBGES1Request request) {
		return BBankingServiceRequestOperationDao.EGBBGES1(request);
	}
	@Override
	public EGBBSEB1Response EGBBSEB1(EGBBSEB1Request request) {
		return BBankingServiceRequestOperationDao.EGBBSEB1(request);
	}
	@Override
	public EIIASGN7Response EIIASGN7(EIIASGN7Request request) {
		return BBankingServiceRequestOperationDao.EIIASGN7(request);
	}
	@Override
	public EUENTBK3Response EUENTBK3(EUENTBK3Request request) {
		return BBankingServiceRequestOperationDao.EUENTBK3(request);
	}
}

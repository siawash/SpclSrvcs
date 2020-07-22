package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BBankingWithdrawConditionsOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BBankingWithdrawConditionsOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCWDWC3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCWDWC3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCCWC4Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCCWC4Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICWDWC2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICWDWC2Response;

@Service
public class BBankingWithdrawConditionsOperationServiceImpl implements BBankingWithdrawConditionsOperationService {
	@Autowired
	private BBankingWithdrawConditionsOperationDao BBankingWithdrawConditionsOperationDao;


	@Override
	public EGCWDWC3Response EGCWDWC3(EGCWDWC3Request request) {
		return BBankingWithdrawConditionsOperationDao.EGCWDWC3(request);
	}
	@Override
	public EICCCWC4Response EICCCWC4(EICCCWC4Request request) {
		return BBankingWithdrawConditionsOperationDao.EICCCWC4(request);
	}
	@Override
	public EICWDWC2Response EICWDWC2(EICWDWC2Request request) {
		return BBankingWithdrawConditionsOperationDao.EICWDWC2(request);
	}
}

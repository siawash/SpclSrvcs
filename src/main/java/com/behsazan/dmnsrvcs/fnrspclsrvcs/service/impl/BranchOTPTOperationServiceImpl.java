package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BranchOTPTOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BranchOTPTOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUNLC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUNLC1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGHCUST5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGHCUST5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCANCU1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCANCU1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCDTCU3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCDTCU3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCHNGS1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCHNGS1Response;

@Service
public class BranchOTPTOperationServiceImpl implements BranchOTPTOperationService {
	@Autowired
	private BranchOTPTOperationDao BranchOTPTOperationDao;


	@Override
	public EGCUNLC1Response EGCUNLC1(EGCUNLC1Request request) {
		return BranchOTPTOperationDao.EGCUNLC1(request);
	}
	@Override
	public EGHCUST5Response EGHCUST5(EGHCUST5Request request) {
		return BranchOTPTOperationDao.EGHCUST5(request);
	}
	@Override
	public EUCANCU1Response EUCANCU1(EUCANCU1Request request) {
		return BranchOTPTOperationDao.EUCANCU1(request);
	}
	@Override
	public EUCDTCU3Response EUCDTCU3(EUCDTCU3Request request) {
		return BranchOTPTOperationDao.EUCDTCU3(request);
	}
	@Override
	public EUCHNGS1Response EUCHNGS1(EUCHNGS1Request request) {
		return BranchOTPTOperationDao.EUCHNGS1(request);
	}
}

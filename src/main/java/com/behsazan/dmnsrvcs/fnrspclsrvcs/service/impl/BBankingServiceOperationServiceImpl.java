package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BBankingServiceOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BBankingServiceOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.AGBBGSS2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.AGBBGSS2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDCREGP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDCREGP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCAO1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCAO1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSL2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSL2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBSREX1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBSREX1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACCL5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACCL5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCRREP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCRREP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUCUS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUCUS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBEXSR1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBEXSR1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBMAMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBMAMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICREGP3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICREGP3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERWDCND3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERWDCND3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCADMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCADMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCUST1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCUST1Response;

@Service
public class BBankingServiceOperationServiceImpl implements BBankingServiceOperationService {
	@Autowired
	private BBankingServiceOperationDao BBankingServiceOperationDao;


	@Override
	public AGBBGSS2Response AGBBGSS2(AGBBGSS2Request request) {
		return BBankingServiceOperationDao.AGBBGSS2(request);
	}
	@Override
	public EDCREGP2Response EDCREGP2(EDCREGP2Request request) {
		return BBankingServiceOperationDao.EDCREGP2(request);
	}
	@Override
	public EGBBCAO1Response EGBBCAO1(EGBBCAO1Request request) {
		return BBankingServiceOperationDao.EGBBCAO1(request);
	}
	@Override
	public EGBBCSL2Response EGBBCSL2(EGBBCSL2Request request) {
		return BBankingServiceOperationDao.EGBBCSL2(request);
	}
	@Override
	public EGBSREX1Response EGBSREX1(EGBSREX1Request request) {
		return BBankingServiceOperationDao.EGBSREX1(request);
	}
	@Override
	public EGCACCL5Response EGCACCL5(EGCACCL5Request request) {
		return BBankingServiceOperationDao.EGCACCL5(request);
	}
	@Override
	public EGCRREP2Response EGCRREP2(EGCRREP2Request request) {
		return BBankingServiceOperationDao.EGCRREP2(request);
	}
	@Override
	public EGCUCUS3Response EGCUCUS3(EGCUCUS3Request request) {
		return BBankingServiceOperationDao.EGCUCUS3(request);
	}
	@Override
	public EIBEXSR1Response EIBEXSR1(EIBEXSR1Request request) {
		return BBankingServiceOperationDao.EIBEXSR1(request);
	}
	@Override
	public EIBMAMN2Response EIBMAMN2(EIBMAMN2Request request) {
		return BBankingServiceOperationDao.EIBMAMN2(request);
	}
	@Override
	public EICREGP3Response EICREGP3(EICREGP3Request request) {
		return BBankingServiceOperationDao.EICREGP3(request);
	}
	@Override
	public ERWDCND3Response ERWDCND3(ERWDCND3Request request) {
		return BBankingServiceOperationDao.ERWDCND3(request);
	}
	@Override
	public EUCADMN2Response EUCADMN2(EUCADMN2Request request) {
		return BBankingServiceOperationDao.EUCADMN2(request);
	}
	@Override
	public EUCCUST1Response EUCCUST1(EUCCUST1Request request) {
		return BBankingServiceOperationDao.EUCCUST1(request);
	}
}

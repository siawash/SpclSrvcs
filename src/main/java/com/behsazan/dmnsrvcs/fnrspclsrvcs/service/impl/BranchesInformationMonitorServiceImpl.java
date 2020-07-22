package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.BranchesInformationMonitorDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BranchesInformationMonitorService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Response;

@Service
public class BranchesInformationMonitorServiceImpl implements BranchesInformationMonitorService {
	@Autowired
	private BranchesInformationMonitorDao BranchesInformationMonitorDao;


	@Override
	public EGBRACH1Response EGBRACH1(EGBRACH1Request request) {
		return BranchesInformationMonitorDao.EGBRACH1(request);
	}
}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.CustomerInformationMonitorDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.CustomerInformationMonitorService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUSI7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUSI7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUST5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUST5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCOGAC5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCOGAC5Response;

@Service
public class CustomerInformationMonitorServiceImpl implements CustomerInformationMonitorService {
	@Autowired
	private CustomerInformationMonitorDao CustomerInformationMonitorDao;


	@Override
	public EGCCUSI7Response EGCCUSI7(EGCCUSI7Request request) {
		return CustomerInformationMonitorDao.EGCCUSI7(request);
	}
	@Override
	public EGCCUST5Response EGCCUST5(EGCCUST5Request request) {
		return CustomerInformationMonitorDao.EGCCUST5(request);
	}
	@Override
	public EGCOGAC5Response EGCOGAC5(EGCOGAC5Request request) {
		return CustomerInformationMonitorDao.EGCOGAC5(request);
	}
}

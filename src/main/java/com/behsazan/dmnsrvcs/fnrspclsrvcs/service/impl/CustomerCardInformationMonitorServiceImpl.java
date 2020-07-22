package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.CustomerCardInformationMonitorDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.CustomerCardInformationMonitorService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Response;

@Service
public class CustomerCardInformationMonitorServiceImpl implements CustomerCardInformationMonitorService {
	@Autowired
	private CustomerCardInformationMonitorDao CustomerCardInformationMonitorDao;


	@Override
	public EGCACRC6Response EGCACRC6(EGCACRC6Request request) {
		return CustomerCardInformationMonitorDao.EGCACRC6(request);
	}
}

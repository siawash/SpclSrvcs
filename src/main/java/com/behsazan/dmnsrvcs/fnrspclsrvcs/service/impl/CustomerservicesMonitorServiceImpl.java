package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.CustomerservicesMonitorDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.CustomerservicesMonitorService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCSRVC3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCSRVC3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUSTS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUSTS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGSRVIF1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGSRVIF1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERCRCST3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERCRCST3Response;

@Service
public class CustomerservicesMonitorServiceImpl implements CustomerservicesMonitorService {
	@Autowired
	private CustomerservicesMonitorDao CustomerservicesMonitorDao;


	@Override
	public EGCSRVC3Response EGCSRVC3(EGCSRVC3Request request) {
		return CustomerservicesMonitorDao.EGCSRVC3(request);
	}
	@Override
	public EGCUSTS3Response EGCUSTS3(EGCUSTS3Request request) {
		return CustomerservicesMonitorDao.EGCUSTS3(request);
	}
	@Override
	public EGSRVIF1Response EGSRVIF1(EGSRVIF1Request request) {
		return CustomerservicesMonitorDao.EGSRVIF1(request);
	}
	@Override
	public ERCRCST3Response ERCRCST3(ERCRCST3Request request) {
		return CustomerservicesMonitorDao.ERCRCST3(request);
	}
}

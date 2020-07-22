package com.behsazan.dmnsrvcs.fnrspclsrvcs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.ChannelCommonOperationDao;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.ChannelCommonOperationService;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINTNM1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINTNM1Response;

@Service
public class ChannelCommonOperationServiceImpl implements ChannelCommonOperationService {
	@Autowired
	private ChannelCommonOperationDao ChannelCommonOperationDao;


	@Override
	public EGINTNM1Response EGINTNM1(EGINTNM1Request request) {
		return ChannelCommonOperationDao.EGINTNM1(request);
	}
}

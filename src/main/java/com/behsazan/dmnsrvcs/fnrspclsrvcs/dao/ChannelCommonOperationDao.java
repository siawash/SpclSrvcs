package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINTNM1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINTNM1Response;

public interface ChannelCommonOperationDao {
	EGINTNM1Response EGINTNM1(EGINTNM1Request request);
}

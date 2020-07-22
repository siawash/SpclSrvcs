package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINFOC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINFOC1Response;

public interface SpecialCustomerMonitorDao {
	EGINFOC1Response EGINFOC1(EGINFOC1Request request);
}

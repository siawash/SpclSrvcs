package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIEDTRQ1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIEDTRQ1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIREGRQ1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIREGRQ1Response;

public interface VirtualRegisterationOperationDao {
	EIEDTRQ1Response EIEDTRQ1(EIEDTRQ1Request request);
	EIREGRQ1Response EIREGRQ1(EIREGRQ1Request request);
}

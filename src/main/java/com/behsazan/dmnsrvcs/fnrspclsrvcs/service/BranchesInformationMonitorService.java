package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Response;

public interface BranchesInformationMonitorService {
	EGBRACH1Response EGBRACH1(EGBRACH1Request request);
}

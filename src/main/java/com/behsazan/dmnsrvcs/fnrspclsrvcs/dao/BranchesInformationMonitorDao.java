package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Response;

public interface BranchesInformationMonitorDao {
	EGBRACH1Response EGBRACH1(EGBRACH1Request request);
}

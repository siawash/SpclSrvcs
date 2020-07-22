package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Response;

public interface CustomerCardInformationMonitorService {
	EGCACRC6Response EGCACRC6(EGCACRC6Request request);
}

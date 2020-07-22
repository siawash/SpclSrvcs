package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUSI7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUSI7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUST5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUST5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCOGAC5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCOGAC5Response;

public interface CustomerInformationMonitorService {
	EGCCUSI7Response EGCCUSI7(EGCCUSI7Request request);
	EGCCUST5Response EGCCUST5(EGCCUST5Request request);
	EGCOGAC5Response EGCOGAC5(EGCOGAC5Request request);
}

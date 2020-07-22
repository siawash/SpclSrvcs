package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCSRVC3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCSRVC3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUSTS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUSTS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGSRVIF1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGSRVIF1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERCRCST3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERCRCST3Response;

public interface CustomerservicesMonitorService {
	EGCSRVC3Response EGCSRVC3(EGCSRVC3Request request);
	EGCUSTS3Response EGCUSTS3(EGCUSTS3Request request);
	EGSRVIF1Response EGSRVIF1(EGSRVIF1Request request);
	ERCRCST3Response ERCRCST3(ERCRCST3Request request);
}

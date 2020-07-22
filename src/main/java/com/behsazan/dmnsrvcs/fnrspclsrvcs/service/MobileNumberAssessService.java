package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCHMO4Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCHMO4Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCMBCT2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCMBCT2Response;

public interface MobileNumberAssessService {
	EGCCHMO4Response EGCCHMO4(EGCCHMO4Request request);
	EGCMBCT2Response EGCMBCT2(EGCMBCT2Request request);
}

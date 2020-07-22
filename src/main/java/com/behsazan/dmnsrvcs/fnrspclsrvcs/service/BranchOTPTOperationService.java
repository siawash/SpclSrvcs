package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUNLC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUNLC1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGHCUST5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGHCUST5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCANCU1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCANCU1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCDTCU3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCDTCU3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCHNGS1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCHNGS1Response;

public interface BranchOTPTOperationService {
	EGCUNLC1Response EGCUNLC1(EGCUNLC1Request request);
	EGHCUST5Response EGHCUST5(EGHCUST5Request request);
	EUCANCU1Response EUCANCU1(EUCANCU1Request request);
	EUCDTCU3Response EUCDTCU3(EUCDTCU3Request request);
	EUCHNGS1Response EUCHNGS1(EUCHNGS1Request request);
}

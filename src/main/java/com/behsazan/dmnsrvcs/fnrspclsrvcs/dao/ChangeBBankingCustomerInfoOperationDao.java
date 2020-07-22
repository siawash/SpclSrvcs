package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGICHAC5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGICHAC5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUICPSW3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUICPSW3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUISTCM3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUISTCM3Response;

public interface ChangeBBankingCustomerInfoOperationDao {
	EGICHAC5Response EGICHAC5(EGICHAC5Request request);
	EUICPSW3Response EUICPSW3(EUICPSW3Request request);
	EUISTCM3Response EUISTCM3(EUISTCM3Request request);
}

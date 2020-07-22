package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBCSAM1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBCSAM1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUACSMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUACSMN2Response;

public interface BBankingCustomerAmntOperationDao {
	EGBCSAM1Response EGBCSAM1(EGBCSAM1Request request);
	EUACSMN2Response EUACSMN2(EUACSMN2Request request);
}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCWDWC3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCWDWC3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCCWC4Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCCWC4Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICWDWC2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICWDWC2Response;

public interface BBankingWithdrawConditionsOperationDao {
	EGCWDWC3Response EGCWDWC3(EGCWDWC3Request request);
	EICCCWC4Response EICCCWC4(EICCCWC4Request request);
	EICWDWC2Response EICWDWC2(EICWDWC2Request request);
}

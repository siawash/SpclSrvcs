package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBASG2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBASG2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSS2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSS2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGBS1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGBS1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGES1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGES1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBSEB1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBSEB1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIIASGN7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIIASGN7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUENTBK3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUENTBK3Response;

public interface BBankingServiceRequestOperationDao {
	EGBBASG2Response EGBBASG2(EGBBASG2Request request);
	EGBBCSS2Response EGBBCSS2(EGBBCSS2Request request);
	EGBBGBS1Response EGBBGBS1(EGBBGBS1Request request);
	EGBBGES1Response EGBBGES1(EGBBGES1Request request);
	EGBBSEB1Response EGBBSEB1(EGBBSEB1Request request);
	EIIASGN7Response EIIASGN7(EIIASGN7Request request);
	EUENTBK3Response EUENTBK3(EUENTBK3Request request);
}

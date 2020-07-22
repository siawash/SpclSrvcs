package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBNRGN1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIBOTP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIBOTP1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIOTPR2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIOTPR2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGOTPOA1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGOTPOA1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIANOTP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIANOTP1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUANOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUANOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EULSOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EULSOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURETSR1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURETSR1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURMOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURMOTP2Response;

public interface CentralOtpCardOperationDao {
	EGBNRGN1Response EGBNRGN1();
	EGIBOTP1Response EGIBOTP1(EGIBOTP1Request request);
	EGIOTPR2Response EGIOTPR2(EGIOTPR2Request request);
	EGOTPOA1Response EGOTPOA1(EGOTPOA1Request request);
	EIANOTP1Response EIANOTP1(EIANOTP1Request request);
	EUANOTP2Response EUANOTP2(EUANOTP2Request request);
	EULSOTP2Response EULSOTP2(EULSOTP2Request request);
	EURETSR1Response EURETSR1(EURETSR1Request request);
	EURMOTP2Response EURMOTP2(EURMOTP2Request request);
}

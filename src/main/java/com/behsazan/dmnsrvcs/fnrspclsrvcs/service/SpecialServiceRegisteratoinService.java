package com.behsazan.dmnsrvcs.fnrspclsrvcs.service;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDSRVCE3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDSRVCE3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIASRVC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIASRVC1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICSRVC9Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICSRVC9Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCPSW3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCPSW3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCSRVC7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCSRVC7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUMDFSV5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUMDFSV5Response;

public interface SpecialServiceRegisteratoinService {
	EDSRVCE3Response EDSRVCE3(EDSRVCE3Request request);
	EIASRVC1Response EIASRVC1(EIASRVC1Request request);
	EICSRVC9Response EICSRVC9(EICSRVC9Request request);
	EUCCPSW3Response EUCCPSW3(EUCCPSW3Request request);
	EUCSRVC7Response EUCSRVC7(EUCSRVC7Request request);
	EUMDFSV5Response EUMDFSV5(EUMDFSV5Request request);
}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIISSU2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIISSU2Response;

public interface GetUnitOTPOperationDao {
	EGIISSU2Response EGIISSU2(EGIISSU2Request request);
}

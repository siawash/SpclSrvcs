package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSWRP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSWRP1Response;

public interface PasswordRequestOperationDao {
	EGPSWRP1Response EGPSWRP1(EGPSWRP1Request request);
}

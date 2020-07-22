package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCHKAC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCHKAC1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSDTL1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSDTL1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPWREQ1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPWREQ1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGRQDTL1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGRQDTL1Response;

public interface PassWordMonitorDao {
	EGCHKAC1Response EGCHKAC1(EGCHKAC1Request request);
	EGPSDTL1Response EGPSDTL1(EGPSDTL1Request request);
	EGPWREQ1Response EGPWREQ1(EGPWREQ1Request request);
	EGRQDTL1Response EGRQDTL1(EGRQDTL1Request request);
}

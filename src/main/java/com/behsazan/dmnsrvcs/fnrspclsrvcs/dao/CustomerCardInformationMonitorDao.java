package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Response;

public interface CustomerCardInformationMonitorDao {
	EGCACRC6Response EGCACRC6(EGCACRC6Request request);
}

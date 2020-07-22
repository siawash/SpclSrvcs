package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.AGBBGSS2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.AGBBGSS2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDCREGP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDCREGP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCAO1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCAO1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSL2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSL2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBSREX1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBSREX1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACCL5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACCL5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCRREP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCRREP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUCUS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUCUS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBEXSR1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBEXSR1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBMAMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBMAMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICREGP3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICREGP3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERWDCND3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERWDCND3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCADMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCADMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCUST1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCUST1Response;

public interface BBankingServiceOperationDao {
	AGBBGSS2Response AGBBGSS2(AGBBGSS2Request request);
	EDCREGP2Response EDCREGP2(EDCREGP2Request request);
	EGBBCAO1Response EGBBCAO1(EGBBCAO1Request request);
	EGBBCSL2Response EGBBCSL2(EGBBCSL2Request request);
	EGBSREX1Response EGBSREX1(EGBSREX1Request request);
	EGCACCL5Response EGCACCL5(EGCACCL5Request request);
	EGCRREP2Response EGCRREP2(EGCRREP2Request request);
	EGCUCUS3Response EGCUCUS3(EGCUCUS3Request request);
	EIBEXSR1Response EIBEXSR1(EIBEXSR1Request request);
	EIBMAMN2Response EIBMAMN2(EIBMAMN2Request request);
	EICREGP3Response EICREGP3(EICREGP3Request request);
	ERWDCND3Response ERWDCND3(ERWDCND3Request request);
	EUCADMN2Response EUCADMN2(EUCADMN2Request request);
	EUCCUST1Response EUCCUST1(EUCCUST1Request request);
}

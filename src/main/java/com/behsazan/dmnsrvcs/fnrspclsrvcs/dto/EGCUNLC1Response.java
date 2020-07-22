package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGCUNLC1Response extends Response {
	private BigDecimal extcustid;
	private String unlockcode;
	private String ownername;

	public BigDecimal getExtcustid() {
		return extcustid;
	}
	public void setExtcustid(BigDecimal extcustid) {
		this.extcustid = extcustid;
	}

	public String getUnlockcode() {
		return unlockcode;
	}
	public void setUnlockcode(String unlockcode) {
		this.unlockcode = unlockcode;
	}

	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

}

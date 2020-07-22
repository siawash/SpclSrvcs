package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EUCDTCU3Response extends Response {
	private Short tstatus;
	private Short customerstatus;
	private BigDecimal followid;

	public Short getTstatus() {
		return tstatus;
	}
	public void setTstatus(Short tstatus) {
		this.tstatus = tstatus;
	}

	public Short getCustomerstatus() {
		return customerstatus;
	}
	public void setCustomerstatus(Short customerstatus) {
		this.customerstatus = customerstatus;
	}

	public BigDecimal getFollowid() {
		return followid;
	}
	public void setFollowid(BigDecimal followid) {
		this.followid = followid;
	}

}

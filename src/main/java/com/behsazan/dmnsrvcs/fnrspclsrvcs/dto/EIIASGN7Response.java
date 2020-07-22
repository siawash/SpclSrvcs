package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EIIASGN7Response extends Response {
	private BigDecimal followid;

	public BigDecimal getFollowid() {
		return followid;
	}
	public void setFollowid(BigDecimal followid) {
		this.followid = followid;
	}

}

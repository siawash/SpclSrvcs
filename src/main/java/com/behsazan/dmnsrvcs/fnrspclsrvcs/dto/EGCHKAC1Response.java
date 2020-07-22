package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGCHKAC1Response extends Response {
	private BigDecimal orgtype;

	public BigDecimal getOrgtype() {
		return orgtype;
	}
	public void setOrgtype(BigDecimal orgtype) {
		this.orgtype = orgtype;
	}

}

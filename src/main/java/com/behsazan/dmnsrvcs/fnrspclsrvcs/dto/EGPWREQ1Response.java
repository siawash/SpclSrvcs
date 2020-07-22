package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGPWREQ1Response extends Response {
	private BigDecimal orgtype;
	private String usedenvcode;
	private String reqno;

	public BigDecimal getOrgtype() {
		return orgtype;
	}
	public void setOrgtype(BigDecimal orgtype) {
		this.orgtype = orgtype;
	}

	public String getUsedenvcode() {
		return usedenvcode;
	}
	public void setUsedenvcode(String usedenvcode) {
		this.usedenvcode = usedenvcode;
	}

	public String getReqno() {
		return reqno;
	}
	public void setReqno(String reqno) {
		this.reqno = reqno;
	}

}

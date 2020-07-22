package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EGOTPOA1Request extends Request {
	private Short statusx;
	private Integer fromdate;
	private Integer todate;
	private Integer branch;
	private Integer rgncode;

	public Short getStatusx() {
		return statusx;
	}
	public void setStatusx(Short statusx) {
		this.statusx = statusx;
	}

	public Integer getFromdate() {
		return fromdate;
	}
	public void setFromdate(Integer fromdate) {
		this.fromdate = fromdate;
	}

	public Integer getTodate() {
		return todate;
	}
	public void setTodate(Integer todate) {
		this.todate = todate;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getRgncode() {
		return rgncode;
	}
	public void setRgncode(Integer rgncode) {
		this.rgncode = rgncode;
	}

}

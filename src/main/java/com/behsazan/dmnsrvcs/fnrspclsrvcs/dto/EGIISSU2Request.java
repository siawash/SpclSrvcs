package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EGIISSU2Request extends Request {
	private Short envcode;
	private Integer fromdate;
	private Integer todate;
	private Integer otptype;
	private Integer branch;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
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

	public Integer getOtptype() {
		return otptype;
	}
	public void setOtptype(Integer otptype) {
		this.otptype = otptype;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

}

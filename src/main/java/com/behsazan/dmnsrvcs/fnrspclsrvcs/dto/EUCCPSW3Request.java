package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EUCCPSW3Request extends Request {
	private Short envcode;
	private Integer intcustid;
	private String statusx;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public String getStatusx() {
		return statusx;
	}
	public void setStatusx(String statusx) {
		this.statusx = statusx;
	}

}

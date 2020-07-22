package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EUCHNGS1Request extends Request {
	private Short otptype;
	private Short cardtype;
	private Integer branch;
	private Integer intcustid;
	private Integer cardid;
	private String mobileno;

	public Short getOtptype() {
		return otptype;
	}
	public void setOtptype(Short otptype) {
		this.otptype = otptype;
	}

	public Short getCardtype() {
		return cardtype;
	}
	public void setCardtype(Short cardtype) {
		this.cardtype = cardtype;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getCardid() {
		return cardid;
	}
	public void setCardid(Integer cardid) {
		this.cardid = cardid;
	}

	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

}

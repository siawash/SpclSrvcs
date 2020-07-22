package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EROTPRE3Request extends Request {
	private Short otptype;
	private Integer cardid;
	private String mobilno;

	public Short getOtptype() {
		return otptype;
	}
	public void setOtptype(Short otptype) {
		this.otptype = otptype;
	}

	public Integer getCardid() {
		return cardid;
	}
	public void setCardid(Integer cardid) {
		this.cardid = cardid;
	}

	public String getMobilno() {
		return mobilno;
	}
	public void setMobilno(String mobilno) {
		this.mobilno = mobilno;
	}

}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGHCUST5Request extends Request {
	private Short otptype;
	private Integer branch;
	private BigDecimal extaccno;

	public Short getOtptype() {
		return otptype;
	}
	public void setOtptype(Short otptype) {
		this.otptype = otptype;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

}

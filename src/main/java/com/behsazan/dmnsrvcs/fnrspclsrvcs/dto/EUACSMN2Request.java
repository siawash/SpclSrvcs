package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EUACSMN2Request extends Request {
	private Short servicecode;
	private Integer intcustid;
	private BigDecimal accno;
	private BigDecimal maxpayamnt;
	private String userid;

	public Short getServicecode() {
		return servicecode;
	}
	public void setServicecode(Short servicecode) {
		this.servicecode = servicecode;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public BigDecimal getAccno() {
		return accno;
	}
	public void setAccno(BigDecimal accno) {
		this.accno = accno;
	}

	public BigDecimal getMaxpayamnt() {
		return maxpayamnt;
	}
	public void setMaxpayamnt(BigDecimal maxpayamnt) {
		this.maxpayamnt = maxpayamnt;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGINTNM1Response extends Response {
	private Integer intcustid;
	private Integer acctype;
	private Integer controlpayerid;
	private BigDecimal accno;
	private String email;
	private String custspec;

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getAcctype() {
		return acctype;
	}
	public void setAcctype(Integer acctype) {
		this.acctype = acctype;
	}

	public Integer getControlpayerid() {
		return controlpayerid;
	}
	public void setControlpayerid(Integer controlpayerid) {
		this.controlpayerid = controlpayerid;
	}

	public BigDecimal getAccno() {
		return accno;
	}
	public void setAccno(BigDecimal accno) {
		this.accno = accno;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustspec() {
		return custspec;
	}
	public void setCustspec(String custspec) {
		this.custspec = custspec;
	}

}

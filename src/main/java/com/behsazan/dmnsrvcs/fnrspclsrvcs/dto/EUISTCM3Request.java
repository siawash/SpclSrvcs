package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EUISTCM3Request extends Request {
	private Short bbstatus;
	private Short actiontype;
	private Integer intcustid;
	private BigDecimal nationalcode;
	private String userid;
	private String adminpass;
	private String adminusername;

	public Short getBbstatus() {
		return bbstatus;
	}
	public void setBbstatus(Short bbstatus) {
		this.bbstatus = bbstatus;
	}

	public Short getActiontype() {
		return actiontype;
	}
	public void setActiontype(Short actiontype) {
		this.actiontype = actiontype;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public BigDecimal getNationalcode() {
		return nationalcode;
	}
	public void setNationalcode(BigDecimal nationalcode) {
		this.nationalcode = nationalcode;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAdminpass() {
		return adminpass;
	}
	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}

	public String getAdminusername() {
		return adminusername;
	}
	public void setAdminusername(String adminusername) {
		this.adminusername = adminusername;
	}

}

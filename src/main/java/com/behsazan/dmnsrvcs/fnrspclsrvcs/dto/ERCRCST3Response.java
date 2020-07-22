package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;

public class ERCRCST3Response extends Response {
	private Short currentgrade;
	private Short authority;
	private Integer branch;
	private String mobileno;
	private String extcustidoraccno;
	private String ownername;
	private String email;
	private Object resultset0;

	public Short getCurrentgrade() {
		return currentgrade;
	}
	public void setCurrentgrade(Short currentgrade) {
		this.currentgrade = currentgrade;
	}

	public Short getAuthority() {
		return authority;
	}
	public void setAuthority(Short authority) {
		this.authority = authority;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getExtcustidoraccno() {
		return extcustidoraccno;
	}
	public void setExtcustidoraccno(String extcustidoraccno) {
		this.extcustidoraccno = extcustidoraccno;
	}

	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Object getResultset0() {
		return resultset0;
	}
	public void setResultset0(Object resultset0) {
		this.resultset0 = resultset0;
	}

}

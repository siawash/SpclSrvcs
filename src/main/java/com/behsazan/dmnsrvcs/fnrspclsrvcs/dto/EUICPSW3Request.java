package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EUICPSW3Request extends Request {
	private Integer intcustid;
	private String userid;
	private String adminusername;
	private String adminpass;

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAdminusername() {
		return adminusername;
	}
	public void setAdminusername(String adminusername) {
		this.adminusername = adminusername;
	}

	public String getAdminpass() {
		return adminpass;
	}
	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}

}

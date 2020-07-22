package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EUCADMN2Request extends Request {
	private Short usertype;
	private Integer intcustid;
	private String newusername;

	public Short getUsertype() {
		return usertype;
	}
	public void setUsertype(Short usertype) {
		this.usertype = usertype;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public String getNewusername() {
		return newusername;
	}
	public void setNewusername(String newusername) {
		this.newusername = newusername;
	}

}

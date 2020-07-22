package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EGCACCL5Request extends Request {
	private Short usertype;
	private Integer intcustid;

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

}

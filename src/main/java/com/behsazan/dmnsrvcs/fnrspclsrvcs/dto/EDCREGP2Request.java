package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EDCREGP2Request extends Request {
	private Short usertype;
	private Integer intcustid;
	private Integer rowid;

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

	public Integer getRowid() {
		return rowid;
	}
	public void setRowid(Integer rowid) {
		this.rowid = rowid;
	}

}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EGCRREP2Request extends Request {
	private Short usertype;
	private Integer intcustid;
	private Integer todate;

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

	public Integer getTodate() {
		return todate;
	}
	public void setTodate(Integer todate) {
		this.todate = todate;
	}

}

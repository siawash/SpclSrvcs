package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EGBBCSL2Request extends Request {
	private Short servicestatus;
	private Integer intcustid;
	private Integer currentdate;

	public Short getServicestatus() {
		return servicestatus;
	}
	public void setServicestatus(Short servicestatus) {
		this.servicestatus = servicestatus;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(Integer currentdate) {
		this.currentdate = currentdate;
	}

}

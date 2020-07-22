package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class AGBBGSS2Request extends Request {
	private Integer intcustid;
	private Integer currentdate;

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

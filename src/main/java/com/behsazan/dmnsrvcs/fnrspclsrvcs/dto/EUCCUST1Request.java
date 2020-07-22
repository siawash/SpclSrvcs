package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EUCCUST1Request extends Request {
	private Integer intcustid;
	private Integer transferdate;
	private Integer transfertime;

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getTransferdate() {
		return transferdate;
	}
	public void setTransferdate(Integer transferdate) {
		this.transferdate = transferdate;
	}

	public Integer getTransfertime() {
		return transfertime;
	}
	public void setTransfertime(Integer transfertime) {
		this.transfertime = transfertime;
	}

}

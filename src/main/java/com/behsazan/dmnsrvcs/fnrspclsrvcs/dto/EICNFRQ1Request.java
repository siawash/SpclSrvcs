package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EICNFRQ1Request extends Request {
	private Short cnfrmstatus;
	private Integer branch;
	private Integer today;
	private String userid;
	private String cnfrmenvcode;
	private String reqno;

	public Short getCnfrmstatus() {
		return cnfrmstatus;
	}
	public void setCnfrmstatus(Short cnfrmstatus) {
		this.cnfrmstatus = cnfrmstatus;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getToday() {
		return today;
	}
	public void setToday(Integer today) {
		this.today = today;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCnfrmenvcode() {
		return cnfrmenvcode;
	}
	public void setCnfrmenvcode(String cnfrmenvcode) {
		this.cnfrmenvcode = cnfrmenvcode;
	}

	public String getReqno() {
		return reqno;
	}
	public void setReqno(String reqno) {
		this.reqno = reqno;
	}

}

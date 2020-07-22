package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EIEDTRQ1Request extends Request {
	private Integer branch;
	private Integer today;
	private String userid;
	private String envcode;
	private String reqno;

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

	public String getEnvcode() {
		return envcode;
	}
	public void setEnvcode(String envcode) {
		this.envcode = envcode;
	}

	public String getReqno() {
		return reqno;
	}
	public void setReqno(String reqno) {
		this.reqno = reqno;
	}

}

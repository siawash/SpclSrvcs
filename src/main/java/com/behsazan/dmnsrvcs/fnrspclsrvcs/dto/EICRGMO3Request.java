package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EICRGMO3Request extends Request {
	private Short type;
	private Short envcode;
	private Short custinquiry;
	private Integer intcustid;
	private Integer branch;
	private Integer verifycode;
	private Integer date;
	private Integer time;
	private String userid;
	private String newmobileno;

	public Short getType() {
		return type;
	}
	public void setType(Short type) {
		this.type = type;
	}

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public Short getCustinquiry() {
		return custinquiry;
	}
	public void setCustinquiry(Short custinquiry) {
		this.custinquiry = custinquiry;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getVerifycode() {
		return verifycode;
	}
	public void setVerifycode(Integer verifycode) {
		this.verifycode = verifycode;
	}

	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}

	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getNewmobileno() {
		return newmobileno;
	}
	public void setNewmobileno(String newmobileno) {
		this.newmobileno = newmobileno;
	}

}

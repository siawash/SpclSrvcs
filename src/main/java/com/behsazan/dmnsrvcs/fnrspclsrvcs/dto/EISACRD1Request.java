package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EISACRD1Request extends Request {
	private Short envcode;
	private Integer intcustid;
	private String followid;
	private String mobileno;
	private String operationtime;
	private String messagetext;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public String getFollowid() {
		return followid;
	}
	public void setFollowid(String followid) {
		this.followid = followid;
	}

	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getOperationtime() {
		return operationtime;
	}
	public void setOperationtime(String operationtime) {
		this.operationtime = operationtime;
	}

	public String getMessagetext() {
		return messagetext;
	}
	public void setMessagetext(String messagetext) {
		this.messagetext = messagetext;
	}

}

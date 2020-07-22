package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EICCPSW4Request extends Request {
	private Short envcode;
	private Integer today;
	private Integer intcustid;
	private BigDecimal orgtype;
	private String passwordx;
	private String userid;
	private String reqno;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public Integer getToday() {
		return today;
	}
	public void setToday(Integer today) {
		this.today = today;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public BigDecimal getOrgtype() {
		return orgtype;
	}
	public void setOrgtype(BigDecimal orgtype) {
		this.orgtype = orgtype;
	}

	public String getPasswordx() {
		return passwordx;
	}
	public void setPasswordx(String passwordx) {
		this.passwordx = passwordx;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getReqno() {
		return reqno;
	}
	public void setReqno(String reqno) {
		this.reqno = reqno;
	}

}

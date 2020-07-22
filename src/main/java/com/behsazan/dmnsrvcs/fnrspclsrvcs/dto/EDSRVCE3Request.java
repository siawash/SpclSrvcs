package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EDSRVCE3Request extends Request {
	private Short envcode;
	private Short servicecode;
	private Integer intcustid;
	private Integer today;
	private BigDecimal accno;
	private String userid;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public Short getServicecode() {
		return servicecode;
	}
	public void setServicecode(Short servicecode) {
		this.servicecode = servicecode;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getToday() {
		return today;
	}
	public void setToday(Integer today) {
		this.today = today;
	}

	public BigDecimal getAccno() {
		return accno;
	}
	public void setAccno(BigDecimal accno) {
		this.accno = accno;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}

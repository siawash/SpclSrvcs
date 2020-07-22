package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EICSRVC9Request extends Request {
	private Short servicegroupcode;
	private Short envcode;
	private Integer intcustid;
	private Integer startdate;
	private Integer expiredate;
	private Integer commisionfee;
	private Integer today;
	private BigDecimal extaccno;
	private String userid;
	private String mobileno;

	public Short getServicegroupcode() {
		return servicegroupcode;
	}
	public void setServicegroupcode(Short servicegroupcode) {
		this.servicegroupcode = servicegroupcode;
	}

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

	public Integer getStartdate() {
		return startdate;
	}
	public void setStartdate(Integer startdate) {
		this.startdate = startdate;
	}

	public Integer getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(Integer expiredate) {
		this.expiredate = expiredate;
	}

	public Integer getCommisionfee() {
		return commisionfee;
	}
	public void setCommisionfee(Integer commisionfee) {
		this.commisionfee = commisionfee;
	}

	public Integer getToday() {
		return today;
	}
	public void setToday(Integer today) {
		this.today = today;
	}

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

}

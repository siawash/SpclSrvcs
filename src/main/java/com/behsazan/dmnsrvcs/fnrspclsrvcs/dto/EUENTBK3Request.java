package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EUENTBK3Request extends Request {
	private Short servicegroupcode;
	private Short servicecode;
	private Integer intcustid;
	private Integer expiredate;
	private Integer startdate;
	private Integer lastrowflag;
	private BigDecimal extaccno;
	private BigDecimal commisionfee;
	private BigDecimal totalcommisionfee;
	private String userid;

	public Short getServicegroupcode() {
		return servicegroupcode;
	}
	public void setServicegroupcode(Short servicegroupcode) {
		this.servicegroupcode = servicegroupcode;
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

	public Integer getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(Integer expiredate) {
		this.expiredate = expiredate;
	}

	public Integer getStartdate() {
		return startdate;
	}
	public void setStartdate(Integer startdate) {
		this.startdate = startdate;
	}

	public Integer getLastrowflag() {
		return lastrowflag;
	}
	public void setLastrowflag(Integer lastrowflag) {
		this.lastrowflag = lastrowflag;
	}

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

	public BigDecimal getCommisionfee() {
		return commisionfee;
	}
	public void setCommisionfee(BigDecimal commisionfee) {
		this.commisionfee = commisionfee;
	}

	public BigDecimal getTotalcommisionfee() {
		return totalcommisionfee;
	}
	public void setTotalcommisionfee(BigDecimal totalcommisionfee) {
		this.totalcommisionfee = totalcommisionfee;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}

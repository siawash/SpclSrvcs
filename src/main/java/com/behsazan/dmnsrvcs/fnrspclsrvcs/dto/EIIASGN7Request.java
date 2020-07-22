package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EIIASGN7Request extends Request {
	private Short servicegroupcode;
	private Short servicecode;
	private Integer intcustid;
	private Integer setservicedate;
	private Integer lastrowflag;
	private Integer expiredate;
	private Integer startdate;
	private BigDecimal nationalcode;
	private BigDecimal extaccno;
	private BigDecimal commisionfee;
	private BigDecimal totalcommisionfee;
	private String userid;
	private String companyname;

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

	public Integer getSetservicedate() {
		return setservicedate;
	}
	public void setSetservicedate(Integer setservicedate) {
		this.setservicedate = setservicedate;
	}

	public Integer getLastrowflag() {
		return lastrowflag;
	}
	public void setLastrowflag(Integer lastrowflag) {
		this.lastrowflag = lastrowflag;
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

	public BigDecimal getNationalcode() {
		return nationalcode;
	}
	public void setNationalcode(BigDecimal nationalcode) {
		this.nationalcode = nationalcode;
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

	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

}

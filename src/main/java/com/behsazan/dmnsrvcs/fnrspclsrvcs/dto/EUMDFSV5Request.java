package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EUMDFSV5Request extends Request {
	private Short servicecode;
	private Short servicegroupcode;
	private Short prdcsendinfo;
	private Short envcode;
	private Integer intcustid;
	private Integer branch;
	private Integer commisionfee;
	private Integer startdate;
	private Integer expiredate;
	private Integer today;
	private BigDecimal extaccno;
	private BigDecimal maxpayamnt;
	private BigDecimal verifchqamnt;
	private String userid;
	private String email;

	public Short getServicecode() {
		return servicecode;
	}
	public void setServicecode(Short servicecode) {
		this.servicecode = servicecode;
	}

	public Short getServicegroupcode() {
		return servicegroupcode;
	}
	public void setServicegroupcode(Short servicegroupcode) {
		this.servicegroupcode = servicegroupcode;
	}

	public Short getPrdcsendinfo() {
		return prdcsendinfo;
	}
	public void setPrdcsendinfo(Short prdcsendinfo) {
		this.prdcsendinfo = prdcsendinfo;
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

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getCommisionfee() {
		return commisionfee;
	}
	public void setCommisionfee(Integer commisionfee) {
		this.commisionfee = commisionfee;
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

	public BigDecimal getMaxpayamnt() {
		return maxpayamnt;
	}
	public void setMaxpayamnt(BigDecimal maxpayamnt) {
		this.maxpayamnt = maxpayamnt;
	}

	public BigDecimal getVerifchqamnt() {
		return verifchqamnt;
	}
	public void setVerifchqamnt(BigDecimal verifchqamnt) {
		this.verifchqamnt = verifchqamnt;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EICWDWC2Request extends Request {
	private Short envcode;
	private Short confirmtype;
	private Short categorycode;
	private Short totalcatsign;
	private Integer intcustid;
	private Integer pintcustid;
	private Integer expiredate;
	private String nationalcode;
	private String operationid;
	private String name;
	private String family;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public Short getConfirmtype() {
		return confirmtype;
	}
	public void setConfirmtype(Short confirmtype) {
		this.confirmtype = confirmtype;
	}

	public Short getCategorycode() {
		return categorycode;
	}
	public void setCategorycode(Short categorycode) {
		this.categorycode = categorycode;
	}

	public Short getTotalcatsign() {
		return totalcatsign;
	}
	public void setTotalcatsign(Short totalcatsign) {
		this.totalcatsign = totalcatsign;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getPintcustid() {
		return pintcustid;
	}
	public void setPintcustid(Integer pintcustid) {
		this.pintcustid = pintcustid;
	}

	public Integer getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(Integer expiredate) {
		this.expiredate = expiredate;
	}

	public String getNationalcode() {
		return nationalcode;
	}
	public void setNationalcode(String nationalcode) {
		this.nationalcode = nationalcode;
	}

	public String getOperationid() {
		return operationid;
	}
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}

}

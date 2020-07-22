package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EIREGRQ1Request extends Request {
	private Integer branch;
	private Integer today;
	private BigDecimal extaccno;
	private BigDecimal extcustid;
	private String creatoruserid;
	private String reqenvcode;
	private String custname;

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

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

	public BigDecimal getExtcustid() {
		return extcustid;
	}
	public void setExtcustid(BigDecimal extcustid) {
		this.extcustid = extcustid;
	}

	public String getCreatoruserid() {
		return creatoruserid;
	}
	public void setCreatoruserid(String creatoruserid) {
		this.creatoruserid = creatoruserid;
	}

	public String getReqenvcode() {
		return reqenvcode;
	}
	public void setReqenvcode(String reqenvcode) {
		this.reqenvcode = reqenvcode;
	}

	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}

}

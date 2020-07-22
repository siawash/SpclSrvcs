package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;

public class EGINFOC1Response extends Response {
	private Short typex;
	private Short custtype;
	private Short acctype;
	private Integer intcustid;
	private Integer branch;
	private String extcustid;
	private String custname;
	private String accdesc;
	private Object resultset0;

	public Short getTypex() {
		return typex;
	}
	public void setTypex(Short typex) {
		this.typex = typex;
	}

	public Short getCusttype() {
		return custtype;
	}
	public void setCusttype(Short custtype) {
		this.custtype = custtype;
	}

	public Short getAcctype() {
		return acctype;
	}
	public void setAcctype(Short acctype) {
		this.acctype = acctype;
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

	public String getExtcustid() {
		return extcustid;
	}
	public void setExtcustid(String extcustid) {
		this.extcustid = extcustid;
	}

	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getAccdesc() {
		return accdesc;
	}
	public void setAccdesc(String accdesc) {
		this.accdesc = accdesc;
	}

	public Object getResultset0() {
		return resultset0;
	}
	public void setResultset0(Object resultset0) {
		this.resultset0 = resultset0;
	}

}

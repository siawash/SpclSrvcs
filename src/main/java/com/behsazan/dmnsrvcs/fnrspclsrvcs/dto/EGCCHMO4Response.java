package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;

public class EGCCHMO4Response extends Response {
	private Short step;
	private Short status;
	private Short custinquiry;
	private Integer branch;
	private String oldmobileno;
	private String newmobileno;

	public Short getStep() {
		return step;
	}
	public void setStep(Short step) {
		this.step = step;
	}

	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getCustinquiry() {
		return custinquiry;
	}
	public void setCustinquiry(Short custinquiry) {
		this.custinquiry = custinquiry;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public String getOldmobileno() {
		return oldmobileno;
	}
	public void setOldmobileno(String oldmobileno) {
		this.oldmobileno = oldmobileno;
	}

	public String getNewmobileno() {
		return newmobileno;
	}
	public void setNewmobileno(String newmobileno) {
		this.newmobileno = newmobileno;
	}

}

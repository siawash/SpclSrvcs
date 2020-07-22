package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EGPSWRP1Request extends Request {
	private Short reptype;
	private Integer branch;
	private Integer fromdate;
	private Integer todate;
	private String extaccno;
	private String reqno;

	public Short getReptype() {
		return reptype;
	}
	public void setReptype(Short reptype) {
		this.reptype = reptype;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getFromdate() {
		return fromdate;
	}
	public void setFromdate(Integer fromdate) {
		this.fromdate = fromdate;
	}

	public Integer getTodate() {
		return todate;
	}
	public void setTodate(Integer todate) {
		this.todate = todate;
	}

	public String getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(String extaccno) {
		this.extaccno = extaccno;
	}

	public String getReqno() {
		return reqno;
	}
	public void setReqno(String reqno) {
		this.reqno = reqno;
	}

}

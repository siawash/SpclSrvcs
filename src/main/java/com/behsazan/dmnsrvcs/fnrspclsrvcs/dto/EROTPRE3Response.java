package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EROTPRE3Response extends Response {
	private Short statusx;
	private Integer branch;
	private Integer firstassigndate;
	private Integer branchassigndate;
	private Integer custassigndate;
	private Integer refunddate;
	private Integer revokedate;
	private Integer lastassigndate;
	private BigDecimal extcustid;

	public Short getStatusx() {
		return statusx;
	}
	public void setStatusx(Short statusx) {
		this.statusx = statusx;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getFirstassigndate() {
		return firstassigndate;
	}
	public void setFirstassigndate(Integer firstassigndate) {
		this.firstassigndate = firstassigndate;
	}

	public Integer getBranchassigndate() {
		return branchassigndate;
	}
	public void setBranchassigndate(Integer branchassigndate) {
		this.branchassigndate = branchassigndate;
	}

	public Integer getCustassigndate() {
		return custassigndate;
	}
	public void setCustassigndate(Integer custassigndate) {
		this.custassigndate = custassigndate;
	}

	public Integer getRefunddate() {
		return refunddate;
	}
	public void setRefunddate(Integer refunddate) {
		this.refunddate = refunddate;
	}

	public Integer getRevokedate() {
		return revokedate;
	}
	public void setRevokedate(Integer revokedate) {
		this.revokedate = revokedate;
	}

	public Integer getLastassigndate() {
		return lastassigndate;
	}
	public void setLastassigndate(Integer lastassigndate) {
		this.lastassigndate = lastassigndate;
	}

	public BigDecimal getExtcustid() {
		return extcustid;
	}
	public void setExtcustid(BigDecimal extcustid) {
		this.extcustid = extcustid;
	}

}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGBBSEB1Request extends Request {
	private Short servicecode;
	private Integer branch;
	private Integer fromdate;
	private Integer todate;
	private BigDecimal extaccno;

	public Short getServicecode() {
		return servicecode;
	}
	public void setServicecode(Short servicecode) {
		this.servicecode = servicecode;
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

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

}

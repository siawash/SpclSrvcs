package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGBCSAM1Request extends Request {
	private Short servicetype;
	private Integer branch;
	private BigDecimal extaccno;

	public Short getServicetype() {
		return servicetype;
	}
	public void setServicetype(Short servicetype) {
		this.servicetype = servicetype;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

}

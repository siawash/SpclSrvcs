package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGBBASG2Request extends Request {
	private Short envcode;
	private Integer branch;
	private BigDecimal extaccno;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
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

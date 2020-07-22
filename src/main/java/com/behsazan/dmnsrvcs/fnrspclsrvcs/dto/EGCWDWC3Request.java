package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGCWDWC3Request extends Request {
	private Short envcode;
	private Integer usrbranch;
	private BigDecimal extaccno;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public Integer getUsrbranch() {
		return usrbranch;
	}
	public void setUsrbranch(Integer usrbranch) {
		this.usrbranch = usrbranch;
	}

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class ERCRCST3Request extends Request {
	private Short envcode;
	private BigDecimal extcustid;
	private BigDecimal extaccno;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public BigDecimal getExtcustid() {
		return extcustid;
	}
	public void setExtcustid(BigDecimal extcustid) {
		this.extcustid = extcustid;
	}

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

}

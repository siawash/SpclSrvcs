package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGCSRVC3Request extends Request {
	private BigDecimal extaccno;
	private Integer intcustid;
	private Short envcode;

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

}

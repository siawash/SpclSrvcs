package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGRQDTL1Response extends Response {
	private BigDecimal extaccno;
	private BigDecimal extcustid;
	private String envcode;

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

	public BigDecimal getExtcustid() {
		return extcustid;
	}
	public void setExtcustid(BigDecimal extcustid) {
		this.extcustid = extcustid;
	}

	public String getEnvcode() {
		return envcode;
	}
	public void setEnvcode(String envcode) {
		this.envcode = envcode;
	}

}

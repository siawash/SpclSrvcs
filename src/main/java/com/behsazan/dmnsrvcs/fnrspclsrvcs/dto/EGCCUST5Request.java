package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGCCUST5Request extends Request {
	private BigDecimal extaccno;
	private BigDecimal extcustid;

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

}

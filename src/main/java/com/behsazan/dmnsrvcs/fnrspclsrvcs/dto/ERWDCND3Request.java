package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class ERWDCND3Request extends Request {
	private Short usertype;
	private BigDecimal accno;

	public Short getUsertype() {
		return usertype;
	}
	public void setUsertype(Short usertype) {
		this.usertype = usertype;
	}

	public BigDecimal getAccno() {
		return accno;
	}
	public void setAccno(BigDecimal accno) {
		this.accno = accno;
	}

}

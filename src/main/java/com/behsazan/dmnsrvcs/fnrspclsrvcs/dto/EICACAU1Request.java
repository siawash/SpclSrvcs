package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EICACAU1Request extends Request {
	private Short statusx;
	private Integer today;
	private BigDecimal accno;

	public Short getStatusx() {
		return statusx;
	}
	public void setStatusx(Short statusx) {
		this.statusx = statusx;
	}

	public Integer getToday() {
		return today;
	}
	public void setToday(Integer today) {
		this.today = today;
	}

	public BigDecimal getAccno() {
		return accno;
	}
	public void setAccno(BigDecimal accno) {
		this.accno = accno;
	}

}

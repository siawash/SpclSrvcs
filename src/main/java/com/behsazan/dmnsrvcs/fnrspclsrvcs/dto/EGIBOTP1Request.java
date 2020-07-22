package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGIBOTP1Request extends Request {
	private Short statusx;
	private Integer fromdate;
	private Integer todate;
	private Integer cardid;
	private BigDecimal extaccno;

	public Short getStatusx() {
		return statusx;
	}
	public void setStatusx(Short statusx) {
		this.statusx = statusx;
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

	public Integer getCardid() {
		return cardid;
	}
	public void setCardid(Integer cardid) {
		this.cardid = cardid;
	}

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

}

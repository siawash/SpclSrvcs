package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGCACRC6Response extends Response {
	private Short typex;
	private Short custtype;
	private Short cardstatus;
	private Integer cardid;
	private Integer intcustid;
	private BigDecimal idcode;
	private String custspec;
	private Object resultset0;

	public Short getTypex() {
		return typex;
	}
	public void setTypex(Short typex) {
		this.typex = typex;
	}

	public Short getCusttype() {
		return custtype;
	}
	public void setCusttype(Short custtype) {
		this.custtype = custtype;
	}

	public Short getCardstatus() {
		return cardstatus;
	}
	public void setCardstatus(Short cardstatus) {
		this.cardstatus = cardstatus;
	}

	public Integer getCardid() {
		return cardid;
	}
	public void setCardid(Integer cardid) {
		this.cardid = cardid;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public BigDecimal getIdcode() {
		return idcode;
	}
	public void setIdcode(BigDecimal idcode) {
		this.idcode = idcode;
	}

	public String getCustspec() {
		return custspec;
	}
	public void setCustspec(String custspec) {
		this.custspec = custspec;
	}

	public Object getResultset0() {
		return resultset0;
	}
	public void setResultset0(Object resultset0) {
		this.resultset0 = resultset0;
	}

}

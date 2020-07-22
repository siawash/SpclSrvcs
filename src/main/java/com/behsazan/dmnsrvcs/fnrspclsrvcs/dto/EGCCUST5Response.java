package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGCCUST5Response extends Response {
	private Short typex;
	private Short currentgrade;
	private BigDecimal custtype;
	private String cnddesc;
	private Object resultset0;

	public Short getTypex() {
		return typex;
	}
	public void setTypex(Short typex) {
		this.typex = typex;
	}

	public Short getCurrentgrade() {
		return currentgrade;
	}
	public void setCurrentgrade(Short currentgrade) {
		this.currentgrade = currentgrade;
	}

	public BigDecimal getCusttype() {
		return custtype;
	}
	public void setCusttype(BigDecimal custtype) {
		this.custtype = custtype;
	}

	public String getCnddesc() {
		return cnddesc;
	}
	public void setCnddesc(String cnddesc) {
		this.cnddesc = cnddesc;
	}

	public Object getResultset0() {
		return resultset0;
	}
	public void setResultset0(Object resultset0) {
		this.resultset0 = resultset0;
	}

}

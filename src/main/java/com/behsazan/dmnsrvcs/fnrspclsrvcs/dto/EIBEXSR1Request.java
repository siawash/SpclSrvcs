package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EIBEXSR1Request extends Request {
	private Short servicecode;
	private Short lastrowflag;
	private Integer intcustid;
	private Integer currentdate;
	private BigDecimal accno;
	private BigDecimal commisionfee;
	private BigDecimal totalcommisionfee;

	public Short getServicecode() {
		return servicecode;
	}
	public void setServicecode(Short servicecode) {
		this.servicecode = servicecode;
	}

	public Short getLastrowflag() {
		return lastrowflag;
	}
	public void setLastrowflag(Short lastrowflag) {
		this.lastrowflag = lastrowflag;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(Integer currentdate) {
		this.currentdate = currentdate;
	}

	public BigDecimal getAccno() {
		return accno;
	}
	public void setAccno(BigDecimal accno) {
		this.accno = accno;
	}

	public BigDecimal getCommisionfee() {
		return commisionfee;
	}
	public void setCommisionfee(BigDecimal commisionfee) {
		this.commisionfee = commisionfee;
	}

	public BigDecimal getTotalcommisionfee() {
		return totalcommisionfee;
	}
	public void setTotalcommisionfee(BigDecimal totalcommisionfee) {
		this.totalcommisionfee = totalcommisionfee;
	}

}

package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class AGBBGSS2Response extends Response {
	private Short step;
	private Short bbstatus;
	private Integer expdate;
	private BigDecimal cntallservice;
	private BigDecimal cntserviceexp;

	public Short getStep() {
		return step;
	}
	public void setStep(Short step) {
		this.step = step;
	}

	public Short getBbstatus() {
		return bbstatus;
	}
	public void setBbstatus(Short bbstatus) {
		this.bbstatus = bbstatus;
	}

	public Integer getExpdate() {
		return expdate;
	}
	public void setExpdate(Integer expdate) {
		this.expdate = expdate;
	}

	public BigDecimal getCntallservice() {
		return cntallservice;
	}
	public void setCntallservice(BigDecimal cntallservice) {
		this.cntallservice = cntallservice;
	}

	public BigDecimal getCntserviceexp() {
		return cntserviceexp;
	}
	public void setCntserviceexp(BigDecimal cntserviceexp) {
		this.cntserviceexp = cntserviceexp;
	}

}

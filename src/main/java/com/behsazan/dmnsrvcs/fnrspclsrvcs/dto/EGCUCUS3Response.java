package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;

public class EGCUCUS3Response extends Response {
	private Integer trnstime;
	private Integer trnsdate;
	private Object resultset0;

	public Integer getTrnstime() {
		return trnstime;
	}
	public void setTrnstime(Integer trnstime) {
		this.trnstime = trnstime;
	}

	public Integer getTrnsdate() {
		return trnsdate;
	}
	public void setTrnsdate(Integer trnsdate) {
		this.trnsdate = trnsdate;
	}

	public Object getResultset0() {
		return resultset0;
	}
	public void setResultset0(Object resultset0) {
		this.resultset0 = resultset0;
	}

}

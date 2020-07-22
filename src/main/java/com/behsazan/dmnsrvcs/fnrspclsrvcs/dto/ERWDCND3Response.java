package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;

public class ERWDCND3Response extends Response {
	private Short draftstatus;
	private Object resultset0;

	public Short getDraftstatus() {
		return draftstatus;
	}
	public void setDraftstatus(Short draftstatus) {
		this.draftstatus = draftstatus;
	}

	public Object getResultset0() {
		return resultset0;
	}
	public void setResultset0(Object resultset0) {
		this.resultset0 = resultset0;
	}

}

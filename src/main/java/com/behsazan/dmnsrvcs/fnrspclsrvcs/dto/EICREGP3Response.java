package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;

public class EICREGP3Response extends Response {
	private Integer rowid;
	private Integer step;

	public Integer getRowid() {
		return rowid;
	}
	public void setRowid(Integer rowid) {
		this.rowid = rowid;
	}

	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}

}

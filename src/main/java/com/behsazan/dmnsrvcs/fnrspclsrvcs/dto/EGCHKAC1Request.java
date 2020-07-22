package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EGCHKAC1Request extends Request {
	private Short action;
	private Integer branch;

	public Short getAction() {
		return action;
	}
	public void setAction(Short action) {
		this.action = action;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

}

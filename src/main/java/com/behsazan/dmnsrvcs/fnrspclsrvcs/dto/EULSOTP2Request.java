package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EULSOTP2Request extends Request {
	private Short cardtype;
	private Integer branch;
	private Integer fromserial;
	private Integer toserial;
	private Integer count;

	public Short getCardtype() {
		return cardtype;
	}
	public void setCardtype(Short cardtype) {
		this.cardtype = cardtype;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getFromserial() {
		return fromserial;
	}
	public void setFromserial(Integer fromserial) {
		this.fromserial = fromserial;
	}

	public Integer getToserial() {
		return toserial;
	}
	public void setToserial(Integer toserial) {
		this.toserial = toserial;
	}

	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}

}

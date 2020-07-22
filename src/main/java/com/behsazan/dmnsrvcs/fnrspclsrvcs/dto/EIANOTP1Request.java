package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;

public class EIANOTP1Request extends Request {
	private Short cardtype;
	private String serial;
	private String unlockcode;

	public Short getCardtype() {
		return cardtype;
	}
	public void setCardtype(Short cardtype) {
		this.cardtype = cardtype;
	}

	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getUnlockcode() {
		return unlockcode;
	}
	public void setUnlockcode(String unlockcode) {
		this.unlockcode = unlockcode;
	}

}

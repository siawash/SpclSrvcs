package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EUCCRDS3Request extends Request {
	private Short action;
	private Integer intcustid;
	private Integer cardid;
	private Integer branch;
	private Integer today;
	private BigDecimal statusx;
	private String userid;

	public Short getAction() {
		return action;
	}
	public void setAction(Short action) {
		this.action = action;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getCardid() {
		return cardid;
	}
	public void setCardid(Integer cardid) {
		this.cardid = cardid;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public Integer getToday() {
		return today;
	}
	public void setToday(Integer today) {
		this.today = today;
	}

	public BigDecimal getStatusx() {
		return statusx;
	}
	public void setStatusx(BigDecimal statusx) {
		this.statusx = statusx;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}

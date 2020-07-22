package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EGCOGAC5Request extends Request {
	private Short action;
	private Integer today;
	private Integer usrbranch;
	private BigDecimal extaccno;

	public Short getAction() {
		return action;
	}
	public void setAction(Short action) {
		this.action = action;
	}

	public Integer getToday() {
		return today;
	}
	public void setToday(Integer today) {
		this.today = today;
	}

	public Integer getUsrbranch() {
		return usrbranch;
	}
	public void setUsrbranch(Integer usrbranch) {
		this.usrbranch = usrbranch;
	}

	public BigDecimal getExtaccno() {
		return extaccno;
	}
	public void setExtaccno(BigDecimal extaccno) {
		this.extaccno = extaccno;
	}

}

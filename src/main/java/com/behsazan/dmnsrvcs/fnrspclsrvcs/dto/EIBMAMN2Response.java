package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EIBMAMN2Response extends Response {
	private Integer step;
	private BigDecimal todaysum;

	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}

	public BigDecimal getTodaysum() {
		return todaysum;
	}
	public void setTodaysum(BigDecimal todaysum) {
		this.todaysum = todaysum;
	}

}

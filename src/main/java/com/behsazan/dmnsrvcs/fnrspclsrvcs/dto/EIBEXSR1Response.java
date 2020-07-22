package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EIBEXSR1Response extends Response {
	private Integer setservicetime;
	private Integer transno;
	private Integer step;
	private BigDecimal followid;
	private BigDecimal totalamount;

	public Integer getSetservicetime() {
		return setservicetime;
	}
	public void setSetservicetime(Integer setservicetime) {
		this.setservicetime = setservicetime;
	}

	public Integer getTransno() {
		return transno;
	}
	public void setTransno(Integer transno) {
		this.transno = transno;
	}

	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}

	public BigDecimal getFollowid() {
		return followid;
	}
	public void setFollowid(BigDecimal followid) {
		this.followid = followid;
	}

	public BigDecimal getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(BigDecimal totalamount) {
		this.totalamount = totalamount;
	}

}

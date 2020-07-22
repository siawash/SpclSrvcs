package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import java.math.BigDecimal;

public class EICCCWC4Request extends Request {
	private Short envcode;
	private Short etrnsstatus;
	private Integer usrbranch;
	private BigDecimal accno;
	private String operationid;

	public Short getEnvcode() {
		return envcode;
	}
	public void setEnvcode(Short envcode) {
		this.envcode = envcode;
	}

	public Short getEtrnsstatus() {
		return etrnsstatus;
	}
	public void setEtrnsstatus(Short etrnsstatus) {
		this.etrnsstatus = etrnsstatus;
	}

	public Integer getUsrbranch() {
		return usrbranch;
	}
	public void setUsrbranch(Integer usrbranch) {
		this.usrbranch = usrbranch;
	}

	public BigDecimal getAccno() {
		return accno;
	}
	public void setAccno(BigDecimal accno) {
		this.accno = accno;
	}

	public String getOperationid() {
		return operationid;
	}
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}

}

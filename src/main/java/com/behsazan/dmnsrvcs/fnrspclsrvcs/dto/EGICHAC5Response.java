package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGICHAC5Response extends Response {
	private Short bbstatus;
	private Integer setservicedate;
	private Integer setservicetime;
	private Integer intcustid;
	private BigDecimal custtype;
	private BigDecimal nationalcode;
	private BigDecimal idcode;
	private String adminusername;
	private String ownername;

	public Short getBbstatus() {
		return bbstatus;
	}
	public void setBbstatus(Short bbstatus) {
		this.bbstatus = bbstatus;
	}

	public Integer getSetservicedate() {
		return setservicedate;
	}
	public void setSetservicedate(Integer setservicedate) {
		this.setservicedate = setservicedate;
	}

	public Integer getSetservicetime() {
		return setservicetime;
	}
	public void setSetservicetime(Integer setservicetime) {
		this.setservicetime = setservicetime;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public BigDecimal getCusttype() {
		return custtype;
	}
	public void setCusttype(BigDecimal custtype) {
		this.custtype = custtype;
	}

	public BigDecimal getNationalcode() {
		return nationalcode;
	}
	public void setNationalcode(BigDecimal nationalcode) {
		this.nationalcode = nationalcode;
	}

	public BigDecimal getIdcode() {
		return idcode;
	}
	public void setIdcode(BigDecimal idcode) {
		this.idcode = idcode;
	}

	public String getAdminusername() {
		return adminusername;
	}
	public void setAdminusername(String adminusername) {
		this.adminusername = adminusername;
	}

	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

}

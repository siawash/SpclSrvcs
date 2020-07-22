package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGCCUSI7Response extends Response {
	private Short typex;
	private Short custtype;
	private Integer intcustid;
	private Integer branch;
	private BigDecimal idcode;
	private String statusx;
	private String mobileno;
	private String extcustid;
	private String customeruid;
	private String accdesc;
	private String custspec;
	private Object resultset0;

	public Short getTypex() {
		return typex;
	}
	public void setTypex(Short typex) {
		this.typex = typex;
	}

	public Short getCusttype() {
		return custtype;
	}
	public void setCusttype(Short custtype) {
		this.custtype = custtype;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getBranch() {
		return branch;
	}
	public void setBranch(Integer branch) {
		this.branch = branch;
	}

	public BigDecimal getIdcode() {
		return idcode;
	}
	public void setIdcode(BigDecimal idcode) {
		this.idcode = idcode;
	}

	public String getStatusx() {
		return statusx;
	}
	public void setStatusx(String statusx) {
		this.statusx = statusx;
	}

	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getExtcustid() {
		return extcustid;
	}
	public void setExtcustid(String extcustid) {
		this.extcustid = extcustid;
	}

	public String getCustomeruid() {
		return customeruid;
	}
	public void setCustomeruid(String customeruid) {
		this.customeruid = customeruid;
	}

	public String getAccdesc() {
		return accdesc;
	}
	public void setAccdesc(String accdesc) {
		this.accdesc = accdesc;
	}

	public String getCustspec() {
		return custspec;
	}
	public void setCustspec(String custspec) {
		this.custspec = custspec;
	}

	public Object getResultset0() {
		return resultset0;
	}
	public void setResultset0(Object resultset0) {
		this.resultset0 = resultset0;
	}

}

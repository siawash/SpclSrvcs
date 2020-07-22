package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGCOGAC5Response extends Response {
	private Short mandcount;
	private Short optcount;
	private Short acctype;
	private Short typex;
	private Short custtype;
	private Short srvstatus;
	private Integer intcustid;
	private BigDecimal idcode;
	private String accno;
	private String extcustid;
	private String custspec;
	private String cnddesc;
	private Object resultset0;

	public Short getMandcount() {
		return mandcount;
	}
	public void setMandcount(Short mandcount) {
		this.mandcount = mandcount;
	}

	public Short getOptcount() {
		return optcount;
	}
	public void setOptcount(Short optcount) {
		this.optcount = optcount;
	}

	public Short getAcctype() {
		return acctype;
	}
	public void setAcctype(Short acctype) {
		this.acctype = acctype;
	}

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

	public Short getSrvstatus() {
		return srvstatus;
	}
	public void setSrvstatus(Short srvstatus) {
		this.srvstatus = srvstatus;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public BigDecimal getIdcode() {
		return idcode;
	}
	public void setIdcode(BigDecimal idcode) {
		this.idcode = idcode;
	}

	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}

	public String getExtcustid() {
		return extcustid;
	}
	public void setExtcustid(String extcustid) {
		this.extcustid = extcustid;
	}

	public String getCustspec() {
		return custspec;
	}
	public void setCustspec(String custspec) {
		this.custspec = custspec;
	}

	public String getCnddesc() {
		return cnddesc;
	}
	public void setCnddesc(String cnddesc) {
		this.cnddesc = cnddesc;
	}

	public Object getResultset0() {
		return resultset0;
	}
	public void setResultset0(Object resultset0) {
		this.resultset0 = resultset0;
	}

}

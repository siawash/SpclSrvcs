package com.behsazan.dmnsrvcs.fnrspclsrvcs.dto;


import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import java.math.BigDecimal;

public class EGHCUST5Response extends Response {
	private Short tcheck;
	private Short acctype;
	private Short custtype;
	private Short cardtype;
	private Short tstatus;
	private Short mstatus;
	private Integer cardid;
	private Integer intcustid;
	private Integer immigrationno;
	private BigDecimal nationalcode;
	private BigDecimal idcode;
	private String mobileno;
	private String passportno;
	private String father;
	private String ownername;

	public Short getTcheck() {
		return tcheck;
	}
	public void setTcheck(Short tcheck) {
		this.tcheck = tcheck;
	}

	public Short getAcctype() {
		return acctype;
	}
	public void setAcctype(Short acctype) {
		this.acctype = acctype;
	}

	public Short getCusttype() {
		return custtype;
	}
	public void setCusttype(Short custtype) {
		this.custtype = custtype;
	}

	public Short getCardtype() {
		return cardtype;
	}
	public void setCardtype(Short cardtype) {
		this.cardtype = cardtype;
	}

	public Short getTstatus() {
		return tstatus;
	}
	public void setTstatus(Short tstatus) {
		this.tstatus = tstatus;
	}

	public Short getMstatus() {
		return mstatus;
	}
	public void setMstatus(Short mstatus) {
		this.mstatus = mstatus;
	}

	public Integer getCardid() {
		return cardid;
	}
	public void setCardid(Integer cardid) {
		this.cardid = cardid;
	}

	public Integer getIntcustid() {
		return intcustid;
	}
	public void setIntcustid(Integer intcustid) {
		this.intcustid = intcustid;
	}

	public Integer getImmigrationno() {
		return immigrationno;
	}
	public void setImmigrationno(Integer immigrationno) {
		this.immigrationno = immigrationno;
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

	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassportno() {
		return passportno;
	}
	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}

	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}

	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

}

package com.iking.springbootdemo_one.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ExSysUserResult implements Serializable{

	private String FRoleName;
	private String FPowName;
	private String FNo;
	private String FDeptNo;
	private String FUserName;
	private int FStatue;
	private boolean FIsLimitIP;
	private boolean FCheckPower;
	private boolean FTipPower;
	private boolean FMsgPower;
	private String FDepStr;
	private String frolestr;
	private String FFullName;
	private Integer FUeyId;
	private Boolean FBindUK;
	private String UKname;
	private String userNo;
	private String fheadpicurl;
	private String fjobvalue;
	private String fphone;
	private String fname;
	public String getFheadpicurl() {
		return fheadpicurl;
	}

	public void setFheadpicurl(String fheadpicurl) {
		this.fheadpicurl = fheadpicurl;
	}
	
	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUKname() {
		return UKname;
	}

	public void setUKname(String uKname) {
		UKname = uKname;
	}

	public Boolean getFBindUK() {
		return FBindUK;
	}

	public void setFBindUK(Boolean fBindUK) {
		FBindUK = fBindUK;
	}

	public Integer getFUeyId() {
		return FUeyId;
	}

	public void setFUeyId(Integer fUeyId) {
		FUeyId = fUeyId;
	}

	public String getFRoleName() {
		return FRoleName;
	}

	public void setFRoleName(String fRoleName) {
		FRoleName = fRoleName;
	}

	public String getFPowName() {
		return FPowName;
	}

	public void setFPowName(String fPowName) {
		FPowName = fPowName;
	}

	public String getFNo() {
		return FNo;
	}

	public void setFNo(String fNo) {
		FNo = fNo;
	}

	public String getFDeptNo() {
		return FDeptNo;
	}

	public void setFDeptNo(String fDeptNo) {
		FDeptNo = fDeptNo;
	}

	public String getFUserName() {
		return FUserName;
	}

	public void setFUserName(String fUserName) {
		FUserName = fUserName;
	}

	public int getFStatue() {
		return FStatue;
	}

	public void setFStatue(int fStatue) {
		FStatue = fStatue;
	}

	public boolean isFIsLimitIP() {
		return FIsLimitIP;
	}

	public void setFIsLimitIP(boolean fIsLimitIP) {
		FIsLimitIP = fIsLimitIP;
	}

	public boolean isFCheckPower() {
		return FCheckPower;
	}

	public void setFCheckPower(boolean fCheckPower) {
		FCheckPower = fCheckPower;
	}

	public boolean isFTipPower() {
		return FTipPower;
	}

	public void setFTipPower(boolean fTipPower) {
		FTipPower = fTipPower;
	}

	public boolean isFMsgPower() {
		return FMsgPower;
	}

	public void setFMsgPower(boolean fMsgPower) {
		FMsgPower = fMsgPower;
	}

	public String getFDepStr() {
		return FDepStr;
	}

	public void setFDepStr(String fDepStr) {
		FDepStr = fDepStr;
	}

	public String getFrolestr() {
		return frolestr;
	}

	public void setFrolestr(String frolestr) {
		this.frolestr = frolestr;
	}

	public String getFFullName() {
		return FFullName;
	}

	public void setFFullName(String fFullName) {
		FFullName = fFullName;
	}

	public String getFjobvalue() {
		return fjobvalue;
	}

	public void setFjobvalue(String fjobvalue) {
		this.fjobvalue = fjobvalue;
	}

	public String getFphone() {
		return fphone;
	}

	public void setFphone(String fphone) {
		this.fphone = fphone;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
}

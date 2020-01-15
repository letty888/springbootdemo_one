package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/** 
 * Title:SysRoleResult
 * @author LLL 
 * @date 2017年11月14日
 */
@SuppressWarnings("serial")
public class SysRoleResult extends SysRole implements Serializable{

	private String BTypeId;
	
	private String PTypeId;

	private String BTypeList;
	
	private String PTypeList;
	
	
	
	public String getBTypeList() {
		return BTypeList;
	}

	public void setBTypeList(String bTypeList) {
		BTypeList = bTypeList;
	}

	public String getPTypeList() {
		return PTypeList;
	}

	public void setPTypeList(String pTypeList) {
		PTypeList = pTypeList;
	}

	public String getBTypeId() {
		return BTypeId;
	}

	public void setBTypeId(String bTypeId) {
		BTypeId = bTypeId;
	}

	public String getPTypeId() {
		return PTypeId;
	}

	public void setPTypeId(String pTypeId) {
		PTypeId = pTypeId;
	}
	
}

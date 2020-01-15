package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/** 
 * Title:POIPersonQuary
 * @author LLL 
 * @date 2017年11月15日
 */
@SuppressWarnings("serial")
public class POIPersonQuary implements Serializable{
	//单位编号
	private String depNo;
	
	//用户编号
	private String userNo;
	
	//导出人员编号集合
	private String personNo;
	
	//选定字段
	private String lockInfo;
	
	//excel文件名称
	private String name;

	
	public String getLockInfo() {
		return lockInfo;
	}

	public void setLockInfo(String lockInfo) {
		this.lockInfo = lockInfo;
	}

	public String getDepNo() {
		return depNo;
	}

	public void setDepNo(String depNo) {
		this.depNo = depNo;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getPersonNo() {
		return personNo;
	}

	public void setPersonNo(String personNo) {
		this.personNo = personNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

package com.iking.springbootdemo_one.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MenuMove implements Serializable{
	
	private String menuNo;//移动单位no
	
	private String toNo;//移动后no
	
	private String fname;//名字
	
	private String ordPFNo;//原父级单位no
	
	private String newPFNo;//现父级单位no

	public String getOrdPFNo() {
		return ordPFNo;
	}

	public void setOrdPFNo(String ordPFNo) {
		this.ordPFNo = ordPFNo;
	}

	public String getNewPFNo() {
		return newPFNo;
	}

	public void setNewPFNo(String newPFNo) {
		this.newPFNo = newPFNo;
	}

	public String getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}

	public String getToNo() {
		return toNo;
	}

	public void setToNo(String toNo) {
		this.toNo = toNo;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

}

package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class GetApprover implements Serializable{

	/**
	 * true为流转，false为提交
	 */
	private boolean fSubmit;

	/**
	 * 部门编号
	 */
	private String fdeptno;

	/**
	 * 部门名称
	 */
	private String fname;

	/**
	 * 用户编号
	 */
	private String userfno;

	/**
	 * 起始页面
	 */
	private Integer pageCurrent;

	/**
	 * 页面大小
	 */
	private Integer pageSize;

	private String ispower;

	public boolean isfSubmit() {
		return fSubmit;
	}

	public void setfSubmit(boolean fSubmit) {
		this.fSubmit = fSubmit;
	}

	public Integer getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getUserfno() {
		return userfno;
	}

	public void setUserfno(String userfno) {
		this.userfno = userfno;
	}

	public String getFdeptno() {
		return fdeptno;
	}

	public void setFdeptno(String fdeptno) {
		this.fdeptno = fdeptno;
	}

	public String getIspower() {
		return ispower;
	}

	public void setIspower(String ispower) {
		this.ispower = ispower;
	}
}

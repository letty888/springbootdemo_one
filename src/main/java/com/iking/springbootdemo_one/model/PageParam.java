package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class PageParam implements Serializable{
	
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	private Integer pageCurrent; //当前页数
	private Integer pageSize; //每页条数
	private Integer pageIndex; //数据库查询开始索引
	private String userNo; //当前用户uuid
	
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
	public Integer getPageIndex() {
		if(pageCurrent == null || pageSize == null){
			return null;
		}
		if (pageCurrent != 0 && pageSize != 0) {
			pageIndex = (pageCurrent - 1) * pageSize;
		} else {
			pageIndex = 0;
		}
		return pageIndex;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	
	
}

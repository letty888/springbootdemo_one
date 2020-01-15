package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 *  角色查询实体
 * @author zhuh 
 * @date 2017年9月18日 下午3:37:01
 */
@SuppressWarnings("serial")
public class SysRoleQuary implements Serializable{
	
	private Integer pageCurrent;
	
	private Integer pageSize;

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
	
}

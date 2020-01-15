package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * 分页扩展类
 * @author zhuh 
 * @date 2017年7月18日 下午8:23:08
 * @param pageCurrent 当前页
 * @param pageSize 每页显示数据大小
 * @param typeid  类型编号
 */
@SuppressWarnings("serial")
public class ExSysDictItemPage implements Serializable{
	private Integer typeId;
	private Integer pageCurrent;
	private Integer pageSize;
	
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
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
	
	
}

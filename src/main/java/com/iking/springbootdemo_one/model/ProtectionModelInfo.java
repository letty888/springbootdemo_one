package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/** 
 * 根据单位及物资型号获取物资数据请求实体
 * Title:ProtectionModelInfo
 * @author LLL 
 * @date 2017年10月28日
 */
@SuppressWarnings("serial")
public class ProtectionModelInfo implements Serializable{
	//单位编号
	private String depNo;
	
	//物资类型编号
	private Integer modelId;
	
	//登录者UUID
	private String user;
	
	//分页起始页
	private Integer pageCurrent;
	
	//分页大小
	private Integer pageSize;

	public String getDepNo() {
		return depNo;
	}

	public void setDepNo(String depNo) {
		this.depNo = depNo;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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

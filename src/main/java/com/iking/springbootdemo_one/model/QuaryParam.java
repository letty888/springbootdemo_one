package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 *  系统参数配置类
 * @author zhuh 
 * @date 2017年10月13日 下午3:50:30
 */
@SuppressWarnings("serial")
public class QuaryParam implements Serializable{
	
	private Integer pageCurrent;
	private Integer pageSize;
	private Integer fid;
	
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
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	
	
	
}

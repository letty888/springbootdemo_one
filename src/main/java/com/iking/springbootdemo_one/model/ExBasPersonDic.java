package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
* 单位信息下详细信息扩展类：人员统计
* @author lll 
* @date 2017年8月3日16:52:54
* @param fstatenum 单位下状态的数量
* @param fdicname  状态名称
 */
@SuppressWarnings("serial")
public class ExBasPersonDic implements Serializable{
	private int fstatenum;  
	private String fdicname;
	private String fdepno;
	
	
	public String getFdepno() {
		return fdepno;
	}
	public void setFdepno(String fdepno) {
		this.fdepno = fdepno;
	}
	public int getFstatenum() {
		return fstatenum;
	}
	public void setFstatenum(int fstatenum) {
		this.fstatenum = fstatenum;
	}
	public String getFdicname() {
		return fdicname;
	}
	public void setFdicname(String fdicname) {
		this.fdicname = fdicname;
	}
}

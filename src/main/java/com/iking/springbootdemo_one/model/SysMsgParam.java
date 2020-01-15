package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.List;


@SuppressWarnings("serial")
public class SysMsgParam implements Serializable{
	
	private Integer msgTypeId; //系统消息类型ID
	
	private List<SysMsgVariable> msgVariables; //参数列表
	
	private Integer tempType; //模板类型：1、领导模板   2：用户模板

	public Integer getMsgTypeId() {
		return msgTypeId;
	}

	public void setMsgTypeId(Integer msgTypeId) {
		this.msgTypeId = msgTypeId;
	}

	public List<SysMsgVariable> getMsgVariables() {
		return msgVariables;
	}

	public void setMsgVariables(List<SysMsgVariable> msgVariables) {
		this.msgVariables = msgVariables;
	}

	public Integer getTempType() {
		return tempType;
	}

	public void setTempType(Integer tempType) {
		this.tempType = tempType;
	}

	public SysMsgParam(){
		
	}

	
	public SysMsgParam(Integer msgTypeId, Integer tempType) {
		super();
		this.msgTypeId = msgTypeId; //类型ID
		this.tempType = tempType; //模板类型ID 1：干部、2：用户
	}

}

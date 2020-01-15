package com.iking.springbootdemo_one.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DeptOutManage extends SysDeptment implements Serializable{
	
	private Integer outerSize;//在外人数
	
	private Integer noContactSize;//未联系人数
	
	private Integer contactedSize;//今日已联系人数

	public Integer getOuterSize() {
		if(outerSize == null){
			outerSize = 0;
		}
		return outerSize;
	}

	public void setOuterSize(Integer outerSize) {
		this.outerSize = outerSize;
	}

	public Integer getNoContactSize() {
		if(noContactSize == null){
			noContactSize = 0;
		}
		return noContactSize;
	}

	public void setNoContactSize(Integer noContactSize) {
		this.noContactSize = noContactSize;
	}

	public Integer getContactedSize() {
		if(contactedSize == null){
			contactedSize = 0;
		}
		return contactedSize;
	}

	public void setContactedSize(Integer contactedSize) {
		this.contactedSize = contactedSize;
	}

}

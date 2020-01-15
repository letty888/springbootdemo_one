package com.iking.springbootdemo_one.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SysInterfaceResult extends SysInterfaceManage implements Serializable{

	private String typeName;

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}

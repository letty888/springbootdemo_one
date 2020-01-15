package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/** 
 * Title:ProtectionModel
 * @author LLL 
 * @date 2017年10月27日
 */
@SuppressWarnings("serial")
public class ProtectionModel implements Serializable{
	//类别名称
	private String modelName;
	
	//类别ID
	private Integer id;
	
	//类别总量
	private int num;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


}

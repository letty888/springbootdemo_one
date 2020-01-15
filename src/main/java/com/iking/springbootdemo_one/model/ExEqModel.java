package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * @Title ExEqModel
 * @author lll
 * @date 2017-8-20 18:46
 * @param 获取型号列表实现类
 * @param modelNum 型号编号
 * @param modelName 型号名称
 */
@SuppressWarnings("serial")
public class ExEqModel implements Serializable{
	private int modelNum;
	private String modelName;
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
}

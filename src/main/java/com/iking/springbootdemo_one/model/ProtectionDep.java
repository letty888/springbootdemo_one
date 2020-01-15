package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/** 
 * Title:ProtectionDep
 * @author LLL 
 * @date 2017年10月28日
 */
@SuppressWarnings("serial")
public class ProtectionDep implements Serializable{
	//单位编号
	private String depNo;

	//单位名称
	private String depName;
	
	//该型号下数量
	private Integer count;

	//物资类型id
	private Integer modelId;
	
	public String getDepNo() {
		return depNo;
	}

	public void setDepNo(String depNo) {
		this.depNo = depNo;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	
	
	
}

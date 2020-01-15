package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * 根据单位编号及物资Id获取详细数据返回实体类
 * Title:ProtectionModelInfoResult
 * @author LLL 
 * @date 2017年10月28日
 */
@SuppressWarnings("serial")
public class ProtectionModelInfoResult implements Serializable{
	//物资类型
	private String modelType;
	
	//承办单位
	private String depName;
	
	//存放位置
	private String storeLocation;
	
	//承办人
	private String undertaker;
	
	//数量
	private Integer count;
	
	//物资来源
	private String modelQuarry;
	
	//技术状况
	private String statues;
	
	//承办时间
	private Date takeTime;
	
	//物资状态
	private String basicInfo;
	
	//物资状况ID
	private String basicID;
	
	//技术状况ID
	private String statuesID;
	
	
	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}

	public String getUndertaker() {
		return undertaker;
	}

	public void setUndertaker(String undertaker) {
		this.undertaker = undertaker;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getModelQuarry() {
		return modelQuarry;
	}

	public void setModelQuarry(String modelQuarry) {
		this.modelQuarry = modelQuarry;
	}

	public String getStatues() {
		return statues;
	}

	public void setStatues(String statues) {
		this.statues = statues;
	}

	public Date getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}

	public String getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(String basicInfo) {
		this.basicInfo = basicInfo;
	}

	public String getBasicID() {
		return basicID;
	}

	public void setBasicID(String bacicID) {
		this.basicID = bacicID;
	}

	public String getStatuesID() {
		return statuesID;
	}

	public void setStatuesID(String statuesID) {
		this.statuesID = statuesID;
	}
	
	
	
}

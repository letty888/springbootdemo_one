package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员信息 曲线统计接口
 *
 * @author zhuh 
 * @date 2017年11月5日 下午12:13:50
 */
@SuppressWarnings("serial")
public class PersonCount implements Serializable{

	private String fno;
	
	private String month;
	
	private String week;
	
	private Date sTime;
	
	private Date eTime;
	
	private Integer type; //区分接口返回数类别
	
	private Date quaryTime; //查询时间
	
	public Date getQuaryTime() {
		return quaryTime;
	}

	public void setQuaryTime(Date quaryTime) {
		this.quaryTime = quaryTime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getFno() {
		return fno;
	}

	public void setFno(String fno) {
		this.fno = fno;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public Date getsTime() {
		return sTime;
	}

	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}

	public Date geteTime() {
		return eTime;
	}

	public void seteTime(Date eTime) {
		this.eTime = eTime;
	}
	
}

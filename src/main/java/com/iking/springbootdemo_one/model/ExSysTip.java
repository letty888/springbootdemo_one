package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 消息实体类
 * @author zhuh 
 * @date 2017年8月8日 下午4:12:13
 * @param FReceiverName 发送人名称
 * @param FTypeName 消息类型名称
 * @param fpushtime 发送时间
 * @param userNo 用户编号
 * @param starttime 判定时间 （本周、上周、近一个月）
 * @param endtime 判定时间 （本周、上周、近一个月）
 * @param pageCurrent 当前页
 * @param pageSize 每页显示条目
 * @param handleJobName 经办人职务
 */
@SuppressWarnings("serial")
public class ExSysTip extends SysTip implements Serializable{
	private String fname;
	private String FReceiverName;
	private String FTypeName;
	private String HandleDepName;
	private String HandleName;
	private String handleJobName;
	
	private String userNo;
	private Date starttime;
	private Date endtime;
	private Integer pageCurrent;
	private Integer pageSize;
	private Date fstarttime;
	private Date fendtime;
	
	public String getHandleDepName() {
		return HandleDepName;
	}
	public void setHandleDepName(String handleDepName) {
		HandleDepName = handleDepName;
	}
	public String getHandleName() {
		return HandleName;
	}
	public void setHandleName(String handleName) {
		HandleName = handleName;
	}
	public Date getFstarttime() {
		return fstarttime;
	}
	public void setFstarttime(Date fstarttime) {
		this.fstarttime = fstarttime;
	}
	public Date getFendtime() {
		return fendtime;
	}
	public void setFendtime(Date fendtime) {
		this.fendtime = fendtime;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFReceiverName() {
		return FReceiverName;
	}
	public void setFReceiverName(String fReceiverName) {
		FReceiverName = fReceiverName;
	}
	public String getFTypeName() {
		return FTypeName;
	}
	public void setFTypeName(String fTypeName) {
		FTypeName = fTypeName;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
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
	public String getHandleJobName() {
		return handleJobName;
	}
	public void setHandleJobName(String handleJobName) {
		this.handleJobName = handleJobName;
	}
	
}

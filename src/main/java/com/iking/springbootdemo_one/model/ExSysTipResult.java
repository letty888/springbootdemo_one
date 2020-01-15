package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.List;

/**
 * 消息返回实体
 * @author zhuh 
 * @date 2017年8月13日 上午11:54:47
 * @param nowMsg 今日
 * @param yesDay 昨日
 * @param recent 最近 
 * @param more 更多
 */
@SuppressWarnings("serial")
public class ExSysTipResult<T> implements Serializable{
	
	private List<T> now;
	private List<T> yesDay;
	private List<T> recent;
	private List<T> more;
	private List<T> nowMsg;
	private List<T> nowWeek;
	private List<T> nowLastWeek;
	
	public List<T> getNowMsg() {
		return nowMsg;
	}
	public void setNowMsg(List<T> nowMsg) {
		this.nowMsg = nowMsg;
	}
	public List<T> getNowWeek() {
		return nowWeek;
	}
	public void setNowWeek(List<T> nowWeek) {
		this.nowWeek = nowWeek;
	}
	public List<T> getNowLastWeek() {
		return nowLastWeek;
	}
	public void setNowLastWeek(List<T> nowLastWeek) {
		this.nowLastWeek = nowLastWeek;
	}
	public List<T> getMore() {
		return more;
	}
	public void setMore(List<T> more) {
		this.more = more;
	}
	public List<T> getNow() {
		return now;
	}
	public void setNow(List<T> now) {
		this.now = now;
	}
	public List<T> getYesDay() {
		return yesDay;
	}
	public void setYesDay(List<T> yesDay) {
		this.yesDay = yesDay;
	}
	public List<T> getRecent() {
		return recent;
	}
	public void setRecent(List<T> recent) {
		this.recent = recent;
	}
	
}

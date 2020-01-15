package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class PageResult<E> extends PageParam implements Serializable{
	
	Integer itemTotal; //总条数
	List<E> items; //查询对象列表
	Integer pageCount; //页数
	
	public List<E> getItems() {
		return items;
	}
	public void setItems(List<E> items) {
		this.items = items;
	}
	public Integer getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(Integer itemTotal) {
		this.itemTotal = itemTotal;
		
	}
	public Integer getPageCount() {
		if(getPageSize() == null || itemTotal == null){
			return null;
		}else{
			return itemTotal % getPageSize()==0?itemTotal / getPageSize():itemTotal / getPageSize()+1;
		}
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public PageResult() {
		super();
	}
	public PageResult(Integer itemTotal, List<E> items) {
		super();
		this.itemTotal = itemTotal;
		this.items = items;
	}
	
	
	
}

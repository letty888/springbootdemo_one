package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * 字典子分类请求实体
 * @author LLL
 * @date 2017年10月9日 14点41分
 *
 * @param bid 字典大类Id
 */
@SuppressWarnings("serial")
public class SysDIctTypeQuary extends SysDictType implements Serializable{
	private Integer bid;
	
	private String userno;
	
	
	public String getUserno() {
		return userno;
	}

	public void setUserno(String userno) {
		this.userno = userno;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}
	
	
}

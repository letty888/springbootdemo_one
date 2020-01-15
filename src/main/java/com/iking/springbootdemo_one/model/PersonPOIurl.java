package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/** 
 * Title:PersonPOIurl
 * @author LLL 
 * @date 2017年11月21日
 */
@SuppressWarnings("serial")
public class PersonPOIurl implements Serializable{
	//请求的Url
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}

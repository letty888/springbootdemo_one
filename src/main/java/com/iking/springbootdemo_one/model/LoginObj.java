package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
*  登录对象
* @author wkt 
* @date 2017年7月21日 下午2:07:26
 */
@SuppressWarnings("serial")
public class LoginObj implements Serializable{

	private String fusername; //用户名
	
	private String fpassword;  // 密码

	private String fcode; // 标识符

	private String fRegistrationID;

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getFusername() {
		return fusername;
	}

	public void setFusername(String fusername) {
		this.fusername = fusername;
	}

	public String getFpassword() {
		return fpassword;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}

	public String getfRegistrationID() {
		return fRegistrationID;
	}

	public void setfRegistrationID(String fRegistrationID) {
		this.fRegistrationID = fRegistrationID;
	}
}

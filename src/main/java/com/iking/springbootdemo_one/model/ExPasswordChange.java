package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
*  修改密码实体
* @author wkt 
* @date 2017年7月18日 下午2:17:25
 */
@SuppressWarnings("serial")
public class ExPasswordChange implements Serializable{
	
	private String oldPassword;
	private String newPassword;	 	//新密码
	private String surePassword;	//确认密码
	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getSurePassword() {
		return surePassword;
	}
	public void setSurePassword(String surePassword) {
		this.surePassword = surePassword;
	}
}

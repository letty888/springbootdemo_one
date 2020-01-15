package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.List;

/**
 * 单位详细信息扩展类
 * @author lll
 * @date 2017年8月3日15:49:49
 * @param fparentsname 父级单位名称
 * @param fchier 单位长官
 * @param finstructor 单位指导员
 * @param fpersonstate 人员在位情况
 * @param fpersoneducation 人员受教育情况
 * @param fcarstate 车辆在位情况
 * @param fcartype 车辆类型
 * @param fgunstate 枪支使用情况
 * @param fgunModel 枪支类型
 * @param fphoneFModel 手机分布情况
 * @param fphonestate 手机型号
 * @param fcomputerLocation 电脑分布状况
 * @param fcomputermdoel 电脑型号
 * @param factualparentnum 单位下实际人数
 */
@SuppressWarnings("serial")
public class ExDeptmentInfo extends SysDeptment implements Serializable{
	private String fparentsname;
	private int factualparentnum;
	private String fchief;
	private String finstructor;
	private List<ExBasPersonDic> fpersonstate;
	private List<ExBasPersonDic> fpersoneducation;
	private List<ExBasPersonDic> fcarstate;
	private List<ExBasPersonDic> fcartype;
	private List<ExBasPersonDic> fgunstate;
	private List<ExBasPersonDic> fgunmodel;
	private List<ExBasPersonDic> fphonestate;
	private List<ExBasPersonDic> fphonemodel;
	private List<ExBasPersonDic> fcomputerlocation;
	private List<ExBasPersonDic> fcomputermodel;
	

	public int getFactualparentnum() {
		return factualparentnum;
	}
	public void setFactualparentnum(int factualparentnum) {
		this.factualparentnum = factualparentnum;
	}
	public List<ExBasPersonDic> getFphonemodel() {
		return fphonemodel;
	}
	public void setFphonemodel(List<ExBasPersonDic> fphonemodel) {
		this.fphonemodel = fphonemodel;
	}
	public String getFparentsname() {
		return fparentsname;
	}
	public void setFparentsname(String fparentsname) {
		this.fparentsname = fparentsname;
	}
	
	public String getFchief() {
		return fchief;
	}
	public void setFchief(String fchief) {
		this.fchief = fchief;
	}
	public String getFinstructor() {
		return finstructor;
	}
	public void setFinstructor(String finstructor) {
		this.finstructor = finstructor;
	}
	public List<ExBasPersonDic> getFpersonstate() {
		return fpersonstate;
	}
	public void setFpersonstate(List<ExBasPersonDic> fpersonstate) {
		this.fpersonstate = fpersonstate;
	}
	public List<ExBasPersonDic> getFpersoneducation() {
		return fpersoneducation;
	}
	public void setFpersoneducation(List<ExBasPersonDic> fpersoneducation) {
		this.fpersoneducation = fpersoneducation;
	}
	public List<ExBasPersonDic> getFcarstate() {
		return fcarstate;
	}
	public void setFcarstate(List<ExBasPersonDic> fcarstate) {
		this.fcarstate = fcarstate;
	}
	public List<ExBasPersonDic> getFcartype() {
		return fcartype;
	}
	public void setFcartype(List<ExBasPersonDic> fcartype) {
		this.fcartype = fcartype;
	}
	public List<ExBasPersonDic> getFgunstate() {
		return fgunstate;
	}
	public void setFgunstate(List<ExBasPersonDic> fgunstate) {
		this.fgunstate = fgunstate;
	}

	public List<ExBasPersonDic> getFphonestate() {
		return fphonestate;
	}
	public void setFphonestate(List<ExBasPersonDic> fphonestate) {
		this.fphonestate = fphonestate;
	}

	public List<ExBasPersonDic> getFgunmodel() {
		return fgunmodel;
	}
	public void setFgunmodel(List<ExBasPersonDic> fgunmodel) {
		this.fgunmodel = fgunmodel;
	}
	public List<ExBasPersonDic> getFcomputermodel() {
		return fcomputermodel;
	}
	public void setFcomputermodel(List<ExBasPersonDic> fcomputermodel) {
		this.fcomputermodel = fcomputermodel;
	}
	public List<ExBasPersonDic> getFcomputerlocation() {
		return fcomputerlocation;
	}
	public void setFcomputerlocation(List<ExBasPersonDic> fcomputerlocation) {
		this.fcomputerlocation = fcomputerlocation;
	}
}

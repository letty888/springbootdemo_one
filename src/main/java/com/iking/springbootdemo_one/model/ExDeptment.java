package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
*  单位扩展类
* @author syy 
* @date 2017年7月19日 下午18:37:25
* @param fuserno  单位主官编号
* 
 */
@SuppressWarnings("serial")
public class ExDeptment extends SysDeptment implements Serializable{
	
	private String userNo;
	
	private String fuserno;
	/**
	 * 实有人数
	 */
	private Integer factualparentnum;
	
	private String levelName;
	
	private String typeName;
	
	private Integer pageCurrent;
	
	private Integer pageSize;
	
	private Integer fgoodsmodelid;
	
	private Integer PageIndex;
	/**
	 * 区分各种接收信息  author lll
	 */
	private String type;

	/**
	 * 摄像头个数
	 */
	private Integer cameranum;

	private String fdepcheck;

	/**
	 * 军事主官
	 */
	private String fofficer;

	/**
	 * 政治主官
	 */
	private String fadjutant;

	/**
	 * 上级部门
	 */
	private String fsuperiordepartment;



	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Integer getFactualparentnum() {
		return factualparentnum;
	}

	public void setFactualparentnum(Integer factualparentnum) {
		this.factualparentnum = factualparentnum;
	}

	public String getFuserno() {
		return fuserno;
	}

	public void setFuserno(String fuserno) {
		this.fuserno = fuserno;
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

	public Integer getFgoodsmodelid() {
		return fgoodsmodelid;
	}

	public void setFgoodsmodelid(Integer fgoodsmodelid) {
		this.fgoodsmodelid = fgoodsmodelid;
	}

	public Integer getPageIndex() {
		return PageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		PageIndex = pageIndex;
	}

	public Integer getCameranum() {
		return cameranum;
	}

	public void setCameranum(Integer cameranum) {
		this.cameranum = cameranum;
	}

	public String getFdepcheck() {
		return fdepcheck;
	}

	public void setFdepcheck(String fdepcheck) {
		this.fdepcheck = fdepcheck;
	}

	public String getFofficer() {
		return fofficer;
	}

	public void setFofficer(String fofficer) {
		this.fofficer = fofficer;
	}

	public String getFadjutant() {
		return fadjutant;
	}

	public void setFadjutant(String fadjutant) {
		this.fadjutant = fadjutant;
	}

	public String getFsuperiordepartment() {
		return fsuperiordepartment;
	}

	public void setFsuperiordepartment(String fsuperiordepartment) {
		this.fsuperiordepartment = fsuperiordepartment;
	}

//	public List<String> getPid() {
//		return pid;
//	}
//
//	public void setPid(List<String> pid) {
//		this.pid = pid;
//	}
//	


	
}

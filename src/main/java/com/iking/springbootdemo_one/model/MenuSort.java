package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 *  菜单排序实体
 * @author zhuh 
 * @date 2017年10月9日 下午5:04:22
 * @Param beforeId 前置菜单ID
 * @Param afterId 后置菜单ID
 * @Param beforeSort 前置菜单顺序
 * @Param afterSort 后置菜单顺序
 */
@SuppressWarnings("serial")
public class MenuSort implements Serializable{
	
	private Integer beforeId;
	
	private Integer beforeSort;
	
	private Integer afterSort;
	
	private Integer afterId;

	public Integer getBeforeSort() {
		return beforeSort;
	}

	public void setBeforeSort(Integer beforeSort) {
		this.beforeSort = beforeSort;
	}

	public Integer getAfterSort() {
		return afterSort;
	}

	public void setAfterSort(Integer afterSort) {
		this.afterSort = afterSort;
	}

	public Integer getBeforeId() {
		return beforeId;
	}

	public void setBeforeId(Integer beforeId) {
		this.beforeId = beforeId;
	}

	public Integer getAfterId() {
		return afterId;
	}

	public void setAfterId(Integer afterId) {
		this.afterId = afterId;
	}
	
	
}

package com.iking.springbootdemo_one.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SysHelpWord implements Serializable{
	
	private Integer fid;
	
	private Integer fno;
	
	private Integer fsort;
	
	private String fcontent;

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Integer getFno() {
		return fno;
	}

	public void setFno(Integer fno) {
		this.fno = fno;
	}

	public Integer getFsort() {
		return fsort;
	}

	public void setFsort(Integer fsort) {
		this.fsort = fsort;
	}

	public String getFcontent() {
		return fcontent;
	}

	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}

}

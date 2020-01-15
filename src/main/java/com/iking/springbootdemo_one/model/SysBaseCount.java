package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SysBaseCount implements Serializable{
    private Integer fid;

    private Integer fsize;

    private Date fcounttime;
    
    private Date fcreatetime;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFsize() {
        return fsize;
    }

    public void setFsize(Integer fsize) {
        this.fsize = fsize;
    }

    public Date getFcounttime() {
        return fcounttime;
    }

    public void setFcounttime(Date fcounttime) {
        this.fcounttime = fcounttime;
    }

	public Date getFcreatetime() {
		return fcreatetime;
	}

	public void setFcreatetime(Date fcreatetime) {
		this.fcreatetime = fcreatetime;
	}
}
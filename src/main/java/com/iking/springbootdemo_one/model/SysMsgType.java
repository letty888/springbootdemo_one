package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SysMsgType implements Serializable{
	 private Integer fid;

	    private String fname;

	    private Integer fparentid;

	    private Date fcreatetime;

	    private String fcreater;

	    private Date fmodifytime;

	    private String fmodifier;

	    private Integer fversion;

	    public Integer getFid() {
	        return fid;
	    }

	    public void setFid(Integer fid) {
	        this.fid = fid;
	    }

	    public String getFname() {
	        return fname;
	    }

	    public void setFname(String fname) {
	        this.fname = fname == null ? null : fname.trim();
	    }

	    public Integer getFparentid() {
	        return fparentid;
	    }

	    public void setFparentid(Integer fparentid) {
	        this.fparentid = fparentid;
	    }

	    public Date getFcreatetime() {
	        return fcreatetime;
	    }

	    public void setFcreatetime(Date fcreatetime) {
	        this.fcreatetime = fcreatetime;
	    }

	    public String getFcreater() {
	        return fcreater;
	    }

	    public void setFcreater(String fcreater) {
	        this.fcreater = fcreater == null ? null : fcreater.trim();
	    }

	    public Date getFmodifytime() {
	        return fmodifytime;
	    }

	    public void setFmodifytime(Date fmodifytime) {
	        this.fmodifytime = fmodifytime;
	    }

	    public String getFmodifier() {
	        return fmodifier;
	    }

	    public void setFmodifier(String fmodifier) {
	        this.fmodifier = fmodifier == null ? null : fmodifier.trim();
	    }

	    public Integer getFversion() {
	        return fversion;
	    }

	    public void setFversion(Integer fversion) {
	        this.fversion = fversion;
	    }
}
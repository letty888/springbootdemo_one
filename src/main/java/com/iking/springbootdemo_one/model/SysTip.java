package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SysTip implements Serializable{
    private Integer fid;

    private String freceiverid; //接受消息人的UserId —— 必传

    private String ftype; //消息类型——必传

    private String fcontent; //文本内容 —— 必传
    
    private String fjumpno;

    private Date fpushtime;//

    private Boolean fisread;

    private String fhandleid; //经办人personNo —— 必传

    private Integer fstate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFreceiverid() {
        return freceiverid;
    }

    public void setFreceiverid(String freceiverid) {
        this.freceiverid = freceiverid == null ? null : freceiverid.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent == null ? null : fcontent.trim();
    }

    public String getFjumpno() {
		return fjumpno;
	}

	public void setFjumpno(String fjumpno) {
		this.fjumpno = fjumpno;
	}

	public Date getFpushtime() {
        return fpushtime;
    }

    public void setFpushtime(Date fpushtime) {
        this.fpushtime = fpushtime;
    }

    public Boolean getFisread() {
        return fisread;
    }

    public void setFisread(Boolean fisread) {
        this.fisread = fisread;
    }

    public String getFhandleid() {
        return fhandleid;
    }

    public void setFhandleid(String fhandleid) {
        this.fhandleid = fhandleid == null ? null : fhandleid.trim();
    }

    public Integer getFstate() {
        return fstate;
    }

    public void setFstate(Integer fstate) {
        this.fstate = fstate;
    }
}
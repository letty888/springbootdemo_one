package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

public class SysInterfaceManage implements Serializable{
    private Integer fid;

    private Integer ftypeid;

    private String fvalue;

    private Integer fstate;

    private Integer fdefault;

    private String fcreater;

    private Date fcreatetime;

    private String fmodifier;

    private Date fmodifytime;

    private Integer fversion;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFtypeid() {
        return ftypeid;
    }

    public void setFtypeid(Integer ftypeid) {
        this.ftypeid = ftypeid;
    }

    public String getFvalue() {
        return fvalue;
    }

    public void setFvalue(String fvalue) {
        this.fvalue = fvalue == null ? null : fvalue.trim();
    }

    public Integer getFstate() {
        return fstate;
    }

    public void setFstate(Integer fstate) {
        this.fstate = fstate;
    }

    public Integer getFdefault() {
        return fdefault;
    }

    public void setFdefault(Integer fdefault) {
        this.fdefault = fdefault;
    }

    public String getFcreater() {
        return fcreater;
    }

    public void setFcreater(String fcreater) {
        this.fcreater = fcreater == null ? null : fcreater.trim();
    }

    public Date getFcreatetime() {
        return fcreatetime;
    }

    public void setFcreatetime(Date fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    public String getFmodifier() {
        return fmodifier;
    }

    public void setFmodifier(String fmodifier) {
        this.fmodifier = fmodifier == null ? null : fmodifier.trim();
    }

    public Date getFmodifytime() {
        return fmodifytime;
    }

    public void setFmodifytime(Date fmodifytime) {
        this.fmodifytime = fmodifytime;
    }

    public Integer getFversion() {
        return fversion;
    }

    public void setFversion(Integer fversion) {
        this.fversion = fversion;
    }
}
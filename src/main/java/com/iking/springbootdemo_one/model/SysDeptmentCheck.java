package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

public class SysDeptmentCheck implements Serializable {
    private Integer fid;

    private String fdepno;

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

    public String getFdepno() {
        return fdepno;
    }

    public void setFdepno(String fdepno) {
        this.fdepno = fdepno == null ? null : fdepno.trim();
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
package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class SysDictType implements Serializable {
    private Integer fid;

    private Integer fbid;

    private String fname;

    private String ftype;

    private Boolean fisadd;

    private Integer fstate;

    private Boolean fisremove;

    private Boolean fismodify;

    private String fdesc;

    private Integer fsort;

    private String fversion;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFbid() {
        return fbid;
    }

    public void setFbid(Integer fbid) {
        this.fbid = fbid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public Boolean getFisadd() {
        return fisadd;
    }

    public void setFisadd(Boolean fisadd) {
        this.fisadd = fisadd;
    }

    public Integer getFstate() {
        return fstate;
    }

    public void setFstate(Integer fstate) {
        this.fstate = fstate;
    }

    public Boolean getFisremove() {
        return fisremove;
    }

    public void setFisremove(Boolean fisremove) {
        this.fisremove = fisremove;
    }

    public Boolean getFismodify() {
        return fismodify;
    }

    public void setFismodify(Boolean fismodify) {
        this.fismodify = fismodify;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc == null ? null : fdesc.trim();
    }

    public Integer getFsort() {
        return fsort;
    }

    public void setFsort(Integer fsort) {
        this.fsort = fsort;
    }

    public String getFversion() {
        return fversion;
    }

    public void setFversion(String fversion) {
        this.fversion = fversion == null ? null : fversion.trim();
    }
}
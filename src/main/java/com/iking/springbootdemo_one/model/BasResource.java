package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class BasResource implements Serializable{

    /** 电子签批 */
    public static final int E_SIGNATURE = 15;

    private Integer fid;

    private Integer fbustype;

    private String fbusid;

    private String frestype;

    private String fresname;

    private String fresurl; //url

    private Double fressize;

    private String fcreater;

    private Date fcreatetime;

    private Integer fversion;

    public BasResource() {
    }

    public BasResource(Integer fbustype, String fbusid, String frestype, String fresname, String fresurl, Double fressize, String fcreater) {
        this.fbustype = fbustype;
        this.fbusid = fbusid;
        this.frestype = frestype;
        this.fresname = fresname;
        this.fresurl = fresurl;
        this.fressize = fressize;
        this.fcreater = fcreater;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFbustype() {
        return fbustype;
    }

    public void setFbustype(Integer fbustype) {
        this.fbustype = fbustype;
    }

    public String getFbusid() {
        return fbusid;
    }

    public void setFbusid(String fbusid) {
        this.fbusid = fbusid == null ? null : fbusid.trim();
    }

    public String getFrestype() {
        return frestype;
    }

    public void setFrestype(String frestype) {
        this.frestype = frestype == null ? null : frestype.trim();
    }

    public String getFresname() {
        return fresname;
    }

    public void setFresname(String fresname) {
        this.fresname = fresname == null ? null : fresname.trim();
    }
    
    public String getFresurl() {
        return fresurl;
    }

    public void setFresurl(String fresurl) {
        this.fresurl = fresurl == null ? null : fresurl.trim();
    }

    public Double getFressize() {
        return fressize;
    }

    public void setFressize(Double fressize) {
        this.fressize = fressize;
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

    public Integer getFversion() {
        return fversion;
    }

    public void setFversion(Integer fversion) {
        this.fversion = fversion;
    }
}
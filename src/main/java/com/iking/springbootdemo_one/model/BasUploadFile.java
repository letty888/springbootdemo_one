package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class BasUploadFile implements Serializable {

    private BigInteger fid;
    private String filetype;
    private String fname;
    private String furl;
    private Double fsize;
    private String fcreater;
    private Date fdatetime;

    public BigInteger getFid() {
        return fid;
    }

    public void setFid(BigInteger fid) {
        this.fid = fid;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl;
    }

    public Double getFsize() {
        return fsize;
    }

    public void setFsize(Double fsize) {
        this.fsize = fsize;
    }

    public String getFcreater() {
        return fcreater;
    }

    public void setFcreater(String fcreater) {
        this.fcreater = fcreater;
    }

    public Date getFdatetime() {
        return fdatetime;
    }

    public void setFdatetime(Date fdatetime) {
        this.fdatetime = fdatetime;
    }
}

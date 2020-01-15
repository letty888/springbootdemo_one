package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class BasArea implements Serializable{
    private Integer fid;

    private Integer fareano;

    private String fareaname;

    private Integer fparentno;

    private Integer farealevel;

    private String ftypefname;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFareano() {
        return fareano;
    }

    public void setFareano(Integer fareano) {
        this.fareano = fareano;
    }

    public String getFareaname() {
        return fareaname;
    }

    public void setFareaname(String fareaname) {
        this.fareaname = fareaname == null ? null : fareaname.trim();
    }

    public Integer getFparentno() {
        return fparentno;
    }

    public void setFparentno(Integer fparentno) {
        this.fparentno = fparentno;
    }

    public Integer getFarealevel() {
        return farealevel;
    }

    public void setFarealevel(Integer farealevel) {
        this.farealevel = farealevel;
    }

    public String getFtypefname() {
        return ftypefname;
    }

    public void setFtypefname(String ftypefname) {
        this.ftypefname = ftypefname == null ? null : ftypefname.trim();
    }
}
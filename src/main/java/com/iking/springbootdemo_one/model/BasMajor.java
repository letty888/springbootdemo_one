package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class BasMajor implements Serializable{
    private String fno;

    private String fcollegeno;

    private String fmajorname;

    private Date fcreatetime;

    private String fcreater;

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    public String getFcollegeno() {
        return fcollegeno;
    }

    public void setFcollegeno(String fcollegeno) {
        this.fcollegeno = fcollegeno == null ? null : fcollegeno.trim();
    }

    public String getFmajorname() {
        return fmajorname;
    }

    public void setFmajorname(String fmajorname) {
        this.fmajorname = fmajorname == null ? null : fmajorname.trim();
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
}
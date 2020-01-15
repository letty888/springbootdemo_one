package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

public class SysDeptment implements Serializable {
    private Integer fid;

    private String fno;

    private String fname;

    private String ffullname;

    private String ftype;

    private String flevel;

    private String fparentno;

    private Integer forgcount;

    private String faddress;

    private String fpost;

    private String fphone;

    private Integer fsort;

    private Integer fstatue;

    private String fcreater;

    private Date fcreatetime;

    private String fmodifier;

    private Date fmodifytime;

    private Integer fversion;

    private String fspare;
    /**
     * 在位人数
     */
    private Integer reignNumber;

    public Integer getReignNumber() {
        return reignNumber;
    }

    public void setReignNumber(Integer reignNumber) {
        this.reignNumber = reignNumber;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFfullname() {
        return ffullname;
    }

    public void setFfullname(String ffullname) {
        this.ffullname = ffullname == null ? null : ffullname.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFlevel() {
        return flevel;
    }

    public void setFlevel(String flevel) {
        this.flevel = flevel == null ? null : flevel.trim();
    }

    public String getFparentno() {
        return fparentno;
    }

    public void setFparentno(String fparentno) {
        this.fparentno = fparentno == null ? null : fparentno.trim();
    }

    public Integer getForgcount() {
        return forgcount;
    }

    public void setForgcount(Integer forgcount) {
        this.forgcount = forgcount;
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress == null ? null : faddress.trim();
    }

    public String getFpost() {
        return fpost;
    }

    public void setFpost(String fpost) {
        this.fpost = fpost == null ? null : fpost.trim();
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone == null ? null : fphone.trim();
    }

    public Integer getFsort() {
        return fsort;
    }

    public void setFsort(Integer fsort) {
        this.fsort = fsort;
    }

    public Integer getFstatue() {
        return fstatue;
    }

    public void setFstatue(Integer fstatue) {
        this.fstatue = fstatue;
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

    public String getFspare() {
        return fspare;
    }

    public void setFspare(String fspare) {
        this.fspare = fspare == null ? null : fspare.trim();
    }
}
package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

public class SysDictItem implements Serializable {

    private String fno;

    private Integer ftypeid;

    private String fname;

    private String fvalue;

    private Integer fsort;

    private Integer fstatue;

    private Integer fisoperable;

    private String fdesc;

    private Date fcreatetime;

    private String fcreater;

    private Date fmodifytime;

    private String fmodifier;

    private Integer fversion;

    private String fspare;

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    public Integer getFtypeid() {
        return ftypeid;
    }

    public void setFtypeid(Integer ftypeid) {
        this.ftypeid = ftypeid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFvalue() {
        return fvalue;
    }

    public void setFvalue(String fvalue) {
        this.fvalue = fvalue == null ? null : fvalue.trim();
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

    public Integer getFisoperable() {
        return fisoperable;
    }

    public void setFisoperable(Integer fisoperable) {
        this.fisoperable = fisoperable;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc == null ? null : fdesc.trim();
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

    public String getFspare() {
        return fspare;
    }

    public void setFspare(String fspare) {
        this.fspare = fspare == null ? null : fspare.trim();
    }

}
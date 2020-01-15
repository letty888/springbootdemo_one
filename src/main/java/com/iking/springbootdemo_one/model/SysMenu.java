package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SysMenu implements Serializable{
    private Integer fid;

    private String fno;

    private String fname;

    private String ftip;

    private Integer fconnecttype;

    private String flinkurl;

    private String fcode;

    private Integer ficontype;

    private String ficonurl;

    private Integer fsort;

    private Integer ftype;

    private Boolean fisleaf;

    private Integer fstatue;

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

    public String getFtip() {
        return ftip;
    }

    public void setFtip(String ftip) {
        this.ftip = ftip == null ? null : ftip.trim();
    }

    public Integer getFconnecttype() {
        return fconnecttype;
    }

    public void setFconnecttype(Integer fconnecttype) {
        this.fconnecttype = fconnecttype;
    }

    public String getFlinkurl() {
        return flinkurl;
    }

    public void setFlinkurl(String flinkurl) {
        this.flinkurl = flinkurl == null ? null : flinkurl.trim();
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode == null ? null : fcode.trim();
    }

    public Integer getFicontype() {
        return ficontype;
    }

    public void setFicontype(Integer ficontype) {
        this.ficontype = ficontype;
    }

    public String getFiconurl() {
        return ficonurl;
    }

    public void setFiconurl(String ficonurl) {
        this.ficonurl = ficonurl == null ? null : ficonurl.trim();
    }

    public Integer getFsort() {
        return fsort;
    }

    public void setFsort(Integer fsort) {
        this.fsort = fsort;
    }

    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    public Boolean getFisleaf() {
        return fisleaf;
    }

    public void setFisleaf(Boolean fisleaf) {
        this.fisleaf = fisleaf;
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

}
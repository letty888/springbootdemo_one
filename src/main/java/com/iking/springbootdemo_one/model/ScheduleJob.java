package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ScheduleJob implements Serializable{
    private Integer fid;

    private String ftaskid;

    private String fname;

    private String fgroup;

    private String fclass;

    private Integer fstatus;

    private String fdesc;

    private Date fstarttime;

    private Date fendtime;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFtaskid() {
        return ftaskid;
    }

    public void setFtaskid(String ftaskid) {
        this.ftaskid = ftaskid == null ? null : ftaskid.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFgroup() {
        return fgroup;
    }

    public void setFgroup(String fgroup) {
        this.fgroup = fgroup == null ? null : fgroup.trim();
    }

    public String getFclass() {
        return fclass;
    }

    public void setFclass(String fclass) {
        this.fclass = fclass == null ? null : fclass.trim();
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc == null ? null : fdesc.trim();
    }

    public Date getFstarttime() {
        return fstarttime;
    }

    public void setFstarttime(Date fstarttime) {
        this.fstarttime = fstarttime;
    }

    public Date getFendtime() {
        return fendtime;
    }

    public void setFendtime(Date fendtime) {
        this.fendtime = fendtime;
    }
}
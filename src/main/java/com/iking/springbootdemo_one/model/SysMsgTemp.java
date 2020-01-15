package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SysMsgTemp implements Serializable{
    private Integer fid;

    private Integer fmsgtypeid;

    private Integer ftemptype;

    private String ftempdemo;

    private String ftempletcontent;

    private String fmodifier;

    private Date fmodifytime;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFmsgtypeid() {
        return fmsgtypeid;
    }

    public void setFmsgtypeid(Integer fmsgtypeid) {
        this.fmsgtypeid = fmsgtypeid;
    }

    public Integer getFtemptype() {
        return ftemptype;
    }

    public void setFtemptype(Integer ftemptype) {
        this.ftemptype = ftemptype;
    }

    public String getFtempdemo() {
        return ftempdemo;
    }

    public void setFtempdemo(String ftempdemo) {
        this.ftempdemo = ftempdemo == null ? null : ftempdemo.trim();
    }

    public String getFtempletcontent() {
        return ftempletcontent;
    }

    public void setFtempletcontent(String ftempletcontent) {
        this.ftempletcontent = ftempletcontent == null ? null : ftempletcontent.trim();
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
}
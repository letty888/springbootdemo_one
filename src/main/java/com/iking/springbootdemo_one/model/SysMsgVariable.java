package com.iking.springbootdemo_one.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SysMsgVariable implements Serializable{

    private Integer fid;

    private Integer fmsgtypeid; //模板类型ID

    private String fvarname;

    private String fcode;

    private String fdemo;

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

    public String getFvarname() {
        return fvarname;
    }

    public void setFvarname(String fvarname) {
        this.fvarname = fvarname == null ? null : fvarname.trim();
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode == null ? null : fcode.trim();
    }

    public String getFdemo() {
        return fdemo;
    }

    public void setFdemo(String fdemo) {
        this.fdemo = fdemo == null ? null : fdemo.trim();
    }
}
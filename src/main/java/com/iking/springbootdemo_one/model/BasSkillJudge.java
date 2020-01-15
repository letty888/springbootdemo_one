package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class BasSkillJudge implements Serializable{
    private String fno;  //主键编号

    private String fpersionno;  //人员编号

    private String fskilljudge;  //职业技能鉴定

    private Date fjudgetime;  //职业技能鉴定时间

    private Date fcreatetime;  //创建时间

    private String fcreater;  //创建人

    private Integer fversion;  //版本号

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    public String getFpersionno() {
        return fpersionno;
    }

    public void setFpersionno(String fpersionno) {
        this.fpersionno = fpersionno == null ? null : fpersionno.trim();
    }

    public String getFskilljudge() {
        return fskilljudge;
    }

    public void setFskilljudge(String fskilljudge) {
        this.fskilljudge = fskilljudge == null ? null : fskilljudge.trim();
    }

    public Date getFjudgetime() {
        return fjudgetime;
    }

    public void setFjudgetime(Date fjudgetime) {
        this.fjudgetime = fjudgetime;
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

    public Integer getFversion() {
        return fversion;
    }

    public void setFversion(Integer fversion) {
        this.fversion = fversion;
    }
}
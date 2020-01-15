package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class SysDepOfficer implements Serializable {
    private Integer fid;

    private String fdepno;

    /**
     * 军事主官
     */
    private String fofficer;

    /**
     * 政治主官
     */
    private String fadjutant;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFdepno() {
        return fdepno;
    }

    public void setFdepno(String fdepno) {
        this.fdepno = fdepno == null ? null : fdepno.trim();
    }

    public String getFofficer() {
        return fofficer;
    }

    public void setFofficer(String fofficer) {
        this.fofficer = fofficer == null ? null : fofficer.trim();
    }

    public String getFadjutant() {
        return fadjutant;
    }

    public void setFadjutant(String fadjutant) {
        this.fadjutant = fadjutant == null ? null : fadjutant.trim();
    }
}
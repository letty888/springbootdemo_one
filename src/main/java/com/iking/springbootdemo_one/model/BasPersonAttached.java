package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class BasPersonAttached implements Serializable {
    private Integer fid;

    private Integer fpersonid;

    private String fexperience;

    private String fmajor;

    private String fother;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFpersonid() {
        return fpersonid;
    }

    public void setFpersonid(Integer fpersonid) {
        this.fpersonid = fpersonid;
    }

    public String getFexperience() {
        return fexperience;
    }

    public void setFexperience(String fexperience) {
        this.fexperience = fexperience == null ? null : fexperience.trim();
    }

    public String getFmajor() {
        return fmajor;
    }

    public void setFmajor(String fmajor) {
        this.fmajor = fmajor == null ? null : fmajor.trim();
    }

    public String getFother() {
        return fother;
    }

    public void setFother(String fother) {
        this.fother = fother == null ? null : fother.trim();
    }
}
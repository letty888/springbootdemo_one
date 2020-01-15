package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * basaloneconfig
 * @author 
 */
public class BasAloneConfig implements Serializable {
    /**
     * 主键
     */
    private Integer fid;

    /**
     * 数据体
     */
    private String fdata;

    /**
     * 类型 1: 二维地图 2 : 是否产生测试数据
     */
    private Integer ftype;

    /**
     * 备注
     */
    private String fremak;

    /**
     * 0 前后通用 1 前 2 后
     */
    private Integer fused;

    private static final long serialVersionUID = 1L;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFdata() {
        return fdata;
    }

    public void setFdata(String fdata) {
        this.fdata = fdata;
    }

    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    public String getFremak() {
        return fremak;
    }

    public void setFremak(String fremak) {
        this.fremak = fremak;
    }

    public Integer getFused() {
        return fused;
    }

    public void setFused(Integer fused) {
        this.fused = fused;
    }
}
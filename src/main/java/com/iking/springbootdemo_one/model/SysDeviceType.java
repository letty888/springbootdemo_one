package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * author:qfj
 * 硬件返回类
 */
public class SysDeviceType implements Serializable {

    /**
     * 设备id
     */
    private Integer fId;

    /**
     * 类型编号
     */
    private String fTypeNo;

    /**
     * 类型名称
     */
    private String fTypeName;

    /**
     * 使用中
     */
    private boolean fUsed;

    /**
     * 是否分进出
     */
    private boolean fInOrOut;

    /**
     * 是否配多人
     */
    private boolean fIsMore;

    /**
     * 设备厂商
     */
    private String vender;


    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public boolean isfInOrOut() {
        return fInOrOut;
    }

    public void setfInOrOut(boolean fInOrOut) {
        this.fInOrOut = fInOrOut;
    }

    public boolean isfIsMore() {
        return fIsMore;
    }

    public void setfIsMore(boolean fIsMore) {
        this.fIsMore = fIsMore;
    }

    public boolean isfUsed() {
        return fUsed;
    }

    public void setfUsed(boolean fUsed) {
        this.fUsed = fUsed;
    }

    public String getfTypeNo() {
        return fTypeNo;
    }

    public void setfTypeNo(String fTypeNo) {
        this.fTypeNo = fTypeNo;
    }

    public String getfTypeName() {
        return fTypeName;
    }

    public void setfTypeName(String fTypeName) {
        this.fTypeName = fTypeName;
    }
}

package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * 单位移动
 */
public class SysDeptmentMove implements Serializable {

    private SysDeptment fsysDeptment;

    /**
     * before 在xx之前
     * inner  在xx里面
     * after  在xx之后
     */
    private String fstate;

    private String fdepno;

    public SysDeptment getFsysDeptment() {
        return fsysDeptment;
    }

    public void setFsysDeptment(SysDeptment fsysDeptment) {
        this.fsysDeptment = fsysDeptment;
    }

    public String getFstate() {
        return fstate;
    }

    public void setFstate(String fstate) {
        this.fstate = fstate;
    }

    public String getFdepno() {
        return fdepno;
    }

    public void setFdepno(String fdepno) {
        this.fdepno = fdepno;
    }
}

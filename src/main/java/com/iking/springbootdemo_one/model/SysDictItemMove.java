package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class SysDictItemMove implements Serializable {

    private SysDictItem fsysDictItem;

    /**
     * before 在xx之前
     * inner  在xx里面
     * after  在xx之后
     */
    private String fstate;

    private String fno;


    public SysDictItem getFsysDictItem() {
        return fsysDictItem;
    }

    public void setFsysDictItem(SysDictItem fsysDictItem) {
        this.fsysDictItem = fsysDictItem;
    }

    public String getFstate() {
        return fstate;
    }

    public void setFstate(String fstate) {
        this.fstate = fstate;
    }

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno;
    }
}

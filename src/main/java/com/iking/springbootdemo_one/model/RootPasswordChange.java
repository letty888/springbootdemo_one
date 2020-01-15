package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class RootPasswordChange implements Serializable {

    private String fno;     //人员编号

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno;
    }
}

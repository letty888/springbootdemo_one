package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.List;

public class Kaifazengjiazidian implements Serializable {

    private Integer typeid;

    private List<String> name;

    private String leixing;


    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }
}

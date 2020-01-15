package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class BasAloneConfigRequest implements Serializable {

    private Integer type;

    private Integer used;

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}

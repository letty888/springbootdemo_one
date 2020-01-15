package com.iking.springbootdemo_one.model;

import java.io.Serializable;

public class PoiPerson extends ExPersonBack implements Serializable {

    private Boolean success;

    private String msg;

    private String code;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

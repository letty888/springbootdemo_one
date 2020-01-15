package com.iking.springbootdemo_one.model;

public class Result {
    private Boolean flag;
    private String message;
    private Object obj;


    public Result() {
    }

    public Result(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(Boolean flag, String message, Object obj) {
        this.flag = flag;
        this.message = message;
        this.obj = obj;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                ", obj=" + obj +
                '}';
    }
}

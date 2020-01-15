package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * 人员返回类
 */
@SuppressWarnings("serial")
public class BasPersonNoList implements Serializable {

    private String personNo;

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

}

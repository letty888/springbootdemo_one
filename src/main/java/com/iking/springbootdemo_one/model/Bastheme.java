package com.iking.springbootdemo_one.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Bastheme implements Serializable {
    private Integer fId;

    /**
    * 用户编号
    */
    private String fUser;

    /**
    * 类型
    */
    private Integer fType;
}
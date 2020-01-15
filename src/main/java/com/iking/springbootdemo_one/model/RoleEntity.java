package com.iking.springbootdemo_one.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chailixing
 * @date 2019/12/2 20:41
 */
@Data
public class RoleEntity implements Serializable {
    private static final long serialVersionUID = -1768531479653805627L;

    private String no;

    private String roleStr;
}
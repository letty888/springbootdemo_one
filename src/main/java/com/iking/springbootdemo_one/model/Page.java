package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * 分页工具被继承类
 * author:qfj
 */
public class Page implements Serializable {

    private static final long serialVersionUID = -5492207336807412722L;
    private Integer pageCurrent;

    private Integer pageSize;

    public Page() {
    }

    public Page(Integer pageCurrent, Integer pageSize) {
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
    }

    public Integer getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(Integer pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * @author chailixing
 * 2019/7/15 18:56
 * 基础查询条件
 */
public class BaseParams implements Serializable {

    private static final long serialVersionUID = 3874581742175739639L;

    /**
     * 当前页
     */
    protected int pageCurrent;

    /**
     * 每页条数
     */
    protected int pageSize;

    /**
     * 开始日期
     */
    protected String startDate;

    /**
     * 结束日期
     */
    protected String endDate;

    public int getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
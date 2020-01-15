package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * 系统用户的扩展类
 *
 * @param depNos      数据权限字符串
 * @param userName    登录名
 * @param state       用户装状态  0：启用  1：禁用
 * @param depno       部门编号
 * @param pageCurrent 当前页
 * @param pageSize    每页显示条数
 * @param nos         单位编号集合
 * @author zhuh
 * @date 2017年7月20日 下午6:15:35
 */
@SuppressWarnings("serial")
public class ExSysUser implements Serializable {

    private String userName;

    private Integer state;

    private String depno;

    private String depName;

    private int pageCurrent;

    private int pageSize;

    private String userNo;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepno() {
        return depno;
    }

    public void setDepno(String depno) {
        this.depno = depno;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

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


}

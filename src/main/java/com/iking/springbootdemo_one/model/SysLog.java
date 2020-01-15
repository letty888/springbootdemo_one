package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

/**
 *  日志实体类
 * @author zhuh 
 * @date 2017年7月18日 下午2:02:49
 * @param fid 主键ID
 * @param flogtype 日志类型： 0、常规日志 1、系统日志  2、安全日志  3、业务日志 
 * @param flevel 日志级别 
 * @param ftime 操作时间
 * @param fip 操作IP
 * @param ftype 操作类型
 * @param fcontent 操作内容
 * @param fusername 用户名
 * @param fversion 版本
 */
@SuppressWarnings("serial")
public class SysLog implements Serializable{
    private Integer fid;

    private Integer flogtype;

    private Integer flevel;

    private Date ftime;

    private String fip;

    private String ftype;

    private String fcontent;

    private String fusername;

    private Integer fversion;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFlogtype() {
        return flogtype;
    }

    public void setFlogtype(Integer flogtype) {
        this.flogtype = flogtype;
    }

    public Integer getFlevel() {
        return flevel;
    }

    public void setFlevel(Integer flevel) {
        this.flevel = flevel;
    }

    public Date getFtime() {
        return ftime;
    }

    public void setFtime(Date ftime) {
        this.ftime = ftime;
    }

    public String getFip() {
        return fip;
    }

    public void setFip(String fip) {
        this.fip = fip == null ? null : fip.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent == null ? null : fcontent.trim();
    }

    public String getFusername() {
        return fusername;
    }

    public void setFusername(String fusername) {
        this.fusername = fusername == null ? null : fusername.trim();
    }

    public Integer getFversion() {
        return fversion;
    }

    public void setFversion(Integer fversion) {
        this.fversion = fversion;
    }
}
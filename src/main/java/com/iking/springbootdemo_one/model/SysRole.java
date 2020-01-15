package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;
/**
 *  系统角色实体类
 * @author zhuh 
 * @date 2017年7月18日 上午11:55:12
 * @param fid 主键ID
 * @param fname 角色名称
 * @param ftype 角色类型 0代表系统内置角色，不能删除   1代表由用户添加的角色
 * @param fsort 角色序号
 * @param fmenuidstr 菜单ID集合
 * @param fstatue 角色状态 0 启用 1 禁用
 * @param fcreater 创建人
 * @param fcreatetime 创建时间
 * @param fmodifier 修改人
 * @param fmodifytime 修改时间
 * @param fversion 版本号
 */
@SuppressWarnings("serial")
public class SysRole implements Serializable{
    private Integer fid;

    private String fname;

    private Integer ftype;

    private Integer fsort;

    private String fmenuidstr;

    private Integer fstatue;

    private String fcreater;

    private Date fcreatetime;

    private String fmodifier;

    private Date fmodifytime;

    private Integer fversion;

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    public Integer getFsort() {
        return fsort;
    }

    public void setFsort(Integer fsort) {
        this.fsort = fsort;
    }

    public String getFmenuidstr() {
        return fmenuidstr;
    }

    public void setFmenuidstr(String fmenuidstr) {
        this.fmenuidstr = fmenuidstr == null ? null : fmenuidstr.trim();
    }

    public Integer getFstatue() {
        return fstatue;
    }

    public void setFstatue(Integer fstatue) {
        this.fstatue = fstatue;
    }

    public String getFcreater() {
        return fcreater;
    }

    public void setFcreater(String fcreater) {
        this.fcreater = fcreater == null ? null : fcreater.trim();
    }

    public Date getFcreatetime() {
        return fcreatetime;
    }

    public void setFcreatetime(Date fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    public String getFmodifier() {
        return fmodifier;
    }

    public void setFmodifier(String fmodifier) {
        this.fmodifier = fmodifier == null ? null : fmodifier.trim();
    }

    public Date getFmodifytime() {
        return fmodifytime;
    }

    public void setFmodifytime(Date fmodifytime) {
        this.fmodifytime = fmodifytime;
    }

    public Integer getFversion() {
        return fversion;
    }

    public void setFversion(Integer fversion) {
        this.fversion = fversion;
    }
}
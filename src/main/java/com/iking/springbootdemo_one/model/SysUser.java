package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SysUser implements Serializable{

    private String fno;

    private String fpersonno;

    private String fusername;

    private String fpassword;

    private Integer fstatue;

    private String fbindip;
    
    private Boolean fbinduk;

    private Boolean fislimitip;

    private Date flastlogintime;

    private String flastloginip;

    private Integer flogincount;

    private Boolean fisdelete;

    private String fcreater;

    private Date fcreatetime;

    private String fmodifier;

    private Date fmodifytime;

    private Integer fversion;
    
    private Integer fueyid;
    
    private String depName;

    /**
     * 用户标识
     */
    private String fuseragent;

    /**
     * 用户注册id
     */
    private String fregistrationId;

    public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Boolean getFbinduk() {
		return fbinduk;
	}

	public void setFbinduk(Boolean fbinduk) {
		this.fbinduk = fbinduk;
	}

	public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    public String getFpersonno() {
        return fpersonno;
    }

    public void setFpersonno(String fpersonno) {
        this.fpersonno = fpersonno == null ? null : fpersonno.trim();
    }

    public String getFusername() {
        return fusername;
    }

    public void setFusername(String fusername) {
        this.fusername = fusername == null ? null : fusername.trim();
    }

    public String getFpassword() {
        return fpassword;
    }

    public void setFpassword(String fpassword) {
        this.fpassword = fpassword == null ? null : fpassword.trim();
    }

    public Integer getFstatue() {
        return fstatue;
    }

    public void setFstatue(Integer fstatue) {
        this.fstatue = fstatue;
    }

    public String getFbindip() {
        return fbindip;
    }

    public void setFbindip(String fbindip) {
        this.fbindip = fbindip == null ? null : fbindip.trim();
    }

    public Boolean getFislimitip() {
        return fislimitip;
    }

    public void setFislimitip(Boolean fislimitip) {
        this.fislimitip = fislimitip;
    }

    public Date getFlastlogintime() {
        return flastlogintime;
    }

    public void setFlastlogintime(Date flastlogintime) {
        this.flastlogintime = flastlogintime;
    }

    public String getFlastloginip() {
        return flastloginip;
    }

    public void setFlastloginip(String flastloginip) {
        this.flastloginip = flastloginip == null ? null : flastloginip.trim();
    }

    public Integer getFlogincount() {
        return flogincount;
    }

    public void setFlogincount(Integer flogincount) {
        this.flogincount = flogincount;
    }

    public Boolean getFisdelete() {
        return fisdelete;
    }

    public void setFisdelete(Boolean fisdelete) {
        this.fisdelete = fisdelete;
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

	public Integer getFueyid() {
		return fueyid;
	}

	public void setFueyid(Integer fueyid) {
		this.fueyid = fueyid;
	}

    public String getFuseragent() {
        return fuseragent;
    }

    public void setFuseragent(String fuseragent) {
        this.fuseragent = fuseragent;
    }

    public String getFregistrationId() {
        return fregistrationId;
    }

    public void setFregistrationId(String fregistrationId) {
        this.fregistrationId = fregistrationId;
    }
}
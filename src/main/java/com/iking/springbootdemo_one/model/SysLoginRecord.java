package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SysLoginRecord implements Serializable{
    private String fno;

    private String fpersonno;

    private String fip;

    private Date flogintime;

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

    public String getFip() {
        return fip;
    }

    public void setFip(String fip) {
        this.fip = fip == null ? null : fip.trim();
    }

    public Date getFlogintime() {
        return flogintime;
    }

    public void setFlogintime(Date flogintime) {
        this.flogintime = flogintime;
    }

	public SysLoginRecord(String fno, String fpersonno, String fip, Date flogintime) {
		super();
		this.fno = fno;
		this.fpersonno = fpersonno;
		this.fip = fip;
		this.flogintime = flogintime;
	}

	public SysLoginRecord() {
		super();
	}
    
    
    
}
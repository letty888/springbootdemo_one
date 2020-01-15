package com.iking.springbootdemo_one.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SysDictRole implements Serializable{
    private Integer fid;

    private String froleno;

    private String fbtypeids;

    private String fptypeids;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFroleno() {
        return froleno;
    }

    public void setFroleno(String froleno) {
        this.froleno = froleno == null ? null : froleno.trim();
    }

    public String getFbtypeids() {
        return fbtypeids;
    }

    public void setFbtypeids(String fbtypeids) {
        this.fbtypeids = fbtypeids == null ? null : fbtypeids.trim();
    }

    public String getFptypeids() {
        return fptypeids;
    }

    public void setFptypeids(String fptypeids) {
        this.fptypeids = fptypeids == null ? null : fptypeids.trim();
    }
}
package com.iking.springbootdemo_one.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SysDictBigType implements Serializable{
    private Integer fid;

    private Integer fpid;
    
    private String fname;

    private String fdesc;

    private Integer fsort;

    private Integer fversion;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
    
    public Integer getFpid() {
		return fpid;
	}

	public void setFpid(Integer fpid) {
		this.fpid = fpid;
	}

	public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc == null ? null : fdesc.trim();
    }

    public Integer getFsort() {
        return fsort;
    }

    public void setFsort(Integer fsort) {
        this.fsort = fsort;
    }

    public Integer getFversion() {
        return fversion;
    }

    public void setFversion(Integer fversion) {
        this.fversion = fversion;
    }
}
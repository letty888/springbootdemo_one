package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Title:POIPersonResult
 *
 * @author LLL
 * @date 2017年11月15日
 */
public class POIPersonResult implements Serializable {
    private String fno; // 人员编号
    private String fdeptno; // 单位编号
    private String fname;   //人员姓名
    private String fgender; // 性别 1男
    private String fnation;    //民族
    private String faddress;    //籍贯
    private Date farmytime;        //入伍年月
    private String fphone;        //手机号
    private String fidcard;        //身份证号
    private String fpolitic;    //政治面貌(数据字典)
    private String fmarriage;  //婚姻 1已婚0未婚
    private String ffamilyhold;  //户口:1农村,0非农村
    private String fliveaddress;  //家庭住址
    private String fsource;  //来源:国家分配等(数据字典)
    private String fcollege;  //毕业院校(配置表)
    private String feducation; //学历(数据字典)
    private String fjob;  //职务(数据字典)
    private String fpersiontype;  //人员类型(数据字典)
    private String fnowrank;  //现职级(数据字典)
    private String fmilitaryrank;  //军衔(数据字典)
    private Date fcaucustime;  //党团日期
    private String fspeciality;  //专长(数据字典)
    private String fisonly; // 是否独生子女
    private String fstate;  //人员状态(数据字典)
    private String depName; //单位名称


    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno;
    }

    public String getFdeptno() {
        return fdeptno;
    }

    public void setFdeptno(String fdeptno) {
        this.fdeptno = fdeptno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFgender() {
        return fgender;
    }

    public void setFgender(String fgender) {
        this.fgender = fgender;
    }

    public String getFnation() {
        return fnation;
    }

    public void setFnation(String fnation) {
        this.fnation = fnation;
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress;
    }

    public Date getFarmytime() {
        return farmytime;
    }

    public void setFarmytime(Date farmytime) {
        this.farmytime = farmytime;
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public String getFidcard() {
        return fidcard;
    }

    public void setFidcard(String fidcard) {
        this.fidcard = fidcard;
    }

    public String getFpolitic() {
        return fpolitic;
    }

    public void setFpolitic(String fpolitic) {
        this.fpolitic = fpolitic;
    }

    public String getFmarriage() {
        return fmarriage;
    }

    public void setFmarriage(String fmarriage) {
        this.fmarriage = fmarriage;
    }

    public String getFfamilyhold() {
        return ffamilyhold;
    }

    public void setFfamilyhold(String ffamilyhold) {
        this.ffamilyhold = ffamilyhold;
    }

    public String getFliveaddress() {
        return fliveaddress;
    }

    public void setFliveaddress(String fliveaddress) {
        this.fliveaddress = fliveaddress;
    }

    public String getFsource() {
        return fsource;
    }

    public void setFsource(String fsource) {
        this.fsource = fsource;
    }

    public String getFcollege() {
        return fcollege;
    }

    public void setFcollege(String fcollege) {
        this.fcollege = fcollege;
    }

    public String getFeducation() {
        return feducation;
    }

    public void setFeducation(String feducation) {
        this.feducation = feducation;
    }

    public String getFjob() {
        return fjob;
    }

    public void setFjob(String fjob) {
        this.fjob = fjob;
    }

    public String getFpersiontype() {
        return fpersiontype;
    }

    public void setFpersiontype(String fpersiontype) {
        this.fpersiontype = fpersiontype;
    }

    public String getFnowrank() {
        return fnowrank;
    }

    public void setFnowrank(String fnowrank) {
        this.fnowrank = fnowrank;
    }

    public String getFmilitaryrank() {
        return fmilitaryrank;
    }

    public void setFmilitaryrank(String fmilitaryrank) {
        this.fmilitaryrank = fmilitaryrank;
    }

    public Date getFcaucustime() {
        return fcaucustime;
    }

    public void setFcaucustime(Date fcaucustime) {
        this.fcaucustime = fcaucustime;
    }

    public String getFspeciality() {
        return fspeciality;
    }

    public void setFspeciality(String fspeciality) {
        this.fspeciality = fspeciality;
    }

    public String getFisonly() {
        return fisonly;
    }

    public void setFisonly(String fisonly) {
        this.fisonly = fisonly;
    }

    public String getFstate() {
        return fstate;
    }

    public void setFstate(String fstate) {
        this.fstate = fstate;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }


}

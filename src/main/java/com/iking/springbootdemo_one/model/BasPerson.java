package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员信息
 *
 * @author wkt
 * @date 2017年7月18日 下午8:01:26
 */
@SuppressWarnings("serial")
public class BasPerson implements Serializable {
    private Integer fid;    //主键ID

    private String fno;        //人员编号

    private String fdeptno;        //单位编号

    private String fname;        //姓名

    private Integer fgender;    //性别 1男  0女

    private String fnation;        //民族

    private String nationValue; // 民族字典项

    private String faddress;    //籍贯

    private Date farmytime;        //入伍年月

    private String fphone;        //手机号

    private String fidcard;        //身份证号

    private String fpolitic;    //政治面貌(数据字典)

    private String politicValue;

    private Integer fmarriage;  //婚姻 1已婚0未婚

    private Integer ffamilyhold;  //户口:1农村,0非农村

    private String fliveaddress;  //家庭住址

    private String fsource;  //来源:国家分配等(数据字典)

    private String fcollege;  //毕业院校(配置表)

    private String feducation; //学历(数据字典)

    private String educationValue;

    private Date finschooltime; //入校时间

    private Date foutschooltime;  //毕业时间

    private String fmajor;  //专业(配置表)

    private String fjob;  //职务(数据字典)
    /**
     * //人员类型 (数据字典)
     * <p>
     * 改为 BasPersonController.paramPersonType() 接口固定返回
     */
    private String fpersiontype;

    private String fnowrank;  //现职级(数据字典)

    private Date franktime;  //职级时间

    private String fmilitaryrank;  //军衔(数据字典)

    private String franklevel;  //军衔文级 (数据字典)

    private Date fmilitaryranktime;  //军衔时间

    private Date fcaucustime;  //党团日期

    private Boolean fischarge;  //1是0不是 是否主官

    private String fidnumber;  //证件号：区分军官和士兵

    private String feducationrank;  //(数据字典)

    private Date feducationuptime;  //学历升级时间

    private String fcomputerrank;  //计算机过级(数据字典)

    private String fspeciality;  //专长(数据字典)

    private Date fcomputerranktime;  //计算机过级时间

    private String fheadpicurl;  //头像路径

    private Integer fisonly; // 是否独生子女

    private String fstate;  //人员状态(数据字典)

    private Integer fsort;  //显示顺序

    private String fcreater;  //创建人

    private Date fcreateytime;  //创建时间

    private String fmodifier;   //修改人

    private Date fmodifytime;  //修改时间

    private Integer fversion;  //版本号

    private Boolean fisdelete;  //删除标识

    private String depName; //单位名称

    private String birthday; // 出生日期

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPoliticValue() {
        return politicValue;
    }

    public void setPoliticValue(String politicValue) {
        this.politicValue = politicValue;
    }

    public String getEducationValue() {
        return educationValue;
    }

    public void setEducationValue(String educationValue) {
        this.educationValue = educationValue;
    }

    public String getNationValue() {
        return nationValue;
    }

    public void setNationValue(String nationValue) {
        this.nationValue = nationValue;
    }

    public void setFisonly(Integer fisonly) {
        this.fisonly = fisonly;
    }

    public Integer getFisonly() {
        return fisonly;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Boolean getFisdelete() {
        return fisdelete;
    }

    public void setFisdelete(Boolean fisdelete) {
        this.fisdelete = fisdelete;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    public String getFdeptno() {
        return fdeptno;
    }

    public void setFdeptno(String fdeptno) {
        this.fdeptno = fdeptno == null ? null : fdeptno.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFgender() {
        return fgender;
    }

    public void setFgender(Integer fgender) {
        this.fgender = fgender;
    }

    public String getFnation() {
        return fnation;
    }

    public void setFnation(String fnation) {
        this.fnation = fnation == null ? null : fnation.trim();
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress == null ? null : faddress.trim();
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
        this.fphone = fphone == null ? null : fphone.trim();
    }

    public String getFidcard() {
        return fidcard;
    }

    public void setFidcard(String fidcard) {
        this.fidcard = fidcard == null ? null : fidcard.trim();
    }

    public String getFpolitic() {
        return fpolitic;
    }

    public void setFpolitic(String fpolitic) {
        this.fpolitic = fpolitic == null ? null : fpolitic.trim();
    }

    public Integer getFmarriage() {
        return fmarriage;
    }

    public void setFmarriage(Integer fmarriage) {
        this.fmarriage = fmarriage;
    }

    public Integer getFfamilyhold() {
        return ffamilyhold;
    }

    public void setFfamilyhold(Integer ffamilyhold) {
        this.ffamilyhold = ffamilyhold;
    }

    public String getFliveaddress() {
        return fliveaddress;
    }

    public void setFliveaddress(String fliveaddress) {
        this.fliveaddress = fliveaddress == null ? null : fliveaddress.trim();
    }

    public String getFsource() {
        return fsource;
    }

    public void setFsource(String fsource) {
        this.fsource = fsource == null ? null : fsource.trim();
    }

    public String getFcollege() {
        return fcollege;
    }

    public void setFcollege(String fcollege) {
        this.fcollege = fcollege == null ? null : fcollege.trim();
    }

    public String getFeducation() {
        return feducation;
    }

    public void setFeducation(String feducation) {
        this.feducation = feducation == null ? null : feducation.trim();
    }

    public Date getFinschooltime() {
        return finschooltime;
    }

    public void setFinschooltime(Date finschooltime) {
        this.finschooltime = finschooltime;
    }

    public Date getFoutschooltime() {
        return foutschooltime;
    }

    public void setFoutschooltime(Date foutschooltime) {
        this.foutschooltime = foutschooltime;
    }

    public String getFmajor() {
        return fmajor;
    }

    public void setFmajor(String fmajor) {
        this.fmajor = fmajor == null ? null : fmajor.trim();
    }

    public String getFjob() {
        return fjob;
    }

    public void setFjob(String fjob) {
        this.fjob = fjob == null ? null : fjob.trim();
    }

    public String getFpersiontype() {
        return fpersiontype;
    }

    public void setFpersiontype(String fpersiontype) {
        this.fpersiontype = fpersiontype == null ? null : fpersiontype.trim();
    }

    public String getFnowrank() {
        return fnowrank;
    }

    public void setFnowrank(String fnowrank) {
        this.fnowrank = fnowrank == null ? null : fnowrank.trim();
    }

    public Date getFranktime() {
        return franktime;
    }

    public void setFranktime(Date franktime) {
        this.franktime = franktime;
    }

    public String getFmilitaryrank() {
        return fmilitaryrank;
    }

    public void setFmilitaryrank(String fmilitaryrank) {
        this.fmilitaryrank = fmilitaryrank == null ? null : fmilitaryrank.trim();
    }

    public String getFranklevel() {
        return franklevel;
    }

    public void setFranklevel(String franklevel) {
        this.franklevel = franklevel == null ? null : franklevel.trim();
    }

    public Date getFmilitaryranktime() {
        return fmilitaryranktime;
    }

    public void setFmilitaryranktime(Date fmilitaryranktime) {
        this.fmilitaryranktime = fmilitaryranktime;
    }

    public Date getFcaucustime() {
        return fcaucustime;
    }

    public void setFcaucustime(Date fcaucustime) {
        this.fcaucustime = fcaucustime;
    }

    public Boolean getFischarge() {
        return fischarge;
    }

    public void setFischarge(Boolean fischarge) {
        this.fischarge = fischarge;
    }

    public String getFidnumber() {
        return fidnumber;
    }

    public void setFidnumber(String fidnumber) {
        this.fidnumber = fidnumber == null ? null : fidnumber.trim();
    }

    public String getFeducationrank() {
        return feducationrank;
    }

    public void setFeducationrank(String feducationrank) {
        this.feducationrank = feducationrank == null ? null : feducationrank.trim();
    }

    public Date getFeducationuptime() {
        return feducationuptime;
    }

    public void setFeducationuptime(Date feducationuptime) {
        this.feducationuptime = feducationuptime;
    }

    public String getFcomputerrank() {
        return fcomputerrank;
    }

    public void setFcomputerrank(String fcomputerrank) {
        this.fcomputerrank = fcomputerrank == null ? null : fcomputerrank.trim();
    }

    public String getFspeciality() {
        return fspeciality;
    }

    public void setFspeciality(String fspeciality) {
        this.fspeciality = fspeciality == null ? null : fspeciality.trim();
    }

    public Date getFcomputerranktime() {
        return fcomputerranktime;
    }

    public void setFcomputerranktime(Date fcomputerranktime) {
        this.fcomputerranktime = fcomputerranktime;
    }

    public String getFheadpicurl() {
        return fheadpicurl;
    }

    public void setFheadpicurl(String fheadpicurl) {
        this.fheadpicurl = fheadpicurl == null ? null : fheadpicurl.trim();
    }

    public String getFstate() {
        return fstate;
    }

    public void setFstate(String fstate) {
        this.fstate = fstate == null ? null : fstate.trim();
    }

    public Integer getFsort() {
        return fsort;
    }

    public void setFsort(Integer fsort) {
        this.fsort = fsort;
    }

    public String getFcreater() {
        return fcreater;
    }

    public void setFcreater(String fcreater) {
        this.fcreater = fcreater == null ? null : fcreater.trim();
    }

    public Date getFcreateytime() {
        return fcreateytime;
    }

    public void setFcreateytime(Date fcreateytime) {
        this.fcreateytime = fcreateytime;
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
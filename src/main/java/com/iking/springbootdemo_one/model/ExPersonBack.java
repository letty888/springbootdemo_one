package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * @author wkt
 *  查询人员信息返回
 * @date 2017年7月25日 上午10:21:44
 */
public class ExPersonBack implements Serializable {

    /**
     * 主键ID
     */
    private Integer fid;

    /**
     * 人员编号
     */
    private String fno;

    /**
     * 单位编号
     */
    private String fdeptno;

    /**
     * 单位名称
     */
    private String fdeptnovalue;

    /**
     * 单位类型
     */
    private String depType;

    /**
     * 单位级别
     */
    private String depLevel;

    /**
     * 姓名
     */
    private String fname;

    /**
     * 性别 1男  0女
     */
    private Integer fgender;

    /**
     * 民族
     */
    private String fnation;

    /**
     * 民族名称
     */
    private String fnationvalue;

    /**
     * 籍贯
     */
    private String faddress;

    /**
     *
     */
    private Date farmytime;

    /**
     * 手机号
     */
    private String fphone;

    /**
     * 身份证号
     */
    private String fidcard;

    /**
     * 政治面貌(数据字典)
     */
    private String fpolitic;

    /**
     * 政治面貌名称
     */
    private String fpoliticvalue;

    /**
     * 婚姻 1已婚0未婚
     */
    private Integer fmarriage;

    /**
     * 户口:1农村,0非农村
     */
    private Integer ffamilyhold;

    /**
     * 家庭住址
     */
    private String fliveaddress;

    /**
     * 来源:国家分配等(数据字典)
     */
    private String fsource;

    /**
     * 来源名称
     */
    private String fsourcevalue;

    /**
     * 毕业院校(配置表)
     */
    private String fcollege;

    /**
     * 学历(数据字典)
     */
    private String feducation;

    /**
     * 学历名称
     */
    private String feducationvalue;

    /**
     * 入校时间
     */
    private Date finschooltime;

    /**
     * 毕业时间
     */
    private Date foutschooltime;

    /**
     * 专业(配置表)
     */
    private String fmajor;

    /**
     * 职务(数据字典)
     */
    private String fjob;

    /**
     * 职务名称
     */
    private String fjobvalue;

    /**
     * 人员类型(数据字典)
     */
    private String fpersiontype;

    /**
     * 人员类型名称
     */
    private String fpersiontypevalue;

    /**
     * 现职级(数据字典)
     */
    private String fnowrank;

    /**
     * 现职级名称
     */
    private String fnowrankvalue;

    /**
     * 职级时间
     */
    private Date franktime;

    /**
     * 军衔(数据字典)
     */
    private String fmilitaryrank;

    /**
     * 军衔名称
     */
    private String fmilitaryrankvalue;

    /**
     * 军衔文级 (数据字典)
     */
    private String franklevel;

    /**
     * 军衔文级名称
     */
    private String franklevelvalue;

    /**
     * 军衔时间
     */
    private Date fmilitaryranktime;

    /**
     * 党团日期
     */
    private Date fcaucustime;

    /**
     * 1是0不是 是否主官
     */
    private Boolean fischarge;

    /**
     * 证件号：区分军官和士兵
     */
    private String fidnumber;

    /**
     * 教育级别(数据字典)
     */
    private String feducationrank;

    /**
     * 教育级别名称
     */
    private String feducationrankvalue;

    /**
     * 学历升级时间
     */
    private Date feducationuptime;

    /**
     * 计算机过级(数据字典)
     */
    private String fcomputerrank;

    /**
     * 计算机过级名称
     */
    private String fcomputerrankvalue;

    /**
     * 专长(数据字典)
     */
    private String fspeciality;

    /**
     * 专长名称
     */
    private String fspecialityvalue;

    /**
     * 计算机过级时间
     */
    private Date fcomputerranktime;

    /**
     * 头像路径
     */
    private String fheadpicurl;

    /**
     * 人员状态(数据字典)
     */
    private String fstate;

    /**
     * 人员状态名称
     */
    private String fstatevalue;

    /**
     * 显示顺序
     */
    private Integer fsort;

    /**
     * 创建人
     */
    private String fcreater;

    /**
     * 创建时间
     */
    private Date fcreateytime;

    /**
     * 修改人
     */
    private String fmodifier;

    /**
     * 修改时间
     */
    private Date fmodifytime;

    /**
     * 版本号
     */
    private Integer fversion;

    /**
     * 删除标识
     */
    private Boolean fisdelete;

    /**
     * 学院名称
     */
    private String collageName;

    /**
     * 专业名称
     */
    private String majorName;

    /**
     * 用户名
     */
    private String username;

    /**
     * 级别
     */
    private String flevel;

    private String rankName;

    /**
     * 地址
     */
    private String addressName;



    private Boolean isApply;

    /**
     * 是否独生子女
     */
    private Integer fisonly;

    /**
     * 生日
     */
    private String fbrithday;

    /**
     * 人员扩展信息,重大经历实体
     */
    private BasPersonAttached basPersonAttached;

    /**
     * 人员智慧考勤等实体
     */
    private BasPersonInformation basPersonInformation;

    /**
     * 借调信息
     */
    private String userRemove;

    /**
     * 职业技能鉴定
     */
    private List<BasSkillJudge> basSkillJudges;

    public String getUserRemove() {
        return userRemove;
    }

    public void setUserRemove(String userRemove) {
        this.userRemove = userRemove;
    }

    public Boolean getApply() {
        return isApply;
    }

    public void setApply(Boolean apply) {
        isApply = apply;
    }

    public Integer getFisonly() {
        return fisonly;
    }

    public void setFisonly(Integer fisonly) {
        this.fisonly = fisonly;
    }

    public String getFbrithday() {
        return fbrithday;
    }

    public void setFbrithday(String fbrithday) {
        this.fbrithday = fbrithday;
    }

    public Boolean getIsApply() {
        return isApply;
    }

    public void setIsApply(Boolean isApply) {
        this.isApply = isApply;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getDepType() {
        return depType;
    }

    public void setDepType(String depType) {
        this.depType = depType;
    }

    public String getDepLevel() {
        return depLevel;
    }

    public void setDepLevel(String depLevel) {
        this.depLevel = depLevel;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getFlevel() {
        return flevel;
    }

    public void setFlevel(String flevel) {
        this.flevel = flevel;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public List<BasSkillJudge> getBasSkillJudges() {
        return basSkillJudges;
    }

    public void setBasSkillJudges(List<BasSkillJudge> basSkillJudges) {
        this.basSkillJudges = basSkillJudges;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        this.fno = fno;
    }

    public String getFdeptno() {
        return fdeptno;
    }

    public void setFdeptno(String fdeptno) {
        this.fdeptno = fdeptno;
    }

    public String getFdeptnovalue() {
        return fdeptnovalue;
    }

    public void setFdeptnovalue(String fdeptnovalue) {
        this.fdeptnovalue = fdeptnovalue;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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
        this.fnation = fnation;
    }

    public String getFnationvalue() {
        return fnationvalue;
    }

    public void setFnationvalue(String fnationvalue) {
        this.fnationvalue = fnationvalue;
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

    public String getFpoliticvalue() {
        return fpoliticvalue;
    }

    public void setFpoliticvalue(String fpoliticvalue) {
        this.fpoliticvalue = fpoliticvalue;
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
        this.fliveaddress = fliveaddress;
    }

    public String getFsource() {
        return fsource;
    }

    public void setFsource(String fsource) {
        this.fsource = fsource;
    }

    public String getFsourcevalue() {
        return fsourcevalue;
    }

    public void setFsourcevalue(String fsourcevalue) {
        this.fsourcevalue = fsourcevalue;
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

    public String getFeducationvalue() {
        return feducationvalue;
    }

    public void setFeducationvalue(String feducationvalue) {
        this.feducationvalue = feducationvalue;
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
        this.fmajor = fmajor;
    }

    public String getFjob() {
        return fjob;
    }

    public void setFjob(String fjob) {
        this.fjob = fjob;
    }

    public String getFjobvalue() {
        return fjobvalue;
    }

    public void setFjobvalue(String fjobvalue) {
        this.fjobvalue = fjobvalue;
    }

    public String getFpersiontype() {
        return fpersiontype;
    }

    public void setFpersiontype(String fpersiontype) {
        this.fpersiontype = fpersiontype;
    }

    public String getFpersiontypevalue() {
        return fpersiontypevalue;
    }

    public void setFpersiontypevalue(String fpersiontypevalue) {
        this.fpersiontypevalue = fpersiontypevalue;
    }

    public String getFnowrank() {
        return fnowrank;
    }

    public void setFnowrank(String fnowrank) {
        this.fnowrank = fnowrank;
    }

    public String getFnowrankvalue() {
        return fnowrankvalue;
    }

    public void setFnowrankvalue(String fnowrankvalue) {
        this.fnowrankvalue = fnowrankvalue;
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
        this.fmilitaryrank = fmilitaryrank;
    }

    public String getFmilitaryrankvalue() {
        return fmilitaryrankvalue;
    }

    public void setFmilitaryrankvalue(String fmilitaryrankvalue) {
        this.fmilitaryrankvalue = fmilitaryrankvalue;
    }

    public String getFranklevel() {
        return franklevel;
    }

    public void setFranklevel(String franklevel) {
        this.franklevel = franklevel;
    }

    public String getFranklevelvalue() {
        return franklevelvalue;
    }

    public void setFranklevelvalue(String franklevelvalue) {
        this.franklevelvalue = franklevelvalue;
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
        this.fidnumber = fidnumber;
    }

    public String getFeducationrank() {
        return feducationrank;
    }

    public void setFeducationrank(String feducationrank) {
        this.feducationrank = feducationrank;
    }

    public String getFeducationrankvalue() {
        return feducationrankvalue;
    }

    public void setFeducationrankvalue(String feducationrankvalue) {
        this.feducationrankvalue = feducationrankvalue;
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
        this.fcomputerrank = fcomputerrank;
    }

    public String getFcomputerrankvalue() {
        return fcomputerrankvalue;
    }

    public void setFcomputerrankvalue(String fcomputerrankvalue) {
        this.fcomputerrankvalue = fcomputerrankvalue;
    }

    public String getFspeciality() {
        return fspeciality;
    }

    public void setFspeciality(String fspeciality) {
        this.fspeciality = fspeciality;
    }

    public String getFspecialityvalue() {
        return fspecialityvalue;
    }

    public void setFspecialityvalue(String fspecialityvalue) {
        this.fspecialityvalue = fspecialityvalue;
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
        this.fheadpicurl = fheadpicurl;
    }

    public String getFstate() {
        return fstate;
    }

    public void setFstate(String fstate) {
        this.fstate = fstate;
    }

    public String getFstatevalue() {
        return fstatevalue;
    }

    public void setFstatevalue(String fstatevalue) {
        this.fstatevalue = fstatevalue;
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
        this.fcreater = fcreater;
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
        this.fmodifier = fmodifier;
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

    public Boolean getFisdelete() {
        return fisdelete;
    }

    public void setFisdelete(Boolean fisdelete) {
        this.fisdelete = fisdelete;
    }

    public BasPersonAttached getBasPersonAttached() {
        return basPersonAttached;
    }

    public void setBasPersonAttached(BasPersonAttached basPersonAttached) {
        this.basPersonAttached = basPersonAttached;
    }

    public BasPersonInformation getBasPersonInformation() {
        return basPersonInformation;
    }

    public void setBasPersonInformation(BasPersonInformation basPersonInformation) {
        this.basPersonInformation = basPersonInformation;
    }
}

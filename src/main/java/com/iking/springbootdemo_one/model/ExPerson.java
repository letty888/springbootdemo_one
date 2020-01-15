package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.List;


/**
 * 人员信息+职业技能鉴定
 *
 * @author wkt
 * @date 2017年7月18日 下午8:03:03
 */
@SuppressWarnings("serial")
public class ExPerson implements Serializable {

    private BasPersonAttached basPersonAttached;

    private BasPersonInformation basPersonInformation;

    private BasPerson person;

    private String username;

    private List<BasSkillJudge> basSkillJudgeList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BasPerson getPerson() {
        return person;
    }

    public void setPerson(BasPerson person) {
        this.person = person;
    }

    public List<BasSkillJudge> getBasSkillJudgeList() {
        return basSkillJudgeList;
    }

    public void setBasSkillJudgeList(List<BasSkillJudge> basSkillJudgeList) {
        this.basSkillJudgeList = basSkillJudgeList;
    }

    public BasPersonInformation getBasPersonInformation() {
        return basPersonInformation;
    }

    public void setBasPersonInformation(BasPersonInformation basPersonInformation) {
        this.basPersonInformation = basPersonInformation;
    }

    public BasPersonAttached getBasPersonAttached() {
        return basPersonAttached;
    }

    public void setBasPersonAttached(BasPersonAttached basPersonAttached) {
        this.basPersonAttached = basPersonAttached;
    }
}

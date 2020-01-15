package com.iking.springbootdemo_one.model;

import org.quartz.JobDataMap;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class TriggerNeedParam implements Serializable {

    /**
     * //调度器执行哪个业务的类型
     */
    private String typerTigger;
    /**
     * //job唯一key值
     */
    private String jobKeyName;
    /**
     * //job的组名
     */
    private String jobGroupName;
    /**
     * //可能会需要传的参数
     */
    private JobDataMap dataMap;
    /**
     * //执行开始时间
     */
    private Date startTime;
    /**
     * //执行结束时间
     */
    private Date endTime;

    public String getTyperTigger() {
        return typerTigger;
    }

    public void setTyperTigger(String typerTigger) {
        this.typerTigger = typerTigger;
    }

    public String getJobKeyName() {
        return jobKeyName == null ? UUID.randomUUID().toString().replace("-", "") : jobKeyName;
    }

    public void setJobKeyName(String jobKeyName) {
        this.jobKeyName = jobKeyName;
    }

    public String getJobGroupName() {
        return jobGroupName == null ? typerTigger : jobGroupName;
    }

    public void setJobGroupName(String jobGroupName) {
        this.jobGroupName = jobGroupName;
    }

    public JobDataMap getDataMap() {
        return dataMap == null ? new JobDataMap() : dataMap;
    }

    public void setDataMap(JobDataMap dataMap) {
        this.dataMap = dataMap;
    }

    public Date getStartTime() {
        return startTime == null ? new Date() : startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public TriggerNeedParam() {
        super();
    }

    public TriggerNeedParam(String typerTigger, String jobKeyName, String jobGroupName, JobDataMap dataMap,
                            Date startTime, Date endTime) {
        super();
        this.typerTigger = typerTigger;
        this.jobKeyName = jobKeyName;
        this.jobGroupName = jobGroupName;
        this.dataMap = dataMap;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public TriggerNeedParam(String typerTigger, String jobKeyName, JobDataMap dataMap, Date startTime) {
        super();
        this.typerTigger = typerTigger;
        this.jobKeyName = jobKeyName;
        this.dataMap = dataMap;
        this.startTime = startTime;
    }


}

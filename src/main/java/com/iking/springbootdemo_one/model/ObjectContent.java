package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

public class ObjectContent implements Serializable {

    private static final long serialVersionUID = -4610018098708276894L;
    /**
     * 标题
     */
    private String fTitle;

    /**
     * 人员名称/车牌号
     */
    private String fName;

    /**
     * 人员职务/车辆类型
     */
    private String fJobName;

    /**
     * 人员或车辆图片
     */
    private String fPicUrl;

    /**
     * 人员车辆基础信息
     * 人员的单位,请假时长,审批人,外出时间，归队时间
     */
    private List<String> basicInformation;

    /**
     * 人员车辆统计信息
     * 人员车辆基础数据统计
     */
    private LinkedHashMap<String, Integer> basicCount;

    /**
     * 语音播报内容
     */
    private String fVoiceBroadcast;

    /**
     * 状态
     */
    private int fState;

    public String getfTitle() {
        return fTitle;
    }

    public void setfTitle(String fTitle) {
        this.fTitle = fTitle;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfJobName() {
        return fJobName;
    }

    public void setfJobName(String fJobName) {
        this.fJobName = fJobName;
    }

    public String getfPicUrl() {
        return fPicUrl;
    }

    public void setfPicUrl(String fPicUrl) {
        this.fPicUrl = fPicUrl;
    }

    public List<String> getBasicInformation() {
        return basicInformation;
    }

    public void setBasicInformation(List<String> basicInformation) {
        this.basicInformation = basicInformation;
    }

    public LinkedHashMap<String, Integer> getBasicCount() {
        return basicCount;
    }

    public void setBasicCount(LinkedHashMap<String, Integer> basicCount) {
        this.basicCount = basicCount;
    }

    public String getfVoiceBroadcast() {
        return fVoiceBroadcast;
    }

    public void setfVoiceBroadcast(String fVoiceBroadcast) {
        this.fVoiceBroadcast = fVoiceBroadcast;
    }

    public int getfState() {
        return fState;
    }

    public void setfState(int fState) {
        this.fState = fState;
    }
}
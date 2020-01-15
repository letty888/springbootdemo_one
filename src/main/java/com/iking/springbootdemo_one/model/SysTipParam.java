package com.iking.springbootdemo_one.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 消息返回类
 * author:qfj
 */
public class SysTipParam implements Serializable {

    /**
     * 主键
     */
    private Integer fId;

    /**
     * 接收人姓名
     */
    private String fReceiverName;

    /**
     * 接收人id
     */
    private String fReceiverId;

    /**
     * 类型名称
     */
    private String fName;

    /**
     * 类型编号
     */
    private String fType;

    /**
     * 主体
     */
    private String fContent;

    /**
     * 0未读，1已读
     */
    private String fIsRead;

    /**
     * 创建时间
     */
    private Date fCreateTime;

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfReceiverName() {
        return fReceiverName;
    }

    public void setfReceiverName(String fReceiverName) {
        this.fReceiverName = fReceiverName;
    }

    public String getfReceiverId() {
        return fReceiverId;
    }

    public void setfReceiverId(String fReceiverId) {
        this.fReceiverId = fReceiverId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public String getfContent() {
        return fContent;
    }

    public void setfContent(String fContent) {
        this.fContent = fContent;
    }

    public String getfIsRead() {
        return fIsRead;
    }

    public void setfIsRead(String fIsRead) {
        this.fIsRead = fIsRead;
    }
}

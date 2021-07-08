package com.welfare.entity;

import java.sql.Date;

/**
 * 资源信息表
 */
public class Message {
    private String messId;//咨询编号
    private String messageTitle;//咨询标题
    private String messageContent;//咨询内容
    private Date createDate;//创建时间

    public Message() {
    }

    public Message(String messId, String messageTitle, String messageContent, Date createDate) {
        this.messId = messId;
        this.messageTitle = messageTitle;
        this.messageContent = messageContent;
        this.createDate = createDate;
    }

    public String getMessId() {
        return messId;
    }

    public void setMessId(String messId) {
        this.messId = messId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

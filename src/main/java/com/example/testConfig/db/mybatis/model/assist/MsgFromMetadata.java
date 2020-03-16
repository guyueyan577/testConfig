package com.example.testConfig.db.mybatis.model.assist;

public class MsgFromMetadata {
    private Integer id;

    private Integer msgFrom;

    private String msgFromName;

    private String msgFromNameEn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMsgFrom() {
        return msgFrom;
    }

    public void setMsgFrom(Integer msgFrom) {
        this.msgFrom = msgFrom;
    }

    public String getMsgFromName() {
        return msgFromName;
    }

    public void setMsgFromName(String msgFromName) {
        this.msgFromName = msgFromName == null ? null : msgFromName.trim();
    }

    public String getMsgFromNameEn() {
        return msgFromNameEn;
    }

    public void setMsgFromNameEn(String msgFromNameEn) {
        this.msgFromNameEn = msgFromNameEn == null ? null : msgFromNameEn.trim();
    }
}
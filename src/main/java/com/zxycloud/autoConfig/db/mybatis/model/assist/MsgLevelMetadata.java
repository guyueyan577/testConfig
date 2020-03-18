package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class MsgLevelMetadata {
    private Integer id;

    private Integer msgLevel;

    private String msgLevelName;

    private String msgLevelNameEn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMsgLevel() {
        return msgLevel;
    }

    public void setMsgLevel(Integer msgLevel) {
        this.msgLevel = msgLevel;
    }

    public String getMsgLevelName() {
        return msgLevelName;
    }

    public void setMsgLevelName(String msgLevelName) {
        this.msgLevelName = msgLevelName == null ? null : msgLevelName.trim();
    }

    public String getMsgLevelNameEn() {
        return msgLevelNameEn;
    }

    public void setMsgLevelNameEn(String msgLevelNameEn) {
        this.msgLevelNameEn = msgLevelNameEn == null ? null : msgLevelNameEn.trim();
    }
}
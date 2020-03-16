package com.example.testConfig.db.mybatis.model.assist;

public class MsgTypeMetadata {
    private Integer id;

    private Integer msgType;

    private String msgTypeName;

    private String msgTypeNameEn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public String getMsgTypeName() {
        return msgTypeName;
    }

    public void setMsgTypeName(String msgTypeName) {
        this.msgTypeName = msgTypeName == null ? null : msgTypeName.trim();
    }

    public String getMsgTypeNameEn() {
        return msgTypeNameEn;
    }

    public void setMsgTypeNameEn(String msgTypeNameEn) {
        this.msgTypeNameEn = msgTypeNameEn == null ? null : msgTypeNameEn.trim();
    }
}
package com.example.testConfig.db.mybatis.model.assist;

import com.alibaba.fastjson.JSON;

public class PushMetadata {
    private String id;

    private Integer pushCode;

    private String pushName;

    private Integer pushType;

    private String i18nCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getPushCode() {
        return pushCode;
    }

    public void setPushCode(Integer pushCode) {
        this.pushCode = pushCode;
    }

    public String getPushName() {
        return pushName;
    }

    public void setPushName(String pushName) {
        this.pushName = pushName == null ? null : pushName.trim();
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }
}
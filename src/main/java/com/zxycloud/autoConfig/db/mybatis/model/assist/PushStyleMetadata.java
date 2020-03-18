package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class PushStyleMetadata {
    private String id;

    private Integer pushCode;

    private String pushName;

    private String i18n;

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

    public String getI18n() {
        return i18n;
    }

    public void setI18n(String i18n) {
        this.i18n = i18n == null ? null : i18n.trim();
    }
}
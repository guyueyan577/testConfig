package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class SignalSourceMetadata {
    private String id;

    private Integer signalCode;

    private String signalName;

    private String i18nCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSignalCode() {
        return signalCode;
    }

    public void setSignalCode(Integer signalCode) {
        this.signalCode = signalCode;
    }

    public String getSignalName() {
        return signalName;
    }

    public void setSignalName(String signalName) {
        this.signalName = signalName == null ? null : signalName.trim();
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }
}
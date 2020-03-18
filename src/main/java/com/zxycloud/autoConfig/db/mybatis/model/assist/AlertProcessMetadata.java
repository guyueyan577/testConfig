package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class AlertProcessMetadata {
    private String id;

    private Integer alertProcessCode;

    private String i18nCode;

    private String alertProcessName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getAlertProcessCode() {
        return alertProcessCode;
    }

    public void setAlertProcessCode(Integer alertProcessCode) {
        this.alertProcessCode = alertProcessCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getAlertProcessName() {
        return alertProcessName;
    }

    public void setAlertProcessName(String alertProcessName) {
        this.alertProcessName = alertProcessName == null ? null : alertProcessName.trim();
    }
}
package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class DeviceEventMetadata {
    private String id;

    private Integer deviceEventCode;

    private String i18nCode;

    private String deviceEventName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceEventCode() {
        return deviceEventCode;
    }

    public void setDeviceEventCode(Integer deviceEventCode) {
        this.deviceEventCode = deviceEventCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getDeviceEventName() {
        return deviceEventName;
    }

    public void setDeviceEventName(String deviceEventName) {
        this.deviceEventName = deviceEventName == null ? null : deviceEventName.trim();
    }
}
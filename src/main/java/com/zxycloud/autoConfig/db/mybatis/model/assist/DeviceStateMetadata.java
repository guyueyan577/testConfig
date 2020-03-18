package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class DeviceStateMetadata {
    private String id;

    private Integer deviceStateCode;

    private String i18nCode;

    private String deviceStateName;

    private Integer deviceStateGroupCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceStateCode() {
        return deviceStateCode;
    }

    public void setDeviceStateCode(Integer deviceStateCode) {
        this.deviceStateCode = deviceStateCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getDeviceStateName() {
        return deviceStateName;
    }

    public void setDeviceStateName(String deviceStateName) {
        this.deviceStateName = deviceStateName == null ? null : deviceStateName.trim();
    }

    public Integer getDeviceStateGroupCode() {
        return deviceStateGroupCode;
    }

    public void setDeviceStateGroupCode(Integer deviceStateGroupCode) {
        this.deviceStateGroupCode = deviceStateGroupCode;
    }
}
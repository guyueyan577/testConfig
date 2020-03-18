package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class DeviceSubSystemMetadata {
    private String id;

    private Integer deviceSubSystemCode;

    private String i18nCode;

    private String deviceSubSystemName;

    private Integer deviceSystemCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceSubSystemCode() {
        return deviceSubSystemCode;
    }

    public void setDeviceSubSystemCode(Integer deviceSubSystemCode) {
        this.deviceSubSystemCode = deviceSubSystemCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getDeviceSubSystemName() {
        return deviceSubSystemName;
    }

    public void setDeviceSubSystemName(String deviceSubSystemName) {
        this.deviceSubSystemName = deviceSubSystemName == null ? null : deviceSubSystemName.trim();
    }

    public Integer getDeviceSystemCode() {
        return deviceSystemCode;
    }

    public void setDeviceSystemCode(Integer deviceSystemCode) {
        this.deviceSystemCode = deviceSystemCode;
    }
}
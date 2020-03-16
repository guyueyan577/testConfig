package com.example.testConfig.db.mybatis.model.assist;

public class DeviceOperateMetadata {
    private String id;

    private Integer deviceOperateCode;

    private String i18nCode;

    private String deviceOperateName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceOperateCode() {
        return deviceOperateCode;
    }

    public void setDeviceOperateCode(Integer deviceOperateCode) {
        this.deviceOperateCode = deviceOperateCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getDeviceOperateName() {
        return deviceOperateName;
    }

    public void setDeviceOperateName(String deviceOperateName) {
        this.deviceOperateName = deviceOperateName == null ? null : deviceOperateName.trim();
    }
}
package com.example.testConfig.db.mybatis.model.assist;

public class DeviceAttributeSetValueMetadata {
    private String id;

    private Integer deviceAttributeSetTypeCode;

    private Integer deviceAttributeSetValueCode;

    private String deviceAttributeSetValueName;

    private String i18nCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceAttributeSetTypeCode() {
        return deviceAttributeSetTypeCode;
    }

    public void setDeviceAttributeSetTypeCode(Integer deviceAttributeSetTypeCode) {
        this.deviceAttributeSetTypeCode = deviceAttributeSetTypeCode;
    }

    public Integer getDeviceAttributeSetValueCode() {
        return deviceAttributeSetValueCode;
    }

    public void setDeviceAttributeSetValueCode(Integer deviceAttributeSetValueCode) {
        this.deviceAttributeSetValueCode = deviceAttributeSetValueCode;
    }

    public String getDeviceAttributeSetValueName() {
        return deviceAttributeSetValueName;
    }

    public void setDeviceAttributeSetValueName(String deviceAttributeSetValueName) {
        this.deviceAttributeSetValueName = deviceAttributeSetValueName == null ? null : deviceAttributeSetValueName.trim();
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }
}
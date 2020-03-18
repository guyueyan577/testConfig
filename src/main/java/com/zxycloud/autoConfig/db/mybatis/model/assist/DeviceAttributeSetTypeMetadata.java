package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class DeviceAttributeSetTypeMetadata {
    private String id;

    private Integer deviceAttributeSetTypeCode;

    private Integer valueType;

    private String deviceAttributeSetTypeName;

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

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public String getDeviceAttributeSetTypeName() {
        return deviceAttributeSetTypeName;
    }

    public void setDeviceAttributeSetTypeName(String deviceAttributeSetTypeName) {
        this.deviceAttributeSetTypeName = deviceAttributeSetTypeName == null ? null : deviceAttributeSetTypeName.trim();
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }
}
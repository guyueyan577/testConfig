package com.example.testConfig.db.mybatis.model.biz;

public class ZhejiangDeviceType {
    private String id;

    private Integer deviceTypeCode;

    private String i18nCode;

    private String deviceTypeName;

    private Integer zjDeviceType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceTypeCode() {
        return deviceTypeCode;
    }

    public void setDeviceTypeCode(Integer deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName == null ? null : deviceTypeName.trim();
    }

    public Integer getZjDeviceType() {
        return zjDeviceType;
    }

    public void setZjDeviceType(Integer zjDeviceType) {
        this.zjDeviceType = zjDeviceType;
    }
}
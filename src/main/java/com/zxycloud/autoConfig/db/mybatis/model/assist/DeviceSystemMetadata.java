package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class DeviceSystemMetadata {
    private String id;

    private Integer deviceSystemCode;

    private String i18nCode;

    private String deviceSystemName;

    private String deviceTypeOrder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceSystemCode() {
        return deviceSystemCode;
    }

    public void setDeviceSystemCode(Integer deviceSystemCode) {
        this.deviceSystemCode = deviceSystemCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getDeviceSystemName() {
        return deviceSystemName;
    }

    public void setDeviceSystemName(String deviceSystemName) {
        this.deviceSystemName = deviceSystemName == null ? null : deviceSystemName.trim();
    }

    public String getDeviceTypeOrder() {
        return deviceTypeOrder;
    }

    public void setDeviceTypeOrder(String deviceTypeOrder) {
        this.deviceTypeOrder = deviceTypeOrder == null ? null : deviceTypeOrder.trim();
    }
}
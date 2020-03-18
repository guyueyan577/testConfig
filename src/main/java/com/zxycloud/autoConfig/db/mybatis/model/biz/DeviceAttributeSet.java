package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class DeviceAttributeSet {
    private String id;

    private String deviceId;

    private Integer deviceAttributeSetTypeCode;

    private Integer deviceAttributeSetValueCode;

    private String deviceAttributeSetValue;

    private Long createTime;

    private Long updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
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

    public String getDeviceAttributeSetValue() {
        return deviceAttributeSetValue;
    }

    public void setDeviceAttributeSetValue(String deviceAttributeSetValue) {
        this.deviceAttributeSetValue = deviceAttributeSetValue == null ? null : deviceAttributeSetValue.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
package com.example.testConfig.db.mybatis.model.assist;

public class DeviceStateRelation {
    private String id;

    private Integer deviceStateCode;

    private String deviceStateName;

    private Integer addStateCode;

    private String removeStateCode;

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

    public String getDeviceStateName() {
        return deviceStateName;
    }

    public void setDeviceStateName(String deviceStateName) {
        this.deviceStateName = deviceStateName == null ? null : deviceStateName.trim();
    }

    public Integer getAddStateCode() {
        return addStateCode;
    }

    public void setAddStateCode(Integer addStateCode) {
        this.addStateCode = addStateCode;
    }

    public String getRemoveStateCode() {
        return removeStateCode;
    }

    public void setRemoveStateCode(String removeStateCode) {
        this.removeStateCode = removeStateCode == null ? null : removeStateCode.trim();
    }
}
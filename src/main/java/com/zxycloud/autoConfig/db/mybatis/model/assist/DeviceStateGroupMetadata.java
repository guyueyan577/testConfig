package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class DeviceStateGroupMetadata {
    private String id;

    private Integer deviceStateGroupCode;

    private String i18nCode;

    private String deviceStateGroupName;

    private Integer sortScore;

    private Integer primeNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceStateGroupCode() {
        return deviceStateGroupCode;
    }

    public void setDeviceStateGroupCode(Integer deviceStateGroupCode) {
        this.deviceStateGroupCode = deviceStateGroupCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getDeviceStateGroupName() {
        return deviceStateGroupName;
    }

    public void setDeviceStateGroupName(String deviceStateGroupName) {
        this.deviceStateGroupName = deviceStateGroupName == null ? null : deviceStateGroupName.trim();
    }

    public Integer getSortScore() {
        return sortScore;
    }

    public void setSortScore(Integer sortScore) {
        this.sortScore = sortScore;
    }

    public Integer getPrimeNumber() {
        return primeNumber;
    }

    public void setPrimeNumber(Integer primeNumber) {
        this.primeNumber = primeNumber;
    }
}
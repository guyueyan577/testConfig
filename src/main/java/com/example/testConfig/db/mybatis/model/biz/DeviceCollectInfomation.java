package com.example.testConfig.db.mybatis.model.biz;

public class DeviceCollectInfomation {
    private String id;

    private String deviceId;

    private Integer sensorTagCode;

    private Integer userSensorTagCode;

    private Integer maxRange;

    private Integer minRange;

    private Integer maxAlarm;

    private Integer minAlarm;

    private Integer multiple;

    private String unit;

    private Integer errorRange;

    private Integer alarmValue;

    private Integer collectPeriod;

    private Integer deviceStateCode;

    private Integer deviceStateGroupCode;

    private Long collectTime;

    private Double collectValue;

    private Long createTime;

    private Integer stateDuration;

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

    public Integer getSensorTagCode() {
        return sensorTagCode;
    }

    public void setSensorTagCode(Integer sensorTagCode) {
        this.sensorTagCode = sensorTagCode;
    }

    public Integer getUserSensorTagCode() {
        return userSensorTagCode;
    }

    public void setUserSensorTagCode(Integer userSensorTagCode) {
        this.userSensorTagCode = userSensorTagCode;
    }

    public Integer getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(Integer maxRange) {
        this.maxRange = maxRange;
    }

    public Integer getMinRange() {
        return minRange;
    }

    public void setMinRange(Integer minRange) {
        this.minRange = minRange;
    }

    public Integer getMaxAlarm() {
        return maxAlarm;
    }

    public void setMaxAlarm(Integer maxAlarm) {
        this.maxAlarm = maxAlarm;
    }

    public Integer getMinAlarm() {
        return minAlarm;
    }

    public void setMinAlarm(Integer minAlarm) {
        this.minAlarm = minAlarm;
    }

    public Integer getMultiple() {
        return multiple;
    }

    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getErrorRange() {
        return errorRange;
    }

    public void setErrorRange(Integer errorRange) {
        this.errorRange = errorRange;
    }

    public Integer getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(Integer alarmValue) {
        this.alarmValue = alarmValue;
    }

    public Integer getCollectPeriod() {
        return collectPeriod;
    }

    public void setCollectPeriod(Integer collectPeriod) {
        this.collectPeriod = collectPeriod;
    }

    public Integer getDeviceStateCode() {
        return deviceStateCode;
    }

    public void setDeviceStateCode(Integer deviceStateCode) {
        this.deviceStateCode = deviceStateCode;
    }

    public Integer getDeviceStateGroupCode() {
        return deviceStateGroupCode;
    }

    public void setDeviceStateGroupCode(Integer deviceStateGroupCode) {
        this.deviceStateGroupCode = deviceStateGroupCode;
    }

    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public Double getCollectValue() {
        return collectValue;
    }

    public void setCollectValue(Double collectValue) {
        this.collectValue = collectValue;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getStateDuration() {
        return stateDuration;
    }

    public void setStateDuration(Integer stateDuration) {
        this.stateDuration = stateDuration;
    }
}
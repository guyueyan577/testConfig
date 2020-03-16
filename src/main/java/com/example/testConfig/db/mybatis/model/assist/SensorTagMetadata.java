package com.example.testConfig.db.mybatis.model.assist;

public class SensorTagMetadata {
    private String id;

    private Integer sensorTagCode;

    private String i18nCode;

    private String sensorName;

    private String unit;

    private Integer sortScort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSensorTagCode() {
        return sensorTagCode;
    }

    public void setSensorTagCode(Integer sensorTagCode) {
        this.sensorTagCode = sensorTagCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName == null ? null : sensorName.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getSortScort() {
        return sortScort;
    }

    public void setSortScort(Integer sortScort) {
        this.sortScort = sortScort;
    }
}
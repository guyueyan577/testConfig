package com.example.testConfig.db.mybatis.model.assist;

public class SuperviseLevelMetadata {
    private String id;

    private Integer superviseLevelCode;

    private String superviseLevelName;

    private String i18nCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSuperviseLevelCode() {
        return superviseLevelCode;
    }

    public void setSuperviseLevelCode(Integer superviseLevelCode) {
        this.superviseLevelCode = superviseLevelCode;
    }

    public String getSuperviseLevelName() {
        return superviseLevelName;
    }

    public void setSuperviseLevelName(String superviseLevelName) {
        this.superviseLevelName = superviseLevelName == null ? null : superviseLevelName.trim();
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }
}
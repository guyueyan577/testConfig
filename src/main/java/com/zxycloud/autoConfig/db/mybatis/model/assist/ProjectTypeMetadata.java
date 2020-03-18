package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class ProjectTypeMetadata {
    private String id;

    private Integer projectTypeCode;

    private String i18nCode;

    private String projectTypeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getProjectTypeCode() {
        return projectTypeCode;
    }

    public void setProjectTypeCode(Integer projectTypeCode) {
        this.projectTypeCode = projectTypeCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getProjectTypeName() {
        return projectTypeName;
    }

    public void setProjectTypeName(String projectTypeName) {
        this.projectTypeName = projectTypeName == null ? null : projectTypeName.trim();
    }
}
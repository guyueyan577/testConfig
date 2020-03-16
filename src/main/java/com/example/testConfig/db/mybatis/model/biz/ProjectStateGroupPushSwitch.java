package com.example.testConfig.db.mybatis.model.biz;

public class ProjectStateGroupPushSwitch {
    private String id;

    private String projectId;

    private Integer deviceStateGroupCode;

    private Integer pushSwitch;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Integer getDeviceStateGroupCode() {
        return deviceStateGroupCode;
    }

    public void setDeviceStateGroupCode(Integer deviceStateGroupCode) {
        this.deviceStateGroupCode = deviceStateGroupCode;
    }

    public Integer getPushSwitch() {
        return pushSwitch;
    }

    public void setPushSwitch(Integer pushSwitch) {
        this.pushSwitch = pushSwitch;
    }
}
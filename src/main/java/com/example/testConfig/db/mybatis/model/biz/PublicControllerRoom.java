package com.example.testConfig.db.mybatis.model.biz;

public class PublicControllerRoom {
    private String id;

    private String projectId;

    private String projectName;

    private Long createTime;

    private Long updateTime;

    private String controllerRoomAddress;

    private Double gcj02Latitude;

    private Double gcj02Longitude;

    private Double wgs84Latitude;

    private Double wgs84Longitude;

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
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

    public String getControllerRoomAddress() {
        return controllerRoomAddress;
    }

    public void setControllerRoomAddress(String controllerRoomAddress) {
        this.controllerRoomAddress = controllerRoomAddress == null ? null : controllerRoomAddress.trim();
    }

    public Double getGcj02Latitude() {
        return gcj02Latitude;
    }

    public void setGcj02Latitude(Double gcj02Latitude) {
        this.gcj02Latitude = gcj02Latitude;
    }

    public Double getGcj02Longitude() {
        return gcj02Longitude;
    }

    public void setGcj02Longitude(Double gcj02Longitude) {
        this.gcj02Longitude = gcj02Longitude;
    }

    public Double getWgs84Latitude() {
        return wgs84Latitude;
    }

    public void setWgs84Latitude(Double wgs84Latitude) {
        this.wgs84Latitude = wgs84Latitude;
    }

    public Double getWgs84Longitude() {
        return wgs84Longitude;
    }

    public void setWgs84Longitude(Double wgs84Longitude) {
        this.wgs84Longitude = wgs84Longitude;
    }
}
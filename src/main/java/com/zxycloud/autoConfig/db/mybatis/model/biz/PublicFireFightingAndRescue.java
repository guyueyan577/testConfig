package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class PublicFireFightingAndRescue {
    private String id;

    private String name;

    private String address;

    private Double gcj02Latitude;

    private Double gcj02Longitude;

    private Double wgs84Latitude;

    private Double wgs84Longitude;

    private Double distance;

    private String state;

    private String principalName;

    private String principalPhoneNumber;

    private String description;

    private String projectId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName == null ? null : principalName.trim();
    }

    public String getPrincipalPhoneNumber() {
        return principalPhoneNumber;
    }

    public void setPrincipalPhoneNumber(String principalPhoneNumber) {
        this.principalPhoneNumber = principalPhoneNumber == null ? null : principalPhoneNumber.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }
}
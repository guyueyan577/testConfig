package com.example.testConfig.db.mybatis.model.biz;

public class DeviceRunningState {
    private String id;

    private String messageId;

    private String projectId;

    private String projectName;

    private String areaId;

    private String areaName;

    private String placeId;

    private String placeName;

    private String adapterId;

    private String adapterName;

    private Integer controllerAddr;

    private String deviceId;

    private Integer deviceSystemCode;

    private Integer deviceStateCode;

    private String deviceStateName;

    private Integer deviceStateGroupCode;

    private String deviceStateGroupName;

    private Long happenTime;

    private Long receiveTime;

    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public String getAdapterId() {
        return adapterId;
    }

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId == null ? null : adapterId.trim();
    }

    public String getAdapterName() {
        return adapterName;
    }

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName == null ? null : adapterName.trim();
    }

    public Integer getControllerAddr() {
        return controllerAddr;
    }

    public void setControllerAddr(Integer controllerAddr) {
        this.controllerAddr = controllerAddr;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Integer getDeviceSystemCode() {
        return deviceSystemCode;
    }

    public void setDeviceSystemCode(Integer deviceSystemCode) {
        this.deviceSystemCode = deviceSystemCode;
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

    public Integer getDeviceStateGroupCode() {
        return deviceStateGroupCode;
    }

    public void setDeviceStateGroupCode(Integer deviceStateGroupCode) {
        this.deviceStateGroupCode = deviceStateGroupCode;
    }

    public String getDeviceStateGroupName() {
        return deviceStateGroupName;
    }

    public void setDeviceStateGroupName(String deviceStateGroupName) {
        this.deviceStateGroupName = deviceStateGroupName == null ? null : deviceStateGroupName.trim();
    }

    public Long getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Long happenTime) {
        this.happenTime = happenTime;
    }

    public Long getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
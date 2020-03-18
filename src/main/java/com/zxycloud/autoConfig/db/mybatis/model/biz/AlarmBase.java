package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class AlarmBase {
    private String id;

    private String messageId;

    private Long alarmHappenTime;

    private Long alarmReceiveTime;

    private String deviceId;

    private Integer alarmType;

    private Integer alarmTypeGroupCode;

    private String projectId;

    private String projectName;

    private String areaId;

    private String areaName;

    private String placeId;

    private String placeName;

    private String adapterId;

    private String adapterName;

    private Integer controllerAddr;

    private Integer deviceTypeCode;

    private String deviceTypeName;

    private String deviceInstallLocation;

    private Integer deviceSystemCode;

    private String deviceSystemName;

    private Integer processType;

    private String processUserId;

    private String processUserName;

    private Long processTime;

    private String processExplain;

    private Long createTime;

    private String alarmCollectInfo;

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

    public Long getAlarmHappenTime() {
        return alarmHappenTime;
    }

    public void setAlarmHappenTime(Long alarmHappenTime) {
        this.alarmHappenTime = alarmHappenTime;
    }

    public Long getAlarmReceiveTime() {
        return alarmReceiveTime;
    }

    public void setAlarmReceiveTime(Long alarmReceiveTime) {
        this.alarmReceiveTime = alarmReceiveTime;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getAlarmTypeGroupCode() {
        return alarmTypeGroupCode;
    }

    public void setAlarmTypeGroupCode(Integer alarmTypeGroupCode) {
        this.alarmTypeGroupCode = alarmTypeGroupCode;
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

    public Integer getDeviceTypeCode() {
        return deviceTypeCode;
    }

    public void setDeviceTypeCode(Integer deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName == null ? null : deviceTypeName.trim();
    }

    public String getDeviceInstallLocation() {
        return deviceInstallLocation;
    }

    public void setDeviceInstallLocation(String deviceInstallLocation) {
        this.deviceInstallLocation = deviceInstallLocation == null ? null : deviceInstallLocation.trim();
    }

    public Integer getDeviceSystemCode() {
        return deviceSystemCode;
    }

    public void setDeviceSystemCode(Integer deviceSystemCode) {
        this.deviceSystemCode = deviceSystemCode;
    }

    public String getDeviceSystemName() {
        return deviceSystemName;
    }

    public void setDeviceSystemName(String deviceSystemName) {
        this.deviceSystemName = deviceSystemName == null ? null : deviceSystemName.trim();
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public String getProcessUserId() {
        return processUserId;
    }

    public void setProcessUserId(String processUserId) {
        this.processUserId = processUserId == null ? null : processUserId.trim();
    }

    public String getProcessUserName() {
        return processUserName;
    }

    public void setProcessUserName(String processUserName) {
        this.processUserName = processUserName == null ? null : processUserName.trim();
    }

    public Long getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Long processTime) {
        this.processTime = processTime;
    }

    public String getProcessExplain() {
        return processExplain;
    }

    public void setProcessExplain(String processExplain) {
        this.processExplain = processExplain == null ? null : processExplain.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getAlarmCollectInfo() {
        return alarmCollectInfo;
    }

    public void setAlarmCollectInfo(String alarmCollectInfo) {
        this.alarmCollectInfo = alarmCollectInfo == null ? null : alarmCollectInfo.trim();
    }
}
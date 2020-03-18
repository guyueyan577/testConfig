package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class DeviceExtend {
    private String id;

    private String adapterName;

    private String deviceId;

    private String deviceModel;

    private String deviceName;

    private String deviceAreaCode;

    private String deviceItemCode;

    private String deviceInstallPersonId;

    private String deviceInstallDescription;

    private String cameraId;

    private Boolean deleted;

    private Long createTime;

    private Long updateTime;

    private String calibrationValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAdapterName() {
        return adapterName;
    }

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName == null ? null : adapterName.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel == null ? null : deviceModel.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceAreaCode() {
        return deviceAreaCode;
    }

    public void setDeviceAreaCode(String deviceAreaCode) {
        this.deviceAreaCode = deviceAreaCode == null ? null : deviceAreaCode.trim();
    }

    public String getDeviceItemCode() {
        return deviceItemCode;
    }

    public void setDeviceItemCode(String deviceItemCode) {
        this.deviceItemCode = deviceItemCode == null ? null : deviceItemCode.trim();
    }

    public String getDeviceInstallPersonId() {
        return deviceInstallPersonId;
    }

    public void setDeviceInstallPersonId(String deviceInstallPersonId) {
        this.deviceInstallPersonId = deviceInstallPersonId == null ? null : deviceInstallPersonId.trim();
    }

    public String getDeviceInstallDescription() {
        return deviceInstallDescription;
    }

    public void setDeviceInstallDescription(String deviceInstallDescription) {
        this.deviceInstallDescription = deviceInstallDescription == null ? null : deviceInstallDescription.trim();
    }

    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId == null ? null : cameraId.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public String getCalibrationValue() {
        return calibrationValue;
    }

    public void setCalibrationValue(String calibrationValue) {
        this.calibrationValue = calibrationValue == null ? null : calibrationValue.trim();
    }
}
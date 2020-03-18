package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class DeviceNet {
    private String id;

    private String deviceId;

    private String adapterName;

    private String imsi;

    private String imei;

    private String iccid;

    private String softwareVersion;

    private String hardwareVersion;

    private String signalSource;

    private Boolean connectStatus;

    private Long lastConnectTime;

    private Boolean deleted;

    private Long createTime;

    private String projectId;

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

    public String getAdapterName() {
        return adapterName;
    }

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName == null ? null : adapterName.trim();
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid == null ? null : iccid.trim();
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion == null ? null : softwareVersion.trim();
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion == null ? null : hardwareVersion.trim();
    }

    public String getSignalSource() {
        return signalSource;
    }

    public void setSignalSource(String signalSource) {
        this.signalSource = signalSource == null ? null : signalSource.trim();
    }

    public Boolean getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(Boolean connectStatus) {
        this.connectStatus = connectStatus;
    }

    public Long getLastConnectTime() {
        return lastConnectTime;
    }

    public void setLastConnectTime(Long lastConnectTime) {
        this.lastConnectTime = lastConnectTime;
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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }
}
package com.example.testConfig.db.mybatis.model.biz;

public class DeviceBase {
    private String id;

    private Integer deviceFlag;

    private Integer controllerAddr;

    private Integer channelId;

    private String deviceNumber;

    private Integer deviceTypeCode;

    private String deviceTypeName;

    private Integer userDeviceTypeCode;

    private String userDeviceTypeName;

    private Integer deviceVendorCode;

    private String deviceVendorName;

    private Long deviceProduceTime;

    private Long deviceCommissionTime;

    private Long deviceUseEndTime;

    private String deviceInstallLocation;

    private String deviceUnitType;

    private String deviceParentId;

    private String projectId;

    private String firstLevelAreaId;

    private String secondLevelAreaId;

    private String thirdLevelAreaId;

    private String areaId;

    private String placeId;

    private Integer deviceSystemCode;

    private String deviceSystemName;

    private Integer deviceSubSystemCode;

    private String deviceSubSystemName;

    private String adapterId;

    private String adapterName;

    private Double layerImageX;

    private Double layerImageY;

    private Integer deviceStateGroupCode;

    private Double gcj02Latitude;

    private Double gcj02Longitude;

    private Double wgs84Latitude;

    private Double wgs84Longitude;

    private Boolean important;

    private Boolean deleted;

    private Long createTime;

    private Long updateTime;

    private Boolean personalDevice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDeviceFlag() {
        return deviceFlag;
    }

    public void setDeviceFlag(Integer deviceFlag) {
        this.deviceFlag = deviceFlag;
    }

    public Integer getControllerAddr() {
        return controllerAddr;
    }

    public void setControllerAddr(Integer controllerAddr) {
        this.controllerAddr = controllerAddr;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber == null ? null : deviceNumber.trim();
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

    public Integer getUserDeviceTypeCode() {
        return userDeviceTypeCode;
    }

    public void setUserDeviceTypeCode(Integer userDeviceTypeCode) {
        this.userDeviceTypeCode = userDeviceTypeCode;
    }

    public String getUserDeviceTypeName() {
        return userDeviceTypeName;
    }

    public void setUserDeviceTypeName(String userDeviceTypeName) {
        this.userDeviceTypeName = userDeviceTypeName == null ? null : userDeviceTypeName.trim();
    }

    public Integer getDeviceVendorCode() {
        return deviceVendorCode;
    }

    public void setDeviceVendorCode(Integer deviceVendorCode) {
        this.deviceVendorCode = deviceVendorCode;
    }

    public String getDeviceVendorName() {
        return deviceVendorName;
    }

    public void setDeviceVendorName(String deviceVendorName) {
        this.deviceVendorName = deviceVendorName == null ? null : deviceVendorName.trim();
    }

    public Long getDeviceProduceTime() {
        return deviceProduceTime;
    }

    public void setDeviceProduceTime(Long deviceProduceTime) {
        this.deviceProduceTime = deviceProduceTime;
    }

    public Long getDeviceCommissionTime() {
        return deviceCommissionTime;
    }

    public void setDeviceCommissionTime(Long deviceCommissionTime) {
        this.deviceCommissionTime = deviceCommissionTime;
    }

    public Long getDeviceUseEndTime() {
        return deviceUseEndTime;
    }

    public void setDeviceUseEndTime(Long deviceUseEndTime) {
        this.deviceUseEndTime = deviceUseEndTime;
    }

    public String getDeviceInstallLocation() {
        return deviceInstallLocation;
    }

    public void setDeviceInstallLocation(String deviceInstallLocation) {
        this.deviceInstallLocation = deviceInstallLocation == null ? null : deviceInstallLocation.trim();
    }

    public String getDeviceUnitType() {
        return deviceUnitType;
    }

    public void setDeviceUnitType(String deviceUnitType) {
        this.deviceUnitType = deviceUnitType == null ? null : deviceUnitType.trim();
    }

    public String getDeviceParentId() {
        return deviceParentId;
    }

    public void setDeviceParentId(String deviceParentId) {
        this.deviceParentId = deviceParentId == null ? null : deviceParentId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getFirstLevelAreaId() {
        return firstLevelAreaId;
    }

    public void setFirstLevelAreaId(String firstLevelAreaId) {
        this.firstLevelAreaId = firstLevelAreaId == null ? null : firstLevelAreaId.trim();
    }

    public String getSecondLevelAreaId() {
        return secondLevelAreaId;
    }

    public void setSecondLevelAreaId(String secondLevelAreaId) {
        this.secondLevelAreaId = secondLevelAreaId == null ? null : secondLevelAreaId.trim();
    }

    public String getThirdLevelAreaId() {
        return thirdLevelAreaId;
    }

    public void setThirdLevelAreaId(String thirdLevelAreaId) {
        this.thirdLevelAreaId = thirdLevelAreaId == null ? null : thirdLevelAreaId.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
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

    public Integer getDeviceSubSystemCode() {
        return deviceSubSystemCode;
    }

    public void setDeviceSubSystemCode(Integer deviceSubSystemCode) {
        this.deviceSubSystemCode = deviceSubSystemCode;
    }

    public String getDeviceSubSystemName() {
        return deviceSubSystemName;
    }

    public void setDeviceSubSystemName(String deviceSubSystemName) {
        this.deviceSubSystemName = deviceSubSystemName == null ? null : deviceSubSystemName.trim();
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

    public Double getLayerImageX() {
        return layerImageX;
    }

    public void setLayerImageX(Double layerImageX) {
        this.layerImageX = layerImageX;
    }

    public Double getLayerImageY() {
        return layerImageY;
    }

    public void setLayerImageY(Double layerImageY) {
        this.layerImageY = layerImageY;
    }

    public Integer getDeviceStateGroupCode() {
        return deviceStateGroupCode;
    }

    public void setDeviceStateGroupCode(Integer deviceStateGroupCode) {
        this.deviceStateGroupCode = deviceStateGroupCode;
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

    public Boolean getImportant() {
        return important;
    }

    public void setImportant(Boolean important) {
        this.important = important;
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

    public Boolean getPersonalDevice() {
        return personalDevice;
    }

    public void setPersonalDevice(Boolean personalDevice) {
        this.personalDevice = personalDevice;
    }
}
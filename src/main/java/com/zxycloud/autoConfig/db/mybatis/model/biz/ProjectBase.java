package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class ProjectBase {
    private String id;

    private String agentId;

    private String projectName;

    private Integer type;

    private String countryCode;

    private String adminId;

    private String firstLevelRegionCode;

    private String secondLevelRegionCode;

    private String thirdLevelRegionCode;

    private String fourLevelRegionCode;

    private String postalCode;

    private String address;

    private String principalName;

    private String principalPhoneNumber;

    private String dutyPhoneNumber;

    private Double gcj02Latitude;

    private Double gcj02Longitude;

    private Double wgs84Latitude;

    private Double wgs84Longitude;

    private Integer projectState;

    private Boolean enable;

    private Integer auditState;

    private String projectMonitorRegion;

    private Integer property;

    private Boolean phoneNotified;

    private Boolean messageNotified;

    private Boolean appNotified;

    private Boolean pushSwitch;

    private String title;

    private String logoUrl;

    private String workflowId;

    private Boolean deleted;

    private Long serviceStartTime;

    private Long serviceEndTime;

    private Long createTime;

    private Long updateTime;

    private Boolean personalProject;

    private Integer projectSource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getFirstLevelRegionCode() {
        return firstLevelRegionCode;
    }

    public void setFirstLevelRegionCode(String firstLevelRegionCode) {
        this.firstLevelRegionCode = firstLevelRegionCode == null ? null : firstLevelRegionCode.trim();
    }

    public String getSecondLevelRegionCode() {
        return secondLevelRegionCode;
    }

    public void setSecondLevelRegionCode(String secondLevelRegionCode) {
        this.secondLevelRegionCode = secondLevelRegionCode == null ? null : secondLevelRegionCode.trim();
    }

    public String getThirdLevelRegionCode() {
        return thirdLevelRegionCode;
    }

    public void setThirdLevelRegionCode(String thirdLevelRegionCode) {
        this.thirdLevelRegionCode = thirdLevelRegionCode == null ? null : thirdLevelRegionCode.trim();
    }

    public String getFourLevelRegionCode() {
        return fourLevelRegionCode;
    }

    public void setFourLevelRegionCode(String fourLevelRegionCode) {
        this.fourLevelRegionCode = fourLevelRegionCode == null ? null : fourLevelRegionCode.trim();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getDutyPhoneNumber() {
        return dutyPhoneNumber;
    }

    public void setDutyPhoneNumber(String dutyPhoneNumber) {
        this.dutyPhoneNumber = dutyPhoneNumber == null ? null : dutyPhoneNumber.trim();
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

    public Integer getProjectState() {
        return projectState;
    }

    public void setProjectState(Integer projectState) {
        this.projectState = projectState;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public String getProjectMonitorRegion() {
        return projectMonitorRegion;
    }

    public void setProjectMonitorRegion(String projectMonitorRegion) {
        this.projectMonitorRegion = projectMonitorRegion == null ? null : projectMonitorRegion.trim();
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

    public Boolean getPhoneNotified() {
        return phoneNotified;
    }

    public void setPhoneNotified(Boolean phoneNotified) {
        this.phoneNotified = phoneNotified;
    }

    public Boolean getMessageNotified() {
        return messageNotified;
    }

    public void setMessageNotified(Boolean messageNotified) {
        this.messageNotified = messageNotified;
    }

    public Boolean getAppNotified() {
        return appNotified;
    }

    public void setAppNotified(Boolean appNotified) {
        this.appNotified = appNotified;
    }

    public Boolean getPushSwitch() {
        return pushSwitch;
    }

    public void setPushSwitch(Boolean pushSwitch) {
        this.pushSwitch = pushSwitch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId == null ? null : workflowId.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getServiceStartTime() {
        return serviceStartTime;
    }

    public void setServiceStartTime(Long serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public Long getServiceEndTime() {
        return serviceEndTime;
    }

    public void setServiceEndTime(Long serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
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

    public Boolean getPersonalProject() {
        return personalProject;
    }

    public void setPersonalProject(Boolean personalProject) {
        this.personalProject = personalProject;
    }

    public Integer getProjectSource() {
        return projectSource;
    }

    public void setProjectSource(Integer projectSource) {
        this.projectSource = projectSource;
    }
}
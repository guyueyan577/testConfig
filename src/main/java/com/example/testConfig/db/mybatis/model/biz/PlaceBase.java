package com.example.testConfig.db.mybatis.model.biz;

public class PlaceBase {
    private String id;

    private String placeName;

    private String placeAddress;

    private String projectId;

    private String projectName;

    private String firstLevelAreaId;

    private String secondLevelAreaId;

    private String thirdLevelAreaId;

    private String belongAreaId;

    private String placePhoneNumber;

    private String placePrincipalName;

    private String placePrincipalPhoneNumber;

    private String placeAdminId;

    private Integer placeState;

    private String placeBusinessScope;

    private String workflowId;

    private Double gcj02Latitude;

    private Double gcj02Longitude;

    private Double wgs84Latitude;

    private Double wgs84Longitude;

    private Long createTime;

    private Long updateTime;

    private Boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress == null ? null : placeAddress.trim();
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

    public String getBelongAreaId() {
        return belongAreaId;
    }

    public void setBelongAreaId(String belongAreaId) {
        this.belongAreaId = belongAreaId == null ? null : belongAreaId.trim();
    }

    public String getPlacePhoneNumber() {
        return placePhoneNumber;
    }

    public void setPlacePhoneNumber(String placePhoneNumber) {
        this.placePhoneNumber = placePhoneNumber == null ? null : placePhoneNumber.trim();
    }

    public String getPlacePrincipalName() {
        return placePrincipalName;
    }

    public void setPlacePrincipalName(String placePrincipalName) {
        this.placePrincipalName = placePrincipalName == null ? null : placePrincipalName.trim();
    }

    public String getPlacePrincipalPhoneNumber() {
        return placePrincipalPhoneNumber;
    }

    public void setPlacePrincipalPhoneNumber(String placePrincipalPhoneNumber) {
        this.placePrincipalPhoneNumber = placePrincipalPhoneNumber == null ? null : placePrincipalPhoneNumber.trim();
    }

    public String getPlaceAdminId() {
        return placeAdminId;
    }

    public void setPlaceAdminId(String placeAdminId) {
        this.placeAdminId = placeAdminId == null ? null : placeAdminId.trim();
    }

    public Integer getPlaceState() {
        return placeState;
    }

    public void setPlaceState(Integer placeState) {
        this.placeState = placeState;
    }

    public String getPlaceBusinessScope() {
        return placeBusinessScope;
    }

    public void setPlaceBusinessScope(String placeBusinessScope) {
        this.placeBusinessScope = placeBusinessScope == null ? null : placeBusinessScope.trim();
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId == null ? null : workflowId.trim();
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
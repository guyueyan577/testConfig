package com.example.testConfig.db.mybatis.model.biz;

public class AreaBase {
    private String id;

    private String areaName;

    private String projectId;

    private String projectName;

    private String firstLevelAreaId;

    private String secondLevelAreaId;

    private String parentAreaId;

    private Integer level;

    private Integer subAreaType;

    private String areaAddress;

    private String areaManageRegion;

    private String areaPrincipalName;

    private String areaPrincipalPhoneNumber;

    private String adminId;

    private Long createTime;

    private Long updateTime;

    private String workflowId;

    private Boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
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

    public String getParentAreaId() {
        return parentAreaId;
    }

    public void setParentAreaId(String parentAreaId) {
        this.parentAreaId = parentAreaId == null ? null : parentAreaId.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSubAreaType() {
        return subAreaType;
    }

    public void setSubAreaType(Integer subAreaType) {
        this.subAreaType = subAreaType;
    }

    public String getAreaAddress() {
        return areaAddress;
    }

    public void setAreaAddress(String areaAddress) {
        this.areaAddress = areaAddress == null ? null : areaAddress.trim();
    }

    public String getAreaManageRegion() {
        return areaManageRegion;
    }

    public void setAreaManageRegion(String areaManageRegion) {
        this.areaManageRegion = areaManageRegion == null ? null : areaManageRegion.trim();
    }

    public String getAreaPrincipalName() {
        return areaPrincipalName;
    }

    public void setAreaPrincipalName(String areaPrincipalName) {
        this.areaPrincipalName = areaPrincipalName == null ? null : areaPrincipalName.trim();
    }

    public String getAreaPrincipalPhoneNumber() {
        return areaPrincipalPhoneNumber;
    }

    public void setAreaPrincipalPhoneNumber(String areaPrincipalPhoneNumber) {
        this.areaPrincipalPhoneNumber = areaPrincipalPhoneNumber == null ? null : areaPrincipalPhoneNumber.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
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
}
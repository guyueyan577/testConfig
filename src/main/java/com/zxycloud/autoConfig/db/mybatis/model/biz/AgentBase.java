package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class AgentBase {
    private String id;

    private String agentName;

    private String countryCode;

    private String firstLevelRegionCode;

    private String secondLevelRegionCode;

    private String thirdLevelRegionCode;

    private String postalCode;

    private String principalName;

    private String principalPhoneNumber;

    private String adminId;

    private Integer level;

    private Boolean enable;

    private String address;

    private Integer auditMethod;

    private Double auditPayment;

    private String auditUserId;

    private Long createTime;

    private Long updateTime;

    private Boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
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

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAuditMethod() {
        return auditMethod;
    }

    public void setAuditMethod(Integer auditMethod) {
        this.auditMethod = auditMethod;
    }

    public Double getAuditPayment() {
        return auditPayment;
    }

    public void setAuditPayment(Double auditPayment) {
        this.auditPayment = auditPayment;
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId == null ? null : auditUserId.trim();
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
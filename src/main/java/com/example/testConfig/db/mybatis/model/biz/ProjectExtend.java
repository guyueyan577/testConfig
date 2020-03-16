package com.example.testConfig.db.mybatis.model.biz;

public class ProjectExtend {
    private String id;

    private String projectId;

    private String manageTitle;

    private String organizationCode;

    private String securityChargePersonName;

    private String securityChargePersonPhone;

    private String securityChargePersonCard;

    private String securityManagerName;

    private String securityManagerPhone;

    private String securityManagerCard;

    private String legalRepresentativeName;

    private String legalRepresentativePhone;

    private String legalRepresentativeCard;

    private String jurisdictionUnitName;

    private Integer economicOwnershipCode;

    private Integer superviseLevelCode;

    private String fullParttimeManagerName;

    private String fullParttimeManagerPhone;

    private String fullParttimeManagerCard;

    private String superUnitName;

    private Long staffCount;

    private Long fixedAssets;

    private String maintenanceCompany;

    private String constructionCompany;

    private String saleCompany;

    private Integer industryCode;

    private Integer superviseTypeCode;

    private Boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getManageTitle() {
        return manageTitle;
    }

    public void setManageTitle(String manageTitle) {
        this.manageTitle = manageTitle == null ? null : manageTitle.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getSecurityChargePersonName() {
        return securityChargePersonName;
    }

    public void setSecurityChargePersonName(String securityChargePersonName) {
        this.securityChargePersonName = securityChargePersonName == null ? null : securityChargePersonName.trim();
    }

    public String getSecurityChargePersonPhone() {
        return securityChargePersonPhone;
    }

    public void setSecurityChargePersonPhone(String securityChargePersonPhone) {
        this.securityChargePersonPhone = securityChargePersonPhone == null ? null : securityChargePersonPhone.trim();
    }

    public String getSecurityChargePersonCard() {
        return securityChargePersonCard;
    }

    public void setSecurityChargePersonCard(String securityChargePersonCard) {
        this.securityChargePersonCard = securityChargePersonCard == null ? null : securityChargePersonCard.trim();
    }

    public String getSecurityManagerName() {
        return securityManagerName;
    }

    public void setSecurityManagerName(String securityManagerName) {
        this.securityManagerName = securityManagerName == null ? null : securityManagerName.trim();
    }

    public String getSecurityManagerPhone() {
        return securityManagerPhone;
    }

    public void setSecurityManagerPhone(String securityManagerPhone) {
        this.securityManagerPhone = securityManagerPhone == null ? null : securityManagerPhone.trim();
    }

    public String getSecurityManagerCard() {
        return securityManagerCard;
    }

    public void setSecurityManagerCard(String securityManagerCard) {
        this.securityManagerCard = securityManagerCard == null ? null : securityManagerCard.trim();
    }

    public String getLegalRepresentativeName() {
        return legalRepresentativeName;
    }

    public void setLegalRepresentativeName(String legalRepresentativeName) {
        this.legalRepresentativeName = legalRepresentativeName == null ? null : legalRepresentativeName.trim();
    }

    public String getLegalRepresentativePhone() {
        return legalRepresentativePhone;
    }

    public void setLegalRepresentativePhone(String legalRepresentativePhone) {
        this.legalRepresentativePhone = legalRepresentativePhone == null ? null : legalRepresentativePhone.trim();
    }

    public String getLegalRepresentativeCard() {
        return legalRepresentativeCard;
    }

    public void setLegalRepresentativeCard(String legalRepresentativeCard) {
        this.legalRepresentativeCard = legalRepresentativeCard == null ? null : legalRepresentativeCard.trim();
    }

    public String getJurisdictionUnitName() {
        return jurisdictionUnitName;
    }

    public void setJurisdictionUnitName(String jurisdictionUnitName) {
        this.jurisdictionUnitName = jurisdictionUnitName == null ? null : jurisdictionUnitName.trim();
    }

    public Integer getEconomicOwnershipCode() {
        return economicOwnershipCode;
    }

    public void setEconomicOwnershipCode(Integer economicOwnershipCode) {
        this.economicOwnershipCode = economicOwnershipCode;
    }

    public Integer getSuperviseLevelCode() {
        return superviseLevelCode;
    }

    public void setSuperviseLevelCode(Integer superviseLevelCode) {
        this.superviseLevelCode = superviseLevelCode;
    }

    public String getFullParttimeManagerName() {
        return fullParttimeManagerName;
    }

    public void setFullParttimeManagerName(String fullParttimeManagerName) {
        this.fullParttimeManagerName = fullParttimeManagerName == null ? null : fullParttimeManagerName.trim();
    }

    public String getFullParttimeManagerPhone() {
        return fullParttimeManagerPhone;
    }

    public void setFullParttimeManagerPhone(String fullParttimeManagerPhone) {
        this.fullParttimeManagerPhone = fullParttimeManagerPhone == null ? null : fullParttimeManagerPhone.trim();
    }

    public String getFullParttimeManagerCard() {
        return fullParttimeManagerCard;
    }

    public void setFullParttimeManagerCard(String fullParttimeManagerCard) {
        this.fullParttimeManagerCard = fullParttimeManagerCard == null ? null : fullParttimeManagerCard.trim();
    }

    public String getSuperUnitName() {
        return superUnitName;
    }

    public void setSuperUnitName(String superUnitName) {
        this.superUnitName = superUnitName == null ? null : superUnitName.trim();
    }

    public Long getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(Long staffCount) {
        this.staffCount = staffCount;
    }

    public Long getFixedAssets() {
        return fixedAssets;
    }

    public void setFixedAssets(Long fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    public String getMaintenanceCompany() {
        return maintenanceCompany;
    }

    public void setMaintenanceCompany(String maintenanceCompany) {
        this.maintenanceCompany = maintenanceCompany == null ? null : maintenanceCompany.trim();
    }

    public String getConstructionCompany() {
        return constructionCompany;
    }

    public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany == null ? null : constructionCompany.trim();
    }

    public String getSaleCompany() {
        return saleCompany;
    }

    public void setSaleCompany(String saleCompany) {
        this.saleCompany = saleCompany == null ? null : saleCompany.trim();
    }

    public Integer getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(Integer industryCode) {
        this.industryCode = industryCode;
    }

    public Integer getSuperviseTypeCode() {
        return superviseTypeCode;
    }

    public void setSuperviseTypeCode(Integer superviseTypeCode) {
        this.superviseTypeCode = superviseTypeCode;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
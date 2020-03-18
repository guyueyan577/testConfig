package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class PayRecord {
    private String id;

    private String chargePackageId;

    private String chargePackageName;

    private String chargeId;

    private String chargeName;

    private String projectId;

    private String projectName;

    private String customerName;

    private String remark;

    private Long payTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChargePackageId() {
        return chargePackageId;
    }

    public void setChargePackageId(String chargePackageId) {
        this.chargePackageId = chargePackageId == null ? null : chargePackageId.trim();
    }

    public String getChargePackageName() {
        return chargePackageName;
    }

    public void setChargePackageName(String chargePackageName) {
        this.chargePackageName = chargePackageName == null ? null : chargePackageName.trim();
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId == null ? null : chargeId.trim();
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName == null ? null : chargeName.trim();
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }
}
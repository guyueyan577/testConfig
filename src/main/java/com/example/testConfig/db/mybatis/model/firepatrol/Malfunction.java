package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class Malfunction {
    private String id;

    private String taskPointId;

    private String patrolTaskId;

    private String patrolTaskName;

    private String equName;

    private String equCode;

    private Integer faultType;

    private String faultTypeName;

    private String faultCause;

    private String malfunctionDes;

    private String disposeState;

    private String disposeDes;

    private Integer planType;

    private String planTypeName;

    private String tagNumber;

    private String companyId;

    private String companyName;

    private String patrolPointName;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskPointId() {
        return taskPointId;
    }

    public void setTaskPointId(String taskPointId) {
        this.taskPointId = taskPointId == null ? null : taskPointId.trim();
    }

    public String getPatrolTaskId() {
        return patrolTaskId;
    }

    public void setPatrolTaskId(String patrolTaskId) {
        this.patrolTaskId = patrolTaskId == null ? null : patrolTaskId.trim();
    }

    public String getPatrolTaskName() {
        return patrolTaskName;
    }

    public void setPatrolTaskName(String patrolTaskName) {
        this.patrolTaskName = patrolTaskName == null ? null : patrolTaskName.trim();
    }

    public String getEquName() {
        return equName;
    }

    public void setEquName(String equName) {
        this.equName = equName == null ? null : equName.trim();
    }

    public String getEquCode() {
        return equCode;
    }

    public void setEquCode(String equCode) {
        this.equCode = equCode == null ? null : equCode.trim();
    }

    public Integer getFaultType() {
        return faultType;
    }

    public void setFaultType(Integer faultType) {
        this.faultType = faultType;
    }

    public String getFaultTypeName() {
        return faultTypeName;
    }

    public void setFaultTypeName(String faultTypeName) {
        this.faultTypeName = faultTypeName == null ? null : faultTypeName.trim();
    }

    public String getFaultCause() {
        return faultCause;
    }

    public void setFaultCause(String faultCause) {
        this.faultCause = faultCause == null ? null : faultCause.trim();
    }

    public String getMalfunctionDes() {
        return malfunctionDes;
    }

    public void setMalfunctionDes(String malfunctionDes) {
        this.malfunctionDes = malfunctionDes == null ? null : malfunctionDes.trim();
    }

    public String getDisposeState() {
        return disposeState;
    }

    public void setDisposeState(String disposeState) {
        this.disposeState = disposeState == null ? null : disposeState.trim();
    }

    public String getDisposeDes() {
        return disposeDes;
    }

    public void setDisposeDes(String disposeDes) {
        this.disposeDes = disposeDes == null ? null : disposeDes.trim();
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public String getPlanTypeName() {
        return planTypeName;
    }

    public void setPlanTypeName(String planTypeName) {
        this.planTypeName = planTypeName == null ? null : planTypeName.trim();
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber == null ? null : tagNumber.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getPatrolPointName() {
        return patrolPointName;
    }

    public void setPatrolPointName(String patrolPointName) {
        this.patrolPointName = patrolPointName == null ? null : patrolPointName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
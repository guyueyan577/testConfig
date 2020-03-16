package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class PatrolTask {
    private String id;

    private String patrolTaskName;

    private String patrolPlanId;

    private String companyId;

    private String companyName;

    private Integer patrolItemType;

    private Integer patrolState;

    private String patrolStaff;

    private String startDate;

    private String endDate;

    private String startTime;

    private String endTime;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPatrolTaskName() {
        return patrolTaskName;
    }

    public void setPatrolTaskName(String patrolTaskName) {
        this.patrolTaskName = patrolTaskName == null ? null : patrolTaskName.trim();
    }

    public String getPatrolPlanId() {
        return patrolPlanId;
    }

    public void setPatrolPlanId(String patrolPlanId) {
        this.patrolPlanId = patrolPlanId == null ? null : patrolPlanId.trim();
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

    public Integer getPatrolItemType() {
        return patrolItemType;
    }

    public void setPatrolItemType(Integer patrolItemType) {
        this.patrolItemType = patrolItemType;
    }

    public Integer getPatrolState() {
        return patrolState;
    }

    public void setPatrolState(Integer patrolState) {
        this.patrolState = patrolState;
    }

    public String getPatrolStaff() {
        return patrolStaff;
    }

    public void setPatrolStaff(String patrolStaff) {
        this.patrolStaff = patrolStaff == null ? null : patrolStaff.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
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
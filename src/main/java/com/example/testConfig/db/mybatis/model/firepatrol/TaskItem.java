package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class TaskItem {
    private String id;

    private String patrolTaskId;

    private String taskPointId;

    private String patrolItemId;

    private Integer resultState;

    private String des;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String companyId;

    private String companyName;

    private String patrolItemName;

    private Integer patrolItemType;

    private Integer equType;

    private String equName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPatrolTaskId() {
        return patrolTaskId;
    }

    public void setPatrolTaskId(String patrolTaskId) {
        this.patrolTaskId = patrolTaskId == null ? null : patrolTaskId.trim();
    }

    public String getTaskPointId() {
        return taskPointId;
    }

    public void setTaskPointId(String taskPointId) {
        this.taskPointId = taskPointId == null ? null : taskPointId.trim();
    }

    public String getPatrolItemId() {
        return patrolItemId;
    }

    public void setPatrolItemId(String patrolItemId) {
        this.patrolItemId = patrolItemId == null ? null : patrolItemId.trim();
    }

    public Integer getResultState() {
        return resultState;
    }

    public void setResultState(Integer resultState) {
        this.resultState = resultState;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
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

    public String getPatrolItemName() {
        return patrolItemName;
    }

    public void setPatrolItemName(String patrolItemName) {
        this.patrolItemName = patrolItemName == null ? null : patrolItemName.trim();
    }

    public Integer getPatrolItemType() {
        return patrolItemType;
    }

    public void setPatrolItemType(Integer patrolItemType) {
        this.patrolItemType = patrolItemType;
    }

    public Integer getEquType() {
        return equType;
    }

    public void setEquType(Integer equType) {
        this.equType = equType;
    }

    public String getEquName() {
        return equName;
    }

    public void setEquName(String equName) {
        this.equName = equName == null ? null : equName.trim();
    }
}
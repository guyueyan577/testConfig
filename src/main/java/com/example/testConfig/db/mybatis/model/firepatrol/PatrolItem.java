package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class PatrolItem {
    private String id;

    private String companyId;

    private String companyName;

    private String patrolItemName;

    private Integer patrolItemType;

    private Integer equType;

    private String equName;

    private String des;

    private Integer selfBuilt;

    private String operation;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Integer getSelfBuilt() {
        return selfBuilt;
    }

    public void setSelfBuilt(Integer selfBuilt) {
        this.selfBuilt = selfBuilt;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
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
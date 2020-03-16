package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class PatrolPointItems {
    private String id;

    private String patrolPointId;

    private String patrolItemId;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPatrolPointId() {
        return patrolPointId;
    }

    public void setPatrolPointId(String patrolPointId) {
        this.patrolPointId = patrolPointId == null ? null : patrolPointId.trim();
    }

    public String getPatrolItemId() {
        return patrolItemId;
    }

    public void setPatrolItemId(String patrolItemId) {
        this.patrolItemId = patrolItemId == null ? null : patrolItemId.trim();
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
package com.zxycloud.autoConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class MalRecord {
    private String id;

    private String malfunctionId;

    private String accendantId;

    private String accendantName;

    private Integer disposeState;

    private String disposeStateName;

    private String des;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMalfunctionId() {
        return malfunctionId;
    }

    public void setMalfunctionId(String malfunctionId) {
        this.malfunctionId = malfunctionId == null ? null : malfunctionId.trim();
    }

    public String getAccendantId() {
        return accendantId;
    }

    public void setAccendantId(String accendantId) {
        this.accendantId = accendantId == null ? null : accendantId.trim();
    }

    public String getAccendantName() {
        return accendantName;
    }

    public void setAccendantName(String accendantName) {
        this.accendantName = accendantName == null ? null : accendantName.trim();
    }

    public Integer getDisposeState() {
        return disposeState;
    }

    public void setDisposeState(Integer disposeState) {
        this.disposeState = disposeState;
    }

    public String getDisposeStateName() {
        return disposeStateName;
    }

    public void setDisposeStateName(String disposeStateName) {
        this.disposeStateName = disposeStateName == null ? null : disposeStateName.trim();
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
}
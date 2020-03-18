package com.zxycloud.autoConfig.db.mybatis.model.projectpermission;

public class PUserThirdAccount {
    private String id;

    private String userId;

    private String thirdAccount;

    private Integer typeCode;

    private String wecharGzhOpenId;

    private String wecharUnionid;

    private String projectId;

    private Long createTime;

    private Long updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getThirdAccount() {
        return thirdAccount;
    }

    public void setThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount == null ? null : thirdAccount.trim();
    }

    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    public String getWecharGzhOpenId() {
        return wecharGzhOpenId;
    }

    public void setWecharGzhOpenId(String wecharGzhOpenId) {
        this.wecharGzhOpenId = wecharGzhOpenId == null ? null : wecharGzhOpenId.trim();
    }

    public String getWecharUnionid() {
        return wecharUnionid;
    }

    public void setWecharUnionid(String wecharUnionid) {
        this.wecharUnionid = wecharUnionid == null ? null : wecharUnionid.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
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
}
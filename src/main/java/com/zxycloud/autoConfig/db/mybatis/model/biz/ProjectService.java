package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class ProjectService {
    private String id;

    private String projectId;

    private Integer phoneNotifyCode;

    private Integer phoneNotifyCodeAlternative;

    private Integer messageNotifyCode;

    private Integer messageNotifyCodeAlternative;

    private Integer appNotifyCode;

    private Integer appNotifyCodeAlternative;

    private String setMealId;

    private Long serviceEndTime;

    private Integer maxPhoneCount;

    private Integer maxMessageCount;

    private Integer maxPushCount;

    private Integer maxType;

    private Integer remainingPhoneCount;

    private Integer remainingMessageCount;

    private Integer remainintAppCount;

    private Long createTime;

    private Long updateTime;

    private Boolean deleted;

    private Long phoneCount;

    private Long messageCount;

    private Long appCount;

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

    public Integer getPhoneNotifyCode() {
        return phoneNotifyCode;
    }

    public void setPhoneNotifyCode(Integer phoneNotifyCode) {
        this.phoneNotifyCode = phoneNotifyCode;
    }

    public Integer getPhoneNotifyCodeAlternative() {
        return phoneNotifyCodeAlternative;
    }

    public void setPhoneNotifyCodeAlternative(Integer phoneNotifyCodeAlternative) {
        this.phoneNotifyCodeAlternative = phoneNotifyCodeAlternative;
    }

    public Integer getMessageNotifyCode() {
        return messageNotifyCode;
    }

    public void setMessageNotifyCode(Integer messageNotifyCode) {
        this.messageNotifyCode = messageNotifyCode;
    }

    public Integer getMessageNotifyCodeAlternative() {
        return messageNotifyCodeAlternative;
    }

    public void setMessageNotifyCodeAlternative(Integer messageNotifyCodeAlternative) {
        this.messageNotifyCodeAlternative = messageNotifyCodeAlternative;
    }

    public Integer getAppNotifyCode() {
        return appNotifyCode;
    }

    public void setAppNotifyCode(Integer appNotifyCode) {
        this.appNotifyCode = appNotifyCode;
    }

    public Integer getAppNotifyCodeAlternative() {
        return appNotifyCodeAlternative;
    }

    public void setAppNotifyCodeAlternative(Integer appNotifyCodeAlternative) {
        this.appNotifyCodeAlternative = appNotifyCodeAlternative;
    }

    public String getSetMealId() {
        return setMealId;
    }

    public void setSetMealId(String setMealId) {
        this.setMealId = setMealId == null ? null : setMealId.trim();
    }

    public Long getServiceEndTime() {
        return serviceEndTime;
    }

    public void setServiceEndTime(Long serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }

    public Integer getMaxPhoneCount() {
        return maxPhoneCount;
    }

    public void setMaxPhoneCount(Integer maxPhoneCount) {
        this.maxPhoneCount = maxPhoneCount;
    }

    public Integer getMaxMessageCount() {
        return maxMessageCount;
    }

    public void setMaxMessageCount(Integer maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
    }

    public Integer getMaxPushCount() {
        return maxPushCount;
    }

    public void setMaxPushCount(Integer maxPushCount) {
        this.maxPushCount = maxPushCount;
    }

    public Integer getMaxType() {
        return maxType;
    }

    public void setMaxType(Integer maxType) {
        this.maxType = maxType;
    }

    public Integer getRemainingPhoneCount() {
        return remainingPhoneCount;
    }

    public void setRemainingPhoneCount(Integer remainingPhoneCount) {
        this.remainingPhoneCount = remainingPhoneCount;
    }

    public Integer getRemainingMessageCount() {
        return remainingMessageCount;
    }

    public void setRemainingMessageCount(Integer remainingMessageCount) {
        this.remainingMessageCount = remainingMessageCount;
    }

    public Integer getRemainintAppCount() {
        return remainintAppCount;
    }

    public void setRemainintAppCount(Integer remainintAppCount) {
        this.remainintAppCount = remainintAppCount;
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

    public Long getPhoneCount() {
        return phoneCount;
    }

    public void setPhoneCount(Long phoneCount) {
        this.phoneCount = phoneCount;
    }

    public Long getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Long messageCount) {
        this.messageCount = messageCount;
    }

    public Long getAppCount() {
        return appCount;
    }

    public void setAppCount(Long appCount) {
        this.appCount = appCount;
    }
}
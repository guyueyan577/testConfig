package com.example.testConfig.db.mybatis.model.biz;

public class PublishCheckTaskInfo {
    private String id;

    private String taskId;

    private String taskName;

    private Integer taskType;

    private String companyId;

    private String checkId;

    private String checkContents;

    private String checkImages;

    private String checkVideos;

    private String checkVoices;

    private String categoryId;

    private String categoryName;

    private String itemId;

    private String itemName;

    private Integer state;

    private String messageId;

    private Long createTime;

    private Long updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    public String getCheckContents() {
        return checkContents;
    }

    public void setCheckContents(String checkContents) {
        this.checkContents = checkContents == null ? null : checkContents.trim();
    }

    public String getCheckImages() {
        return checkImages;
    }

    public void setCheckImages(String checkImages) {
        this.checkImages = checkImages == null ? null : checkImages.trim();
    }

    public String getCheckVideos() {
        return checkVideos;
    }

    public void setCheckVideos(String checkVideos) {
        this.checkVideos = checkVideos == null ? null : checkVideos.trim();
    }

    public String getCheckVoices() {
        return checkVoices;
    }

    public void setCheckVoices(String checkVoices) {
        this.checkVoices = checkVoices == null ? null : checkVoices.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
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
package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class DeviceEventProcess {
    private String id;

    private String eventId;

    private String processUserId;

    private String processUserName;

    private String processUserPhone;

    private Long processTime;

    private Integer processType;

    private String processExplain;

    private Boolean isDeleted;

    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getProcessUserId() {
        return processUserId;
    }

    public void setProcessUserId(String processUserId) {
        this.processUserId = processUserId == null ? null : processUserId.trim();
    }

    public String getProcessUserName() {
        return processUserName;
    }

    public void setProcessUserName(String processUserName) {
        this.processUserName = processUserName == null ? null : processUserName.trim();
    }

    public String getProcessUserPhone() {
        return processUserPhone;
    }

    public void setProcessUserPhone(String processUserPhone) {
        this.processUserPhone = processUserPhone == null ? null : processUserPhone.trim();
    }

    public Long getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Long processTime) {
        this.processTime = processTime;
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public String getProcessExplain() {
        return processExplain;
    }

    public void setProcessExplain(String processExplain) {
        this.processExplain = processExplain == null ? null : processExplain.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
package com.zxycloud.autoConfig.db.mybatis.model.biz;

public class PushMethodRecord {
    private String id;

    private String pushMethodName;

    private Integer pushMethodType;

    private Integer pushIntervalTime;

    private Integer placePushStyleCode;

    private Integer areaPushStyleCode;

    private Integer projectPushStyleCode;

    private String otherPush;

    private Boolean pushPhoneSwitch;

    private Boolean pushSmsSwitch;

    private Boolean pushAppSwitch;

    private Boolean pushWebsocketSwitch;

    private Integer suitableRange;

    private String rangeId;

    private String description;

    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPushMethodName() {
        return pushMethodName;
    }

    public void setPushMethodName(String pushMethodName) {
        this.pushMethodName = pushMethodName == null ? null : pushMethodName.trim();
    }

    public Integer getPushMethodType() {
        return pushMethodType;
    }

    public void setPushMethodType(Integer pushMethodType) {
        this.pushMethodType = pushMethodType;
    }

    public Integer getPushIntervalTime() {
        return pushIntervalTime;
    }

    public void setPushIntervalTime(Integer pushIntervalTime) {
        this.pushIntervalTime = pushIntervalTime;
    }

    public Integer getPlacePushStyleCode() {
        return placePushStyleCode;
    }

    public void setPlacePushStyleCode(Integer placePushStyleCode) {
        this.placePushStyleCode = placePushStyleCode;
    }

    public Integer getAreaPushStyleCode() {
        return areaPushStyleCode;
    }

    public void setAreaPushStyleCode(Integer areaPushStyleCode) {
        this.areaPushStyleCode = areaPushStyleCode;
    }

    public Integer getProjectPushStyleCode() {
        return projectPushStyleCode;
    }

    public void setProjectPushStyleCode(Integer projectPushStyleCode) {
        this.projectPushStyleCode = projectPushStyleCode;
    }

    public String getOtherPush() {
        return otherPush;
    }

    public void setOtherPush(String otherPush) {
        this.otherPush = otherPush == null ? null : otherPush.trim();
    }

    public Boolean getPushPhoneSwitch() {
        return pushPhoneSwitch;
    }

    public void setPushPhoneSwitch(Boolean pushPhoneSwitch) {
        this.pushPhoneSwitch = pushPhoneSwitch;
    }

    public Boolean getPushSmsSwitch() {
        return pushSmsSwitch;
    }

    public void setPushSmsSwitch(Boolean pushSmsSwitch) {
        this.pushSmsSwitch = pushSmsSwitch;
    }

    public Boolean getPushAppSwitch() {
        return pushAppSwitch;
    }

    public void setPushAppSwitch(Boolean pushAppSwitch) {
        this.pushAppSwitch = pushAppSwitch;
    }

    public Boolean getPushWebsocketSwitch() {
        return pushWebsocketSwitch;
    }

    public void setPushWebsocketSwitch(Boolean pushWebsocketSwitch) {
        this.pushWebsocketSwitch = pushWebsocketSwitch;
    }

    public Integer getSuitableRange() {
        return suitableRange;
    }

    public void setSuitableRange(Integer suitableRange) {
        this.suitableRange = suitableRange;
    }

    public String getRangeId() {
        return rangeId;
    }

    public void setRangeId(String rangeId) {
        this.rangeId = rangeId == null ? null : rangeId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
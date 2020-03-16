package com.example.testConfig.db.mybatis.model.biz;

import java.util.Date;

public class AppPushUser {
    private String tokenId;

    private String userId;

    private Integer appTypeId;

    private String pushId;

    private Integer serviceProviderId;

    private Long addTime;

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getAppTypeId() {
        return appTypeId;
    }

    public void setAppTypeId(Integer appTypeId) {
        this.appTypeId = appTypeId;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId == null ? null : pushId.trim();
    }

    public Integer getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(Integer serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
}
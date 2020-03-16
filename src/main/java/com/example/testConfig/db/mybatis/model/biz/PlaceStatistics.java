package com.example.testConfig.db.mybatis.model.biz;

public class PlaceStatistics {
    private String id;

    private String agentId;

    private String projectId;

    private String areaId;

    private String placeId;

    private Integer yearMonthTime;

    private Integer fireNumber;

    private Integer faultNumber;

    private Integer eventNumber;

    private Integer hiddenNumber;

    private Integer hiddenHandleNumber;

    private Integer fireHandleIn15m;

    private Integer fireHandleIn1h;

    private Integer fireHandleIn1d;

    private Integer fireHandleAfter1d;

    private Integer phoneNumber;

    private Integer phoneFailNumber;

    private Integer messageNumber;

    private Integer messageFailNumber;

    private Integer appPushNumber;

    private Integer appPushFailNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
    }

    public Integer getYearMonthTime() {
        return yearMonthTime;
    }

    public void setYearMonthTime(Integer yearMonthTime) {
        this.yearMonthTime = yearMonthTime;
    }

    public Integer getFireNumber() {
        return fireNumber;
    }

    public void setFireNumber(Integer fireNumber) {
        this.fireNumber = fireNumber;
    }

    public Integer getFaultNumber() {
        return faultNumber;
    }

    public void setFaultNumber(Integer faultNumber) {
        this.faultNumber = faultNumber;
    }

    public Integer getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(Integer eventNumber) {
        this.eventNumber = eventNumber;
    }

    public Integer getHiddenNumber() {
        return hiddenNumber;
    }

    public void setHiddenNumber(Integer hiddenNumber) {
        this.hiddenNumber = hiddenNumber;
    }

    public Integer getHiddenHandleNumber() {
        return hiddenHandleNumber;
    }

    public void setHiddenHandleNumber(Integer hiddenHandleNumber) {
        this.hiddenHandleNumber = hiddenHandleNumber;
    }

    public Integer getFireHandleIn15m() {
        return fireHandleIn15m;
    }

    public void setFireHandleIn15m(Integer fireHandleIn15m) {
        this.fireHandleIn15m = fireHandleIn15m;
    }

    public Integer getFireHandleIn1h() {
        return fireHandleIn1h;
    }

    public void setFireHandleIn1h(Integer fireHandleIn1h) {
        this.fireHandleIn1h = fireHandleIn1h;
    }

    public Integer getFireHandleIn1d() {
        return fireHandleIn1d;
    }

    public void setFireHandleIn1d(Integer fireHandleIn1d) {
        this.fireHandleIn1d = fireHandleIn1d;
    }

    public Integer getFireHandleAfter1d() {
        return fireHandleAfter1d;
    }

    public void setFireHandleAfter1d(Integer fireHandleAfter1d) {
        this.fireHandleAfter1d = fireHandleAfter1d;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPhoneFailNumber() {
        return phoneFailNumber;
    }

    public void setPhoneFailNumber(Integer phoneFailNumber) {
        this.phoneFailNumber = phoneFailNumber;
    }

    public Integer getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(Integer messageNumber) {
        this.messageNumber = messageNumber;
    }

    public Integer getMessageFailNumber() {
        return messageFailNumber;
    }

    public void setMessageFailNumber(Integer messageFailNumber) {
        this.messageFailNumber = messageFailNumber;
    }

    public Integer getAppPushNumber() {
        return appPushNumber;
    }

    public void setAppPushNumber(Integer appPushNumber) {
        this.appPushNumber = appPushNumber;
    }

    public Integer getAppPushFailNumber() {
        return appPushFailNumber;
    }

    public void setAppPushFailNumber(Integer appPushFailNumber) {
        this.appPushFailNumber = appPushFailNumber;
    }
}
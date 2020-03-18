package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.Date;

public class VideoInfo {
    private String guid;

    private String ip;

    private String port;

    private String protocol;

    private String streamName;

    private String appName;

    private String videoName;

    private String pubUrl;

    private String sourceAddr;

    private String address;

    private String projectGuid;

    private String projectName;

    private String zoneGuid;

    private String zoneName;

    private String placeGuid;

    private String placeName;

    private String remark;

    private String pubToken;

    private Date createTime;

    private Date updateTime;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName == null ? null : streamName.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getPubUrl() {
        return pubUrl;
    }

    public void setPubUrl(String pubUrl) {
        this.pubUrl = pubUrl == null ? null : pubUrl.trim();
    }

    public String getSourceAddr() {
        return sourceAddr;
    }

    public void setSourceAddr(String sourceAddr) {
        this.sourceAddr = sourceAddr == null ? null : sourceAddr.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getProjectGuid() {
        return projectGuid;
    }

    public void setProjectGuid(String projectGuid) {
        this.projectGuid = projectGuid == null ? null : projectGuid.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getZoneGuid() {
        return zoneGuid;
    }

    public void setZoneGuid(String zoneGuid) {
        this.zoneGuid = zoneGuid == null ? null : zoneGuid.trim();
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    public String getPlaceGuid() {
        return placeGuid;
    }

    public void setPlaceGuid(String placeGuid) {
        this.placeGuid = placeGuid == null ? null : placeGuid.trim();
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPubToken() {
        return pubToken;
    }

    public void setPubToken(String pubToken) {
        this.pubToken = pubToken == null ? null : pubToken.trim();
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
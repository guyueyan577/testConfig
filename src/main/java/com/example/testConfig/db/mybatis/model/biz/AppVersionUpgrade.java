package com.example.testConfig.db.mybatis.model.biz;

import java.util.Date;

public class AppVersionUpgrade {
    private String id;

    private String appName;

    private Integer appType;

    private String appVersion;

    private String appPath;

    private String appSystem;

    private Integer appForce;

    private Date appUploadTime;

    private String appMd5;

    private String appSize;

    private String appDesp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath == null ? null : appPath.trim();
    }

    public String getAppSystem() {
        return appSystem;
    }

    public void setAppSystem(String appSystem) {
        this.appSystem = appSystem == null ? null : appSystem.trim();
    }

    public Integer getAppForce() {
        return appForce;
    }

    public void setAppForce(Integer appForce) {
        this.appForce = appForce;
    }

    public Date getAppUploadTime() {
        return appUploadTime;
    }

    public void setAppUploadTime(Date appUploadTime) {
        this.appUploadTime = appUploadTime;
    }

    public String getAppMd5() {
        return appMd5;
    }

    public void setAppMd5(String appMd5) {
        this.appMd5 = appMd5 == null ? null : appMd5.trim();
    }

    public String getAppSize() {
        return appSize;
    }

    public void setAppSize(String appSize) {
        this.appSize = appSize == null ? null : appSize.trim();
    }

    public String getAppDesp() {
        return appDesp;
    }

    public void setAppDesp(String appDesp) {
        this.appDesp = appDesp == null ? null : appDesp.trim();
    }
}
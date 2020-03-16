package com.example.testConfig.db.mybatis.model.assist;

public class ManageCompany {
    private String id;

    private String producerCode;

    private String companyId;

    private String companyName;

    private String companyCode;

    private String companyAddress;

    private String companyContactName;

    private String companyContactTel;

    private String mqAddr;

    private Integer mqPort;

    private String mqUsername;

    private String mqPassword;

    private String projectAdminAccount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProducerCode() {
        return producerCode;
    }

    public void setProducerCode(String producerCode) {
        this.producerCode = producerCode == null ? null : producerCode.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyContactName() {
        return companyContactName;
    }

    public void setCompanyContactName(String companyContactName) {
        this.companyContactName = companyContactName == null ? null : companyContactName.trim();
    }

    public String getCompanyContactTel() {
        return companyContactTel;
    }

    public void setCompanyContactTel(String companyContactTel) {
        this.companyContactTel = companyContactTel == null ? null : companyContactTel.trim();
    }

    public String getMqAddr() {
        return mqAddr;
    }

    public void setMqAddr(String mqAddr) {
        this.mqAddr = mqAddr == null ? null : mqAddr.trim();
    }

    public Integer getMqPort() {
        return mqPort;
    }

    public void setMqPort(Integer mqPort) {
        this.mqPort = mqPort;
    }

    public String getMqUsername() {
        return mqUsername;
    }

    public void setMqUsername(String mqUsername) {
        this.mqUsername = mqUsername == null ? null : mqUsername.trim();
    }

    public String getMqPassword() {
        return mqPassword;
    }

    public void setMqPassword(String mqPassword) {
        this.mqPassword = mqPassword == null ? null : mqPassword.trim();
    }

    public String getProjectAdminAccount() {
        return projectAdminAccount;
    }

    public void setProjectAdminAccount(String projectAdminAccount) {
        this.projectAdminAccount = projectAdminAccount == null ? null : projectAdminAccount.trim();
    }
}
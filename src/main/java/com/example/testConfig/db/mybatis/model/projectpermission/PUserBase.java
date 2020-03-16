package com.example.testConfig.db.mybatis.model.projectpermission;

public class PUserBase {
    private String id;

    private String userAccount;

    private String userName;

    private String parentAccount;

    private Integer roleCode;

    private String bindingUser;

    private String phoneNumber;

    private String email;

    private Boolean changepassword;

    private Boolean accountStatus;

    private Boolean login;

    private String password;

    private Integer themeId;

    private Boolean deleted;

    private String copyrightInformation;

    private String titleInformation;

    private Long createTime;

    private Long updateTime;

    private String projectId;

    private Boolean privacyAgreement;

    private Boolean personalAccount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount == null ? null : parentAccount.trim();
    }

    public Integer getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Integer roleCode) {
        this.roleCode = roleCode;
    }

    public String getBindingUser() {
        return bindingUser;
    }

    public void setBindingUser(String bindingUser) {
        this.bindingUser = bindingUser == null ? null : bindingUser.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getChangepassword() {
        return changepassword;
    }

    public void setChangepassword(Boolean changepassword) {
        this.changepassword = changepassword;
    }

    public Boolean getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getCopyrightInformation() {
        return copyrightInformation;
    }

    public void setCopyrightInformation(String copyrightInformation) {
        this.copyrightInformation = copyrightInformation == null ? null : copyrightInformation.trim();
    }

    public String getTitleInformation() {
        return titleInformation;
    }

    public void setTitleInformation(String titleInformation) {
        this.titleInformation = titleInformation == null ? null : titleInformation.trim();
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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Boolean getPrivacyAgreement() {
        return privacyAgreement;
    }

    public void setPrivacyAgreement(Boolean privacyAgreement) {
        this.privacyAgreement = privacyAgreement;
    }

    public Boolean getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(Boolean personalAccount) {
        this.personalAccount = personalAccount;
    }
}
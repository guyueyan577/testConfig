package com.example.testConfig.db.mybatis.model.projectpermission;

public class PVerfication {
    private String id;

    private String verificationNumber;

    private String verificationCode;

    private Long verificationRequestTime;

    private String verificationRequestState;

    private Integer verificationNum;

    private Integer verificationType;

    private Integer verificationState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVerificationNumber() {
        return verificationNumber;
    }

    public void setVerificationNumber(String verificationNumber) {
        this.verificationNumber = verificationNumber == null ? null : verificationNumber.trim();
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode == null ? null : verificationCode.trim();
    }

    public Long getVerificationRequestTime() {
        return verificationRequestTime;
    }

    public void setVerificationRequestTime(Long verificationRequestTime) {
        this.verificationRequestTime = verificationRequestTime;
    }

    public String getVerificationRequestState() {
        return verificationRequestState;
    }

    public void setVerificationRequestState(String verificationRequestState) {
        this.verificationRequestState = verificationRequestState == null ? null : verificationRequestState.trim();
    }

    public Integer getVerificationNum() {
        return verificationNum;
    }

    public void setVerificationNum(Integer verificationNum) {
        this.verificationNum = verificationNum;
    }

    public Integer getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(Integer verificationType) {
        this.verificationType = verificationType;
    }

    public Integer getVerificationState() {
        return verificationState;
    }

    public void setVerificationState(Integer verificationState) {
        this.verificationState = verificationState;
    }
}
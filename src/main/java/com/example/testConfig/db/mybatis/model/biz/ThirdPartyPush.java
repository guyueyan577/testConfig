package com.example.testConfig.db.mybatis.model.biz;

public class ThirdPartyPush {
    private String projectGuid;

    private String pushUrl;

    private Boolean useAble;

    private String projectArgs;

    public String getProjectGuid() {
        return projectGuid;
    }

    public void setProjectGuid(String projectGuid) {
        this.projectGuid = projectGuid == null ? null : projectGuid.trim();
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl == null ? null : pushUrl.trim();
    }

    public Boolean getUseAble() {
        return useAble;
    }

    public void setUseAble(Boolean useAble) {
        this.useAble = useAble;
    }

    public String getProjectArgs() {
        return projectArgs;
    }

    public void setProjectArgs(String projectArgs) {
        this.projectArgs = projectArgs == null ? null : projectArgs.trim();
    }
}
package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class EquTypeMenu {
    private Integer id;

    private String equTypeName;

    private String i18nCode;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquTypeName() {
        return equTypeName;
    }

    public void setEquTypeName(String equTypeName) {
        this.equTypeName = equTypeName == null ? null : equTypeName.trim();
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
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
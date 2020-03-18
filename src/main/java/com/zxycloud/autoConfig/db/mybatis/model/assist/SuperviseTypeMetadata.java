package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class SuperviseTypeMetadata {
    private String id;

    private Integer superviseTypeCode;

    private String superviseTypeName;

    private String i18nCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSuperviseTypeCode() {
        return superviseTypeCode;
    }

    public void setSuperviseTypeCode(Integer superviseTypeCode) {
        this.superviseTypeCode = superviseTypeCode;
    }

    public String getSuperviseTypeName() {
        return superviseTypeName;
    }

    public void setSuperviseTypeName(String superviseTypeName) {
        this.superviseTypeName = superviseTypeName == null ? null : superviseTypeName.trim();
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }
}
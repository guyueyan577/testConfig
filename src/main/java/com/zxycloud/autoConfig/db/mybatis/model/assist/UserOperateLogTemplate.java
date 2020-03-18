package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class UserOperateLogTemplate {
    private String id;

    private Integer operateCode;

    private String i18nCode;

    private String template;

    private String valueList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getOperateCode() {
        return operateCode;
    }

    public void setOperateCode(Integer operateCode) {
        this.operateCode = operateCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    public String getValueList() {
        return valueList;
    }

    public void setValueList(String valueList) {
        this.valueList = valueList == null ? null : valueList.trim();
    }
}
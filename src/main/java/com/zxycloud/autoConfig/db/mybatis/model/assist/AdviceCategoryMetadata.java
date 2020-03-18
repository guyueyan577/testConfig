package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class AdviceCategoryMetadata {
    private Integer id;

    private Integer adviceCategory;

    private String adviceCategoryName;

    private String adviceCategoryNameEn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdviceCategory() {
        return adviceCategory;
    }

    public void setAdviceCategory(Integer adviceCategory) {
        this.adviceCategory = adviceCategory;
    }

    public String getAdviceCategoryName() {
        return adviceCategoryName;
    }

    public void setAdviceCategoryName(String adviceCategoryName) {
        this.adviceCategoryName = adviceCategoryName == null ? null : adviceCategoryName.trim();
    }

    public String getAdviceCategoryNameEn() {
        return adviceCategoryNameEn;
    }

    public void setAdviceCategoryNameEn(String adviceCategoryNameEn) {
        this.adviceCategoryNameEn = adviceCategoryNameEn == null ? null : adviceCategoryNameEn.trim();
    }
}
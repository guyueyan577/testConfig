package com.example.testConfig.db.mybatis.model.assist;

public class FileTypeMetadata {
    private String id;

    private Integer fileTypeCode;

    private String i18nCode;

    private String fileTypeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(Integer fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

    public String getFileTypeName() {
        return fileTypeName;
    }

    public void setFileTypeName(String fileTypeName) {
        this.fileTypeName = fileTypeName == null ? null : fileTypeName.trim();
    }
}
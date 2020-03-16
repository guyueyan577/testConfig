package com.example.testConfig.db.mybatis.model.assist;

public class FileUploadInfomation {
    private String id;

    private Integer moduleCode;

    private Integer fileTypeCode;

    private String fileUrl;

    private String description;

    private Integer sortScort;

    private String bindingId;

    private Integer fileUrlType;

    private Double imgWidth;

    private Double imgHeight;

    private String thumbImgUrl;

    private Double thumbImgWidth;

    private Double thumbImgHeight;

    private Long createTime;

    private Long updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(Integer moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Integer getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(Integer fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSortScort() {
        return sortScort;
    }

    public void setSortScort(Integer sortScort) {
        this.sortScort = sortScort;
    }

    public String getBindingId() {
        return bindingId;
    }

    public void setBindingId(String bindingId) {
        this.bindingId = bindingId == null ? null : bindingId.trim();
    }

    public Integer getFileUrlType() {
        return fileUrlType;
    }

    public void setFileUrlType(Integer fileUrlType) {
        this.fileUrlType = fileUrlType;
    }

    public Double getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Double imgWidth) {
        this.imgWidth = imgWidth;
    }

    public Double getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Double imgHeight) {
        this.imgHeight = imgHeight;
    }

    public String getThumbImgUrl() {
        return thumbImgUrl;
    }

    public void setThumbImgUrl(String thumbImgUrl) {
        this.thumbImgUrl = thumbImgUrl == null ? null : thumbImgUrl.trim();
    }

    public Double getThumbImgWidth() {
        return thumbImgWidth;
    }

    public void setThumbImgWidth(Double thumbImgWidth) {
        this.thumbImgWidth = thumbImgWidth;
    }

    public Double getThumbImgHeight() {
        return thumbImgHeight;
    }

    public void setThumbImgHeight(Double thumbImgHeight) {
        this.thumbImgHeight = thumbImgHeight;
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
}
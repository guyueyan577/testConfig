package com.example.testConfig.db.mybatis.model.biz;

public class PlaceLinkman {
    private String id;

    private String placeId;

    private String linkmanName;

    private String linkmanPhoneNumber;

    private Long createTime;

    private Integer linkmanLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getLinkmanPhoneNumber() {
        return linkmanPhoneNumber;
    }

    public void setLinkmanPhoneNumber(String linkmanPhoneNumber) {
        this.linkmanPhoneNumber = linkmanPhoneNumber == null ? null : linkmanPhoneNumber.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getLinkmanLevel() {
        return linkmanLevel;
    }

    public void setLinkmanLevel(Integer linkmanLevel) {
        this.linkmanLevel = linkmanLevel;
    }
}
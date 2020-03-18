package com.zxycloud.autoConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class PatrolPoint {
    private String id;

    private String companyId;

    private String companyName;

    private String patrolPointName;

    private Integer patrolItemType;

    private Integer equType;

    private String equName;

    private String tagNumber;

    private Integer cardType;

    private String cardName;

    private String areaId;

    private String areaName;

    private String buildingId;

    private String buildingName;

    private String floorId;

    private String floorName;

    private String address;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String producedDate;

    private String openDate;

    private String durableYear;

    private String manufacturer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getPatrolPointName() {
        return patrolPointName;
    }

    public void setPatrolPointName(String patrolPointName) {
        this.patrolPointName = patrolPointName == null ? null : patrolPointName.trim();
    }

    public Integer getPatrolItemType() {
        return patrolItemType;
    }

    public void setPatrolItemType(Integer patrolItemType) {
        this.patrolItemType = patrolItemType;
    }

    public Integer getEquType() {
        return equType;
    }

    public void setEquType(Integer equType) {
        this.equType = equType;
    }

    public String getEquName() {
        return equName;
    }

    public void setEquName(String equName) {
        this.equName = equName == null ? null : equName.trim();
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber == null ? null : tagNumber.trim();
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId == null ? null : buildingId.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId == null ? null : floorId.trim();
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(String producedDate) {
        this.producedDate = producedDate == null ? null : producedDate.trim();
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate == null ? null : openDate.trim();
    }

    public String getDurableYear() {
        return durableYear;
    }

    public void setDurableYear(String durableYear) {
        this.durableYear = durableYear == null ? null : durableYear.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }
}
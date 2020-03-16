package com.example.testConfig.db.mybatis.model.assist;

public class ChargesExtend {
    private String id;

    private String chargesId;

    private Integer monthCount;

    private Double money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChargesId() {
        return chargesId;
    }

    public void setChargesId(String chargesId) {
        this.chargesId = chargesId == null ? null : chargesId.trim();
    }

    public Integer getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(Integer monthCount) {
        this.monthCount = monthCount;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
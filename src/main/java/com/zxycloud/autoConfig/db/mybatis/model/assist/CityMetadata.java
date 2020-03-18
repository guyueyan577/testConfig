package com.zxycloud.autoConfig.db.mybatis.model.assist;

public class CityMetadata {
    private String id;

    private String cityCode;

    private String cityName;

    private String cityParentCode;

    private String i18nCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityParentCode() {
        return cityParentCode;
    }

    public void setCityParentCode(String cityParentCode) {
        this.cityParentCode = cityParentCode == null ? null : cityParentCode.trim();
    }

    public String getI18nCode() {
        return i18nCode;
    }

    public void setI18nCode(String i18nCode) {
        this.i18nCode = i18nCode == null ? null : i18nCode.trim();
    }

	@Override
	public String toString() {
		return "CityMetadata [id=" + id + ", cityCode=" + cityCode + ", cityName=" + cityName + ", cityParentCode="
				+ cityParentCode + ", i18nCode=" + i18nCode + "]";
	}
    
    
}
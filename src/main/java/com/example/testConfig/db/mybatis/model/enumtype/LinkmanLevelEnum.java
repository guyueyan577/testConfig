package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 场所联系人等级
 * @author anxiaojian
 *
 * @date 2019年11月29日下午1:37:52
 */
public enum LinkmanLevelEnum {
    /**
     * 一级联系人
     */
    ONE_LEVEL(1),
    /**
     * 二级联系人
     */
    TWO_LEVEL(2);

    LinkmanLevelEnum(Integer level) {
        this.level = level;
    }

    private Integer level;

	public Integer getLevel() {
		return level;
	}

    
}

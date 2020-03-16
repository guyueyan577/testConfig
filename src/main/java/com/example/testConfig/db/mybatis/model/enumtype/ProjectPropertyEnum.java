package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 单位类型
 * @author lvheng
 * @create 2019 - 03 - 01 15:19
 */
public enum  ProjectPropertyEnum {
    /**
     * 正式单位
     */
    OFFICIAL("正式单位",1),
    /**
     * 测试单位
     */
    TEST("测试单位",2);

    private String name;
    private Integer code;

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    ProjectPropertyEnum(String name, Integer code) {
        this.name = name;
        this.code = code;
    }
}

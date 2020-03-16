package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 区域子一级类型的枚举
 * @author lvheng
 * @create 2019 - 02 - 28 9:20
 */
public enum  SubAreaTypeEnum {

    /**
     * 未分配
     */
    NONE("未分配",0),

    /**
     * 区域
     */
    AREA("区域",1),

    /**
     * 场所
     */
    PLACE("场所",2);

    private String name;
    private Integer code;

    SubAreaTypeEnum(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }
}
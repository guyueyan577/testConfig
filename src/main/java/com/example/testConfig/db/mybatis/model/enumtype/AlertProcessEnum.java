package com.example.testConfig.db.mybatis.model.enumtype;

public enum AlertProcessEnum {
    /**
     * 未复核
     */
    UNCHECK(0),
    /**
     * 真实火警
     */
    REAL(1),
    /**
     * 火警误报
     */
    MISTAKE(2),
    /**
     * 火警测试
     */
    TEST(3);

    AlertProcessEnum(Integer code) {
        this.code = code;
    }

    private Integer code;

    public Integer getCode() {
        return code;
    }
}

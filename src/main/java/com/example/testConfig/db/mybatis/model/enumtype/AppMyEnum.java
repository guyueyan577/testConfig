package com.example.testConfig.db.mybatis.model.enumtype;

public enum  AppMyEnum {
    /**
     * 常见问题
     */
    QUESTION(1),
    /**
     * 安全消防知识
     */
    FIRE_FIGHTING_KNOWLEDGE(2),
    /**
     * 服务协议
     */
    TERMS_OF_SERVICE(3);

    private Integer type;

    public Integer getType() {
        return type;
    }

    AppMyEnum(Integer type) {
        this.type = type;
    }
}

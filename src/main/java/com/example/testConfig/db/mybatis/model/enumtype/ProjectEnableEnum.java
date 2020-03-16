package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 项目禁用启用枚举类
 * @author lvheng
 * @create 2019 - 03 - 08 15:43
 */
@Getter
public enum  ProjectEnableEnum {
    /**
     * 类型码
     */
    T_C(4),
    /**
     * 禁用
     */
    FORBIDDEN(0),
    /**
     * 启用
     */
    ACTIVE(1);

    private Integer code;

    ProjectEnableEnum(Integer code) {
        this.code = code;
    }
}

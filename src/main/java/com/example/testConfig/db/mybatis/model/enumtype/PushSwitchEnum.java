package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 推送总开关枚举
 * @author lvheng
 * @create 2019 - 03 - 08 15:31
 */
@Getter
public enum  PushSwitchEnum {
    /**
     * 在其它元数据中的type code 码
     */
    T_C(3),
    /**
     * 关闭
     */
    OFF(0),
    /**
     * 开启
     */
    ON(1)
    ;
    private Integer code;

    PushSwitchEnum(Integer code) {
        this.code = code;
    }
}

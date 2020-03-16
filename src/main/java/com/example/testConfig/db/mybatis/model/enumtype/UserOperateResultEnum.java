package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 用户操作是否成功枚举
 * other_metadata
 * @author lvheng
 * @create 2019 - 03 - 12 10:40
 */
@Getter
public enum  UserOperateResultEnum {
    /**
     * 失败
     */
    FAIL(5,0),
    /**
     * 成功
     */
    SUCESS(5,1);
    ;
    /**
     * type code
     */
    private Integer typeCode;

    /**
     * code
     */
    private Integer code;

    UserOperateResultEnum(Integer typeCode, Integer code) {
        this.typeCode = typeCode;
        this.code = code;
    }
}

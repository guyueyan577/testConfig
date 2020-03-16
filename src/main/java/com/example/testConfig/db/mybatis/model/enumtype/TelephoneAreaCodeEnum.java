package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 电话区号枚举
 * @author lvheng
 * 2019-06-17 11:10:56
 */
@Getter
public enum TelephoneAreaCodeEnum {
    /**
     * 中国区区号
     */
    CHINA("0086")
    ;
    /**
     * code码
     */
    private String code;

    TelephoneAreaCodeEnum(String code) {
        this.code = code;
    }}

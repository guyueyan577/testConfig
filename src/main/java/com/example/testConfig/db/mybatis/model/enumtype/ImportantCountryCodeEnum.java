package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 重要国家码枚举
 * @author lvheng
 * 2019年5月29日16:25:56
 */
@Getter
public enum ImportantCountryCodeEnum {

    /**
     * 中国
     */
    CHINA("000156");

    ImportantCountryCodeEnum(String code) {
        this.code = code;
    }

    private String code;

}

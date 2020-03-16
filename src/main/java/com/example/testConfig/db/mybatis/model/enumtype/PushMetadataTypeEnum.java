package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 推送大类枚举
 * @author lvheng
 * @create 2019 - 03 - 05 19:54
 */
@Getter
public enum  PushMetadataTypeEnum {
    /**
     * 电话
     */
    PHONE(1),
    /**
     * 短信
     */
    MESSAGE(2),
    /**
     * app推送
     */
    APP_PUSH(3);

    private Integer type;

    PushMetadataTypeEnum(Integer type) {
        this.type = type;
    }

}

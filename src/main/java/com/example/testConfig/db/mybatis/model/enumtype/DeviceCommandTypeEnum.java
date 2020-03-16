package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * The command that can be sent to device is refers to
 * a list of types.
 * This Enum shows the command type that we can use.
 * @author lvheng
 * 2019-06-04 15:36:12
 */
@Getter
public enum DeviceCommandTypeEnum {
    /**
     * 复位
     */
    RESET(1),
    /**
     * 消音
     */
    MUTE(2);

    private Integer code;

    DeviceCommandTypeEnum(Integer code) {
        this.code = code;
    }}

package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 隐患处置状态枚举
 *
 * @author lvheng
 * 2019-08-16 16:40:13
 */
@Getter
public enum HiddenHandleEnum {

    /**
     * 未整改
     */
    UNCORRECT(0),
    /**
     * 整改中
     */
    CORRECTING(1),
    /**
     * 已整改，待验收
     */
    READY_FOR_CHECK(2),
    /**
     * 验收合格
     */
    QUALIFIED(3),
    /**
     * 验收不合格
     */
    UNQUALIFIED(4);

    private Integer code;

    HiddenHandleEnum(Integer code) {
        this.code = code;
    }}

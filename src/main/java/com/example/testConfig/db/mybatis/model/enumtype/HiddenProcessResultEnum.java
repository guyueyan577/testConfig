package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

@Getter
public enum HiddenProcessResultEnum {
    /**
     * 未整改
     */
    UNPROCESS_NUMBER(0),

    /**
     * 整改中
     */
     PROCESSING_NUMBER(1),

    /**
     * 已整改待验收
     */
    READY_FOR_ACCEPT_NUMBER(2),

    /**
     * 验收合格
     */
    QUALIFIED_NUMBER(3),

    /**
     * 验收不合格
     */
    UNQUALIFIED_NUMBER(4)

    ;

    private Integer processResult;

    HiddenProcessResultEnum(Integer processResult) {
        this.processResult = processResult;
    }
}

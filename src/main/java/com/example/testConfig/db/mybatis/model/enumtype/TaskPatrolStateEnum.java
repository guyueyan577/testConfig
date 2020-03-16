package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

@Getter
public enum TaskPatrolStateEnum {
    /**
     * 未开始
     */
    NOT_BEGIN_NUMBER(0),

    /**
     * 执行中
     */
    IN_PROGRESS_NUMBER(1),

    /**
     * 已完成
     */
    FINISHED_NUMBER(2),

    /**
     * 未完成
     */
    UNFINISHED_NUMBER(3);

    private Integer stateCode;

    TaskPatrolStateEnum(Integer stateCode) {
        this.stateCode = stateCode;
    }
}

package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 根据时段统计信息类型枚举
 * @author lvheng
 * 2019-06-10 17:51:11
 */
@Getter
public enum PlaceHourStatisticsTypeEnum {
    /**
     * 火警
     */
    ALARM(1),
    /**
     * 故障
     */
    FAULT(2),
    /**
     * 事件
     */
    EVENT(3),
    /**
     * 电话推送
     */
    PHONE_PUSH(4),
    /**
     * 短信推送
     */
    MESSAGE_PUSH(5),
    /**
     * app推送
     */
    APP_PUSH(6);

    private Integer type;

    PlaceHourStatisticsTypeEnum(Integer type) {
        this.type = type;
    }
}

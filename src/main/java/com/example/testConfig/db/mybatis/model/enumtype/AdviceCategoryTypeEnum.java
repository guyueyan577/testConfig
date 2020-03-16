package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 谏言分类码
 * @author lvheng
 * 2020-3-10 10:45
 */
@Getter
public enum AdviceCategoryTypeEnum {
    /**
     * 系统通知
     */
    PLATFORM_ADVICE(10),
    /**
     * 新闻通知
     */
    NEWS_ADVICE(20),
    /**
     * 监管通知
     */
    REGULATORY_ADVICE(30),
    /**
     * 整改通知
     */
    RECTIFICATION_ADVICE(40),
    /**
     * 火警
     */
    FIRE_ALARM(100),
    /**
     * 预警
     */
    WARN(110),
    /**
     * 故障
     */
    DEVICE_FAULT(120),
    /**
     * 隐患
     */
    HIDDEN_DANGER(130),
    /**
     * 事件
     */
    DEVICE_EVENT(140),
    /**
     * 上线
     */
    ONLINE(150),
    /**
     * 其他
     */
    OTHER(200);


    /**
     * 消息分类码
     */
    private Integer code;

    AdviceCategoryTypeEnum(Integer code) {
        this.code = code;
    }
}

package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 核心设备状态组枚举
 */
public enum CoreDeviceStateGroupEnum {
    /**
     * 火警
     */
    FIRE(1),
    /**
     * 预警
     */
    EARLY_WARNING(2),
    /**
     * 启动
     */
    START(3),
    /**
     * 监管
     */
    SUPERVISE(4),
    /**
     * 反馈
     */
    FEEDBACK(5),
    /**
     * 故障
     */
    MALFUNCTION(6),
    /**
     * 屏蔽
     */
    SHIELDING(7),
    /**
     * 离线
     */
    OFFLINE(96),
    /**
     * 在线
     */
    ONLINE(97),
    /**
     * 正常
     */
    NORMAL(99);

    private Integer code;

    CoreDeviceStateGroupEnum(Integer code) {
        this.code = code;
    }}

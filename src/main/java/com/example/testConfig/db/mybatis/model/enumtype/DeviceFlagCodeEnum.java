package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 设备标识类型枚举
 * @author Anxiaojian lvheng
 * 2019-08-08 14:18:03
 */
public enum DeviceFlagCodeEnum {
    /**
     * 独立式设备
     */
    INDEPENDENT_DEVICE(1),
    /**
     * 非独立式网关
     */
    INDEPENDENT_ADAPTER(2),
    /**
     * 控制器
     */
    CONTROLLER(3),
    /**
     * 设备
     */
    COMMON_DEVICE(4),
    /**
     * 通道
     */
    CHANNEL(5);

    private final int code;

    DeviceFlagCodeEnum(int code) {
        this.code = code;
    }

    public int getFlagCode() {
        return code;
    }

}

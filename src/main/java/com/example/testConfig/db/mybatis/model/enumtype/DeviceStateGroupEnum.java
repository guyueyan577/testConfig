package com.example.testConfig.db.mybatis.model.enumtype;

public enum DeviceStateGroupEnum {

    /**
     * 火警
     */
    ALARM(1),
    /**
     * 预警
     */
    WARN(2),
    /**
     * 故障
     */
    FAULT(6),
    /**
     * 事件
     */
    EVENT(95),
    /**
     * 离线
     */
    OFFLINE(96),
    /**
     * 操作
     */
    OPERATE(98),
    /**
     * 正常
     */
    NORMAL(99);

    private final int deviceStateGroupCode;

    DeviceStateGroupEnum(int deviceStateGroupCode) {
        this.deviceStateGroupCode = deviceStateGroupCode;
    }

    public int getDeviceStateGroupCode() {
        return deviceStateGroupCode;
    }
}

package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * tagCode 枚举
 * 参考网站：http://www.openmobilealliance.org/wp/OMNA/LwM2M/LwM2MRegistry.html#x_label
 * @author Chenjianwei lvheng
 * 2019-08-09 14:18:21
 */
public enum DeviceTagCodeEnum {
    /**
     * 执行功能
     */
    FUNCTION_CODE(50000),
    /**
     * 主机地址
     */
    CONTROLLER_ID(50001),
    /**
     * 回路地址
     */
    LOOP_ID(50002),
    /**
     * 设备地址
     */
    DEVICE_ID(50003),
    /**
     * 通道号
     */
    CHANNEL_ID(50004),
    /**
     * 二次码（设备识别码）
     */
    DEVICE_NUMBER(50005),
    /**
     * 状态
     */
    STATE_ID(50006),
    /**
     * 操作码
     */
    OPERATE_ID(50007),
    /**
     * 设备类型
     */
    DEVICE_TYPE(50008),
    /**
     * 发送时间
     */
    SEND_TIME(50009),
    /**
     * 采集类型
     */
    COLLECT_TYPE(50010),
    /**
     * 采集单位
     */
    COLLECT_UNIT(50011),
    /**
     * 采集间隔
     */
    COLLECT_PERIOD(50012),
    /**
     * 放大倍数
     */
    MAGNIFICATION(50013),
    /**
     * 信号源
     */
    SIGNAL_SOURCE(50014),
    /**
     * 软件版本号
     */
    SOFTWARE_VERSION(50015),
    /**
     * 硬件版本号
     */
    HARDWARE_VERSION(50016),
    /**
     * 在线状态
     */
    CONNCECTED(50017),
    /**
     * 采集下限
     */
    LOW_COLLECT(50018),
    /**
     * 采集上限
     */
    HIGH_COLLECT(50019),
    /**
     * 报警下限
     */
    LOW_ALARM(50020),
    /**
     * 报警上限
     */
    HIGH_ALARM(50021),
    /**
     * 误差范围
     */
    ERROR_RANGE(50022),
    /**
     * 报警值
     */
    ALARM_VALUE(50023),
    /**
     * 设备安装位置
     */
    DEVICE_INSTALL_PLACE(50024),
    /**
     * 设备中使用的SIM卡编码
     */
    ICCID(50025),
    /**
     * 设备IMEI编码（国际移动设备识别码/模组编码）
     */
    IMEI(50026),
    /**
     * 设备IMSI编码(国际移动用户识别码)
     */
    IMSI(50027),
    /**
     * 1nb独立式；2网关；3控制器；4普通设备；5通道设备
     */
    FLAG(50028),
    /**
     * 指令
     */
    COMMAND(50029),
    /**
     * 主机类型
     */
    CONTROLLER_TYPE(50030),
    /**
     * 事件编码
     */
    EVENT_CODE(50031),
    /**
     * 事件对应图片地址
     */
    IMAGE_URL(50032),
    ;

    private Integer code;

    DeviceTagCodeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}

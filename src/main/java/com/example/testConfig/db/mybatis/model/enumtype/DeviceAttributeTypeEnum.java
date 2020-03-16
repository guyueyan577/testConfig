package com.example.testConfig.db.mybatis.model.enumtype;

public enum DeviceAttributeTypeEnum {
    /**
     * 预留
     */
    RESERVED(0),
    /**
     * 在线/本地
     */
    ONLINE_OR_LOCAL(1),
    /**
     * 布防、撤防
     */
    DEFENCE(2),
    /**
     * 省电和正常模式
     */
    SAVEELEC_NORMAL(3),
    /**
     * 月检开始/月检结束
     */
    MONTHLY_INSPECTION_BEGIN_OR_END(4),
    /**
     * 年检开始/年检结束
     */
    ANNUAL_INSPECTION_BEGIN_OR_END(5),
    /**
     * 应急启动/退出应急
     */
    EMERGENCY_START_OR_EXIT(6),
    /**
     * 应急灯上
     */
    EMERGENCY_LIGHTS_UP(7),
    /**
     * 应急灯下
     */
    EMERGENCY_LIGHTS_DOWN(8),
    /**
     * 应急灯左
     */
    EMERGENCY_LIGHTS_LEFT(9),
    /**
     * 应急灯右
     */
    EMERGENCY_LIGHTS_RIGHT(10),
    /**
     * 联动条件：0无联动；1单个设备联动；2两个设备报警联动
     */
    LINKED_CONDITION(11),
    /**
     * 开始时间
     * e.g. 0130
     */
    START_TIME(12),
    /**
     *  结束时间
     *  e.g. 2230
     */
    END_TIME(13),
    /**
     * 时间段标识
     * 为0标识该时间段内布防；为1表示该时间段外布防
     */
    DEFENCE_TIME_FLAG(14),
    /**
     * 监护时长
     * 单位为分
     * 表明探测多长时间内是否有人活动，最大43200（30天）
     */
    MONITORING_TIME_LENGTH(15),
    /**
     * 热释电灵敏度等级
     * 为2对应2m，3对应3m，4对应4m
     */
    PYROELECTRIC_SENSITIVITY_LEVEL(16),
    /**
     * 热释电场景模式 1 监护模式；2 布防模式
     */
    PYROELECTRIC_SCENE_MODE(17),
    
    /**
	 * 探测间隔 （单位：分）
	 */
    DETECT_INTERVAL(18),
    /**
     * WIFI ssid
     */
    WIFI_SSID(128),
    /**
     * Wifi Auth加密类型
     */
    WIFI_AUTH_TYPE(129),
    /**
     * Wifi IP地址
     */
    IP_ADDRESS(130),
    /**
     * MAC地址
     */
    MAC_ADDRESS(131),
    /**
     * 连接速度
     */
    CONNECT_SPEED(132),
    /**
     * 频率
     */
    FREQUENCY(133),
    /**
     * 小区号
     */
    SIGNAL_CELL(134),
    /**
     * 基站号
     */
    SIGNAL_BASIC(135),
    /**
     * 位置号
     */
    SIGNAL_LAC(136)
    ;

    DeviceAttributeTypeEnum(Integer code) {
        this.code = code;
    }

    private Integer code;

    public Integer getCode() {
        return code;
    }
}

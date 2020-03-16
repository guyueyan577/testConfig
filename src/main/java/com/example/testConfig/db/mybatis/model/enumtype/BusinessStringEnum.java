package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 固定的业务的字符串示例枚举
 * @author lvheng
 * 2019-07-29 18:58:35
 */
public interface BusinessStringEnum {

    /**
     * 设备采集值单位为空字符串
     * @author lvheng
     */
    String DEVICE_COLLECT_UNIT_NULL = "-";

    /**
     * 采集模拟量值平均值非法值
     */
    String DEVICE_COLLECT_AVG_ILLEGAL_VALUE = "-9999";

    /**
     * platform official language is zh
     */
    String OFFICIAL_LANGUAGE_I18N_CODE = "zh";
}

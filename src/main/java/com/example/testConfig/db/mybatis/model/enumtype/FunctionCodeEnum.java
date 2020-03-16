package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * function code enum
 * @author lvheng
 * 2019-06-12 16:25:00
 */
@Getter
public enum FunctionCodeEnum {
	
	/**
     * 设置在线状态
     */
    DEVICE_CONNECT_STATE(1001),
	
    /**
     * 注册直连设备
     */
    REGISTER_ADATPER(1003),
	
    /**
     * 设置IMEI
     */
    DEVICE_IMEI(1005),
    
    /**
     * 设置IMSI
     */
    DEVICE_IMSI(1006),
    
    /**
     * 设置ICCID
     */
    DEVICE_ICCID(1007),
    
    /**
     * 初始化网关
     */
    INIT_ADAPTER(1017),
	
	/**
	 * 设备事件
	 */
	DEVICE_EVENT(1036);

    private Integer code;

    FunctionCodeEnum(Integer code) {
        this.code = code;
    }
}

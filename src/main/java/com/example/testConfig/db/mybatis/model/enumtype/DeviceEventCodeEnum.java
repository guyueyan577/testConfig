package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 事件处理Code
 * @author anxiaojian
 *
 * @date 2019年11月19日下午5:49:22
 */
public enum DeviceEventCodeEnum {
	
	/**
	 * 消防通道堵塞
	 */
	FIREEXITBLOCKED_EVENT_CODE(1),
	/**
	 * 人员离岗
	 */
	PERSONLEAVING_EVENT_CODE(2),
	/**
	 * 火焰预警
	 */
	FLAMEWARNING_EVENT_CODE(3),
	/**
	 * 火警事件(目前包含手报发送状态走事件)
	 */
	FIRE_EVENT_CODE(4),
	/*
	 * 人员入侵
	 * */
	FOUND_PERSON(5),
	/*
	 * 监护无人报警
	 * */
	NO_PERSON(6);
	
	private final int code;

	DeviceEventCodeEnum(int code) {
        this.code = code;
    }

    public int getEventCode() {
        return code;
    }
	
}

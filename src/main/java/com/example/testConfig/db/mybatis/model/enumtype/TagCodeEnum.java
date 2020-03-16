package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * TagCode
 * @author anxiaojian
 *
 * @date 2019年3月19日下午5:44:12
 */
public enum TagCodeEnum {

	/**
	 * 信号强度
	 */
	SINAL_STRENGTH(30022),

	/**
	 * 通用采集值
	 */
	COMMON_ANALOG_VALUE(30023),

	/**
	 * 电压值
	 */
	VOLTAGE(30005);

	private final int tagCode;
	
	TagCodeEnum(int tagCode){
		this.tagCode = tagCode;
	}

	public int getTagCode() {
		return tagCode;
	}

}

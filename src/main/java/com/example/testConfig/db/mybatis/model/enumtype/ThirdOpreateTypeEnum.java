package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 第三方操作
 * @author anxiaojian
 *
 * @date 2019年10月23日下午2:40:51
 */
public enum ThirdOpreateTypeEnum {
    /**
     * 火警确认
     */
    FIRE_TRUE("1001"),
    /**
     * 项目添加
     */
    PROJECT_ADD("2001"),
    /**
     * 项目编辑
     */
    PROJECT_EDIT("2002"),
    /**
     * 项目删除
     */
    PROJECT_DEL("2003"),
    /**
     * 场所添加
     */
    PLACE_ADD("3001"),
    /**
     * 场所编辑
     */
    PLACE_EDIT("3002"),
    /**
     * 场所删除
     */
    PLACE_DEL("3003"),
    /**
     * 网关添加
     */
    ADAPTER_ADD("4001"),
    /**
     * 网关编辑
     */
    ADAPTER_EDIT("4002"),
    /**
     * 网关删除
     */
    ADAPTER_DEL("4003"),
    /**
     * 网关以及网关下设备分配
     */
    ADAPTER_SUBDEVICE_DISTRIBUTE("4004"),
    /**
     * 解绑网关
     */
    ADAPTER_UNBINDING("4005"),
    /**
     * 设备添加
     */
    DEVICE_ADD("5001"),
    /**
     * 设备编辑
     */
    DEVICE_EDIT("5002"),
    /**
     * 设备删除
     */
    DEVICE_DEL("5003"),
	/**
     * 分配单个设备
     */
    DEVICE_SINGLE_DISTRIBUTE("5004"),
    /**
     * 片区添加
     */
    AREA_ADD("6001"),
    /**
     * 片区编辑
     */
    AREA_EDIT("6002"),
    /**
     * 片区删除
     */
    AREA_DEL("6003");

    ThirdOpreateTypeEnum(String code) {
        this.functionCode = code;
    }

    private String functionCode;

	public String getFunctionCode() {
		return functionCode;
	}
	
}

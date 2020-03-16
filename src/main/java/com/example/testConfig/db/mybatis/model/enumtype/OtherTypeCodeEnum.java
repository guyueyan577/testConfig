package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 其他元数据数据类型
 *
 * @author anxiaojian lvheng
 * @date 2019年3月15日下午6:59:19
 */
public enum OtherTypeCodeEnum {


	/**
	 * 单位的审核状态
	 */
	PROJECT_AUDIT_STATE(1),
	/**
	 * 渠道的转移类型
	 */
	AGENT_TRANSFER_TYPE(2),
	/**
	 * 用户日志时间筛选条件
	 */
	USER_LOG_TIME_FILTER(6),
	/**
	 * 用户日志操作对象
	 */
	OPERATE_OBJECT(7),
	/**
	 * 用户日志操作类型
	 */
	OPERATE_TYPE(8),
	/**
	 * 审核方式
	 */
	AUDIT_MODEL(9),
	/**
	 * 单位属性
	 */
	PROJECT_PROPERTY(10),
	/**
	 * 网关在线/离线状态
	 */
	ADAPTER_CONNECT(11),
	/**
	 * 巡检任务状态
	 */
	PATROL_TASK_STATE(14),
	
	/**
	 * 隐患上报类型
	 */
	HIDDEN_SOURCE_CODE(16),
	
	/**
	 * 隐患等级
	 */
	HIDDEN_LEVEL(18),
	
	/**
	 * 隐患整改状态
	 */
	HIDDEN_PROCESS_STATE(19),
	/**
	 * 用户状态
	 */
	USER_STATES(21),
	
	/**
	 * 巡检计划状态
	 */
	PATROL_PLAN_STATE(22),
	/**
	 * 翼之城展厅需要的设备故障元数据，
	 * 可能包含一些自定义的故障
	 */
	YZC_DEVICE_FAULT(23),
	/**
	 * 事件处置方式
	 */
	DEVICE_EVENT_PROCESS_TYPE(24)
	;

    /**
     * 对应 other_metadata_type 中的 type_code
     */
    private int code;

    OtherTypeCodeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }


}

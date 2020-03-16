package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 项目审核状态枚举
 *
 * @author LvHeng
 * @date 2019年2月13日 下午6:22:03
 */
public enum AuditStateEnum {

	/**
	 * 审核状态类型在其它元数据表中的type code
	 */
	T_C(1),
	/**
	 * 待审核
	 */
	PENDING(1),
	/**
	 * 拒绝
	 */
	REJECT(2),
	/**
	 * 通过审核
	 */
	PASS(3);
	/**
	 * 编码
	 */
	private Integer code;

	public Integer getCode() {
		return code;
	}

	private AuditStateEnum(Integer code) {
		this.code = code;
	}
	
	
}

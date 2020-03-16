package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 审核方式枚举
 *
 * @author LvHeng
 * @date 2019年2月13日 下午6:08:17
 */
public enum AuditMethodEnum {
	/**
	 * 免审核
	 */
	SKIPPED(1),
	/**
	 * 缴费审核
	 */
	PAY(2),
	/**
	 * 人工审核
	 */
	MANUAL(3)
	;
	/**
	 * 编码
	 */
	private Integer code;

	public Integer getCode() {
		return code;
	}

	private AuditMethodEnum(Integer code) {
		this.code = code;
	}
	
	
}

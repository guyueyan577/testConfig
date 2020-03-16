package com.example.testConfig.db.mybatis.model.enumtype;
/**
 * 项目来源
 * @author anxiaojian
 *
 * @date 2019年12月14日下午1:45:39
 */
public enum ProjectSourceEnum {

	/**
	 * 内部项目
	 */
	COMPANY_INSIDE(1),
	/**
	 * 第三方厂家
	 */
	COMPANY_THIRD(2),
	/**
	 * 其它
	 */
	OTHER(99);

	private final int code;
	
	ProjectSourceEnum(int code){
		this.code = code;
	}

	public int getProjectSourceCode() {
		return code;
	}

}

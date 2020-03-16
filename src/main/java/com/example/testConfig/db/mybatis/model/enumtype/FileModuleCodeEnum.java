package com.example.testConfig.db.mybatis.model.enumtype;

public enum FileModuleCodeEnum {

	/**
	 * 系统
	 */
	SYSTEM(1),
	/**
	 * 渠道
	 */
	AGENT(2),
	/**
	 * 单位
	 */
	PROJECT(3),
	/**
	 * 片区
	 */
	AREA(4),
	/**
	 * 场所
	 */
	PLACE(5),
	/**
	 * 安装
	 */
	INSTALL(6),
	/**
	 * 设备
	 */
	DEVICE(98),
	/**
	 * 其它
	 */
	OTHER(99);

	private final int fileModelCode;
	
	FileModuleCodeEnum(int fileModelCode){
		this.fileModelCode = fileModelCode;
	}

	public int getFileModelCode() {
		return fileModelCode;
	}

}

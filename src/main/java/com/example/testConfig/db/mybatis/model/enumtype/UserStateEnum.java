package com.example.testConfig.db.mybatis.model.enumtype;

public enum UserStateEnum {

	ALL(-1),
	
	ON_LINE(1),
	
	OUT_LINE(0);
	
	private int code;
	
	UserStateEnum(int code){
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}

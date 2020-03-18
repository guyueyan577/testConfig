package com.zxycloud.autoConfig.db.mybatis.model.permission;

import lombok.Data;

@Data
public class PassWordErrorCount {
	
	private String ip;

	private String userId;
	
	private Integer errorCount; 
}

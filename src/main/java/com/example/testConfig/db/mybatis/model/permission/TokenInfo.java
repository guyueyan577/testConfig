package com.example.testConfig.db.mybatis.model.permission;

import com.example.testConfig.db.mybatis.model.enumtype.RoleCodeEnum;

import lombok.Data;

@Data
public class TokenInfo {
	
	private String tokenId;
	private String userAccount;
	private String userId;
	private RoleCodeEnum roleCodeEnum;
	private Integer roleCode;
	private Integer moduleCode;
	private String bindingId;
	private String agentId;	
	private String projectId;
	private String language;
	private Integer themeId;
	private String copyrightInformation;
}

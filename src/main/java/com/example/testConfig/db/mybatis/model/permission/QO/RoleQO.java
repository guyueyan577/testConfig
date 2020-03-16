package com.example.testConfig.db.mybatis.model.permission.QO;

import java.util.List;

import com.example.testConfig.db.mybatis.model.permission.FunctionMenu;
import com.example.testConfig.db.mybatis.model.projectpermission.PFunctionMenu;

public class RoleQO {
	
	private String roleId;
	
	private Integer roleCode;
	
	private Integer moduleCode;
	
	private String roleName;
	
	private String description;
	
	List<FunctionMenu> functionCodeList;
	List<PFunctionMenu> pFunctionCodeList;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	public Integer getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(Integer roleCode) {
		this.roleCode = roleCode;
	}

	public Integer getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(Integer moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<FunctionMenu> getFunctionCodeList() {
		return functionCodeList;
	}

	public void setFunctionCodeList(List<FunctionMenu> functionCodeList) {
		this.functionCodeList = functionCodeList;
	}

	public List<PFunctionMenu> getpFunctionCodeList() {
		return pFunctionCodeList;
	}

	public void setpFunctionCodeList(List<PFunctionMenu> pFunctionCodeList) {
		this.pFunctionCodeList = pFunctionCodeList;
	}
	
}

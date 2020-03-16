package com.example.testConfig.db.mybatis.model.message;

import com.example.testConfig.db.mybatis.model.biz.ProjectBase;
import com.example.testConfig.db.mybatis.model.biz.ProjectExtend;
import com.example.testConfig.db.mybatis.model.biz.ProjectService;

public class ProjectModel {

	/**
	 * 单位基础
	 */
	private ProjectBase base;
	/**
	 * 单位扩展
	 */
	private ProjectExtend extend;
	
	/**
	 * 服务配置
	 */
	private ProjectService service;

	public ProjectBase getBase() {
		return base;
	}

	public void setBase(ProjectBase base) {
		this.base = base;
	}

	public ProjectExtend getExtend() {
		return extend;
	}

	public void setExtend(ProjectExtend extend) {
		this.extend = extend;
	}

	public ProjectService getService() {
		return service;
	}

	public void setService(ProjectService service) {
		this.service = service;
	}
	
	
}

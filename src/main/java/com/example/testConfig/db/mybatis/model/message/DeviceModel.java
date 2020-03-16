package com.example.testConfig.db.mybatis.model.message;

import com.example.testConfig.db.mybatis.model.biz.DeviceBase;
import com.example.testConfig.db.mybatis.model.biz.DeviceExtend;
import com.example.testConfig.db.mybatis.model.biz.DeviceNet;

public class DeviceModel {

	/**
	 * 设备基本信息
	 */
	private DeviceBase base;
	/**
	 * 设备扩展信息
	 */
	private DeviceExtend extend;
	/**
	 * 设备网络属性
	 */
	private DeviceNet net;
	public DeviceBase getBase() {
		return base;
	}
	public void setBase(DeviceBase base) {
		this.base = base;
	}
	public DeviceExtend getExtend() {
		return extend;
	}
	public void setExtend(DeviceExtend extend) {
		this.extend = extend;
	}
	public DeviceNet getNet() {
		return net;
	}
	public void setNet(DeviceNet net) {
		this.net = net;
	}
	
	
}

package com.zxycloud.autoConfig.db.mybatis.model.message;
/**
 * 状态信息
 * @author anxiaojian
 *
 * @date 2019年2月18日下午6:42:40
 */

import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceStateGroupMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceStateMetadata;

public class StateInfoModel {
	
	/**
	 * 状态信息
	 */
	private DeviceStateMetadata state;
	
	/**
	 * 状态组信息
	 */
	private DeviceStateGroupMetadata stateGroup;

	public DeviceStateMetadata getState() {
		return state;
	}

	public void setState(DeviceStateMetadata state) {
		this.state = state;
	}

	public DeviceStateGroupMetadata getStateGroup() {
		return stateGroup;
	}

	public void setStateGroup(DeviceStateGroupMetadata stateGroup) {
		this.stateGroup = stateGroup;
	}
	
	
}

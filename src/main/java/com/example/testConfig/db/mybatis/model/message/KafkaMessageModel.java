package com.example.testConfig.db.mybatis.model.message;

import com.example.testConfig.db.mybatis.model.assist.DeviceOperateMetadata;
import com.example.testConfig.db.mybatis.model.biz.AreaBase;
import com.example.testConfig.db.mybatis.model.biz.DeviceAttributeSet;
import com.example.testConfig.db.mybatis.model.biz.DeviceCollectInfomation;
import com.example.testConfig.db.mybatis.model.biz.PlaceBase;
import lombok.Data;
import lombok.Getter;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * Kafka 消息队列标准消息体结构
 *
 * @author lvheng
 * 2019-08-09 15:30:16
 */
@Data
public class KafkaMessageModel {

	/*
	 * 消息编码
	 * */
    private String messageId;
    /*
	 * 发生时间
	 * */
    private Long happenTime;
    /*
	 * 接收时间
	 * */
    private Long receiveTime;
    /*
	 * 功能编码
	 * */
    private String functionCode;
    /*
	 * 项目必须你
	 * */
    private ProjectModel projectInfo;
    /*
	 * 片区信息
	 * */
    private AreaBase areaInfo;
    /*
	 * 场所信息
	 * */
    private PlaceBase placeInfo;
    /*
	 * 设备信息
	 * */
    private DeviceModel deviceInfo;
    /*
	 * 状态信息
	 * */
    private StateInfoModel stateInfo;
    /*
	 * 操作信息
	 * */
    private DeviceOperateMetadata operateInfo;
    /*
	 * 采集信息
	 * */
    private List<DeviceCollectInfomation> collectInfo;
    /*
	 * 属性集信息
	 * */
    private List<DeviceAttributeSet> deviceAttributeSetList;
    
    /**
     * 设备事件消息体
     */
    private DeviceEventModel deviceEventInfo;

    public KafkaMessageModel() {
    }

    public KafkaMessageModel(Builder builder) {
        BeanUtils.copyProperties(builder,this);
    }

    @Getter
    public static final class Builder {

        private String messageId;
        private Long happenTime;
        private Long receiveTime;
        private String functionCode;
        private ProjectModel projectInfo;
        private AreaBase areaInfo;
        private PlaceBase placeInfo;
        private DeviceModel deviceInfo;
        private StateInfoModel stateInfo;
        private DeviceOperateMetadata operateInfo;
        private List<DeviceCollectInfomation> collectInfo;
        private DeviceEventModel deviceEventInfo;
        private List<DeviceAttributeSet> deviceAttributeSetList;

        public Builder setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setHappenTime(Long happenTime) {
            this.happenTime = happenTime;
            return this;
        }

        public Builder setReceiveTime(Long receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }

        public Builder setFunctionCode(String functionCode) {
            this.functionCode = functionCode;
            return this;
        }

        public Builder setProjectInfo(ProjectModel projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }

        public Builder setAreaInfo(AreaBase areaInfo) {
            this.areaInfo = areaInfo;
            return this;
        }

        public Builder setPlaceInfo(PlaceBase placeInfo) {
            this.placeInfo = placeInfo;
            return this;
        }

        public Builder setDeviceInfo(DeviceModel deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }

        public Builder setStateInfo(StateInfoModel stateInfo) {
            this.stateInfo = stateInfo;
            return this;
        }

        public Builder setOperateInfo(DeviceOperateMetadata operateInfo) {
            this.operateInfo = operateInfo;
            return this;
        }

        public Builder setCollectInfo(List<DeviceCollectInfomation> collectInfo) {
            this.collectInfo = collectInfo;
            return this;
        }

        public Builder setDeviceEventInfo(DeviceEventModel deviceEventInfo) {
            this.deviceEventInfo = deviceEventInfo;
            return this;
        }
        
        public Builder setDeviceAttributeSetList(List<DeviceAttributeSet> deviceAttributeSetList) {
        	this.deviceAttributeSetList = deviceAttributeSetList;
        	return this;
        }
        
        public KafkaMessageModel build(){
            return new KafkaMessageModel(this);
        }
    }
}
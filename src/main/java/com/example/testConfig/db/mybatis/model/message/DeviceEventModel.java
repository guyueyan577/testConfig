package com.example.testConfig.db.mybatis.model.message;

import lombok.Data;

/**
 * 设备事件信息体
 */
@Data
public class DeviceEventModel {

    /**
     * 设备事件类型码
     * 请参照 device_event_metadata
     */
    private Integer deviceEventType;

    /**
     * 设备事件类型名称
     */
    private String deviceEventName;

    /**
     * 文件url，若有可以填入
     */
    private String fileUrl;

}

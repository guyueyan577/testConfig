package com.zxycloud.autoConfig.configModel;

import lombok.Data;

@Data
public class KafakaConfigModel {
	/**
	 * 服务器，格式：192.168.32.28:9092,192.168.32.29:9092,192.168.32.30:9092
	 */
    private String servers;
    /**
     * 请求失败了可以重试几次
     */
    private Integer retries;
    /**
     * Producer发往同一个Partition的数据数量：分批处理
     */
    private Integer batchSize;
    /**
     * 每次发送消息的延迟时间，以此来聚合更多的Message进行批量发送
     */
    private Integer linger;
    /**
     * 用来缓存数据的内存大小
     */
    private Integer bufferMemory;
}

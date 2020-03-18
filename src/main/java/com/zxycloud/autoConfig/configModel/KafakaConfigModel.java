package com.zxycloud.autoConfig.configModel;

import lombok.Data;

@Data
public class KafakaConfigModel {
    private String servers;
    private Integer retries;
    private Integer batchSize;
    private Integer linger;
    private Integer bufferMemory;
}

package com.zxycloud.autoConfig.configModel;

import lombok.Data;

@Data
public class RedisConfigModel {
    String nodes;
    String password;
    Integer database;
    Integer maxActive;
    Integer maxWait;
    Integer maxIdle;
    Integer minIdledle;
    Integer timeout;
}

package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 公共资源相关常用距离枚举
 */
@Getter
public enum  PublicResourcesDistanceEnum {

    /**
     * 5000 米范围内
     */
    DEFAULT(Double.valueOf(5000d));

    /**
     * 最长距离
     */
    private Double maxDistance;

    PublicResourcesDistanceEnum(Double maxDistance) {
        this.maxDistance = maxDistance;
    }
}

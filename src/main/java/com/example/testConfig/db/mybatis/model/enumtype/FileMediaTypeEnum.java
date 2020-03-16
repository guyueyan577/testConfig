package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 文件类型枚举
 * @author anxiaojian
 *
 * @date 2020年3月13日下午1:54:30
 */
@Getter
public enum FileMediaTypeEnum {
    /**
     * 图片
     */
    IMG("img"),
    /**
     * 视频
     */
    VIDEO("video"),
    /**
     * 音频
     */
    AUDIO("audio"),
    /**
     * 文档
     */
    FILE("file")
    ;
	
    /**
     * 消息分类码
     */
    private String name;

    FileMediaTypeEnum(String name) {
        this.name = name;
    }
}

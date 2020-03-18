package com.zxycloud.autoConfig.db.mybatis.model.biz;

import lombok.Data;

/**
 * 片区基本核心信息
 *
 * @author LvHeng
 * @date 2019年1月24日 上午11:00:25
 */
@Data
public class AreaBaseCore {

	/**
	 * id
	 */
    private String areaId;

    /**
     * 片区名称
     */
    private String areaName;

    /**
     * 子一级类型：0未分配；1片区；2场所
     */
    private Integer subAreaType;

    /**
     * 项目id
     */
    private String projectId;

    /**
     * 父级片区id
     */
    private String parentAreaId;
    
    private String firstLevelAreaId;

    private String secondLevelAreaId;

    private Integer level;
}

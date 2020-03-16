package com.example.testConfig.db.mybatis.model;

import lombok.Data;

/**
 * 基础QO对象
 *
 * @author lvheng
 * 2019-07-09 16:15:39
 */
@Data
public class BasePageQO {

    /**
     * 页码
     */
    private Integer pageIndex;

    /**
     * 分页大小
     */
    private Integer pageSize;

    public BasePageQO() {
        init();
    }

    protected void init() {
        this.pageIndex = 1;
        this.pageSize = 5;
    }
}

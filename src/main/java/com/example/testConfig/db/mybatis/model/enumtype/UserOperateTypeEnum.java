package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 用户操作类型（大类）
 * @author lvheng
 * 2019年3月14日
 */
public enum  UserOperateTypeEnum {
    /**
     * 新增
     */
    ADD(1),
    /**
     * 删除
     */
    DELETE(2),
    /**
     * 修改
     */
    MODIFY(3),
    /**
     * 登录
     */
    LOGIN(4),
    /**
     * 其它
     */
    OTHER(5)
    ;
    private Integer typeCode;

    public Integer getTypeCode() {
        return typeCode;
    }

    UserOperateTypeEnum(Integer typeCode) {
        this.typeCode = typeCode;
    }
}

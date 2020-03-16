package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

/**
 * 消息权限范围绑定关系枚举
 *
 * @author lvheng
 * 2020-3-13 11:16
 */
@Getter
public enum MessagePermissionScopeBindingRelationEnum {
    /**
     * 全部可看
     */
    ALL("all"),
    /**
     * 监管有关联可看
     */
    SUPERVISE("supervise"),
    /**
     * 系统级用户可看
     */
    SYSTEM("system"),
    /**
     * 渠道级用户可看
     */
    AGENT("agent"),
    /**
     * 单位级用户可看
     */
    PROJECT("project"),
    ;

    /**
     * 在表 message_permission_scope 中应对应的名称
     */
    private String name;

    MessagePermissionScopeBindingRelationEnum(String name) {
        this.name = name;
    }
}

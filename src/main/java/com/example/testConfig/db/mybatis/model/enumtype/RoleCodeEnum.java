package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 角色码枚举
 *
 * @author luojie lvheng
 * 2019-06-11 17:12:48
 */
@Getter
@ToString
@AllArgsConstructor
public enum RoleCodeEnum {
    /**
     * 超级管理员
     */
    SUPER_ADMIN(1),
    /**
     * 系统管理员
     */
    SYSTEM_ADMIN(2),
    /**
     * 渠道管理员
     */
    AGENT_MANAGER(21),
    /**
     * 子渠道管理员
     */
    SUBAGENT_MANAGER(22),
    /**
     * 渠道监控员
     */
    CHANNEL_MONITOR(23),
    /**
     * 联网单位主管理员
     */
    PROJECT_MAIN_MANAGER(41),
    /**
     * 联网单位子管理员
     */
    PROJECT_SUB_MANAGER(42),
    /**
     * 监管人员
     */
    PRESENTER(43),
    /**
     * 监管人员（红谷滩）
     */
    SUPERVISOR(44),
    /**
     * 消防队（红谷滩）
     */
    FIRE_BRIGADE(45),
    /**
     * 区域管理员
     */
    REGION_ADMIN(51),
    /**
     * 投屏管理员
     */
    SCREENING_ADMIN(97),
    /**
     * 安装人员
     */
    INSTALLER(98),
    /**
     * 巡查人员
     */
    PATROL_OFFICER(99),

    /**
     * 用户自定义的角色
     */
    USER_DEFINED(666);

    /**
     * 角色码映射枚举Map
     */
    private static final ConcurrentHashMap<Integer, RoleCodeEnum> CODE_TO_ENUM_MAP = new ConcurrentHashMap<>();

    static {
        // 填装现有角色枚举
        CODE_TO_ENUM_MAP.put(SUPER_ADMIN.getRoleTypeCode(), SUPER_ADMIN);
        CODE_TO_ENUM_MAP.put(SYSTEM_ADMIN.getRoleTypeCode(), SYSTEM_ADMIN);
        CODE_TO_ENUM_MAP.put(AGENT_MANAGER.getRoleTypeCode(), AGENT_MANAGER);
        CODE_TO_ENUM_MAP.put(SUBAGENT_MANAGER.getRoleTypeCode(), SUBAGENT_MANAGER);
        CODE_TO_ENUM_MAP.put(CHANNEL_MONITOR.getRoleTypeCode(), CHANNEL_MONITOR);
        CODE_TO_ENUM_MAP.put(PROJECT_MAIN_MANAGER.getRoleTypeCode(), PROJECT_MAIN_MANAGER);
        CODE_TO_ENUM_MAP.put(PROJECT_SUB_MANAGER.getRoleTypeCode(), PROJECT_SUB_MANAGER);
        CODE_TO_ENUM_MAP.put(PRESENTER.getRoleTypeCode(), PRESENTER);
        CODE_TO_ENUM_MAP.put(SUPERVISOR.getRoleTypeCode(), SUPERVISOR);
        CODE_TO_ENUM_MAP.put(FIRE_BRIGADE.getRoleTypeCode(), FIRE_BRIGADE);
        CODE_TO_ENUM_MAP.put(REGION_ADMIN.getRoleTypeCode(), REGION_ADMIN);
        CODE_TO_ENUM_MAP.put(INSTALLER.getRoleTypeCode(), INSTALLER);
        CODE_TO_ENUM_MAP.put(PATROL_OFFICER.getRoleTypeCode(), PATROL_OFFICER);
        CODE_TO_ENUM_MAP.put(SCREENING_ADMIN.getRoleTypeCode(), SCREENING_ADMIN);
    }

    /**
     * 角色类型码
     */
    private final int roleTypeCode;

    /**
     * 通过 roleCode 取得对应枚举
     *
     * @param roleCode 角色码
     * @return
     */
    public static RoleCodeEnum getFromInt(int roleCode) {
        return CODE_TO_ENUM_MAP.getOrDefault(roleCode, RoleCodeEnum.USER_DEFINED);
    }
}

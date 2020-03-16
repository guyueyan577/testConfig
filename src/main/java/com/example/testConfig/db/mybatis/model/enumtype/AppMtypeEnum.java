package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 定义mType类型
 * @author lvheng
 * 2019-07-29 18:58:35
 */
public enum AppMtypeEnum {

	//------------------------------报警类
    /**
     * 火警
     */
	 FIRE("fire"),

    /**
     * 采集模拟量值平均值非法值
     */
    PREFIRE("prefire"),
    /**
     * 故障
     */
    FAULT("fault"),
    /**
     * 屏蔽
     */
    ABNORMAL("abnormal"),
    /**
     * 复位、火警解除
     */
    RESET("reset"),
    
    
    //------------------------------通知类
    /**
     * 新闻
     */
    NEWS("news"),
    /**
     * 隐患通知
     */
    HIDDEN("hidden"),
    /**
     * 监管通知
     */
    RECTIFICATION("rectification"),
    /**
     * 整改通知
     */
    TASK_RECTIFICATION("task_rectification")
    ;
    
	 AppMtypeEnum(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }
    
}

package com.example.testConfig.db.mybatis.model.enumtype;
/**
 * 是否已发布
 * @author anxiaojian
 *
 * @date 2019年4月29日下午2:32:02
 */
public enum PublishState {

	 /**
     * 已发布
     */
    HAS_PUBLISHED(1),
    /**
     * 未发布
     */
    UN_PUBLISHED(0);
    

    private Integer code;

    PublishState(Integer code) {
        this.code = code;
    }

	public Integer getCode() {
		return code;
	}
	
	
}

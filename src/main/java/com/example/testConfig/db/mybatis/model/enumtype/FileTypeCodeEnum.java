package com.example.testConfig.db.mybatis.model.enumtype;

/**
 * 文件类型码枚举
 *
 * @author Anxiaojian
 */
public enum FileTypeCodeEnum {

    /**
     * 资质
     */
    APTITUDE(1),
    /**
     * 营业执照
     */
    BUSINESS_ICENSE(2),

    /**
     * 楼层平面图背景
     */
    FLOOR_PLAN_BG(3),

    /**
     * logo
     */
    LOGO(4),

    /**
     * 设备安装
     */
    DEVICE_INSTALL(5),

    /**
     * 设备报警
     */
    DEVICE_ALARM(6),

    /**
     * 火警复核
     */
    FIRE_REVIEW(9),

    /**
     * 隐患
     */
    HIDDEN(8),

    /**
     * 隐患
     */
    HIDDEN_PROCESS(19),

    /**
     * 巡查隐患
     */
    PATROL_HIDDEN(11),
    /**
     * 摄像头报警
     */
    CAMERA_ALARM(20),
    /**
     * 事件处置
     */
    EVENT_PROCESS(21),
    
    /**
     * 模板文件
     */
    DOCUMENT_TEMPLATE(22);

	
    /**
     * 文件类型编码
     */
    private final int fileTypeCode;

    FileTypeCodeEnum(int fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    public int getFileTypeCode() {
        return fileTypeCode;
    }

}

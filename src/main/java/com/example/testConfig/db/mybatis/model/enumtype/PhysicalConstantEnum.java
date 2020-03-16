package com.example.testConfig.db.mybatis.model.enumtype;

import lombok.Getter;

@Getter
public enum PhysicalConstantEnum {
    /**
     * 珠穆朗玛峰的高度，单位为米
     */
    MOUNT_EVEREST_HEIGHT(8844.43D),
    /**
     * 中国国土面积，单位为平方米
     */
    CHINA_AREA(9600000000000D);

    private Double value;

    PhysicalConstantEnum(Double value) {
        this.value = value;
    }
}

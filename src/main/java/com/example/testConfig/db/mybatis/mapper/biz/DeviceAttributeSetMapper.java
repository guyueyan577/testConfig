package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.DeviceAttributeSet;
import com.example.testConfig.db.mybatis.model.biz.DeviceAttributeSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceAttributeSetMapper {
    long countByExample(DeviceAttributeSetExample example);

    int deleteByExample(DeviceAttributeSetExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceAttributeSet record);

    int insertSelective(DeviceAttributeSet record);

    List<DeviceAttributeSet> selectByExample(DeviceAttributeSetExample example);

    DeviceAttributeSet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceAttributeSet record, @Param("example") DeviceAttributeSetExample example);

    int updateByExample(@Param("record") DeviceAttributeSet record, @Param("example") DeviceAttributeSetExample example);

    int updateByPrimaryKeySelective(DeviceAttributeSet record);

    int updateByPrimaryKey(DeviceAttributeSet record);
}
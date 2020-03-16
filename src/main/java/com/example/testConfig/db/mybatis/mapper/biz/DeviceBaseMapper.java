package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.DeviceBase;
import com.example.testConfig.db.mybatis.model.biz.DeviceBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceBaseMapper {
    long countByExample(DeviceBaseExample example);

    int deleteByExample(DeviceBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceBase record);

    int insertSelective(DeviceBase record);

    List<DeviceBase> selectByExample(DeviceBaseExample example);

    DeviceBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceBase record, @Param("example") DeviceBaseExample example);

    int updateByExample(@Param("record") DeviceBase record, @Param("example") DeviceBaseExample example);

    int updateByPrimaryKeySelective(DeviceBase record);

    int updateByPrimaryKey(DeviceBase record);
}
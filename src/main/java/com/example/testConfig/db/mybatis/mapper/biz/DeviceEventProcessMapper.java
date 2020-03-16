package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.DeviceEventProcess;
import com.example.testConfig.db.mybatis.model.biz.DeviceEventProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceEventProcessMapper {
    long countByExample(DeviceEventProcessExample example);

    int deleteByExample(DeviceEventProcessExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceEventProcess record);

    int insertSelective(DeviceEventProcess record);

    List<DeviceEventProcess> selectByExample(DeviceEventProcessExample example);

    DeviceEventProcess selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceEventProcess record, @Param("example") DeviceEventProcessExample example);

    int updateByExample(@Param("record") DeviceEventProcess record, @Param("example") DeviceEventProcessExample example);

    int updateByPrimaryKeySelective(DeviceEventProcess record);

    int updateByPrimaryKey(DeviceEventProcess record);
}
package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.DeviceCollectInfomation;
import com.example.testConfig.db.mybatis.model.biz.DeviceCollectInfomationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceCollectInfomationMapper {
    long countByExample(DeviceCollectInfomationExample example);

    int deleteByExample(DeviceCollectInfomationExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceCollectInfomation record);

    int insertSelective(DeviceCollectInfomation record);

    List<DeviceCollectInfomation> selectByExample(DeviceCollectInfomationExample example);

    DeviceCollectInfomation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceCollectInfomation record, @Param("example") DeviceCollectInfomationExample example);

    int updateByExample(@Param("record") DeviceCollectInfomation record, @Param("example") DeviceCollectInfomationExample example);

    int updateByPrimaryKeySelective(DeviceCollectInfomation record);

    int updateByPrimaryKey(DeviceCollectInfomation record);
}
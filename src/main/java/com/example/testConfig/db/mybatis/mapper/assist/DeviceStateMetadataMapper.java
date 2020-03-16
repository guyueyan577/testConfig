package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceStateMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceStateMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceStateMetadataMapper {
    long countByExample(DeviceStateMetadataExample example);

    int deleteByExample(DeviceStateMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceStateMetadata record);

    int insertSelective(DeviceStateMetadata record);

    List<DeviceStateMetadata> selectByExample(DeviceStateMetadataExample example);

    DeviceStateMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceStateMetadata record, @Param("example") DeviceStateMetadataExample example);

    int updateByExample(@Param("record") DeviceStateMetadata record, @Param("example") DeviceStateMetadataExample example);

    int updateByPrimaryKeySelective(DeviceStateMetadata record);

    int updateByPrimaryKey(DeviceStateMetadata record);
}
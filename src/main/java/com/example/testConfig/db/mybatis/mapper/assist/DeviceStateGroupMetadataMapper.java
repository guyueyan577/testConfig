package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceStateGroupMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceStateGroupMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceStateGroupMetadataMapper {
    long countByExample(DeviceStateGroupMetadataExample example);

    int deleteByExample(DeviceStateGroupMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceStateGroupMetadata record);

    int insertSelective(DeviceStateGroupMetadata record);

    List<DeviceStateGroupMetadata> selectByExample(DeviceStateGroupMetadataExample example);

    DeviceStateGroupMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceStateGroupMetadata record, @Param("example") DeviceStateGroupMetadataExample example);

    int updateByExample(@Param("record") DeviceStateGroupMetadata record, @Param("example") DeviceStateGroupMetadataExample example);

    int updateByPrimaryKeySelective(DeviceStateGroupMetadata record);

    int updateByPrimaryKey(DeviceStateGroupMetadata record);
}
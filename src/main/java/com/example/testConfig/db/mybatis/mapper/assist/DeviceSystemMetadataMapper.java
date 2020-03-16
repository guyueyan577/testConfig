package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceSystemMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceSystemMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceSystemMetadataMapper {
    long countByExample(DeviceSystemMetadataExample example);

    int deleteByExample(DeviceSystemMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceSystemMetadata record);

    int insertSelective(DeviceSystemMetadata record);

    List<DeviceSystemMetadata> selectByExample(DeviceSystemMetadataExample example);

    DeviceSystemMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceSystemMetadata record, @Param("example") DeviceSystemMetadataExample example);

    int updateByExample(@Param("record") DeviceSystemMetadata record, @Param("example") DeviceSystemMetadataExample example);

    int updateByPrimaryKeySelective(DeviceSystemMetadata record);

    int updateByPrimaryKey(DeviceSystemMetadata record);
}
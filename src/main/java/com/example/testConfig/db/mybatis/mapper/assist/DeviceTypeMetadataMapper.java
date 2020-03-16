package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceTypeMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceTypeMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTypeMetadataMapper {
    long countByExample(DeviceTypeMetadataExample example);

    int deleteByExample(DeviceTypeMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceTypeMetadata record);

    int insertSelective(DeviceTypeMetadata record);

    List<DeviceTypeMetadata> selectByExample(DeviceTypeMetadataExample example);

    DeviceTypeMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceTypeMetadata record, @Param("example") DeviceTypeMetadataExample example);

    int updateByExample(@Param("record") DeviceTypeMetadata record, @Param("example") DeviceTypeMetadataExample example);

    int updateByPrimaryKeySelective(DeviceTypeMetadata record);

    int updateByPrimaryKey(DeviceTypeMetadata record);
}
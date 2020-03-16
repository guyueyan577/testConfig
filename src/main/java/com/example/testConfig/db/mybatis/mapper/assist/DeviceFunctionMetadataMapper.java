package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceFunctionMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceFunctionMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceFunctionMetadataMapper {
    long countByExample(DeviceFunctionMetadataExample example);

    int deleteByExample(DeviceFunctionMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceFunctionMetadata record);

    int insertSelective(DeviceFunctionMetadata record);

    List<DeviceFunctionMetadata> selectByExample(DeviceFunctionMetadataExample example);

    DeviceFunctionMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceFunctionMetadata record, @Param("example") DeviceFunctionMetadataExample example);

    int updateByExample(@Param("record") DeviceFunctionMetadata record, @Param("example") DeviceFunctionMetadataExample example);

    int updateByPrimaryKeySelective(DeviceFunctionMetadata record);

    int updateByPrimaryKey(DeviceFunctionMetadata record);
}
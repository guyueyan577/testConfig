package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceUnitMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceUnitMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceUnitMetadataMapper {
    long countByExample(DeviceUnitMetadataExample example);

    int deleteByExample(DeviceUnitMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceUnitMetadata record);

    int insertSelective(DeviceUnitMetadata record);

    List<DeviceUnitMetadata> selectByExample(DeviceUnitMetadataExample example);

    DeviceUnitMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceUnitMetadata record, @Param("example") DeviceUnitMetadataExample example);

    int updateByExample(@Param("record") DeviceUnitMetadata record, @Param("example") DeviceUnitMetadataExample example);

    int updateByPrimaryKeySelective(DeviceUnitMetadata record);

    int updateByPrimaryKey(DeviceUnitMetadata record);
}
package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceSubSystemMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceSubSystemMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceSubSystemMetadataMapper {
    long countByExample(DeviceSubSystemMetadataExample example);

    int deleteByExample(DeviceSubSystemMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceSubSystemMetadata record);

    int insertSelective(DeviceSubSystemMetadata record);

    List<DeviceSubSystemMetadata> selectByExample(DeviceSubSystemMetadataExample example);

    DeviceSubSystemMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceSubSystemMetadata record, @Param("example") DeviceSubSystemMetadataExample example);

    int updateByExample(@Param("record") DeviceSubSystemMetadata record, @Param("example") DeviceSubSystemMetadataExample example);

    int updateByPrimaryKeySelective(DeviceSubSystemMetadata record);

    int updateByPrimaryKey(DeviceSubSystemMetadata record);
}
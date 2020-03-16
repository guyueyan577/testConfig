package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceAttributeSetValueMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceAttributeSetValueMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceAttributeSetValueMetadataMapper {
    long countByExample(DeviceAttributeSetValueMetadataExample example);

    int deleteByExample(DeviceAttributeSetValueMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceAttributeSetValueMetadata record);

    int insertSelective(DeviceAttributeSetValueMetadata record);

    List<DeviceAttributeSetValueMetadata> selectByExample(DeviceAttributeSetValueMetadataExample example);

    DeviceAttributeSetValueMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceAttributeSetValueMetadata record, @Param("example") DeviceAttributeSetValueMetadataExample example);

    int updateByExample(@Param("record") DeviceAttributeSetValueMetadata record, @Param("example") DeviceAttributeSetValueMetadataExample example);

    int updateByPrimaryKeySelective(DeviceAttributeSetValueMetadata record);

    int updateByPrimaryKey(DeviceAttributeSetValueMetadata record);
}
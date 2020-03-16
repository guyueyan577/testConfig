package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceVendorMetadata;
import com.example.testConfig.db.mybatis.model.assist.DeviceVendorMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceVendorMetadataMapper {
    long countByExample(DeviceVendorMetadataExample example);

    int deleteByExample(DeviceVendorMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceVendorMetadata record);

    int insertSelective(DeviceVendorMetadata record);

    List<DeviceVendorMetadata> selectByExample(DeviceVendorMetadataExample example);

    DeviceVendorMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceVendorMetadata record, @Param("example") DeviceVendorMetadataExample example);

    int updateByExample(@Param("record") DeviceVendorMetadata record, @Param("example") DeviceVendorMetadataExample example);

    int updateByPrimaryKeySelective(DeviceVendorMetadata record);

    int updateByPrimaryKey(DeviceVendorMetadata record);
}
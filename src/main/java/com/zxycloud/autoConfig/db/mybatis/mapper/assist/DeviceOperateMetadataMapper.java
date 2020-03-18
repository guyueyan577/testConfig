package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceOperateMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceOperateMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceOperateMetadataMapper {
    long countByExample(DeviceOperateMetadataExample example);

    int deleteByExample(DeviceOperateMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceOperateMetadata record);

    int insertSelective(DeviceOperateMetadata record);

    List<DeviceOperateMetadata> selectByExample(DeviceOperateMetadataExample example);

    DeviceOperateMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceOperateMetadata record, @Param("example") DeviceOperateMetadataExample example);

    int updateByExample(@Param("record") DeviceOperateMetadata record, @Param("example") DeviceOperateMetadataExample example);

    int updateByPrimaryKeySelective(DeviceOperateMetadata record);

    int updateByPrimaryKey(DeviceOperateMetadata record);
}
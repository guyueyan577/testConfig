package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceEventMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceEventMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceEventMetadataMapper {
    int countByExample(DeviceEventMetadataExample example);

    int deleteByExample(DeviceEventMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceEventMetadata record);

    int insertSelective(DeviceEventMetadata record);

    List<DeviceEventMetadata> selectByExample(DeviceEventMetadataExample example);

    DeviceEventMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceEventMetadata record, @Param("example") DeviceEventMetadataExample example);

    int updateByExample(@Param("record") DeviceEventMetadata record, @Param("example") DeviceEventMetadataExample example);

    int updateByPrimaryKeySelective(DeviceEventMetadata record);

    int updateByPrimaryKey(DeviceEventMetadata record);
}
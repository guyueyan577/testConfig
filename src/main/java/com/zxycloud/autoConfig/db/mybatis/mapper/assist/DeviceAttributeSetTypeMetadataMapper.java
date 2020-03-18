package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceAttributeSetTypeMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceAttributeSetTypeMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceAttributeSetTypeMetadataMapper {
    long countByExample(DeviceAttributeSetTypeMetadataExample example);

    int deleteByExample(DeviceAttributeSetTypeMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceAttributeSetTypeMetadata record);

    int insertSelective(DeviceAttributeSetTypeMetadata record);

    List<DeviceAttributeSetTypeMetadata> selectByExample(DeviceAttributeSetTypeMetadataExample example);

    DeviceAttributeSetTypeMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceAttributeSetTypeMetadata record, @Param("example") DeviceAttributeSetTypeMetadataExample example);

    int updateByExample(@Param("record") DeviceAttributeSetTypeMetadata record, @Param("example") DeviceAttributeSetTypeMetadataExample example);

    int updateByPrimaryKeySelective(DeviceAttributeSetTypeMetadata record);

    int updateByPrimaryKey(DeviceAttributeSetTypeMetadata record);
}
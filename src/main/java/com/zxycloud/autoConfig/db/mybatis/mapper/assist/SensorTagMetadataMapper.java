package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.SensorTagMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.SensorTagMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SensorTagMetadataMapper {
    long countByExample(SensorTagMetadataExample example);

    int deleteByExample(SensorTagMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(SensorTagMetadata record);

    int insertSelective(SensorTagMetadata record);

    List<SensorTagMetadata> selectByExample(SensorTagMetadataExample example);

    SensorTagMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SensorTagMetadata record, @Param("example") SensorTagMetadataExample example);

    int updateByExample(@Param("record") SensorTagMetadata record, @Param("example") SensorTagMetadataExample example);

    int updateByPrimaryKeySelective(SensorTagMetadata record);

    int updateByPrimaryKey(SensorTagMetadata record);
}
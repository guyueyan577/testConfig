package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.AlertProcessMetadata;
import com.example.testConfig.db.mybatis.model.assist.AlertProcessMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlertProcessMetadataMapper {
    long countByExample(AlertProcessMetadataExample example);

    int deleteByExample(AlertProcessMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(AlertProcessMetadata record);

    int insertSelective(AlertProcessMetadata record);

    List<AlertProcessMetadata> selectByExample(AlertProcessMetadataExample example);

    AlertProcessMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AlertProcessMetadata record, @Param("example") AlertProcessMetadataExample example);

    int updateByExample(@Param("record") AlertProcessMetadata record, @Param("example") AlertProcessMetadataExample example);

    int updateByPrimaryKeySelective(AlertProcessMetadata record);

    int updateByPrimaryKey(AlertProcessMetadata record);
}
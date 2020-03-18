package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.PushMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.PushMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushMetadataMapper {
    long countByExample(PushMetadataExample example);

    int deleteByExample(PushMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(PushMetadata record);

    int insertSelective(PushMetadata record);

    List<PushMetadata> selectByExample(PushMetadataExample example);

    PushMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PushMetadata record, @Param("example") PushMetadataExample example);

    int updateByExample(@Param("record") PushMetadata record, @Param("example") PushMetadataExample example);

    int updateByPrimaryKeySelective(PushMetadata record);

    int updateByPrimaryKey(PushMetadata record);
}
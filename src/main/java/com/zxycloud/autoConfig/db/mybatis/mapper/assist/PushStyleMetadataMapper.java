package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.PushStyleMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.PushStyleMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushStyleMetadataMapper {
    long countByExample(PushStyleMetadataExample example);

    int deleteByExample(PushStyleMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(PushStyleMetadata record);

    int insertSelective(PushStyleMetadata record);

    List<PushStyleMetadata> selectByExample(PushStyleMetadataExample example);

    PushStyleMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PushStyleMetadata record, @Param("example") PushStyleMetadataExample example);

    int updateByExample(@Param("record") PushStyleMetadata record, @Param("example") PushStyleMetadataExample example);

    int updateByPrimaryKeySelective(PushStyleMetadata record);

    int updateByPrimaryKey(PushStyleMetadata record);
}
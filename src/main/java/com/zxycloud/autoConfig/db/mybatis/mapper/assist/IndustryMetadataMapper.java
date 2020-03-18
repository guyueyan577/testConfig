package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.IndustryMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.IndustryMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryMetadataMapper {
    long countByExample(IndustryMetadataExample example);

    int deleteByExample(IndustryMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(IndustryMetadata record);

    int insertSelective(IndustryMetadata record);

    List<IndustryMetadata> selectByExample(IndustryMetadataExample example);

    IndustryMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IndustryMetadata record, @Param("example") IndustryMetadataExample example);

    int updateByExample(@Param("record") IndustryMetadata record, @Param("example") IndustryMetadataExample example);

    int updateByPrimaryKeySelective(IndustryMetadata record);

    int updateByPrimaryKey(IndustryMetadata record);
}
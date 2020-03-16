package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.AdviceCategoryMetadata;
import com.example.testConfig.db.mybatis.model.assist.AdviceCategoryMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdviceCategoryMetadataMapper {
    long countByExample(AdviceCategoryMetadataExample example);

    int deleteByExample(AdviceCategoryMetadataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdviceCategoryMetadata record);

    int insertSelective(AdviceCategoryMetadata record);

    List<AdviceCategoryMetadata> selectByExample(AdviceCategoryMetadataExample example);

    AdviceCategoryMetadata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdviceCategoryMetadata record, @Param("example") AdviceCategoryMetadataExample example);

    int updateByExample(@Param("record") AdviceCategoryMetadata record, @Param("example") AdviceCategoryMetadataExample example);

    int updateByPrimaryKeySelective(AdviceCategoryMetadata record);

    int updateByPrimaryKey(AdviceCategoryMetadata record);
}
package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.CityMetadata;
import com.example.testConfig.db.mybatis.model.assist.CityMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMetadataMapper {
    long countByExample(CityMetadataExample example);

    int deleteByExample(CityMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(CityMetadata record);

    int insertSelective(CityMetadata record);

    List<CityMetadata> selectByExample(CityMetadataExample example);

    CityMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CityMetadata record, @Param("example") CityMetadataExample example);

    int updateByExample(@Param("record") CityMetadata record, @Param("example") CityMetadataExample example);

    int updateByPrimaryKeySelective(CityMetadata record);

    int updateByPrimaryKey(CityMetadata record);
}
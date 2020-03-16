package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.SuperviseTypeMetadata;
import com.example.testConfig.db.mybatis.model.assist.SuperviseTypeMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperviseTypeMetadataMapper {
    long countByExample(SuperviseTypeMetadataExample example);

    int deleteByExample(SuperviseTypeMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(SuperviseTypeMetadata record);

    int insertSelective(SuperviseTypeMetadata record);

    List<SuperviseTypeMetadata> selectByExample(SuperviseTypeMetadataExample example);

    SuperviseTypeMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SuperviseTypeMetadata record, @Param("example") SuperviseTypeMetadataExample example);

    int updateByExample(@Param("record") SuperviseTypeMetadata record, @Param("example") SuperviseTypeMetadataExample example);

    int updateByPrimaryKeySelective(SuperviseTypeMetadata record);

    int updateByPrimaryKey(SuperviseTypeMetadata record);
}
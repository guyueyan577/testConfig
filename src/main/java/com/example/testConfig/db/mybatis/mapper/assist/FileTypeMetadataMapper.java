package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.FileTypeMetadata;
import com.example.testConfig.db.mybatis.model.assist.FileTypeMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileTypeMetadataMapper {
    long countByExample(FileTypeMetadataExample example);

    int deleteByExample(FileTypeMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(FileTypeMetadata record);

    int insertSelective(FileTypeMetadata record);

    List<FileTypeMetadata> selectByExample(FileTypeMetadataExample example);

    FileTypeMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FileTypeMetadata record, @Param("example") FileTypeMetadataExample example);

    int updateByExample(@Param("record") FileTypeMetadata record, @Param("example") FileTypeMetadataExample example);

    int updateByPrimaryKeySelective(FileTypeMetadata record);

    int updateByPrimaryKey(FileTypeMetadata record);
}
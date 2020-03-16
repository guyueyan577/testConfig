package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.ProjectTypeMetadata;
import com.example.testConfig.db.mybatis.model.assist.ProjectTypeMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectTypeMetadataMapper {
    long countByExample(ProjectTypeMetadataExample example);

    int deleteByExample(ProjectTypeMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectTypeMetadata record);

    int insertSelective(ProjectTypeMetadata record);

    List<ProjectTypeMetadata> selectByExample(ProjectTypeMetadataExample example);

    ProjectTypeMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectTypeMetadata record, @Param("example") ProjectTypeMetadataExample example);

    int updateByExample(@Param("record") ProjectTypeMetadata record, @Param("example") ProjectTypeMetadataExample example);

    int updateByPrimaryKeySelective(ProjectTypeMetadata record);

    int updateByPrimaryKey(ProjectTypeMetadata record);
}
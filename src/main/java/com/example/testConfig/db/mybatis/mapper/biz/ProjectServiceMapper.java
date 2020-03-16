package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.ProjectService;
import com.example.testConfig.db.mybatis.model.biz.ProjectServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectServiceMapper {
    long countByExample(ProjectServiceExample example);

    int deleteByExample(ProjectServiceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectService record);

    int insertSelective(ProjectService record);

    List<ProjectService> selectByExample(ProjectServiceExample example);

    ProjectService selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectService record, @Param("example") ProjectServiceExample example);

    int updateByExample(@Param("record") ProjectService record, @Param("example") ProjectServiceExample example);

    int updateByPrimaryKeySelective(ProjectService record);

    int updateByPrimaryKey(ProjectService record);
}
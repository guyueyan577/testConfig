package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.ProjectCopyright;
import com.example.testConfig.db.mybatis.model.biz.ProjectCopyrightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectCopyrightMapper {
    long countByExample(ProjectCopyrightExample example);

    int deleteByExample(ProjectCopyrightExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectCopyright record);

    int insertSelective(ProjectCopyright record);

    List<ProjectCopyright> selectByExample(ProjectCopyrightExample example);

    ProjectCopyright selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectCopyright record, @Param("example") ProjectCopyrightExample example);

    int updateByExample(@Param("record") ProjectCopyright record, @Param("example") ProjectCopyrightExample example);

    int updateByPrimaryKeySelective(ProjectCopyright record);

    int updateByPrimaryKey(ProjectCopyright record);
}
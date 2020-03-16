package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.ProjectReport;
import com.example.testConfig.db.mybatis.model.biz.ProjectReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectReportMapper {
    long countByExample(ProjectReportExample example);

    int deleteByExample(ProjectReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectReport record);

    int insertSelective(ProjectReport record);

    List<ProjectReport> selectByExample(ProjectReportExample example);

    ProjectReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectReport record, @Param("example") ProjectReportExample example);

    int updateByExample(@Param("record") ProjectReport record, @Param("example") ProjectReportExample example);

    int updateByPrimaryKeySelective(ProjectReport record);

    int updateByPrimaryKey(ProjectReport record);
}
package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.ProjectExtend;
import com.example.testConfig.db.mybatis.model.biz.ProjectExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectExtendMapper {
    long countByExample(ProjectExtendExample example);

    int deleteByExample(ProjectExtendExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectExtend record);

    int insertSelective(ProjectExtend record);

    List<ProjectExtend> selectByExample(ProjectExtendExample example);

    ProjectExtend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectExtend record, @Param("example") ProjectExtendExample example);

    int updateByExample(@Param("record") ProjectExtend record, @Param("example") ProjectExtendExample example);

    int updateByPrimaryKeySelective(ProjectExtend record);

    int updateByPrimaryKey(ProjectExtend record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.ProjectBase;
import com.zxycloud.autoConfig.db.mybatis.model.biz.ProjectBaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectBaseMapper {
    long countByExample(ProjectBaseExample example);

    int deleteByExample(ProjectBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectBase record);

    int insertSelective(ProjectBase record);

    List<ProjectBase> selectByExample(ProjectBaseExample example);
    
    ProjectBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectBase record, @Param("example") ProjectBaseExample example);

    int updateByExample(@Param("record") ProjectBase record, @Param("example") ProjectBaseExample example);

    int updateByPrimaryKeySelective(ProjectBase record);

    int updateByPrimaryKey(ProjectBase record);
    
    //获取指定条件且上级单位名称固定的单位列表
    List<ProjectBase> selectByExampleAndSuperUnitName(@Param("example") ProjectBaseExample example, @Param("superUnitName") String superUnitName);

    List<String> selectIdListByExample(ProjectBaseExample example);
}
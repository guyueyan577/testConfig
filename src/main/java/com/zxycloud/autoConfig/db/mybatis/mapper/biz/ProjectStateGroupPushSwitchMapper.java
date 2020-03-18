package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.ProjectStateGroupPushSwitch;
import com.zxycloud.autoConfig.db.mybatis.model.biz.ProjectStateGroupPushSwitchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectStateGroupPushSwitchMapper {
    long countByExample(ProjectStateGroupPushSwitchExample example);

    int deleteByExample(ProjectStateGroupPushSwitchExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectStateGroupPushSwitch record);

    int insertSelective(ProjectStateGroupPushSwitch record);

    List<ProjectStateGroupPushSwitch> selectByExample(ProjectStateGroupPushSwitchExample example);

    ProjectStateGroupPushSwitch selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectStateGroupPushSwitch record, @Param("example") ProjectStateGroupPushSwitchExample example);

    int updateByExample(@Param("record") ProjectStateGroupPushSwitch record, @Param("example") ProjectStateGroupPushSwitchExample example);

    int updateByPrimaryKeySelective(ProjectStateGroupPushSwitch record);

    int updateByPrimaryKey(ProjectStateGroupPushSwitch record);
}
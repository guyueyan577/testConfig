package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.TaskAccessory;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.TaskAccessoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskAccessoryMapper {
    long countByExample(TaskAccessoryExample example);

    int deleteByExample(TaskAccessoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(TaskAccessory record);

    int insertSelective(TaskAccessory record);

    List<TaskAccessory> selectByExample(TaskAccessoryExample example);

    TaskAccessory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TaskAccessory record, @Param("example") TaskAccessoryExample example);

    int updateByExample(@Param("record") TaskAccessory record, @Param("example") TaskAccessoryExample example);

    int updateByPrimaryKeySelective(TaskAccessory record);

    int updateByPrimaryKey(TaskAccessory record);
}
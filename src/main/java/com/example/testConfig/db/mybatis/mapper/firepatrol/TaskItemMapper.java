package com.example.testConfig.db.mybatis.mapper.firepatrol;

import com.example.testConfig.db.mybatis.model.firepatrol.TaskItem;
import com.example.testConfig.db.mybatis.model.firepatrol.TaskItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskItemMapper {
    long countByExample(TaskItemExample example);

    int deleteByExample(TaskItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(TaskItem record);

    int insertSelective(TaskItem record);

    List<TaskItem> selectByExample(TaskItemExample example);

    TaskItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TaskItem record, @Param("example") TaskItemExample example);

    int updateByExample(@Param("record") TaskItem record, @Param("example") TaskItemExample example);

    int updateByPrimaryKeySelective(TaskItem record);

    int updateByPrimaryKey(TaskItem record);
}
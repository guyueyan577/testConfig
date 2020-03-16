package com.example.testConfig.db.mybatis.mapper.firepatrol;

import com.example.testConfig.db.mybatis.model.firepatrol.TaskPoint;
import com.example.testConfig.db.mybatis.model.firepatrol.TaskPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskPointMapper {
    long countByExample(TaskPointExample example);

    int deleteByExample(TaskPointExample example);

    int deleteByPrimaryKey(String id);

    int insert(TaskPoint record);

    int insertSelective(TaskPoint record);

    List<TaskPoint> selectByExample(TaskPointExample example);

    TaskPoint selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TaskPoint record, @Param("example") TaskPointExample example);

    int updateByExample(@Param("record") TaskPoint record, @Param("example") TaskPointExample example);

    int updateByPrimaryKeySelective(TaskPoint record);

    int updateByPrimaryKey(TaskPoint record);
}
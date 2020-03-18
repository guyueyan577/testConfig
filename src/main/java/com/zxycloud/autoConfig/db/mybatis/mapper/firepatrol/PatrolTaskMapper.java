package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolTask;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatrolTaskMapper {
    long countByExample(PatrolTaskExample example);

    int deleteByExample(PatrolTaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatrolTask record);

    int insertSelective(PatrolTask record);

    List<PatrolTask> selectByExample(PatrolTaskExample example);

    PatrolTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatrolTask record, @Param("example") PatrolTaskExample example);

    int updateByExample(@Param("record") PatrolTask record, @Param("example") PatrolTaskExample example);

    int updateByPrimaryKeySelective(PatrolTask record);

    int updateByPrimaryKey(PatrolTask record);
}
package com.example.testConfig.db.mybatis.mapper.firepatrol;

import com.example.testConfig.db.mybatis.model.firepatrol.PatrolItem;
import com.example.testConfig.db.mybatis.model.firepatrol.PatrolItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatrolItemMapper {
    long countByExample(PatrolItemExample example);

    int deleteByExample(PatrolItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatrolItem record);

    int insertSelective(PatrolItem record);

    List<PatrolItem> selectByExample(PatrolItemExample example);

    PatrolItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatrolItem record, @Param("example") PatrolItemExample example);

    int updateByExample(@Param("record") PatrolItem record, @Param("example") PatrolItemExample example);

    int updateByPrimaryKeySelective(PatrolItem record);

    int updateByPrimaryKey(PatrolItem record);
}
package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.AgentBase;
import com.example.testConfig.db.mybatis.model.biz.AgentBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentBaseMapper {
    long countByExample(AgentBaseExample example);

    int deleteByExample(AgentBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(AgentBase record);

    int insertSelective(AgentBase record);

    List<AgentBase> selectByExample(AgentBaseExample example);

    AgentBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AgentBase record, @Param("example") AgentBaseExample example);

    int updateByExample(@Param("record") AgentBase record, @Param("example") AgentBaseExample example);

    int updateByPrimaryKeySelective(AgentBase record);

    int updateByPrimaryKey(AgentBase record);
}
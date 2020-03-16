package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.SystemConfigConstValue;
import com.example.testConfig.db.mybatis.model.assist.SystemConfigConstValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemConfigConstValueMapper {
    long countByExample(SystemConfigConstValueExample example);

    int deleteByExample(SystemConfigConstValueExample example);

    int deleteByPrimaryKey(String id);

    int insert(SystemConfigConstValue record);

    int insertSelective(SystemConfigConstValue record);

    List<SystemConfigConstValue> selectByExample(SystemConfigConstValueExample example);

    SystemConfigConstValue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SystemConfigConstValue record, @Param("example") SystemConfigConstValueExample example);

    int updateByExample(@Param("record") SystemConfigConstValue record, @Param("example") SystemConfigConstValueExample example);

    int updateByPrimaryKeySelective(SystemConfigConstValue record);

    int updateByPrimaryKey(SystemConfigConstValue record);
}
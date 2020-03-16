package com.example.testConfig.db.mybatis.mapper.firepatrol;

import com.example.testConfig.db.mybatis.model.firepatrol.PatrolTypeMenu;
import com.example.testConfig.db.mybatis.model.firepatrol.PatrolTypeMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatrolTypeMenuMapper {
    long countByExample(PatrolTypeMenuExample example);

    int deleteByExample(PatrolTypeMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatrolTypeMenu record);

    int insertSelective(PatrolTypeMenu record);

    List<PatrolTypeMenu> selectByExample(PatrolTypeMenuExample example);

    PatrolTypeMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatrolTypeMenu record, @Param("example") PatrolTypeMenuExample example);

    int updateByExample(@Param("record") PatrolTypeMenu record, @Param("example") PatrolTypeMenuExample example);

    int updateByPrimaryKeySelective(PatrolTypeMenu record);

    int updateByPrimaryKey(PatrolTypeMenu record);
}
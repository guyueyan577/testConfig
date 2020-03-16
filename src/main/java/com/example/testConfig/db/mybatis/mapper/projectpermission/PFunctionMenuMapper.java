package com.example.testConfig.db.mybatis.mapper.projectpermission;

import com.example.testConfig.db.mybatis.model.projectpermission.PFunctionMenu;
import com.example.testConfig.db.mybatis.model.projectpermission.PFunctionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PFunctionMenuMapper {
    long countByExample(PFunctionMenuExample example);

    int deleteByExample(PFunctionMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(PFunctionMenu record);

    int insertSelective(PFunctionMenu record);

    List<PFunctionMenu> selectByExample(PFunctionMenuExample example);

    PFunctionMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PFunctionMenu record, @Param("example") PFunctionMenuExample example);

    int updateByExample(@Param("record") PFunctionMenu record, @Param("example") PFunctionMenuExample example);

    int updateByPrimaryKeySelective(PFunctionMenu record);

    int updateByPrimaryKey(PFunctionMenu record);
}
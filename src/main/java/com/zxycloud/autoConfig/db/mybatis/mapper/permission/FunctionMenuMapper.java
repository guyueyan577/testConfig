package com.zxycloud.autoConfig.db.mybatis.mapper.permission;

import com.zxycloud.autoConfig.db.mybatis.model.permission.FunctionMenu;
import com.zxycloud.autoConfig.db.mybatis.model.permission.FunctionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionMenuMapper {
    long countByExample(FunctionMenuExample example);

    int deleteByExample(FunctionMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(FunctionMenu record);

    int insertSelective(FunctionMenu record);

    List<FunctionMenu> selectByExample(FunctionMenuExample example);

    FunctionMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FunctionMenu record, @Param("example") FunctionMenuExample example);

    int updateByExample(@Param("record") FunctionMenu record, @Param("example") FunctionMenuExample example);

    int updateByPrimaryKeySelective(FunctionMenu record);

    int updateByPrimaryKey(FunctionMenu record);
}
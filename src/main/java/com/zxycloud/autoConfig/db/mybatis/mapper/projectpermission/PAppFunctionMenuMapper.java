package com.zxycloud.autoConfig.db.mybatis.mapper.projectpermission;

import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PAppFunctionMenu;
import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PAppFunctionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PAppFunctionMenuMapper {
    long countByExample(PAppFunctionMenuExample example);

    int deleteByExample(PAppFunctionMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(PAppFunctionMenu record);

    int insertSelective(PAppFunctionMenu record);

    List<PAppFunctionMenu> selectByExample(PAppFunctionMenuExample example);

    PAppFunctionMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PAppFunctionMenu record, @Param("example") PAppFunctionMenuExample example);

    int updateByExample(@Param("record") PAppFunctionMenu record, @Param("example") PAppFunctionMenuExample example);

    int updateByPrimaryKeySelective(PAppFunctionMenu record);

    int updateByPrimaryKey(PAppFunctionMenu record);
}
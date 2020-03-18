package com.zxycloud.autoConfig.db.mybatis.mapper.projectpermission;

import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PRoleFunction;
import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRoleFunctionMapper {
    long countByExample(PRoleFunctionExample example);

    int deleteByExample(PRoleFunctionExample example);

    int deleteByPrimaryKey(String id);

    int insert(PRoleFunction record);

    int insertSelective(PRoleFunction record);

    List<PRoleFunction> selectByExample(PRoleFunctionExample example);

    PRoleFunction selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PRoleFunction record, @Param("example") PRoleFunctionExample example);

    int updateByExample(@Param("record") PRoleFunction record, @Param("example") PRoleFunctionExample example);

    int updateByPrimaryKeySelective(PRoleFunction record);

    int updateByPrimaryKey(PRoleFunction record);
}
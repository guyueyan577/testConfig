package com.zxycloud.autoConfig.db.mybatis.mapper.permission;

import com.zxycloud.autoConfig.db.mybatis.model.permission.RoleFunction;
import com.zxycloud.autoConfig.db.mybatis.model.permission.RoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleFunctionMapper {
    long countByExample(RoleFunctionExample example);

    int deleteByExample(RoleFunctionExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);

    List<RoleFunction> selectByExample(RoleFunctionExample example);

    RoleFunction selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleFunction record, @Param("example") RoleFunctionExample example);

    int updateByExample(@Param("record") RoleFunction record, @Param("example") RoleFunctionExample example);

    int updateByPrimaryKeySelective(RoleFunction record);

    int updateByPrimaryKey(RoleFunction record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.permission;

import com.zxycloud.autoConfig.db.mybatis.model.permission.UserOperateLog;
import com.zxycloud.autoConfig.db.mybatis.model.permission.UserOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOperateLogMapper {
    long countByExample(UserOperateLogExample example);

    int deleteByExample(UserOperateLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserOperateLog record);

    int insertSelective(UserOperateLog record);

    List<UserOperateLog> selectByExample(UserOperateLogExample example);

    UserOperateLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserOperateLog record, @Param("example") UserOperateLogExample example);

    int updateByExample(@Param("record") UserOperateLog record, @Param("example") UserOperateLogExample example);

    int updateByPrimaryKeySelective(UserOperateLog record);

    int updateByPrimaryKey(UserOperateLog record);
}
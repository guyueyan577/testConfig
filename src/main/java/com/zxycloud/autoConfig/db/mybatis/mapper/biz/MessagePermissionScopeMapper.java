package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.MessagePermissionScope;
import com.zxycloud.autoConfig.db.mybatis.model.biz.MessagePermissionScopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessagePermissionScopeMapper {
    long countByExample(MessagePermissionScopeExample example);

    int deleteByExample(MessagePermissionScopeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MessagePermissionScope record);

    int insertSelective(MessagePermissionScope record);

    List<MessagePermissionScope> selectByExample(MessagePermissionScopeExample example);

    MessagePermissionScope selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MessagePermissionScope record, @Param("example") MessagePermissionScopeExample example);

    int updateByExample(@Param("record") MessagePermissionScope record, @Param("example") MessagePermissionScopeExample example);

    int updateByPrimaryKeySelective(MessagePermissionScope record);

    int updateByPrimaryKey(MessagePermissionScope record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.UserOperateLogTemplate;
import com.zxycloud.autoConfig.db.mybatis.model.assist.UserOperateLogTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOperateLogTemplateMapper {
    long countByExample(UserOperateLogTemplateExample example);

    int deleteByExample(UserOperateLogTemplateExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserOperateLogTemplate record);

    int insertSelective(UserOperateLogTemplate record);

    List<UserOperateLogTemplate> selectByExample(UserOperateLogTemplateExample example);

    UserOperateLogTemplate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserOperateLogTemplate record, @Param("example") UserOperateLogTemplateExample example);

    int updateByExample(@Param("record") UserOperateLogTemplate record, @Param("example") UserOperateLogTemplateExample example);

    int updateByPrimaryKeySelective(UserOperateLogTemplate record);

    int updateByPrimaryKey(UserOperateLogTemplate record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.AppPushUser;
import com.zxycloud.autoConfig.db.mybatis.model.biz.AppPushUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppPushUserMapper {
    long countByExample(AppPushUserExample example);

    int deleteByExample(AppPushUserExample example);

    int deleteByPrimaryKey(String tokenId);

    int insert(AppPushUser record);

    int insertSelective(AppPushUser record);

    List<AppPushUser> selectByExample(AppPushUserExample example);

    AppPushUser selectByPrimaryKey(String tokenId);

    int updateByExampleSelective(@Param("record") AppPushUser record, @Param("example") AppPushUserExample example);

    int updateByExample(@Param("record") AppPushUser record, @Param("example") AppPushUserExample example);

    int updateByPrimaryKeySelective(AppPushUser record);

    int updateByPrimaryKey(AppPushUser record);
}
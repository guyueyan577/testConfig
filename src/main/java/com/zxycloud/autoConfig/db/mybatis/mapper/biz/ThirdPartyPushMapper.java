package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.ThirdPartyPush;
import com.zxycloud.autoConfig.db.mybatis.model.biz.ThirdPartyPushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdPartyPushMapper {
    long countByExample(ThirdPartyPushExample example);

    int deleteByExample(ThirdPartyPushExample example);

    int deleteByPrimaryKey(String projectGuid);

    int insert(ThirdPartyPush record);

    int insertSelective(ThirdPartyPush record);

    List<ThirdPartyPush> selectByExample(ThirdPartyPushExample example);

    ThirdPartyPush selectByPrimaryKey(String projectGuid);

    int updateByExampleSelective(@Param("record") ThirdPartyPush record, @Param("example") ThirdPartyPushExample example);

    int updateByExample(@Param("record") ThirdPartyPush record, @Param("example") ThirdPartyPushExample example);

    int updateByPrimaryKeySelective(ThirdPartyPush record);

    int updateByPrimaryKey(ThirdPartyPush record);
}
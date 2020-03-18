package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PublishMsg;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PublishMsgExample;

public interface PublishMsgMapper {
    long countByExample(PublishMsgExample example);

    int deleteByExample(PublishMsgExample example);

    int deleteByPrimaryKey(String id);

    int insert(PublishMsg record);

    int insertSelective(PublishMsg record);

    List<PublishMsg> selectByExampleWithBLOBs(PublishMsgExample example);

    List<PublishMsg> selectByExample(PublishMsgExample example);

    PublishMsg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PublishMsg record, @Param("example") PublishMsgExample example);

    int updateByExampleWithBLOBs(@Param("record") PublishMsg record, @Param("example") PublishMsgExample example);

    int updateByExample(@Param("record") PublishMsg record, @Param("example") PublishMsgExample example);

    int updateByPrimaryKeySelective(PublishMsg record);

    int updateByPrimaryKeyWithBLOBs(PublishMsg record);

    int updateByPrimaryKey(PublishMsg record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PublishCheckTaskInfo;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PublishCheckTaskInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishCheckTaskInfoMapper {
    long countByExample(PublishCheckTaskInfoExample example);

    int deleteByExample(PublishCheckTaskInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(PublishCheckTaskInfo record);

    int insertSelective(PublishCheckTaskInfo record);

    List<PublishCheckTaskInfo> selectByExample(PublishCheckTaskInfoExample example);

    PublishCheckTaskInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PublishCheckTaskInfo record, @Param("example") PublishCheckTaskInfoExample example);

    int updateByExample(@Param("record") PublishCheckTaskInfo record, @Param("example") PublishCheckTaskInfoExample example);

    int updateByPrimaryKeySelective(PublishCheckTaskInfo record);

    int updateByPrimaryKey(PublishCheckTaskInfo record);
}
package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.SmsRlianMetadata;
import com.example.testConfig.db.mybatis.model.assist.SmsRlianMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsRlianMetadataMapper {
    long countByExample(SmsRlianMetadataExample example);

    int deleteByExample(SmsRlianMetadataExample example);

    int deleteByPrimaryKey(Integer rlianSmsTemplateid);

    int insert(SmsRlianMetadata record);

    int insertSelective(SmsRlianMetadata record);

    List<SmsRlianMetadata> selectByExample(SmsRlianMetadataExample example);

    SmsRlianMetadata selectByPrimaryKey(Integer rlianSmsTemplateid);

    int updateByExampleSelective(@Param("record") SmsRlianMetadata record, @Param("example") SmsRlianMetadataExample example);

    int updateByExample(@Param("record") SmsRlianMetadata record, @Param("example") SmsRlianMetadataExample example);

    int updateByPrimaryKeySelective(SmsRlianMetadata record);

    int updateByPrimaryKey(SmsRlianMetadata record);
}
package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.MsgFromMetadata;
import com.example.testConfig.db.mybatis.model.assist.MsgFromMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgFromMetadataMapper {
    long countByExample(MsgFromMetadataExample example);

    int deleteByExample(MsgFromMetadataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgFromMetadata record);

    int insertSelective(MsgFromMetadata record);

    List<MsgFromMetadata> selectByExample(MsgFromMetadataExample example);

    MsgFromMetadata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsgFromMetadata record, @Param("example") MsgFromMetadataExample example);

    int updateByExample(@Param("record") MsgFromMetadata record, @Param("example") MsgFromMetadataExample example);

    int updateByPrimaryKeySelective(MsgFromMetadata record);

    int updateByPrimaryKey(MsgFromMetadata record);
}
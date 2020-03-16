package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.MsgLevelMetadata;
import com.example.testConfig.db.mybatis.model.assist.MsgLevelMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgLevelMetadataMapper {
    long countByExample(MsgLevelMetadataExample example);

    int deleteByExample(MsgLevelMetadataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgLevelMetadata record);

    int insertSelective(MsgLevelMetadata record);

    List<MsgLevelMetadata> selectByExample(MsgLevelMetadataExample example);

    MsgLevelMetadata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsgLevelMetadata record, @Param("example") MsgLevelMetadataExample example);

    int updateByExample(@Param("record") MsgLevelMetadata record, @Param("example") MsgLevelMetadataExample example);

    int updateByPrimaryKeySelective(MsgLevelMetadata record);

    int updateByPrimaryKey(MsgLevelMetadata record);
}
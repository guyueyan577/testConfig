package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.MsgTypeMetadata;
import com.example.testConfig.db.mybatis.model.assist.MsgTypeMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgTypeMetadataMapper {
    long countByExample(MsgTypeMetadataExample example);

    int deleteByExample(MsgTypeMetadataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgTypeMetadata record);

    int insertSelective(MsgTypeMetadata record);

    List<MsgTypeMetadata> selectByExample(MsgTypeMetadataExample example);

    MsgTypeMetadata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsgTypeMetadata record, @Param("example") MsgTypeMetadataExample example);

    int updateByExample(@Param("record") MsgTypeMetadata record, @Param("example") MsgTypeMetadataExample example);

    int updateByPrimaryKeySelective(MsgTypeMetadata record);

    int updateByPrimaryKey(MsgTypeMetadata record);
}
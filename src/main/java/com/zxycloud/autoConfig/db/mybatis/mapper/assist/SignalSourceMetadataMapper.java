package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.SignalSourceMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.SignalSourceMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignalSourceMetadataMapper {
    long countByExample(SignalSourceMetadataExample example);

    int deleteByExample(SignalSourceMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(SignalSourceMetadata record);

    int insertSelective(SignalSourceMetadata record);

    List<SignalSourceMetadata> selectByExample(SignalSourceMetadataExample example);

    SignalSourceMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SignalSourceMetadata record, @Param("example") SignalSourceMetadataExample example);

    int updateByExample(@Param("record") SignalSourceMetadata record, @Param("example") SignalSourceMetadataExample example);

    int updateByPrimaryKeySelective(SignalSourceMetadata record);

    int updateByPrimaryKey(SignalSourceMetadata record);
}
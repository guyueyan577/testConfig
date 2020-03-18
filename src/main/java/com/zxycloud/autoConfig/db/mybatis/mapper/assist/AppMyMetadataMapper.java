package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.AppMyMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.AppMyMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppMyMetadataMapper {
    long countByExample(AppMyMetadataExample example);

    int deleteByExample(AppMyMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppMyMetadata record);

    int insertSelective(AppMyMetadata record);

    List<AppMyMetadata> selectByExample(AppMyMetadataExample example);

    AppMyMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppMyMetadata record, @Param("example") AppMyMetadataExample example);

    int updateByExample(@Param("record") AppMyMetadata record, @Param("example") AppMyMetadataExample example);

    int updateByPrimaryKeySelective(AppMyMetadata record);

    int updateByPrimaryKey(AppMyMetadata record);
}
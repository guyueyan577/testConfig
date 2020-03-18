package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.AppTypeMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.AppTypeMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppTypeMetadataMapper {
    long countByExample(AppTypeMetadataExample example);

    int deleteByExample(AppTypeMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppTypeMetadata record);

    int insertSelective(AppTypeMetadata record);

    List<AppTypeMetadata> selectByExample(AppTypeMetadataExample example);

    AppTypeMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppTypeMetadata record, @Param("example") AppTypeMetadataExample example);

    int updateByExample(@Param("record") AppTypeMetadata record, @Param("example") AppTypeMetadataExample example);

    int updateByPrimaryKeySelective(AppTypeMetadata record);

    int updateByPrimaryKey(AppTypeMetadata record);
}
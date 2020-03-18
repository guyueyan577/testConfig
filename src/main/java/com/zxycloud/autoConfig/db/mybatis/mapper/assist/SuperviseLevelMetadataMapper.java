package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.SuperviseLevelMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.SuperviseLevelMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperviseLevelMetadataMapper {
    long countByExample(SuperviseLevelMetadataExample example);

    int deleteByExample(SuperviseLevelMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(SuperviseLevelMetadata record);

    int insertSelective(SuperviseLevelMetadata record);

    List<SuperviseLevelMetadata> selectByExample(SuperviseLevelMetadataExample example);

    SuperviseLevelMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SuperviseLevelMetadata record, @Param("example") SuperviseLevelMetadataExample example);

    int updateByExample(@Param("record") SuperviseLevelMetadata record, @Param("example") SuperviseLevelMetadataExample example);

    int updateByPrimaryKeySelective(SuperviseLevelMetadata record);

    int updateByPrimaryKey(SuperviseLevelMetadata record);
}
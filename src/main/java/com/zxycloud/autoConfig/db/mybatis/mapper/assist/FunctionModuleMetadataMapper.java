package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.FunctionModuleMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.FunctionModuleMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionModuleMetadataMapper {
    long countByExample(FunctionModuleMetadataExample example);

    int deleteByExample(FunctionModuleMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(FunctionModuleMetadata record);

    int insertSelective(FunctionModuleMetadata record);

    List<FunctionModuleMetadata> selectByExample(FunctionModuleMetadataExample example);

    FunctionModuleMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FunctionModuleMetadata record, @Param("example") FunctionModuleMetadataExample example);

    int updateByExample(@Param("record") FunctionModuleMetadata record, @Param("example") FunctionModuleMetadataExample example);

    int updateByPrimaryKeySelective(FunctionModuleMetadata record);

    int updateByPrimaryKey(FunctionModuleMetadata record);
}
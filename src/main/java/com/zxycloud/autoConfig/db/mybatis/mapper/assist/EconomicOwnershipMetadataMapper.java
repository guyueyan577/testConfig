package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.EconomicOwnershipMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.EconomicOwnershipMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EconomicOwnershipMetadataMapper {
    long countByExample(EconomicOwnershipMetadataExample example);

    int deleteByExample(EconomicOwnershipMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(EconomicOwnershipMetadata record);

    int insertSelective(EconomicOwnershipMetadata record);

    List<EconomicOwnershipMetadata> selectByExample(EconomicOwnershipMetadataExample example);

    EconomicOwnershipMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") EconomicOwnershipMetadata record, @Param("example") EconomicOwnershipMetadataExample example);

    int updateByExample(@Param("record") EconomicOwnershipMetadata record, @Param("example") EconomicOwnershipMetadataExample example);

    int updateByPrimaryKeySelective(EconomicOwnershipMetadata record);

    int updateByPrimaryKey(EconomicOwnershipMetadata record);
}
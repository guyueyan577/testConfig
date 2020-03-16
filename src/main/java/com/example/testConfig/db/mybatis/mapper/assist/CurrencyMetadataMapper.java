package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.CurrencyMetadata;
import com.example.testConfig.db.mybatis.model.assist.CurrencyMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrencyMetadataMapper {
    long countByExample(CurrencyMetadataExample example);

    int deleteByExample(CurrencyMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(CurrencyMetadata record);

    int insertSelective(CurrencyMetadata record);

    List<CurrencyMetadata> selectByExample(CurrencyMetadataExample example);

    CurrencyMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CurrencyMetadata record, @Param("example") CurrencyMetadataExample example);

    int updateByExample(@Param("record") CurrencyMetadata record, @Param("example") CurrencyMetadataExample example);

    int updateByPrimaryKeySelective(CurrencyMetadata record);

    int updateByPrimaryKey(CurrencyMetadata record);
}
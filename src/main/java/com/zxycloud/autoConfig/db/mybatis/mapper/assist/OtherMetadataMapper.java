package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.OtherMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.OtherMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherMetadataMapper {
    long countByExample(OtherMetadataExample example);

    int deleteByExample(OtherMetadataExample example);

    int deleteByPrimaryKey(String guid);

    int insert(OtherMetadata record);

    int insertSelective(OtherMetadata record);

    List<OtherMetadata> selectByExample(OtherMetadataExample example);

    OtherMetadata selectByPrimaryKey(String guid);

    int updateByExampleSelective(@Param("record") OtherMetadata record, @Param("example") OtherMetadataExample example);

    int updateByExample(@Param("record") OtherMetadata record, @Param("example") OtherMetadataExample example);

    int updateByPrimaryKeySelective(OtherMetadata record);

    int updateByPrimaryKey(OtherMetadata record);
}
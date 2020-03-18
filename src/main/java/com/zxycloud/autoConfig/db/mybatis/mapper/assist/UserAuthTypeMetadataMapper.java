package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.UserAuthTypeMetadata;
import com.zxycloud.autoConfig.db.mybatis.model.assist.UserAuthTypeMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthTypeMetadataMapper {
    long countByExample(UserAuthTypeMetadataExample example);

    int deleteByExample(UserAuthTypeMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserAuthTypeMetadata record);

    int insertSelective(UserAuthTypeMetadata record);

    List<UserAuthTypeMetadata> selectByExample(UserAuthTypeMetadataExample example);

    UserAuthTypeMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserAuthTypeMetadata record, @Param("example") UserAuthTypeMetadataExample example);

    int updateByExample(@Param("record") UserAuthTypeMetadata record, @Param("example") UserAuthTypeMetadataExample example);

    int updateByPrimaryKeySelective(UserAuthTypeMetadata record);

    int updateByPrimaryKey(UserAuthTypeMetadata record);
}
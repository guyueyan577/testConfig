package com.example.testConfig.db.mybatis.mapper.permission;

import com.example.testConfig.db.mybatis.model.permission.UserThirdAccount;
import com.example.testConfig.db.mybatis.model.permission.UserThirdAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserThirdAccountMapper {
    long countByExample(UserThirdAccountExample example);

    int deleteByExample(UserThirdAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserThirdAccount record);

    int insertSelective(UserThirdAccount record);

    List<UserThirdAccount> selectByExample(UserThirdAccountExample example);

    UserThirdAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserThirdAccount record, @Param("example") UserThirdAccountExample example);

    int updateByExample(@Param("record") UserThirdAccount record, @Param("example") UserThirdAccountExample example);

    int updateByPrimaryKeySelective(UserThirdAccount record);

    int updateByPrimaryKey(UserThirdAccount record);
}
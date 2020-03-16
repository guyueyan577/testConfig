package com.example.testConfig.db.mybatis.mapper.permission;

import com.example.testConfig.db.mybatis.model.permission.ApiAppkeyList;
import com.example.testConfig.db.mybatis.model.permission.ApiAppkeyListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiAppkeyListMapper {
    long countByExample(ApiAppkeyListExample example);

    int deleteByExample(ApiAppkeyListExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApiAppkeyList record);

    int insertSelective(ApiAppkeyList record);

    List<ApiAppkeyList> selectByExample(ApiAppkeyListExample example);

    ApiAppkeyList selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApiAppkeyList record, @Param("example") ApiAppkeyListExample example);

    int updateByExample(@Param("record") ApiAppkeyList record, @Param("example") ApiAppkeyListExample example);

    int updateByPrimaryKeySelective(ApiAppkeyList record);

    int updateByPrimaryKey(ApiAppkeyList record);
}
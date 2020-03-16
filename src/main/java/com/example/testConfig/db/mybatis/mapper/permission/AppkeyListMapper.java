package com.example.testConfig.db.mybatis.mapper.permission;

import com.example.testConfig.db.mybatis.model.permission.AppkeyList;
import com.example.testConfig.db.mybatis.model.permission.AppkeyListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppkeyListMapper {
    long countByExample(AppkeyListExample example);

    int deleteByExample(AppkeyListExample example);

    int deleteByPrimaryKey(String appkey);

    int insert(AppkeyList record);

    int insertSelective(AppkeyList record);

    List<AppkeyList> selectByExampleWithBLOBs(AppkeyListExample example);

    List<AppkeyList> selectByExample(AppkeyListExample example);

    AppkeyList selectByPrimaryKey(String appkey);

    int updateByExampleSelective(@Param("record") AppkeyList record, @Param("example") AppkeyListExample example);

    int updateByExampleWithBLOBs(@Param("record") AppkeyList record, @Param("example") AppkeyListExample example);

    int updateByExample(@Param("record") AppkeyList record, @Param("example") AppkeyListExample example);

    int updateByPrimaryKeySelective(AppkeyList record);

    int updateByPrimaryKeyWithBLOBs(AppkeyList record);

    int updateByPrimaryKey(AppkeyList record);
}
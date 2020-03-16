package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.UserPlace;
import com.example.testConfig.db.mybatis.model.biz.UserPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPlaceMapper {
    long countByExample(UserPlaceExample example);

    int deleteByExample(UserPlaceExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserPlace record);

    int insertSelective(UserPlace record);

    List<UserPlace> selectByExample(UserPlaceExample example);

    UserPlace selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserPlace record, @Param("example") UserPlaceExample example);

    int updateByExample(@Param("record") UserPlace record, @Param("example") UserPlaceExample example);

    int updateByPrimaryKeySelective(UserPlace record);

    int updateByPrimaryKey(UserPlace record);
}
package com.example.testConfig.db.mybatis.mapper.permission;

import com.example.testConfig.db.mybatis.model.permission.UserBase;
import com.example.testConfig.db.mybatis.model.permission.UserBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBaseMapper {
    long countByExample(UserBaseExample example);

    int deleteByExample(UserBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserBase record);

    int insertSelective(UserBase record);

    List<UserBase> selectByExample(UserBaseExample example);

    UserBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserBase record, @Param("example") UserBaseExample example);

    int updateByExample(@Param("record") UserBase record, @Param("example") UserBaseExample example);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);
    
	/**
	 * 根据userId获取其父级用户信息
	 * 
	 * @param userId 用户id
	 * @return 父级用户信息
	 */
	UserBase selectParentUser(String userId);
}
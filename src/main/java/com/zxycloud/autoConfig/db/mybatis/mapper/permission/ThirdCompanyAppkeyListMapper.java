package com.zxycloud.autoConfig.db.mybatis.mapper.permission;

import com.zxycloud.autoConfig.db.mybatis.model.permission.ThirdCompanyAppkeyList;
import com.zxycloud.autoConfig.db.mybatis.model.permission.ThirdCompanyAppkeyListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdCompanyAppkeyListMapper {
    long countByExample(ThirdCompanyAppkeyListExample example);

    int deleteByExample(ThirdCompanyAppkeyListExample example);

    int deleteByPrimaryKey(String id);

    int insert(ThirdCompanyAppkeyList record);

    int insertSelective(ThirdCompanyAppkeyList record);

    List<ThirdCompanyAppkeyList> selectByExample(ThirdCompanyAppkeyListExample example);

    ThirdCompanyAppkeyList selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ThirdCompanyAppkeyList record, @Param("example") ThirdCompanyAppkeyListExample example);

    int updateByExample(@Param("record") ThirdCompanyAppkeyList record, @Param("example") ThirdCompanyAppkeyListExample example);

    int updateByPrimaryKeySelective(ThirdCompanyAppkeyList record);

    int updateByPrimaryKey(ThirdCompanyAppkeyList record);
}
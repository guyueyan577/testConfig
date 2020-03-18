package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.ManageCompany;
import com.zxycloud.autoConfig.db.mybatis.model.assist.ManageCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageCompanyMapper {
    long countByExample(ManageCompanyExample example);

    int deleteByExample(ManageCompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(ManageCompany record);

    int insertSelective(ManageCompany record);

    List<ManageCompany> selectByExample(ManageCompanyExample example);

    ManageCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ManageCompany record, @Param("example") ManageCompanyExample example);

    int updateByExample(@Param("record") ManageCompany record, @Param("example") ManageCompanyExample example);

    int updateByPrimaryKeySelective(ManageCompany record);

    int updateByPrimaryKey(ManageCompany record);
}
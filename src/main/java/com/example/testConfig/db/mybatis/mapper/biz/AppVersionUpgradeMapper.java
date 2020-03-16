package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.AppVersionUpgrade;
import com.example.testConfig.db.mybatis.model.biz.AppVersionUpgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppVersionUpgradeMapper {
    long countByExample(AppVersionUpgradeExample example);

    int deleteByExample(AppVersionUpgradeExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppVersionUpgrade record);

    int insertSelective(AppVersionUpgrade record);

    List<AppVersionUpgrade> selectByExampleWithBLOBs(AppVersionUpgradeExample example);

    List<AppVersionUpgrade> selectByExample(AppVersionUpgradeExample example);

    AppVersionUpgrade selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppVersionUpgrade record, @Param("example") AppVersionUpgradeExample example);

    int updateByExampleWithBLOBs(@Param("record") AppVersionUpgrade record, @Param("example") AppVersionUpgradeExample example);

    int updateByExample(@Param("record") AppVersionUpgrade record, @Param("example") AppVersionUpgradeExample example);

    int updateByPrimaryKeySelective(AppVersionUpgrade record);

    int updateByPrimaryKeyWithBLOBs(AppVersionUpgrade record);

    int updateByPrimaryKey(AppVersionUpgrade record);
}
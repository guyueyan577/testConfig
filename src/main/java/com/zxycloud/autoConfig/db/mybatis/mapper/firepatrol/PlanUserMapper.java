package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PlanUser;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PlanUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanUserMapper {
    long countByExample(PlanUserExample example);

    int deleteByExample(PlanUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(PlanUser record);

    int insertSelective(PlanUser record);

    List<PlanUser> selectByExample(PlanUserExample example);

    PlanUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PlanUser record, @Param("example") PlanUserExample example);

    int updateByExample(@Param("record") PlanUser record, @Param("example") PlanUserExample example);

    int updateByPrimaryKeySelective(PlanUser record);

    int updateByPrimaryKey(PlanUser record);
}
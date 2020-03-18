package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PlanTypeMenu;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PlanTypeMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanTypeMenuMapper {
    long countByExample(PlanTypeMenuExample example);

    int deleteByExample(PlanTypeMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlanTypeMenu record);

    int insertSelective(PlanTypeMenu record);

    List<PlanTypeMenu> selectByExample(PlanTypeMenuExample example);

    PlanTypeMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlanTypeMenu record, @Param("example") PlanTypeMenuExample example);

    int updateByExample(@Param("record") PlanTypeMenu record, @Param("example") PlanTypeMenuExample example);

    int updateByPrimaryKeySelective(PlanTypeMenu record);

    int updateByPrimaryKey(PlanTypeMenu record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolPlan;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolPlanExample;

public interface PatrolPlanMapper {
	long countByExample(PatrolPlanExample example);

	int deleteByExample(PatrolPlanExample example);

	int deleteByPrimaryKey(String id);

	int insert(PatrolPlan record);

	int insertSelective(PatrolPlan record);

	List<PatrolPlan> selectByExample(PatrolPlanExample example);

	PatrolPlan selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") PatrolPlan record, @Param("example") PatrolPlanExample example);

	int updateByExample(@Param("record") PatrolPlan record, @Param("example") PatrolPlanExample example);

	int updateByPrimaryKeySelective(PatrolPlan record);

	int updateByPrimaryKey(PatrolPlan record);
}
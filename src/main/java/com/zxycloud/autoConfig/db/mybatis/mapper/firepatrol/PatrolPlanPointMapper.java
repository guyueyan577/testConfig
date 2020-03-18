package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolPlanPoint;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolPlanPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatrolPlanPointMapper {
    long countByExample(PatrolPlanPointExample example);

    int deleteByExample(PatrolPlanPointExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatrolPlanPoint record);

    int insertSelective(PatrolPlanPoint record);

    List<PatrolPlanPoint> selectByExample(PatrolPlanPointExample example);

    PatrolPlanPoint selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatrolPlanPoint record, @Param("example") PatrolPlanPointExample example);

    int updateByExample(@Param("record") PatrolPlanPoint record, @Param("example") PatrolPlanPointExample example);

    int updateByPrimaryKeySelective(PatrolPlanPoint record);

    int updateByPrimaryKey(PatrolPlanPoint record);
}
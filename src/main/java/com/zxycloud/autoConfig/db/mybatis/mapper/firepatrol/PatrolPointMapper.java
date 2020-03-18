package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolPoint;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatrolPointMapper {
    long countByExample(PatrolPointExample example);

    int deleteByExample(PatrolPointExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatrolPoint record);

    int insertSelective(PatrolPoint record);

    List<PatrolPoint> selectByExample(PatrolPointExample example);

    PatrolPoint selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatrolPoint record, @Param("example") PatrolPointExample example);

    int updateByExample(@Param("record") PatrolPoint record, @Param("example") PatrolPointExample example);

    int updateByPrimaryKeySelective(PatrolPoint record);

    int updateByPrimaryKey(PatrolPoint record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolPointItems;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.PatrolPointItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatrolPointItemsMapper {
    long countByExample(PatrolPointItemsExample example);

    int deleteByExample(PatrolPointItemsExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatrolPointItems record);

    int insertSelective(PatrolPointItems record);

    List<PatrolPointItems> selectByExample(PatrolPointItemsExample example);

    PatrolPointItems selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatrolPointItems record, @Param("example") PatrolPointItemsExample example);

    int updateByExample(@Param("record") PatrolPointItems record, @Param("example") PatrolPointItemsExample example);

    int updateByPrimaryKeySelective(PatrolPointItems record);

    int updateByPrimaryKey(PatrolPointItems record);
}
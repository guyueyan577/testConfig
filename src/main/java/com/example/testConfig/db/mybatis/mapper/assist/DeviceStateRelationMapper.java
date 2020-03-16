package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.DeviceStateRelation;
import com.example.testConfig.db.mybatis.model.assist.DeviceStateRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceStateRelationMapper {
    long countByExample(DeviceStateRelationExample example);

    int deleteByExample(DeviceStateRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceStateRelation record);

    int insertSelective(DeviceStateRelation record);

    List<DeviceStateRelation> selectByExample(DeviceStateRelationExample example);

    DeviceStateRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceStateRelation record, @Param("example") DeviceStateRelationExample example);

    int updateByExample(@Param("record") DeviceStateRelation record, @Param("example") DeviceStateRelationExample example);

    int updateByPrimaryKeySelective(DeviceStateRelation record);

    int updateByPrimaryKey(DeviceStateRelation record);
}
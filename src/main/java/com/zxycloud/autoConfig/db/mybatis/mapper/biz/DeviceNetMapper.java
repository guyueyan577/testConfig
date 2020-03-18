package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.DeviceNet;
import com.zxycloud.autoConfig.db.mybatis.model.biz.DeviceNetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceNetMapper {
    long countByExample(DeviceNetExample example);

    int deleteByExample(DeviceNetExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceNet record);

    int insertSelective(DeviceNet record);

    List<DeviceNet> selectByExample(DeviceNetExample example);

    DeviceNet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceNet record, @Param("example") DeviceNetExample example);

    int updateByExample(@Param("record") DeviceNet record, @Param("example") DeviceNetExample example);

    int updateByPrimaryKeySelective(DeviceNet record);

    int updateByPrimaryKey(DeviceNet record);
}
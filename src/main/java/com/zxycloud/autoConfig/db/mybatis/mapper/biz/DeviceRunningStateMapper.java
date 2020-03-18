package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.DeviceRunningState;
import com.zxycloud.autoConfig.db.mybatis.model.biz.DeviceRunningStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceRunningStateMapper {
    long countByExample(DeviceRunningStateExample example);

    int deleteByExample(DeviceRunningStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceRunningState record);

    int insertSelective(DeviceRunningState record);

    List<DeviceRunningState> selectByExample(DeviceRunningStateExample example);

    DeviceRunningState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceRunningState record, @Param("example") DeviceRunningStateExample example);

    int updateByExample(@Param("record") DeviceRunningState record, @Param("example") DeviceRunningStateExample example);

    int updateByPrimaryKeySelective(DeviceRunningState record);

    int updateByPrimaryKey(DeviceRunningState record);
}
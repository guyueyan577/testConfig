package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceRunningLog;
import com.zxycloud.autoConfig.db.mybatis.model.assist.DeviceRunningLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceRunningLogMapper {
    int countByExample(DeviceRunningLogExample example);

    int deleteByExample(DeviceRunningLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceRunningLog record);

    int insertSelective(DeviceRunningLog record);

    List<DeviceRunningLog> selectByExample(DeviceRunningLogExample example);

    DeviceRunningLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceRunningLog record, @Param("example") DeviceRunningLogExample example);

    int updateByExample(@Param("record") DeviceRunningLog record, @Param("example") DeviceRunningLogExample example);

    int updateByPrimaryKeySelective(DeviceRunningLog record);

    int updateByPrimaryKey(DeviceRunningLog record);
}
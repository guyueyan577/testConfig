package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.DeviceEventRecord;
import com.zxycloud.autoConfig.db.mybatis.model.biz.DeviceEventRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceEventRecordMapper {
    long countByExample(DeviceEventRecordExample example);

    int deleteByExample(DeviceEventRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceEventRecord record);

    int insertSelective(DeviceEventRecord record);

    List<DeviceEventRecord> selectByExample(DeviceEventRecordExample example);

    DeviceEventRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceEventRecord record, @Param("example") DeviceEventRecordExample example);

    int updateByExample(@Param("record") DeviceEventRecord record, @Param("example") DeviceEventRecordExample example);

    int updateByPrimaryKeySelective(DeviceEventRecord record);

    int updateByPrimaryKey(DeviceEventRecord record);
}
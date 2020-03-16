package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.DeviceFaultRecord;
import com.example.testConfig.db.mybatis.model.biz.DeviceFaultRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceFaultRecordMapper {
    long countByExample(DeviceFaultRecordExample example);

    int deleteByExample(DeviceFaultRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceFaultRecord record);

    int insertSelective(DeviceFaultRecord record);

    List<DeviceFaultRecord> selectByExample(DeviceFaultRecordExample example);

    DeviceFaultRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceFaultRecord record, @Param("example") DeviceFaultRecordExample example);

    int updateByExample(@Param("record") DeviceFaultRecord record, @Param("example") DeviceFaultRecordExample example);

    int updateByPrimaryKeySelective(DeviceFaultRecord record);

    int updateByPrimaryKey(DeviceFaultRecord record);
}
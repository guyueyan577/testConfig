package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.MalRecord;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.MalRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MalRecordMapper {
    long countByExample(MalRecordExample example);

    int deleteByExample(MalRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(MalRecord record);

    int insertSelective(MalRecord record);

    List<MalRecord> selectByExample(MalRecordExample example);

    MalRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MalRecord record, @Param("example") MalRecordExample example);

    int updateByExample(@Param("record") MalRecord record, @Param("example") MalRecordExample example);

    int updateByPrimaryKeySelective(MalRecord record);

    int updateByPrimaryKey(MalRecord record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PushMethodRecord;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PushMethodRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushMethodRecordMapper {
    long countByExample(PushMethodRecordExample example);

    int deleteByExample(PushMethodRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(PushMethodRecord record);

    int insertSelective(PushMethodRecord record);

    List<PushMethodRecord> selectByExample(PushMethodRecordExample example);

    PushMethodRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PushMethodRecord record, @Param("example") PushMethodRecordExample example);

    int updateByExample(@Param("record") PushMethodRecord record, @Param("example") PushMethodRecordExample example);

    int updateByPrimaryKeySelective(PushMethodRecord record);

    int updateByPrimaryKey(PushMethodRecord record);
}
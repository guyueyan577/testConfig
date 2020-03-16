package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.AuditRecord;
import com.example.testConfig.db.mybatis.model.biz.AuditRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditRecordMapper {
    long countByExample(AuditRecordExample example);

    int deleteByExample(AuditRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuditRecord record);

    int insertSelective(AuditRecord record);

    List<AuditRecord> selectByExample(AuditRecordExample example);

    AuditRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuditRecord record, @Param("example") AuditRecordExample example);

    int updateByExample(@Param("record") AuditRecord record, @Param("example") AuditRecordExample example);

    int updateByPrimaryKeySelective(AuditRecord record);

    int updateByPrimaryKey(AuditRecord record);
}
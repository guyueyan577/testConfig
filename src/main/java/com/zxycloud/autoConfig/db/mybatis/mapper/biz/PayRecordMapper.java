package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PayRecord;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PayRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayRecordMapper {
    long countByExample(PayRecordExample example);

    int deleteByExample(PayRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(PayRecord record);

    int insertSelective(PayRecord record);

    List<PayRecord> selectByExample(PayRecordExample example);

    PayRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByExample(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByPrimaryKeySelective(PayRecord record);

    int updateByPrimaryKey(PayRecord record);
}
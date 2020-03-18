package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.HiddenRecord;
import com.zxycloud.autoConfig.db.mybatis.model.biz.HiddenRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiddenRecordMapper {
    long countByExample(HiddenRecordExample example);

    int deleteByExample(HiddenRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(HiddenRecord record);

    int insertSelective(HiddenRecord record);

    List<HiddenRecord> selectByExample(HiddenRecordExample example);

    HiddenRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HiddenRecord record, @Param("example") HiddenRecordExample example);

    int updateByExample(@Param("record") HiddenRecord record, @Param("example") HiddenRecordExample example);

    int updateByPrimaryKeySelective(HiddenRecord record);

    int updateByPrimaryKey(HiddenRecord record);
}
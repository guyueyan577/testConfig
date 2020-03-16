package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.AlarmProcess;
import com.example.testConfig.db.mybatis.model.biz.AlarmProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmProcessMapper {
    long countByExample(AlarmProcessExample example);

    int deleteByExample(AlarmProcessExample example);

    int deleteByPrimaryKey(String id);

    int insert(AlarmProcess record);

    int insertSelective(AlarmProcess record);

    List<AlarmProcess> selectByExample(AlarmProcessExample example);

    AlarmProcess selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AlarmProcess record, @Param("example") AlarmProcessExample example);

    int updateByExample(@Param("record") AlarmProcess record, @Param("example") AlarmProcessExample example);

    int updateByPrimaryKeySelective(AlarmProcess record);

    int updateByPrimaryKey(AlarmProcess record);
}
package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.Pushrecord;
import com.example.testConfig.db.mybatis.model.biz.PushrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushrecordMapper {
    int countByExample(PushrecordExample example);

    int deleteByExample(PushrecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Pushrecord record);

    int insertSelective(Pushrecord record);

    List<Pushrecord> selectByExample(PushrecordExample example);

    Pushrecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Pushrecord record, @Param("example") PushrecordExample example);

    int updateByExample(@Param("record") Pushrecord record, @Param("example") PushrecordExample example);

    int updateByPrimaryKeySelective(Pushrecord record);

    int updateByPrimaryKey(Pushrecord record);
}
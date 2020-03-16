package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.HiddenProcess;
import com.example.testConfig.db.mybatis.model.biz.HiddenProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HiddenProcessMapper {
    long countByExample(HiddenProcessExample example);

    int deleteByExample(HiddenProcessExample example);

    int deleteByPrimaryKey(String id);

    int insert(HiddenProcess record);

    int insertSelective(HiddenProcess record);

    List<HiddenProcess> selectByExample(HiddenProcessExample example);

    HiddenProcess selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HiddenProcess record, @Param("example") HiddenProcessExample example);

    int updateByExample(@Param("record") HiddenProcess record, @Param("example") HiddenProcessExample example);

    int updateByPrimaryKeySelective(HiddenProcess record);

    int updateByPrimaryKey(HiddenProcess record);
}
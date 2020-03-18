package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.ChargesBase;
import com.zxycloud.autoConfig.db.mybatis.model.assist.ChargesBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargesBaseMapper {
    long countByExample(ChargesBaseExample example);

    int deleteByExample(ChargesBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChargesBase record);

    int insertSelective(ChargesBase record);

    List<ChargesBase> selectByExample(ChargesBaseExample example);

    ChargesBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChargesBase record, @Param("example") ChargesBaseExample example);

    int updateByExample(@Param("record") ChargesBase record, @Param("example") ChargesBaseExample example);

    int updateByPrimaryKeySelective(ChargesBase record);

    int updateByPrimaryKey(ChargesBase record);
}
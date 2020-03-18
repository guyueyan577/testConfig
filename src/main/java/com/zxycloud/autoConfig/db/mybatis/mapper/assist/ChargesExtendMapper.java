package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.ChargesExtend;
import com.zxycloud.autoConfig.db.mybatis.model.assist.ChargesExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargesExtendMapper {
    long countByExample(ChargesExtendExample example);

    int deleteByExample(ChargesExtendExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChargesExtend record);

    int insertSelective(ChargesExtend record);

    List<ChargesExtend> selectByExample(ChargesExtendExample example);

    ChargesExtend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChargesExtend record, @Param("example") ChargesExtendExample example);

    int updateByExample(@Param("record") ChargesExtend record, @Param("example") ChargesExtendExample example);

    int updateByPrimaryKeySelective(ChargesExtend record);

    int updateByPrimaryKey(ChargesExtend record);
}
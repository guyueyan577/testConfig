package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.PlaceBase;
import com.example.testConfig.db.mybatis.model.biz.PlaceBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceBaseMapper {
    long countByExample(PlaceBaseExample example);

    int deleteByExample(PlaceBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(PlaceBase record);

    int insertSelective(PlaceBase record);

    List<PlaceBase> selectByExample(PlaceBaseExample example);

    PlaceBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PlaceBase record, @Param("example") PlaceBaseExample example);

    int updateByExample(@Param("record") PlaceBase record, @Param("example") PlaceBaseExample example);

    int updateByPrimaryKeySelective(PlaceBase record);

    int updateByPrimaryKey(PlaceBase record);
}
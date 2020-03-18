package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.AreaBase;
import com.zxycloud.autoConfig.db.mybatis.model.biz.AreaBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaBaseMapper {
    long countByExample(AreaBaseExample example);

    int deleteByExample(AreaBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(AreaBase record);

    int insertSelective(AreaBase record);

    List<AreaBase> selectByExample(AreaBaseExample example);

    AreaBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AreaBase record, @Param("example") AreaBaseExample example);

    int updateByExample(@Param("record") AreaBase record, @Param("example") AreaBaseExample example);

    int updateByPrimaryKeySelective(AreaBase record);

    int updateByPrimaryKey(AreaBase record);
}
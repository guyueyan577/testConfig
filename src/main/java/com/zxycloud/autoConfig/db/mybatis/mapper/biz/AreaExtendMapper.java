package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.AreaExtend;
import com.zxycloud.autoConfig.db.mybatis.model.biz.AreaExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaExtendMapper {
    long countByExample(AreaExtendExample example);

    int deleteByExample(AreaExtendExample example);

    int deleteByPrimaryKey(String id);

    int insert(AreaExtend record);

    int insertSelective(AreaExtend record);

    List<AreaExtend> selectByExample(AreaExtendExample example);

    AreaExtend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AreaExtend record, @Param("example") AreaExtendExample example);

    int updateByExample(@Param("record") AreaExtend record, @Param("example") AreaExtendExample example);

    int updateByPrimaryKeySelective(AreaExtend record);

    int updateByPrimaryKey(AreaExtend record);
}
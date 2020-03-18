package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PlaceLinkman;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PlaceLinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceLinkmanMapper {
    long countByExample(PlaceLinkmanExample example);

    int deleteByExample(PlaceLinkmanExample example);

    int deleteByPrimaryKey(String id);

    int insert(PlaceLinkman record);

    int insertSelective(PlaceLinkman record);

    List<PlaceLinkman> selectByExample(PlaceLinkmanExample example);

    PlaceLinkman selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PlaceLinkman record, @Param("example") PlaceLinkmanExample example);

    int updateByExample(@Param("record") PlaceLinkman record, @Param("example") PlaceLinkmanExample example);

    int updateByPrimaryKeySelective(PlaceLinkman record);

    int updateByPrimaryKey(PlaceLinkman record);
}
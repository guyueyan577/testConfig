package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PlaceDisturb;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PlaceDisturbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceDisturbMapper {
    long countByExample(PlaceDisturbExample example);

    int deleteByExample(PlaceDisturbExample example);

    int deleteByPrimaryKey(String id);

    int insert(PlaceDisturb record);

    int insertSelective(PlaceDisturb record);

    List<PlaceDisturb> selectByExample(PlaceDisturbExample example);

    PlaceDisturb selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PlaceDisturb record, @Param("example") PlaceDisturbExample example);

    int updateByExample(@Param("record") PlaceDisturb record, @Param("example") PlaceDisturbExample example);

    int updateByPrimaryKeySelective(PlaceDisturb record);

    int updateByPrimaryKey(PlaceDisturb record);
}
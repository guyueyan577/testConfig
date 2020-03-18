package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.CardTypeMenu;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.CardTypeMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardTypeMenuMapper {
    long countByExample(CardTypeMenuExample example);

    int deleteByExample(CardTypeMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CardTypeMenu record);

    int insertSelective(CardTypeMenu record);

    List<CardTypeMenu> selectByExample(CardTypeMenuExample example);

    CardTypeMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CardTypeMenu record, @Param("example") CardTypeMenuExample example);

    int updateByExample(@Param("record") CardTypeMenu record, @Param("example") CardTypeMenuExample example);

    int updateByPrimaryKeySelective(CardTypeMenu record);

    int updateByPrimaryKey(CardTypeMenu record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.EquTypeMenu;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.EquTypeMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquTypeMenuMapper {
    long countByExample(EquTypeMenuExample example);

    int deleteByExample(EquTypeMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EquTypeMenu record);

    int insertSelective(EquTypeMenu record);

    List<EquTypeMenu> selectByExample(EquTypeMenuExample example);

    EquTypeMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EquTypeMenu record, @Param("example") EquTypeMenuExample example);

    int updateByExample(@Param("record") EquTypeMenu record, @Param("example") EquTypeMenuExample example);

    int updateByPrimaryKeySelective(EquTypeMenu record);

    int updateByPrimaryKey(EquTypeMenu record);
}
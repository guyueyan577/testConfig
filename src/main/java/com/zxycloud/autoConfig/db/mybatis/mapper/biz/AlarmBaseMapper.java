package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.AlarmBase;
import com.zxycloud.autoConfig.db.mybatis.model.biz.AlarmBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmBaseMapper {
    long countByExample(AlarmBaseExample example);

    int deleteByExample(AlarmBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(AlarmBase record);

    int insertSelective(AlarmBase record);

    List<AlarmBase> selectByExampleWithBLOBs(AlarmBaseExample example);

    List<AlarmBase> selectByExample(AlarmBaseExample example);

    AlarmBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AlarmBase record, @Param("example") AlarmBaseExample example);

    int updateByExampleWithBLOBs(@Param("record") AlarmBase record, @Param("example") AlarmBaseExample example);

    int updateByExample(@Param("record") AlarmBase record, @Param("example") AlarmBaseExample example);

    int updateByPrimaryKeySelective(AlarmBase record);

    int updateByPrimaryKeyWithBLOBs(AlarmBase record);

    int updateByPrimaryKey(AlarmBase record);
}
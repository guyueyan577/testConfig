package com.zxycloud.autoConfig.db.mybatis.mapper.firepatrol;

import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.Malfunction;
import com.zxycloud.autoConfig.db.mybatis.model.firepatrol.MalfunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MalfunctionMapper {
    long countByExample(MalfunctionExample example);

    int deleteByExample(MalfunctionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Malfunction record);

    int insertSelective(Malfunction record);

    List<Malfunction> selectByExample(MalfunctionExample example);

    Malfunction selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Malfunction record, @Param("example") MalfunctionExample example);

    int updateByExample(@Param("record") Malfunction record, @Param("example") MalfunctionExample example);

    int updateByPrimaryKeySelective(Malfunction record);

    int updateByPrimaryKey(Malfunction record);
}
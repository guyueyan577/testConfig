package com.zxycloud.autoConfig.db.mybatis.mapper.thirdbiz;


import com.zxycloud.autoConfig.db.mybatis.model.thirdbiz.Region;
import com.zxycloud.autoConfig.db.mybatis.model.thirdbiz.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    long countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);
}

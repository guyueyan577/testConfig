package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PlaceHourStatistics;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PlaceHourStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceHourStatisticsMapper {
    long countByExample(PlaceHourStatisticsExample example);

    int deleteByExample(PlaceHourStatisticsExample example);

    int deleteByPrimaryKey(String id);

    int insert(PlaceHourStatistics record);

    int insertSelective(PlaceHourStatistics record);

    List<PlaceHourStatistics> selectByExample(PlaceHourStatisticsExample example);

    PlaceHourStatistics selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PlaceHourStatistics record, @Param("example") PlaceHourStatisticsExample example);

    int updateByExample(@Param("record") PlaceHourStatistics record, @Param("example") PlaceHourStatisticsExample example);

    int updateByPrimaryKeySelective(PlaceHourStatistics record);

    int updateByPrimaryKey(PlaceHourStatistics record);
    
    int updateByExampleSelectiveToAdd(@Param("record") PlaceHourStatistics record, @Param("example") PlaceHourStatisticsExample example);
    List<PlaceHourStatistics> sumHoursStatisticsByExample(PlaceHourStatisticsExample example);
}
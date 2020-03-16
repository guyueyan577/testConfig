package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.PlaceStatistics;
import com.example.testConfig.db.mybatis.model.biz.PlaceStatisticsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlaceStatisticsMapper {
    int countByExample(PlaceStatisticsExample example);

    int deleteByExample(PlaceStatisticsExample example);

    int deleteByPrimaryKey(String id);

    int insert(PlaceStatistics record);

    int insertSelective(PlaceStatistics record);

    List<PlaceStatistics> selectByExample(PlaceStatisticsExample example);

    PlaceStatistics selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PlaceStatistics record, @Param("example") PlaceStatisticsExample example);

    int updateByExample(@Param("record") PlaceStatistics record, @Param("example") PlaceStatisticsExample example);

    int updateByPrimaryKeySelective(PlaceStatistics record);

    int updateByPrimaryKey(PlaceStatistics record);

    //获取指定条件的各种数据统计之和
    PlaceStatistics sumStatisticsByExample(PlaceStatisticsExample example);
    //发生火警或其他操作时，修改数据表中数据方式为添加指定字段的数量
    int updateByExampleSelectiveToAdd(@Param("record") PlaceStatistics record, @Param("example") PlaceStatisticsExample example);
    //查询指定条件的火警、故障、事件、隐患数量，按项目分组
    List<PlaceStatistics> sumAlertCountWithTopN(@Param("topn") Integer topn, @Param("example") PlaceStatisticsExample example);

    //app端区域管理员获取指定月份火警/故障/事件等统计
    PlaceStatistics selectAppSumStatisticsByExampleArea(@Param("projectId") String projectId, @Param("userId")String userId,@Param("yearMonth") Integer yearMonth);

    //app端子项目管理员获取指定月份火警/故障/事件等统计
    PlaceStatistics selectAppSumStatisticsByExampleSub(@Param("projectId") String projectId, @Param("yearMonth") Integer yeahMonth);

    //app端项目管理员获取指定月份火警/故障/事件等统计
    PlaceStatistics selectAppSumStatisticsByExampleMain(@Param("projectId") String projectId, @Param("userId")String userId,@Param("yearMonth") Integer yearMonth);


}
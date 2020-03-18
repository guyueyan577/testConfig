package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PublicMiniFireStation;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PublicMiniFireStationExample;

public interface PublicMiniFireStationMapper {
	long countByExample(PublicMiniFireStationExample example);

	int deleteByExample(PublicMiniFireStationExample example);

	int deleteByPrimaryKey(String id);

	int insert(PublicMiniFireStation record);

	int insertSelective(PublicMiniFireStation record);

	List<PublicMiniFireStation> selectByExample(PublicMiniFireStationExample example);

	PublicMiniFireStation selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") PublicMiniFireStation record,
			@Param("example") PublicMiniFireStationExample example);

	int updateByExample(@Param("record") PublicMiniFireStation record,
			@Param("example") PublicMiniFireStationExample example);

	int updateByPrimaryKeySelective(PublicMiniFireStation record);

	int updateByPrimaryKey(PublicMiniFireStation record);

	/**
	 * @author chenjianwei
	 * @date 2019年3月26日 统计指定坐标的一定范围内的灭火救援站站信息列表
	 */
	List<PublicMiniFireStation> selectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);

	List<PublicMiniFireStation> mySelectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);
}
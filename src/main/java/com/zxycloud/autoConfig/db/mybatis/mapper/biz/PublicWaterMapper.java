package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PublicWater;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PublicWaterExample;

public interface PublicWaterMapper {
	long countByExample(PublicWaterExample example);

	int deleteByExample(PublicWaterExample example);

	int deleteByPrimaryKey(String id);

	int insert(PublicWater record);

	int insertSelective(PublicWater record);

	List<PublicWater> selectByExample(PublicWaterExample example);

	PublicWater selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") PublicWater record, @Param("example") PublicWaterExample example);

	int updateByExample(@Param("record") PublicWater record, @Param("example") PublicWaterExample example);

	int updateByPrimaryKeySelective(PublicWater record);

	int updateByPrimaryKey(PublicWater record);

	/**
	 * @author chenjianwei
	 * @date 2019年3月26日 统计指定坐标的一定范围内的灭火救援站站信息列表
	 */
	List<PublicWater> selectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);

	List<PublicWater> mySelectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);
}
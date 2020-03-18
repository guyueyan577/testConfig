package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PublicMedicalStation;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PublicMedicalStationExample;

public interface PublicMedicalStationMapper {
	long countByExample(PublicMedicalStationExample example);

	int deleteByExample(PublicMedicalStationExample example);

	int deleteByPrimaryKey(String id);

	int insert(PublicMedicalStation record);

	int insertSelective(PublicMedicalStation record);

	List<PublicMedicalStation> selectByExample(PublicMedicalStationExample example);

	PublicMedicalStation selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") PublicMedicalStation record,
			@Param("example") PublicMedicalStationExample example);

	int updateByExample(@Param("record") PublicMedicalStation record,
			@Param("example") PublicMedicalStationExample example);

	int updateByPrimaryKeySelective(PublicMedicalStation record);

	int updateByPrimaryKey(PublicMedicalStation record);

	/**
	 * @author chenjianwei
	 * @date 2019年3月26日 统计指定坐标的一定范围内的灭火救援站站信息列表
	 */
	List<PublicMedicalStation> selectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);

	List<PublicMedicalStation> mySelectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);
}
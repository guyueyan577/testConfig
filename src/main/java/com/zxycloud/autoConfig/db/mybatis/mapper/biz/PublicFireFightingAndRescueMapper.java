package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zxycloud.autoConfig.db.mybatis.model.biz.PublicFireFightingAndRescue;
import com.zxycloud.autoConfig.db.mybatis.model.biz.PublicFireFightingAndRescueExample;

public interface PublicFireFightingAndRescueMapper {
	long countByExample(PublicFireFightingAndRescueExample example);

	int deleteByExample(PublicFireFightingAndRescueExample example);

	int deleteByPrimaryKey(String id);

	int insert(PublicFireFightingAndRescue record);

	int insertSelective(PublicFireFightingAndRescue record);

	List<PublicFireFightingAndRescue> selectByExample(PublicFireFightingAndRescueExample example);

	PublicFireFightingAndRescue selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") PublicFireFightingAndRescue record,
			@Param("example") PublicFireFightingAndRescueExample example);

	int updateByExample(@Param("record") PublicFireFightingAndRescue record,
			@Param("example") PublicFireFightingAndRescueExample example);

	int updateByPrimaryKeySelective(PublicFireFightingAndRescue record);

	int updateByPrimaryKey(PublicFireFightingAndRescue record);

	/**
	 * @author chenjianwei
	 * @date 2019年3月26日 统计指定坐标的一定范围内的灭火救援站站信息列表
	 */
	List<PublicFireFightingAndRescue> selectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);

	List<PublicFireFightingAndRescue> mySelectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);
}
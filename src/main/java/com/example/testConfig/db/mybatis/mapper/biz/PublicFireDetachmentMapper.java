package com.example.testConfig.db.mybatis.mapper.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.testConfig.db.mybatis.model.biz.PublicFireDetachment;
import com.example.testConfig.db.mybatis.model.biz.PublicFireDetachmentExample;

public interface PublicFireDetachmentMapper {
	long countByExample(PublicFireDetachmentExample example);

	int deleteByExample(PublicFireDetachmentExample example);

	int deleteByPrimaryKey(String id);

	int insert(PublicFireDetachment record);

	int insertSelective(PublicFireDetachment record);

	List<PublicFireDetachment> selectByExample(PublicFireDetachmentExample example);

	PublicFireDetachment selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") PublicFireDetachment record,
			@Param("example") PublicFireDetachmentExample example);

	int updateByExample(@Param("record") PublicFireDetachment record,
			@Param("example") PublicFireDetachmentExample example);

	int updateByPrimaryKeySelective(PublicFireDetachment record);

	int updateByPrimaryKey(PublicFireDetachment record);

	/**
	 * @author chenjianwei
	 * @date 2019年3月26日 统计指定坐标的一定范围内的灭火救援站站信息列表
	 */
	List<PublicFireDetachment> selectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);

	List<PublicFireDetachment> mySelectListByLocationAndMaxDistance(@Param("lat") Double lat, @Param("lng") Double lng,
			@Param("maxDistance") Double maxDistance);
}
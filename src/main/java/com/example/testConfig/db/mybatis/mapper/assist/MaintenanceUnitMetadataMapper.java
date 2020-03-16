package com.example.testConfig.db.mybatis.mapper.assist;

import com.example.testConfig.db.mybatis.model.assist.MaintenanceUnitMetadata;
import com.example.testConfig.db.mybatis.model.assist.MaintenanceUnitMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintenanceUnitMetadataMapper {
    long countByExample(MaintenanceUnitMetadataExample example);

    int deleteByExample(MaintenanceUnitMetadataExample example);

    int deleteByPrimaryKey(String id);

    int insert(MaintenanceUnitMetadata record);

    int insertSelective(MaintenanceUnitMetadata record);

    List<MaintenanceUnitMetadata> selectByExample(MaintenanceUnitMetadataExample example);

    MaintenanceUnitMetadata selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MaintenanceUnitMetadata record, @Param("example") MaintenanceUnitMetadataExample example);

    int updateByExample(@Param("record") MaintenanceUnitMetadata record, @Param("example") MaintenanceUnitMetadataExample example);

    int updateByPrimaryKeySelective(MaintenanceUnitMetadata record);

    int updateByPrimaryKey(MaintenanceUnitMetadata record);
}
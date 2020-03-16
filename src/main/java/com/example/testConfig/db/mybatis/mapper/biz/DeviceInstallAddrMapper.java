package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.DeviceInstallAddr;
import com.example.testConfig.db.mybatis.model.biz.DeviceInstallAddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceInstallAddrMapper {
    long countByExample(DeviceInstallAddrExample example);

    int deleteByExample(DeviceInstallAddrExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceInstallAddr record);

    int insertSelective(DeviceInstallAddr record);

    List<DeviceInstallAddr> selectByExample(DeviceInstallAddrExample example);

    DeviceInstallAddr selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceInstallAddr record, @Param("example") DeviceInstallAddrExample example);

    int updateByExample(@Param("record") DeviceInstallAddr record, @Param("example") DeviceInstallAddrExample example);

    int updateByPrimaryKeySelective(DeviceInstallAddr record);

    int updateByPrimaryKey(DeviceInstallAddr record);
}
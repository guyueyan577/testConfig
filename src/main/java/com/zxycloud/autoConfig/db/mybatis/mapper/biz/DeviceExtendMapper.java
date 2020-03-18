package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.DeviceExtend;
import com.zxycloud.autoConfig.db.mybatis.model.biz.DeviceExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceExtendMapper {
    long countByExample(DeviceExtendExample example);

    int deleteByExample(DeviceExtendExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeviceExtend record);

    int insertSelective(DeviceExtend record);

    List<DeviceExtend> selectByExample(DeviceExtendExample example);

    DeviceExtend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeviceExtend record, @Param("example") DeviceExtendExample example);

    int updateByExample(@Param("record") DeviceExtend record, @Param("example") DeviceExtendExample example);

    int updateByPrimaryKeySelective(DeviceExtend record);

    int updateByPrimaryKey(DeviceExtend record);
}
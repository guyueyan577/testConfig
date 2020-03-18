package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.ZhejiangDeviceType;
import com.zxycloud.autoConfig.db.mybatis.model.biz.ZhejiangDeviceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhejiangDeviceTypeMapper {
    long countByExample(ZhejiangDeviceTypeExample example);

    int deleteByExample(ZhejiangDeviceTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZhejiangDeviceType record);

    int insertSelective(ZhejiangDeviceType record);

    List<ZhejiangDeviceType> selectByExample(ZhejiangDeviceTypeExample example);

    ZhejiangDeviceType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZhejiangDeviceType record, @Param("example") ZhejiangDeviceTypeExample example);

    int updateByExample(@Param("record") ZhejiangDeviceType record, @Param("example") ZhejiangDeviceTypeExample example);

    int updateByPrimaryKeySelective(ZhejiangDeviceType record);

    int updateByPrimaryKey(ZhejiangDeviceType record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.projectpermission;

import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PVerfication;
import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PVerficationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PVerficationMapper {
    long countByExample(PVerficationExample example);

    int deleteByExample(PVerficationExample example);

    int deleteByPrimaryKey(String id);

    int insert(PVerfication record);

    int insertSelective(PVerfication record);

    List<PVerfication> selectByExample(PVerficationExample example);

    PVerfication selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PVerfication record, @Param("example") PVerficationExample example);

    int updateByExample(@Param("record") PVerfication record, @Param("example") PVerficationExample example);

    int updateByPrimaryKeySelective(PVerfication record);

    int updateByPrimaryKey(PVerfication record);
}
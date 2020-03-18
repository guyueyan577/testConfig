package com.zxycloud.autoConfig.db.mybatis.mapper.projectpermission;

import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PUserOperateLog;
import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PUserOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUserOperateLogMapper {
    long countByExample(PUserOperateLogExample example);

    int deleteByExample(PUserOperateLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(PUserOperateLog record);

    int insertSelective(PUserOperateLog record);

    List<PUserOperateLog> selectByExample(PUserOperateLogExample example);

    PUserOperateLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PUserOperateLog record, @Param("example") PUserOperateLogExample example);

    int updateByExample(@Param("record") PUserOperateLog record, @Param("example") PUserOperateLogExample example);

    int updateByPrimaryKeySelective(PUserOperateLog record);

    int updateByPrimaryKey(PUserOperateLog record);
}
package com.zxycloud.autoConfig.db.mybatis.mapper.projectpermission;

import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PUserLogo;
import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PUserLogoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUserLogoMapper {
    long countByExample(PUserLogoExample example);

    int deleteByExample(PUserLogoExample example);

    int deleteByPrimaryKey(String id);

    int insert(PUserLogo record);

    int insertSelective(PUserLogo record);

    List<PUserLogo> selectByExample(PUserLogoExample example);

    PUserLogo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PUserLogo record, @Param("example") PUserLogoExample example);

    int updateByExample(@Param("record") PUserLogo record, @Param("example") PUserLogoExample example);

    int updateByPrimaryKeySelective(PUserLogo record);

    int updateByPrimaryKey(PUserLogo record);
}
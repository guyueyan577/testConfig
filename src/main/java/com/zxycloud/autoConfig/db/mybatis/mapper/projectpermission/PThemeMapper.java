package com.zxycloud.autoConfig.db.mybatis.mapper.projectpermission;

import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PTheme;
import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PThemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PThemeMapper {
    long countByExample(PThemeExample example);

    int deleteByExample(PThemeExample example);

    int deleteByPrimaryKey(String id);

    int insert(PTheme record);

    int insertSelective(PTheme record);

    List<PTheme> selectByExample(PThemeExample example);

    PTheme selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PTheme record, @Param("example") PThemeExample example);

    int updateByExample(@Param("record") PTheme record, @Param("example") PThemeExample example);

    int updateByPrimaryKeySelective(PTheme record);

    int updateByPrimaryKey(PTheme record);
}
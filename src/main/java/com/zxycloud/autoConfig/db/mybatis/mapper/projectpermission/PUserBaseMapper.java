package com.zxycloud.autoConfig.db.mybatis.mapper.projectpermission;

import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PUserBase;
import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PUserBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUserBaseMapper {
    long countByExample(PUserBaseExample example);

    int deleteByExample(PUserBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(PUserBase record);

    int insertSelective(PUserBase record);

    List<PUserBase> selectByExample(PUserBaseExample example);

    PUserBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PUserBase record, @Param("example") PUserBaseExample example);

    int updateByExample(@Param("record") PUserBase record, @Param("example") PUserBaseExample example);

    int updateByPrimaryKeySelective(PUserBase record);

    int updateByPrimaryKey(PUserBase record);
    
	/**
	 * 根据userId获取其父级用户信息
	 * 
	 * @param userId 用户id
	 * @return 父级用户信息
	 */
    PUserBase selectParentUser(@Param("userId") String userId);
}
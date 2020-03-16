package com.example.testConfig.db.mybatis.mapper.projectpermission;

import com.example.testConfig.db.mybatis.model.projectpermission.PRole;
import com.example.testConfig.db.mybatis.model.projectpermission.PRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRoleMapper {
    long countByExample(PRoleExample example);

    int deleteByExample(PRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(PRole record);

    int insertSelective(PRole record);

    List<PRole> selectByExample(PRoleExample example);

    PRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PRole record, @Param("example") PRoleExample example);

    int updateByExample(@Param("record") PRole record, @Param("example") PRoleExample example);

    int updateByPrimaryKeySelective(PRole record);

    int updateByPrimaryKey(PRole record);
    
    /**
     * 查询最大的userCode
     * @return
     */
	int selectMaxRoleCode();
}
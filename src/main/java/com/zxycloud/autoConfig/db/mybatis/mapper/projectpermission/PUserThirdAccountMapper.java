package com.zxycloud.autoConfig.db.mybatis.mapper.projectpermission;

import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PUserThirdAccount;
import com.zxycloud.autoConfig.db.mybatis.model.projectpermission.PUserThirdAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUserThirdAccountMapper {
    long countByExample(PUserThirdAccountExample example);

    int deleteByExample(PUserThirdAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(PUserThirdAccount record);

    int insertSelective(PUserThirdAccount record);

    List<PUserThirdAccount> selectByExample(PUserThirdAccountExample example);

    PUserThirdAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PUserThirdAccount record, @Param("example") PUserThirdAccountExample example);

    int updateByExample(@Param("record") PUserThirdAccount record, @Param("example") PUserThirdAccountExample example);

    int updateByPrimaryKeySelective(PUserThirdAccount record);

    int updateByPrimaryKey(PUserThirdAccount record);
}
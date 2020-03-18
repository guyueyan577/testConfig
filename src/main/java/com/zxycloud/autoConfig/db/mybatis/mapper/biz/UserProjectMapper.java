package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.UserProject;
import com.zxycloud.autoConfig.db.mybatis.model.biz.UserProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProjectMapper {
    long countByExample(UserProjectExample example);

    int deleteByExample(UserProjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserProject record);

    int insertSelective(UserProject record);

    List<UserProject> selectByExample(UserProjectExample example);

    UserProject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserProject record, @Param("example") UserProjectExample example);

    int updateByExample(@Param("record") UserProject record, @Param("example") UserProjectExample example);

    int updateByPrimaryKeySelective(UserProject record);

    int updateByPrimaryKey(UserProject record);
    
    int insertBatch(@Param("roleCode") int roleCode,@Param("userId") String userId, @Param("list") List<Object> list);
    
    //浙江总队获取指定用户权限下指定机构的项目ID列表
    List<String> selectZjProjectIdListByUserId(@Param("superUnitName") String superUnitName, @Param("userId") String userId);
}
package com.example.testConfig.db.mybatis.mapper.biz;

import com.example.testConfig.db.mybatis.model.biz.PublicControllerRoom;
import com.example.testConfig.db.mybatis.model.biz.PublicControllerRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicControllerRoomMapper {
    long countByExample(PublicControllerRoomExample example);

    int deleteByExample(PublicControllerRoomExample example);

    int deleteByPrimaryKey(String id);

    int insert(PublicControllerRoom record);

    int insertSelective(PublicControllerRoom record);

    List<PublicControllerRoom> selectByExample(PublicControllerRoomExample example);

    PublicControllerRoom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PublicControllerRoom record, @Param("example") PublicControllerRoomExample example);

    int updateByExample(@Param("record") PublicControllerRoom record, @Param("example") PublicControllerRoomExample example);

    int updateByPrimaryKeySelective(PublicControllerRoom record);

    int updateByPrimaryKey(PublicControllerRoom record);
}
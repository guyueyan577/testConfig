package com.zxycloud.autoConfig.db.mybatis.mapper.biz;

import com.zxycloud.autoConfig.db.mybatis.model.biz.VideoInfo;
import com.zxycloud.autoConfig.db.mybatis.model.biz.VideoInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoInfoMapper {
    long countByExample(VideoInfoExample example);

    int deleteByExample(VideoInfoExample example);

    int deleteByPrimaryKey(String guid);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    List<VideoInfo> selectByExample(VideoInfoExample example);

    VideoInfo selectByPrimaryKey(String guid);

    int updateByExampleSelective(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    int updateByExample(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);
}
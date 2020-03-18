package com.zxycloud.autoConfig.db.mybatis.mapper.assist;

import com.zxycloud.autoConfig.db.mybatis.model.assist.FileUploadInfomation;
import com.zxycloud.autoConfig.db.mybatis.model.assist.FileUploadInfomationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileUploadInfomationMapper {
    long countByExample(FileUploadInfomationExample example);

    int deleteByExample(FileUploadInfomationExample example);

    int deleteByPrimaryKey(String id);

    int insert(FileUploadInfomation record);

    int insertSelective(FileUploadInfomation record);

    List<FileUploadInfomation> selectByExample(FileUploadInfomationExample example);

    FileUploadInfomation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FileUploadInfomation record, @Param("example") FileUploadInfomationExample example);

    int updateByExample(@Param("record") FileUploadInfomation record, @Param("example") FileUploadInfomationExample example);

    int updateByPrimaryKeySelective(FileUploadInfomation record);

    int updateByPrimaryKey(FileUploadInfomation record);
}
package com.example.testConfig.db.mybatis.model.biz;

import lombok.Data;

@Data
public class ProjectBaseCore {

    private String projectId;

    private String projectName;

    public ProjectBaseCore() {
    }

    public ProjectBaseCore(ProjectBase projectBase) {
        this.projectId = projectBase.getId();
        this.projectName = projectBase.getProjectName();
    }
}

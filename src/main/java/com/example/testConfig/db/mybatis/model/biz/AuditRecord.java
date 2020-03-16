package com.example.testConfig.db.mybatis.model.biz;

public class AuditRecord {
    private String id;

    private String agentId;

    private String projectId;

    private String projectName;

    private String projectApplicantId;

    private String projectAdminId;

    private Integer auditState;

    private Integer auditMethod;

    private String auditorId;

    private String auditRemark;

    private Boolean urgent;

    private String urgentReason;

    private Boolean deleted;

    private Long createTime;

    private Long updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectApplicantId() {
        return projectApplicantId;
    }

    public void setProjectApplicantId(String projectApplicantId) {
        this.projectApplicantId = projectApplicantId == null ? null : projectApplicantId.trim();
    }

    public String getProjectAdminId() {
        return projectAdminId;
    }

    public void setProjectAdminId(String projectAdminId) {
        this.projectAdminId = projectAdminId == null ? null : projectAdminId.trim();
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public Integer getAuditMethod() {
        return auditMethod;
    }

    public void setAuditMethod(Integer auditMethod) {
        this.auditMethod = auditMethod;
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public String getUrgentReason() {
        return urgentReason;
    }

    public void setUrgentReason(String urgentReason) {
        this.urgentReason = urgentReason == null ? null : urgentReason.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
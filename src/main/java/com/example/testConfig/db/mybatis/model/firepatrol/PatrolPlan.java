package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.Date;

public class PatrolPlan {
	private String id;

	private String patrolPlanTitle;

	private String associatedLabel;

	private Integer planType;

	private Integer time;

	private String remind;

	private String patrolGroupName;

	private String patrolGroupId;

	private String des;

	private String remark;

	private Date createTime;

	private Date updateTime;

	private Long createTimeBiz;

	private Long updateTimeBiz;

	private String startTime;

	private String endTime;

	private String companyId;

	private Byte planState;

	private String planStateName;

	private String startDate;

	private String taskStartTime;

	private String taskEndTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getPatrolPlanTitle() {
		return patrolPlanTitle;
	}

	public void setPatrolPlanTitle(String patrolPlanTitle) {
		this.patrolPlanTitle = patrolPlanTitle == null ? null : patrolPlanTitle.trim();
	}

	public String getAssociatedLabel() {
		return associatedLabel;
	}

	public void setAssociatedLabel(String associatedLabel) {
		this.associatedLabel = associatedLabel == null ? null : associatedLabel.trim();
	}

	public Integer getPlanType() {
		return planType;
	}

	public void setPlanType(Integer planType) {
		this.planType = planType;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getRemind() {
		return remind;
	}

	public void setRemind(String remind) {
		this.remind = remind == null ? null : remind.trim();
	}

	public String getPatrolGroupName() {
		return patrolGroupName;
	}

	public void setPatrolGroupName(String patrolGroupName) {
		this.patrolGroupName = patrolGroupName == null ? null : patrolGroupName.trim();
	}

	public String getPatrolGroupId() {
		return patrolGroupId;
	}

	public void setPatrolGroupId(String patrolGroupId) {
		this.patrolGroupId = patrolGroupId == null ? null : patrolGroupId.trim();
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des == null ? null : des.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getCreateTimeBiz() {
		return createTimeBiz;
	}

	public void setCreateTimeBiz(Long createTimeBiz) {
		this.createTimeBiz = createTimeBiz;
	}

	public Long getUpdateTimeBiz() {
		return updateTimeBiz;
	}

	public void setUpdateTimeBiz(Long updateTimeBiz) {
		this.updateTimeBiz = updateTimeBiz;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime == null ? null : startTime.trim();
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime == null ? null : endTime.trim();
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId == null ? null : companyId.trim();
	}

	public Byte getPlanState() {
		return planState;
	}

	public void setPlanState(Byte planState) {
		this.planState = planState;
	}

	public String getPlanStateName() {
		return planStateName;
	}

	public void setPlanStateName(String planStateName) {
		this.planStateName = planStateName == null ? null : planStateName.trim();
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate == null ? null : startDate.trim();
	}

	public String getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(String taskStartTime) {
		this.taskStartTime = taskStartTime == null ? null : taskStartTime.trim();
	}

	public String getTaskEndTime() {
		return taskEndTime;
	}

	public void setTaskEndTime(String taskEndTime) {
		this.taskEndTime = taskEndTime == null ? null : taskEndTime.trim();
	}
}
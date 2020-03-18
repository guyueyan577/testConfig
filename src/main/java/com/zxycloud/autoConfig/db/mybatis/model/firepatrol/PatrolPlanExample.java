package com.zxycloud.autoConfig.db.mybatis.model.firepatrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatrolPlanExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PatrolPlanExample() {
		oredCriteria = new ArrayList<>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleIsNull() {
			addCriterion("patrol_plan_title is null");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleIsNotNull() {
			addCriterion("patrol_plan_title is not null");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleEqualTo(String value) {
			addCriterion("patrol_plan_title =", value, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleNotEqualTo(String value) {
			addCriterion("patrol_plan_title <>", value, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleGreaterThan(String value) {
			addCriterion("patrol_plan_title >", value, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleGreaterThanOrEqualTo(String value) {
			addCriterion("patrol_plan_title >=", value, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleLessThan(String value) {
			addCriterion("patrol_plan_title <", value, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleLessThanOrEqualTo(String value) {
			addCriterion("patrol_plan_title <=", value, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleLike(String value) {
			addCriterion("patrol_plan_title like", value, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleNotLike(String value) {
			addCriterion("patrol_plan_title not like", value, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleIn(List<String> values) {
			addCriterion("patrol_plan_title in", values, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleNotIn(List<String> values) {
			addCriterion("patrol_plan_title not in", values, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleBetween(String value1, String value2) {
			addCriterion("patrol_plan_title between", value1, value2, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andPatrolPlanTitleNotBetween(String value1, String value2) {
			addCriterion("patrol_plan_title not between", value1, value2, "patrolPlanTitle");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelIsNull() {
			addCriterion("associated_label is null");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelIsNotNull() {
			addCriterion("associated_label is not null");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelEqualTo(String value) {
			addCriterion("associated_label =", value, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelNotEqualTo(String value) {
			addCriterion("associated_label <>", value, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelGreaterThan(String value) {
			addCriterion("associated_label >", value, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelGreaterThanOrEqualTo(String value) {
			addCriterion("associated_label >=", value, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelLessThan(String value) {
			addCriterion("associated_label <", value, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelLessThanOrEqualTo(String value) {
			addCriterion("associated_label <=", value, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelLike(String value) {
			addCriterion("associated_label like", value, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelNotLike(String value) {
			addCriterion("associated_label not like", value, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelIn(List<String> values) {
			addCriterion("associated_label in", values, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelNotIn(List<String> values) {
			addCriterion("associated_label not in", values, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelBetween(String value1, String value2) {
			addCriterion("associated_label between", value1, value2, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andAssociatedLabelNotBetween(String value1, String value2) {
			addCriterion("associated_label not between", value1, value2, "associatedLabel");
			return (Criteria) this;
		}

		public Criteria andPlanTypeIsNull() {
			addCriterion("plan_type is null");
			return (Criteria) this;
		}

		public Criteria andPlanTypeIsNotNull() {
			addCriterion("plan_type is not null");
			return (Criteria) this;
		}

		public Criteria andPlanTypeEqualTo(Integer value) {
			addCriterion("plan_type =", value, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeNotEqualTo(Integer value) {
			addCriterion("plan_type <>", value, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeGreaterThan(Integer value) {
			addCriterion("plan_type >", value, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("plan_type >=", value, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeLessThan(Integer value) {
			addCriterion("plan_type <", value, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeLessThanOrEqualTo(Integer value) {
			addCriterion("plan_type <=", value, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeIn(List<Integer> values) {
			addCriterion("plan_type in", values, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeNotIn(List<Integer> values) {
			addCriterion("plan_type not in", values, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeBetween(Integer value1, Integer value2) {
			addCriterion("plan_type between", value1, value2, "planType");
			return (Criteria) this;
		}

		public Criteria andPlanTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("plan_type not between", value1, value2, "planType");
			return (Criteria) this;
		}

		public Criteria andTimeIsNull() {
			addCriterion("time is null");
			return (Criteria) this;
		}

		public Criteria andTimeIsNotNull() {
			addCriterion("time is not null");
			return (Criteria) this;
		}

		public Criteria andTimeEqualTo(Integer value) {
			addCriterion("time =", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotEqualTo(Integer value) {
			addCriterion("time <>", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThan(Integer value) {
			addCriterion("time >", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("time >=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThan(Integer value) {
			addCriterion("time <", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThanOrEqualTo(Integer value) {
			addCriterion("time <=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeIn(List<Integer> values) {
			addCriterion("time in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotIn(List<Integer> values) {
			addCriterion("time not in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeBetween(Integer value1, Integer value2) {
			addCriterion("time between", value1, value2, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("time not between", value1, value2, "time");
			return (Criteria) this;
		}

		public Criteria andRemindIsNull() {
			addCriterion("remind is null");
			return (Criteria) this;
		}

		public Criteria andRemindIsNotNull() {
			addCriterion("remind is not null");
			return (Criteria) this;
		}

		public Criteria andRemindEqualTo(String value) {
			addCriterion("remind =", value, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindNotEqualTo(String value) {
			addCriterion("remind <>", value, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindGreaterThan(String value) {
			addCriterion("remind >", value, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindGreaterThanOrEqualTo(String value) {
			addCriterion("remind >=", value, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindLessThan(String value) {
			addCriterion("remind <", value, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindLessThanOrEqualTo(String value) {
			addCriterion("remind <=", value, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindLike(String value) {
			addCriterion("remind like", value, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindNotLike(String value) {
			addCriterion("remind not like", value, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindIn(List<String> values) {
			addCriterion("remind in", values, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindNotIn(List<String> values) {
			addCriterion("remind not in", values, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindBetween(String value1, String value2) {
			addCriterion("remind between", value1, value2, "remind");
			return (Criteria) this;
		}

		public Criteria andRemindNotBetween(String value1, String value2) {
			addCriterion("remind not between", value1, value2, "remind");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameIsNull() {
			addCriterion("patrol_group_name is null");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameIsNotNull() {
			addCriterion("patrol_group_name is not null");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameEqualTo(String value) {
			addCriterion("patrol_group_name =", value, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameNotEqualTo(String value) {
			addCriterion("patrol_group_name <>", value, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameGreaterThan(String value) {
			addCriterion("patrol_group_name >", value, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameGreaterThanOrEqualTo(String value) {
			addCriterion("patrol_group_name >=", value, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameLessThan(String value) {
			addCriterion("patrol_group_name <", value, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameLessThanOrEqualTo(String value) {
			addCriterion("patrol_group_name <=", value, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameLike(String value) {
			addCriterion("patrol_group_name like", value, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameNotLike(String value) {
			addCriterion("patrol_group_name not like", value, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameIn(List<String> values) {
			addCriterion("patrol_group_name in", values, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameNotIn(List<String> values) {
			addCriterion("patrol_group_name not in", values, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameBetween(String value1, String value2) {
			addCriterion("patrol_group_name between", value1, value2, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupNameNotBetween(String value1, String value2) {
			addCriterion("patrol_group_name not between", value1, value2, "patrolGroupName");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdIsNull() {
			addCriterion("patrol_group_id is null");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdIsNotNull() {
			addCriterion("patrol_group_id is not null");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdEqualTo(String value) {
			addCriterion("patrol_group_id =", value, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdNotEqualTo(String value) {
			addCriterion("patrol_group_id <>", value, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdGreaterThan(String value) {
			addCriterion("patrol_group_id >", value, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdGreaterThanOrEqualTo(String value) {
			addCriterion("patrol_group_id >=", value, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdLessThan(String value) {
			addCriterion("patrol_group_id <", value, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdLessThanOrEqualTo(String value) {
			addCriterion("patrol_group_id <=", value, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdLike(String value) {
			addCriterion("patrol_group_id like", value, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdNotLike(String value) {
			addCriterion("patrol_group_id not like", value, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdIn(List<String> values) {
			addCriterion("patrol_group_id in", values, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdNotIn(List<String> values) {
			addCriterion("patrol_group_id not in", values, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdBetween(String value1, String value2) {
			addCriterion("patrol_group_id between", value1, value2, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andPatrolGroupIdNotBetween(String value1, String value2) {
			addCriterion("patrol_group_id not between", value1, value2, "patrolGroupId");
			return (Criteria) this;
		}

		public Criteria andDesIsNull() {
			addCriterion("des is null");
			return (Criteria) this;
		}

		public Criteria andDesIsNotNull() {
			addCriterion("des is not null");
			return (Criteria) this;
		}

		public Criteria andDesEqualTo(String value) {
			addCriterion("des =", value, "des");
			return (Criteria) this;
		}

		public Criteria andDesNotEqualTo(String value) {
			addCriterion("des <>", value, "des");
			return (Criteria) this;
		}

		public Criteria andDesGreaterThan(String value) {
			addCriterion("des >", value, "des");
			return (Criteria) this;
		}

		public Criteria andDesGreaterThanOrEqualTo(String value) {
			addCriterion("des >=", value, "des");
			return (Criteria) this;
		}

		public Criteria andDesLessThan(String value) {
			addCriterion("des <", value, "des");
			return (Criteria) this;
		}

		public Criteria andDesLessThanOrEqualTo(String value) {
			addCriterion("des <=", value, "des");
			return (Criteria) this;
		}

		public Criteria andDesLike(String value) {
			addCriterion("des like", value, "des");
			return (Criteria) this;
		}

		public Criteria andDesNotLike(String value) {
			addCriterion("des not like", value, "des");
			return (Criteria) this;
		}

		public Criteria andDesIn(List<String> values) {
			addCriterion("des in", values, "des");
			return (Criteria) this;
		}

		public Criteria andDesNotIn(List<String> values) {
			addCriterion("des not in", values, "des");
			return (Criteria) this;
		}

		public Criteria andDesBetween(String value1, String value2) {
			addCriterion("des between", value1, value2, "des");
			return (Criteria) this;
		}

		public Criteria andDesNotBetween(String value1, String value2) {
			addCriterion("des not between", value1, value2, "des");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizIsNull() {
			addCriterion("create_time_biz is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizIsNotNull() {
			addCriterion("create_time_biz is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizEqualTo(Long value) {
			addCriterion("create_time_biz =", value, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizNotEqualTo(Long value) {
			addCriterion("create_time_biz <>", value, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizGreaterThan(Long value) {
			addCriterion("create_time_biz >", value, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizGreaterThanOrEqualTo(Long value) {
			addCriterion("create_time_biz >=", value, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizLessThan(Long value) {
			addCriterion("create_time_biz <", value, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizLessThanOrEqualTo(Long value) {
			addCriterion("create_time_biz <=", value, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizIn(List<Long> values) {
			addCriterion("create_time_biz in", values, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizNotIn(List<Long> values) {
			addCriterion("create_time_biz not in", values, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizBetween(Long value1, Long value2) {
			addCriterion("create_time_biz between", value1, value2, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBizNotBetween(Long value1, Long value2) {
			addCriterion("create_time_biz not between", value1, value2, "createTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizIsNull() {
			addCriterion("update_time_biz is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizIsNotNull() {
			addCriterion("update_time_biz is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizEqualTo(Long value) {
			addCriterion("update_time_biz =", value, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizNotEqualTo(Long value) {
			addCriterion("update_time_biz <>", value, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizGreaterThan(Long value) {
			addCriterion("update_time_biz >", value, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizGreaterThanOrEqualTo(Long value) {
			addCriterion("update_time_biz >=", value, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizLessThan(Long value) {
			addCriterion("update_time_biz <", value, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizLessThanOrEqualTo(Long value) {
			addCriterion("update_time_biz <=", value, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizIn(List<Long> values) {
			addCriterion("update_time_biz in", values, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizNotIn(List<Long> values) {
			addCriterion("update_time_biz not in", values, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizBetween(Long value1, Long value2) {
			addCriterion("update_time_biz between", value1, value2, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBizNotBetween(Long value1, Long value2) {
			addCriterion("update_time_biz not between", value1, value2, "updateTimeBiz");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(String value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(String value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(String value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(String value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(String value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLike(String value) {
			addCriterion("start_time like", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotLike(String value) {
			addCriterion("start_time not like", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<String> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<String> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(String value1, String value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(String value1, String value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNull() {
			addCriterion("end_time is null");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNotNull() {
			addCriterion("end_time is not null");
			return (Criteria) this;
		}

		public Criteria andEndTimeEqualTo(String value) {
			addCriterion("end_time =", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotEqualTo(String value) {
			addCriterion("end_time <>", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThan(String value) {
			addCriterion("end_time >", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
			addCriterion("end_time >=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThan(String value) {
			addCriterion("end_time <", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThanOrEqualTo(String value) {
			addCriterion("end_time <=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLike(String value) {
			addCriterion("end_time like", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotLike(String value) {
			addCriterion("end_time not like", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIn(List<String> values) {
			addCriterion("end_time in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotIn(List<String> values) {
			addCriterion("end_time not in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeBetween(String value1, String value2) {
			addCriterion("end_time between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotBetween(String value1, String value2) {
			addCriterion("end_time not between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andCompanyIdIsNull() {
			addCriterion("company_id is null");
			return (Criteria) this;
		}

		public Criteria andCompanyIdIsNotNull() {
			addCriterion("company_id is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyIdEqualTo(String value) {
			addCriterion("company_id =", value, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdNotEqualTo(String value) {
			addCriterion("company_id <>", value, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdGreaterThan(String value) {
			addCriterion("company_id >", value, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
			addCriterion("company_id >=", value, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdLessThan(String value) {
			addCriterion("company_id <", value, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdLessThanOrEqualTo(String value) {
			addCriterion("company_id <=", value, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdLike(String value) {
			addCriterion("company_id like", value, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdNotLike(String value) {
			addCriterion("company_id not like", value, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdIn(List<String> values) {
			addCriterion("company_id in", values, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdNotIn(List<String> values) {
			addCriterion("company_id not in", values, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdBetween(String value1, String value2) {
			addCriterion("company_id between", value1, value2, "companyId");
			return (Criteria) this;
		}

		public Criteria andCompanyIdNotBetween(String value1, String value2) {
			addCriterion("company_id not between", value1, value2, "companyId");
			return (Criteria) this;
		}

		public Criteria andPlanStateIsNull() {
			addCriterion("plan_state is null");
			return (Criteria) this;
		}

		public Criteria andPlanStateIsNotNull() {
			addCriterion("plan_state is not null");
			return (Criteria) this;
		}

		public Criteria andPlanStateEqualTo(Byte value) {
			addCriterion("plan_state =", value, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateNotEqualTo(Byte value) {
			addCriterion("plan_state <>", value, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateGreaterThan(Byte value) {
			addCriterion("plan_state >", value, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateGreaterThanOrEqualTo(Byte value) {
			addCriterion("plan_state >=", value, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateLessThan(Byte value) {
			addCriterion("plan_state <", value, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateLessThanOrEqualTo(Byte value) {
			addCriterion("plan_state <=", value, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateIn(List<Byte> values) {
			addCriterion("plan_state in", values, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateNotIn(List<Byte> values) {
			addCriterion("plan_state not in", values, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateBetween(Byte value1, Byte value2) {
			addCriterion("plan_state between", value1, value2, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateNotBetween(Byte value1, Byte value2) {
			addCriterion("plan_state not between", value1, value2, "planState");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameIsNull() {
			addCriterion("plan_state_name is null");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameIsNotNull() {
			addCriterion("plan_state_name is not null");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameEqualTo(String value) {
			addCriterion("plan_state_name =", value, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameNotEqualTo(String value) {
			addCriterion("plan_state_name <>", value, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameGreaterThan(String value) {
			addCriterion("plan_state_name >", value, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameGreaterThanOrEqualTo(String value) {
			addCriterion("plan_state_name >=", value, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameLessThan(String value) {
			addCriterion("plan_state_name <", value, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameLessThanOrEqualTo(String value) {
			addCriterion("plan_state_name <=", value, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameLike(String value) {
			addCriterion("plan_state_name like", value, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameNotLike(String value) {
			addCriterion("plan_state_name not like", value, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameIn(List<String> values) {
			addCriterion("plan_state_name in", values, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameNotIn(List<String> values) {
			addCriterion("plan_state_name not in", values, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameBetween(String value1, String value2) {
			addCriterion("plan_state_name between", value1, value2, "planStateName");
			return (Criteria) this;
		}

		public Criteria andPlanStateNameNotBetween(String value1, String value2) {
			addCriterion("plan_state_name not between", value1, value2, "planStateName");
			return (Criteria) this;
		}

		public Criteria andStartDateIsNull() {
			addCriterion("start_date is null");
			return (Criteria) this;
		}

		public Criteria andStartDateIsNotNull() {
			addCriterion("start_date is not null");
			return (Criteria) this;
		}

		public Criteria andStartDateEqualTo(String value) {
			addCriterion("start_date =", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotEqualTo(String value) {
			addCriterion("start_date <>", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateGreaterThan(String value) {
			addCriterion("start_date >", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateGreaterThanOrEqualTo(String value) {
			addCriterion("start_date >=", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLessThan(String value) {
			addCriterion("start_date <", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLessThanOrEqualTo(String value) {
			addCriterion("start_date <=", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateLike(String value) {
			addCriterion("start_date like", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotLike(String value) {
			addCriterion("start_date not like", value, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateIn(List<String> values) {
			addCriterion("start_date in", values, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotIn(List<String> values) {
			addCriterion("start_date not in", values, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateBetween(String value1, String value2) {
			addCriterion("start_date between", value1, value2, "startDate");
			return (Criteria) this;
		}

		public Criteria andStartDateNotBetween(String value1, String value2) {
			addCriterion("start_date not between", value1, value2, "startDate");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeIsNull() {
			addCriterion("task_start_time is null");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeIsNotNull() {
			addCriterion("task_start_time is not null");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeEqualTo(String value) {
			addCriterion("task_start_time =", value, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeNotEqualTo(String value) {
			addCriterion("task_start_time <>", value, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeGreaterThan(String value) {
			addCriterion("task_start_time >", value, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeGreaterThanOrEqualTo(String value) {
			addCriterion("task_start_time >=", value, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeLessThan(String value) {
			addCriterion("task_start_time <", value, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeLessThanOrEqualTo(String value) {
			addCriterion("task_start_time <=", value, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeLike(String value) {
			addCriterion("task_start_time like", value, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeNotLike(String value) {
			addCriterion("task_start_time not like", value, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeIn(List<String> values) {
			addCriterion("task_start_time in", values, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeNotIn(List<String> values) {
			addCriterion("task_start_time not in", values, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeBetween(String value1, String value2) {
			addCriterion("task_start_time between", value1, value2, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskStartTimeNotBetween(String value1, String value2) {
			addCriterion("task_start_time not between", value1, value2, "taskStartTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeIsNull() {
			addCriterion("task_end_time is null");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeIsNotNull() {
			addCriterion("task_end_time is not null");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeEqualTo(String value) {
			addCriterion("task_end_time =", value, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeNotEqualTo(String value) {
			addCriterion("task_end_time <>", value, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeGreaterThan(String value) {
			addCriterion("task_end_time >", value, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeGreaterThanOrEqualTo(String value) {
			addCriterion("task_end_time >=", value, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeLessThan(String value) {
			addCriterion("task_end_time <", value, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeLessThanOrEqualTo(String value) {
			addCriterion("task_end_time <=", value, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeLike(String value) {
			addCriterion("task_end_time like", value, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeNotLike(String value) {
			addCriterion("task_end_time not like", value, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeIn(List<String> values) {
			addCriterion("task_end_time in", values, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeNotIn(List<String> values) {
			addCriterion("task_end_time not in", values, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeBetween(String value1, String value2) {
			addCriterion("task_end_time between", value1, value2, "taskEndTime");
			return (Criteria) this;
		}

		public Criteria andTaskEndTimeNotBetween(String value1, String value2) {
			addCriterion("task_end_time not between", value1, value2, "taskEndTime");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

}
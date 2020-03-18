package com.zxycloud.autoConfig.db.mybatis.model.firepatrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatrolTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatrolTaskExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andPatrolTaskNameIsNull() {
            addCriterion("patrol_task_name is null");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameIsNotNull() {
            addCriterion("patrol_task_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameEqualTo(String value) {
            addCriterion("patrol_task_name =", value, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameNotEqualTo(String value) {
            addCriterion("patrol_task_name <>", value, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameGreaterThan(String value) {
            addCriterion("patrol_task_name >", value, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("patrol_task_name >=", value, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameLessThan(String value) {
            addCriterion("patrol_task_name <", value, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameLessThanOrEqualTo(String value) {
            addCriterion("patrol_task_name <=", value, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameLike(String value) {
            addCriterion("patrol_task_name like", value, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameNotLike(String value) {
            addCriterion("patrol_task_name not like", value, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameIn(List<String> values) {
            addCriterion("patrol_task_name in", values, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameNotIn(List<String> values) {
            addCriterion("patrol_task_name not in", values, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameBetween(String value1, String value2) {
            addCriterion("patrol_task_name between", value1, value2, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskNameNotBetween(String value1, String value2) {
            addCriterion("patrol_task_name not between", value1, value2, "patrolTaskName");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdIsNull() {
            addCriterion("patrol_plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdIsNotNull() {
            addCriterion("patrol_plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdEqualTo(String value) {
            addCriterion("patrol_plan_id =", value, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdNotEqualTo(String value) {
            addCriterion("patrol_plan_id <>", value, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdGreaterThan(String value) {
            addCriterion("patrol_plan_id >", value, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("patrol_plan_id >=", value, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdLessThan(String value) {
            addCriterion("patrol_plan_id <", value, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdLessThanOrEqualTo(String value) {
            addCriterion("patrol_plan_id <=", value, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdLike(String value) {
            addCriterion("patrol_plan_id like", value, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdNotLike(String value) {
            addCriterion("patrol_plan_id not like", value, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdIn(List<String> values) {
            addCriterion("patrol_plan_id in", values, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdNotIn(List<String> values) {
            addCriterion("patrol_plan_id not in", values, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdBetween(String value1, String value2) {
            addCriterion("patrol_plan_id between", value1, value2, "patrolPlanId");
            return (Criteria) this;
        }

        public Criteria andPatrolPlanIdNotBetween(String value1, String value2) {
            addCriterion("patrol_plan_id not between", value1, value2, "patrolPlanId");
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeIsNull() {
            addCriterion("patrol_item_type is null");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeIsNotNull() {
            addCriterion("patrol_item_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeEqualTo(Integer value) {
            addCriterion("patrol_item_type =", value, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeNotEqualTo(Integer value) {
            addCriterion("patrol_item_type <>", value, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeGreaterThan(Integer value) {
            addCriterion("patrol_item_type >", value, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("patrol_item_type >=", value, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeLessThan(Integer value) {
            addCriterion("patrol_item_type <", value, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("patrol_item_type <=", value, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeIn(List<Integer> values) {
            addCriterion("patrol_item_type in", values, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeNotIn(List<Integer> values) {
            addCriterion("patrol_item_type not in", values, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("patrol_item_type between", value1, value2, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("patrol_item_type not between", value1, value2, "patrolItemType");
            return (Criteria) this;
        }

        public Criteria andPatrolStateIsNull() {
            addCriterion("patrol_state is null");
            return (Criteria) this;
        }

        public Criteria andPatrolStateIsNotNull() {
            addCriterion("patrol_state is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolStateEqualTo(Integer value) {
            addCriterion("patrol_state =", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateNotEqualTo(Integer value) {
            addCriterion("patrol_state <>", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateGreaterThan(Integer value) {
            addCriterion("patrol_state >", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("patrol_state >=", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateLessThan(Integer value) {
            addCriterion("patrol_state <", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateLessThanOrEqualTo(Integer value) {
            addCriterion("patrol_state <=", value, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateIn(List<Integer> values) {
            addCriterion("patrol_state in", values, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateNotIn(List<Integer> values) {
            addCriterion("patrol_state not in", values, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateBetween(Integer value1, Integer value2) {
            addCriterion("patrol_state between", value1, value2, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStateNotBetween(Integer value1, Integer value2) {
            addCriterion("patrol_state not between", value1, value2, "patrolState");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffIsNull() {
            addCriterion("patrol_staff is null");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffIsNotNull() {
            addCriterion("patrol_staff is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffEqualTo(String value) {
            addCriterion("patrol_staff =", value, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffNotEqualTo(String value) {
            addCriterion("patrol_staff <>", value, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffGreaterThan(String value) {
            addCriterion("patrol_staff >", value, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffGreaterThanOrEqualTo(String value) {
            addCriterion("patrol_staff >=", value, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffLessThan(String value) {
            addCriterion("patrol_staff <", value, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffLessThanOrEqualTo(String value) {
            addCriterion("patrol_staff <=", value, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffLike(String value) {
            addCriterion("patrol_staff like", value, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffNotLike(String value) {
            addCriterion("patrol_staff not like", value, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffIn(List<String> values) {
            addCriterion("patrol_staff in", values, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffNotIn(List<String> values) {
            addCriterion("patrol_staff not in", values, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffBetween(String value1, String value2) {
            addCriterion("patrol_staff between", value1, value2, "patrolStaff");
            return (Criteria) this;
        }

        public Criteria andPatrolStaffNotBetween(String value1, String value2) {
            addCriterion("patrol_staff not between", value1, value2, "patrolStaff");
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

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
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
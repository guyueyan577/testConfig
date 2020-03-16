package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskPointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskPointExample() {
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

        public Criteria andPatrolTaskIdIsNull() {
            addCriterion("patrol_task_id is null");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdIsNotNull() {
            addCriterion("patrol_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdEqualTo(String value) {
            addCriterion("patrol_task_id =", value, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdNotEqualTo(String value) {
            addCriterion("patrol_task_id <>", value, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdGreaterThan(String value) {
            addCriterion("patrol_task_id >", value, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("patrol_task_id >=", value, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdLessThan(String value) {
            addCriterion("patrol_task_id <", value, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdLessThanOrEqualTo(String value) {
            addCriterion("patrol_task_id <=", value, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdLike(String value) {
            addCriterion("patrol_task_id like", value, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdNotLike(String value) {
            addCriterion("patrol_task_id not like", value, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdIn(List<String> values) {
            addCriterion("patrol_task_id in", values, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdNotIn(List<String> values) {
            addCriterion("patrol_task_id not in", values, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdBetween(String value1, String value2) {
            addCriterion("patrol_task_id between", value1, value2, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolTaskIdNotBetween(String value1, String value2) {
            addCriterion("patrol_task_id not between", value1, value2, "patrolTaskId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdIsNull() {
            addCriterion("patrol_point_id is null");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdIsNotNull() {
            addCriterion("patrol_point_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdEqualTo(String value) {
            addCriterion("patrol_point_id =", value, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdNotEqualTo(String value) {
            addCriterion("patrol_point_id <>", value, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdGreaterThan(String value) {
            addCriterion("patrol_point_id >", value, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdGreaterThanOrEqualTo(String value) {
            addCriterion("patrol_point_id >=", value, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdLessThan(String value) {
            addCriterion("patrol_point_id <", value, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdLessThanOrEqualTo(String value) {
            addCriterion("patrol_point_id <=", value, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdLike(String value) {
            addCriterion("patrol_point_id like", value, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdNotLike(String value) {
            addCriterion("patrol_point_id not like", value, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdIn(List<String> values) {
            addCriterion("patrol_point_id in", values, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdNotIn(List<String> values) {
            addCriterion("patrol_point_id not in", values, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdBetween(String value1, String value2) {
            addCriterion("patrol_point_id between", value1, value2, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andPatrolPointIdNotBetween(String value1, String value2) {
            addCriterion("patrol_point_id not between", value1, value2, "patrolPointId");
            return (Criteria) this;
        }

        public Criteria andResultStateIsNull() {
            addCriterion("result_state is null");
            return (Criteria) this;
        }

        public Criteria andResultStateIsNotNull() {
            addCriterion("result_state is not null");
            return (Criteria) this;
        }

        public Criteria andResultStateEqualTo(Integer value) {
            addCriterion("result_state =", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotEqualTo(Integer value) {
            addCriterion("result_state <>", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateGreaterThan(Integer value) {
            addCriterion("result_state >", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_state >=", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateLessThan(Integer value) {
            addCriterion("result_state <", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateLessThanOrEqualTo(Integer value) {
            addCriterion("result_state <=", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateIn(List<Integer> values) {
            addCriterion("result_state in", values, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotIn(List<Integer> values) {
            addCriterion("result_state not in", values, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateBetween(Integer value1, Integer value2) {
            addCriterion("result_state between", value1, value2, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotBetween(Integer value1, Integer value2) {
            addCriterion("result_state not between", value1, value2, "resultState");
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

        public Criteria andPatrolPointNameIsNull() {
            addCriterion("patrol_point_name is null");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameIsNotNull() {
            addCriterion("patrol_point_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameEqualTo(String value) {
            addCriterion("patrol_point_name =", value, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameNotEqualTo(String value) {
            addCriterion("patrol_point_name <>", value, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameGreaterThan(String value) {
            addCriterion("patrol_point_name >", value, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameGreaterThanOrEqualTo(String value) {
            addCriterion("patrol_point_name >=", value, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameLessThan(String value) {
            addCriterion("patrol_point_name <", value, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameLessThanOrEqualTo(String value) {
            addCriterion("patrol_point_name <=", value, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameLike(String value) {
            addCriterion("patrol_point_name like", value, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameNotLike(String value) {
            addCriterion("patrol_point_name not like", value, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameIn(List<String> values) {
            addCriterion("patrol_point_name in", values, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameNotIn(List<String> values) {
            addCriterion("patrol_point_name not in", values, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameBetween(String value1, String value2) {
            addCriterion("patrol_point_name between", value1, value2, "patrolPointName");
            return (Criteria) this;
        }

        public Criteria andPatrolPointNameNotBetween(String value1, String value2) {
            addCriterion("patrol_point_name not between", value1, value2, "patrolPointName");
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

        public Criteria andEquTypeIsNull() {
            addCriterion("equ_type is null");
            return (Criteria) this;
        }

        public Criteria andEquTypeIsNotNull() {
            addCriterion("equ_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquTypeEqualTo(Integer value) {
            addCriterion("equ_type =", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeNotEqualTo(Integer value) {
            addCriterion("equ_type <>", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeGreaterThan(Integer value) {
            addCriterion("equ_type >", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("equ_type >=", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeLessThan(Integer value) {
            addCriterion("equ_type <", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeLessThanOrEqualTo(Integer value) {
            addCriterion("equ_type <=", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeIn(List<Integer> values) {
            addCriterion("equ_type in", values, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeNotIn(List<Integer> values) {
            addCriterion("equ_type not in", values, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeBetween(Integer value1, Integer value2) {
            addCriterion("equ_type between", value1, value2, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("equ_type not between", value1, value2, "equType");
            return (Criteria) this;
        }

        public Criteria andEquNameIsNull() {
            addCriterion("equ_name is null");
            return (Criteria) this;
        }

        public Criteria andEquNameIsNotNull() {
            addCriterion("equ_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquNameEqualTo(String value) {
            addCriterion("equ_name =", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameNotEqualTo(String value) {
            addCriterion("equ_name <>", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameGreaterThan(String value) {
            addCriterion("equ_name >", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameGreaterThanOrEqualTo(String value) {
            addCriterion("equ_name >=", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameLessThan(String value) {
            addCriterion("equ_name <", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameLessThanOrEqualTo(String value) {
            addCriterion("equ_name <=", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameLike(String value) {
            addCriterion("equ_name like", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameNotLike(String value) {
            addCriterion("equ_name not like", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameIn(List<String> values) {
            addCriterion("equ_name in", values, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameNotIn(List<String> values) {
            addCriterion("equ_name not in", values, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameBetween(String value1, String value2) {
            addCriterion("equ_name between", value1, value2, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameNotBetween(String value1, String value2) {
            addCriterion("equ_name not between", value1, value2, "equName");
            return (Criteria) this;
        }

        public Criteria andTagNumberIsNull() {
            addCriterion("tag_number is null");
            return (Criteria) this;
        }

        public Criteria andTagNumberIsNotNull() {
            addCriterion("tag_number is not null");
            return (Criteria) this;
        }

        public Criteria andTagNumberEqualTo(String value) {
            addCriterion("tag_number =", value, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberNotEqualTo(String value) {
            addCriterion("tag_number <>", value, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberGreaterThan(String value) {
            addCriterion("tag_number >", value, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tag_number >=", value, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberLessThan(String value) {
            addCriterion("tag_number <", value, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberLessThanOrEqualTo(String value) {
            addCriterion("tag_number <=", value, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberLike(String value) {
            addCriterion("tag_number like", value, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberNotLike(String value) {
            addCriterion("tag_number not like", value, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberIn(List<String> values) {
            addCriterion("tag_number in", values, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberNotIn(List<String> values) {
            addCriterion("tag_number not in", values, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberBetween(String value1, String value2) {
            addCriterion("tag_number between", value1, value2, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andTagNumberNotBetween(String value1, String value2) {
            addCriterion("tag_number not between", value1, value2, "tagNumber");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNull() {
            addCriterion("building_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNotNull() {
            addCriterion("building_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdEqualTo(String value) {
            addCriterion("building_id =", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotEqualTo(String value) {
            addCriterion("building_id <>", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThan(String value) {
            addCriterion("building_id >", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThanOrEqualTo(String value) {
            addCriterion("building_id >=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThan(String value) {
            addCriterion("building_id <", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThanOrEqualTo(String value) {
            addCriterion("building_id <=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLike(String value) {
            addCriterion("building_id like", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotLike(String value) {
            addCriterion("building_id not like", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIn(List<String> values) {
            addCriterion("building_id in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotIn(List<String> values) {
            addCriterion("building_id not in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdBetween(String value1, String value2) {
            addCriterion("building_id between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotBetween(String value1, String value2) {
            addCriterion("building_id not between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNull() {
            addCriterion("building_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("building_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("building_name =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("building_name <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("building_name >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("building_name >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("building_name <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("building_name <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("building_name like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("building_name not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("building_name in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("building_name not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("building_name between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("building_name not between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNull() {
            addCriterion("floor_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNotNull() {
            addCriterion("floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIdEqualTo(String value) {
            addCriterion("floor_id =", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotEqualTo(String value) {
            addCriterion("floor_id <>", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThan(String value) {
            addCriterion("floor_id >", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThanOrEqualTo(String value) {
            addCriterion("floor_id >=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThan(String value) {
            addCriterion("floor_id <", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThanOrEqualTo(String value) {
            addCriterion("floor_id <=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLike(String value) {
            addCriterion("floor_id like", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotLike(String value) {
            addCriterion("floor_id not like", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIn(List<String> values) {
            addCriterion("floor_id in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotIn(List<String> values) {
            addCriterion("floor_id not in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdBetween(String value1, String value2) {
            addCriterion("floor_id between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotBetween(String value1, String value2) {
            addCriterion("floor_id not between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNull() {
            addCriterion("floor_name is null");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNotNull() {
            addCriterion("floor_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNameEqualTo(String value) {
            addCriterion("floor_name =", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotEqualTo(String value) {
            addCriterion("floor_name <>", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThan(String value) {
            addCriterion("floor_name >", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_name >=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThan(String value) {
            addCriterion("floor_name <", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThanOrEqualTo(String value) {
            addCriterion("floor_name <=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLike(String value) {
            addCriterion("floor_name like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotLike(String value) {
            addCriterion("floor_name not like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameIn(List<String> values) {
            addCriterion("floor_name in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotIn(List<String> values) {
            addCriterion("floor_name not in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameBetween(String value1, String value2) {
            addCriterion("floor_name between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotBetween(String value1, String value2) {
            addCriterion("floor_name not between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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
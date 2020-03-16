package com.example.testConfig.db.mybatis.model.firepatrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MalfunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MalfunctionExample() {
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

        public Criteria andTaskPointIdIsNull() {
            addCriterion("task_point_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdIsNotNull() {
            addCriterion("task_point_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdEqualTo(String value) {
            addCriterion("task_point_id =", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdNotEqualTo(String value) {
            addCriterion("task_point_id <>", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdGreaterThan(String value) {
            addCriterion("task_point_id >", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_point_id >=", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdLessThan(String value) {
            addCriterion("task_point_id <", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdLessThanOrEqualTo(String value) {
            addCriterion("task_point_id <=", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdLike(String value) {
            addCriterion("task_point_id like", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdNotLike(String value) {
            addCriterion("task_point_id not like", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdIn(List<String> values) {
            addCriterion("task_point_id in", values, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdNotIn(List<String> values) {
            addCriterion("task_point_id not in", values, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdBetween(String value1, String value2) {
            addCriterion("task_point_id between", value1, value2, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdNotBetween(String value1, String value2) {
            addCriterion("task_point_id not between", value1, value2, "taskPointId");
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

        public Criteria andEquCodeIsNull() {
            addCriterion("equ_code is null");
            return (Criteria) this;
        }

        public Criteria andEquCodeIsNotNull() {
            addCriterion("equ_code is not null");
            return (Criteria) this;
        }

        public Criteria andEquCodeEqualTo(String value) {
            addCriterion("equ_code =", value, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeNotEqualTo(String value) {
            addCriterion("equ_code <>", value, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeGreaterThan(String value) {
            addCriterion("equ_code >", value, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeGreaterThanOrEqualTo(String value) {
            addCriterion("equ_code >=", value, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeLessThan(String value) {
            addCriterion("equ_code <", value, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeLessThanOrEqualTo(String value) {
            addCriterion("equ_code <=", value, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeLike(String value) {
            addCriterion("equ_code like", value, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeNotLike(String value) {
            addCriterion("equ_code not like", value, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeIn(List<String> values) {
            addCriterion("equ_code in", values, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeNotIn(List<String> values) {
            addCriterion("equ_code not in", values, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeBetween(String value1, String value2) {
            addCriterion("equ_code between", value1, value2, "equCode");
            return (Criteria) this;
        }

        public Criteria andEquCodeNotBetween(String value1, String value2) {
            addCriterion("equ_code not between", value1, value2, "equCode");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNull() {
            addCriterion("fault_type is null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNotNull() {
            addCriterion("fault_type is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeEqualTo(Integer value) {
            addCriterion("fault_type =", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotEqualTo(Integer value) {
            addCriterion("fault_type <>", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThan(Integer value) {
            addCriterion("fault_type >", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fault_type >=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThan(Integer value) {
            addCriterion("fault_type <", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fault_type <=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIn(List<Integer> values) {
            addCriterion("fault_type in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotIn(List<Integer> values) {
            addCriterion("fault_type not in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeBetween(Integer value1, Integer value2) {
            addCriterion("fault_type between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fault_type not between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameIsNull() {
            addCriterion("fault_type_name is null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameIsNotNull() {
            addCriterion("fault_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameEqualTo(String value) {
            addCriterion("fault_type_name =", value, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameNotEqualTo(String value) {
            addCriterion("fault_type_name <>", value, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameGreaterThan(String value) {
            addCriterion("fault_type_name >", value, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("fault_type_name >=", value, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameLessThan(String value) {
            addCriterion("fault_type_name <", value, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameLessThanOrEqualTo(String value) {
            addCriterion("fault_type_name <=", value, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameLike(String value) {
            addCriterion("fault_type_name like", value, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameNotLike(String value) {
            addCriterion("fault_type_name not like", value, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameIn(List<String> values) {
            addCriterion("fault_type_name in", values, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameNotIn(List<String> values) {
            addCriterion("fault_type_name not in", values, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameBetween(String value1, String value2) {
            addCriterion("fault_type_name between", value1, value2, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNameNotBetween(String value1, String value2) {
            addCriterion("fault_type_name not between", value1, value2, "faultTypeName");
            return (Criteria) this;
        }

        public Criteria andFaultCauseIsNull() {
            addCriterion("fault_cause is null");
            return (Criteria) this;
        }

        public Criteria andFaultCauseIsNotNull() {
            addCriterion("fault_cause is not null");
            return (Criteria) this;
        }

        public Criteria andFaultCauseEqualTo(String value) {
            addCriterion("fault_cause =", value, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseNotEqualTo(String value) {
            addCriterion("fault_cause <>", value, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseGreaterThan(String value) {
            addCriterion("fault_cause >", value, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseGreaterThanOrEqualTo(String value) {
            addCriterion("fault_cause >=", value, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseLessThan(String value) {
            addCriterion("fault_cause <", value, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseLessThanOrEqualTo(String value) {
            addCriterion("fault_cause <=", value, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseLike(String value) {
            addCriterion("fault_cause like", value, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseNotLike(String value) {
            addCriterion("fault_cause not like", value, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseIn(List<String> values) {
            addCriterion("fault_cause in", values, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseNotIn(List<String> values) {
            addCriterion("fault_cause not in", values, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseBetween(String value1, String value2) {
            addCriterion("fault_cause between", value1, value2, "faultCause");
            return (Criteria) this;
        }

        public Criteria andFaultCauseNotBetween(String value1, String value2) {
            addCriterion("fault_cause not between", value1, value2, "faultCause");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesIsNull() {
            addCriterion("malfunction_des is null");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesIsNotNull() {
            addCriterion("malfunction_des is not null");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesEqualTo(String value) {
            addCriterion("malfunction_des =", value, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesNotEqualTo(String value) {
            addCriterion("malfunction_des <>", value, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesGreaterThan(String value) {
            addCriterion("malfunction_des >", value, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesGreaterThanOrEqualTo(String value) {
            addCriterion("malfunction_des >=", value, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesLessThan(String value) {
            addCriterion("malfunction_des <", value, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesLessThanOrEqualTo(String value) {
            addCriterion("malfunction_des <=", value, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesLike(String value) {
            addCriterion("malfunction_des like", value, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesNotLike(String value) {
            addCriterion("malfunction_des not like", value, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesIn(List<String> values) {
            addCriterion("malfunction_des in", values, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesNotIn(List<String> values) {
            addCriterion("malfunction_des not in", values, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesBetween(String value1, String value2) {
            addCriterion("malfunction_des between", value1, value2, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andMalfunctionDesNotBetween(String value1, String value2) {
            addCriterion("malfunction_des not between", value1, value2, "malfunctionDes");
            return (Criteria) this;
        }

        public Criteria andDisposeStateIsNull() {
            addCriterion("dispose_state is null");
            return (Criteria) this;
        }

        public Criteria andDisposeStateIsNotNull() {
            addCriterion("dispose_state is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeStateEqualTo(String value) {
            addCriterion("dispose_state =", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNotEqualTo(String value) {
            addCriterion("dispose_state <>", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateGreaterThan(String value) {
            addCriterion("dispose_state >", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_state >=", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateLessThan(String value) {
            addCriterion("dispose_state <", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateLessThanOrEqualTo(String value) {
            addCriterion("dispose_state <=", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateLike(String value) {
            addCriterion("dispose_state like", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNotLike(String value) {
            addCriterion("dispose_state not like", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateIn(List<String> values) {
            addCriterion("dispose_state in", values, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNotIn(List<String> values) {
            addCriterion("dispose_state not in", values, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateBetween(String value1, String value2) {
            addCriterion("dispose_state between", value1, value2, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNotBetween(String value1, String value2) {
            addCriterion("dispose_state not between", value1, value2, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeDesIsNull() {
            addCriterion("dispose_des is null");
            return (Criteria) this;
        }

        public Criteria andDisposeDesIsNotNull() {
            addCriterion("dispose_des is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeDesEqualTo(String value) {
            addCriterion("dispose_des =", value, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesNotEqualTo(String value) {
            addCriterion("dispose_des <>", value, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesGreaterThan(String value) {
            addCriterion("dispose_des >", value, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_des >=", value, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesLessThan(String value) {
            addCriterion("dispose_des <", value, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesLessThanOrEqualTo(String value) {
            addCriterion("dispose_des <=", value, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesLike(String value) {
            addCriterion("dispose_des like", value, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesNotLike(String value) {
            addCriterion("dispose_des not like", value, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesIn(List<String> values) {
            addCriterion("dispose_des in", values, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesNotIn(List<String> values) {
            addCriterion("dispose_des not in", values, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesBetween(String value1, String value2) {
            addCriterion("dispose_des between", value1, value2, "disposeDes");
            return (Criteria) this;
        }

        public Criteria andDisposeDesNotBetween(String value1, String value2) {
            addCriterion("dispose_des not between", value1, value2, "disposeDes");
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

        public Criteria andPlanTypeNameIsNull() {
            addCriterion("plan_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameIsNotNull() {
            addCriterion("plan_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameEqualTo(String value) {
            addCriterion("plan_type_name =", value, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameNotEqualTo(String value) {
            addCriterion("plan_type_name <>", value, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameGreaterThan(String value) {
            addCriterion("plan_type_name >", value, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("plan_type_name >=", value, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameLessThan(String value) {
            addCriterion("plan_type_name <", value, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameLessThanOrEqualTo(String value) {
            addCriterion("plan_type_name <=", value, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameLike(String value) {
            addCriterion("plan_type_name like", value, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameNotLike(String value) {
            addCriterion("plan_type_name not like", value, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameIn(List<String> values) {
            addCriterion("plan_type_name in", values, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameNotIn(List<String> values) {
            addCriterion("plan_type_name not in", values, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameBetween(String value1, String value2) {
            addCriterion("plan_type_name between", value1, value2, "planTypeName");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNameNotBetween(String value1, String value2) {
            addCriterion("plan_type_name not between", value1, value2, "planTypeName");
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
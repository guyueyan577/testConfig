package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class PlaceStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaceStatisticsExample() {
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

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("agent_id like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("agent_id not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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

        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(String value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(String value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(String value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(String value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLike(String value) {
            addCriterion("place_id like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotLike(String value) {
            addCriterion("place_id not like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<String> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<String> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(String value1, String value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(String value1, String value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeIsNull() {
            addCriterion("year_month_time is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeIsNotNull() {
            addCriterion("year_month_time is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeEqualTo(Integer value) {
            addCriterion("year_month_time =", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeNotEqualTo(Integer value) {
            addCriterion("year_month_time <>", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeGreaterThan(Integer value) {
            addCriterion("year_month_time >", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_month_time >=", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeLessThan(Integer value) {
            addCriterion("year_month_time <", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeLessThanOrEqualTo(Integer value) {
            addCriterion("year_month_time <=", value, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeIn(List<Integer> values) {
            addCriterion("year_month_time in", values, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeNotIn(List<Integer> values) {
            addCriterion("year_month_time not in", values, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeBetween(Integer value1, Integer value2) {
            addCriterion("year_month_time between", value1, value2, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andYearMonthTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("year_month_time not between", value1, value2, "yearMonthTime");
            return (Criteria) this;
        }

        public Criteria andFireNumberIsNull() {
            addCriterion("fire_number is null");
            return (Criteria) this;
        }

        public Criteria andFireNumberIsNotNull() {
            addCriterion("fire_number is not null");
            return (Criteria) this;
        }

        public Criteria andFireNumberEqualTo(Integer value) {
            addCriterion("fire_number =", value, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberNotEqualTo(Integer value) {
            addCriterion("fire_number <>", value, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberGreaterThan(Integer value) {
            addCriterion("fire_number >", value, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fire_number >=", value, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberLessThan(Integer value) {
            addCriterion("fire_number <", value, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberLessThanOrEqualTo(Integer value) {
            addCriterion("fire_number <=", value, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberIn(List<Integer> values) {
            addCriterion("fire_number in", values, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberNotIn(List<Integer> values) {
            addCriterion("fire_number not in", values, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberBetween(Integer value1, Integer value2) {
            addCriterion("fire_number between", value1, value2, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFireNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fire_number not between", value1, value2, "fireNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberIsNull() {
            addCriterion("fault_number is null");
            return (Criteria) this;
        }

        public Criteria andFaultNumberIsNotNull() {
            addCriterion("fault_number is not null");
            return (Criteria) this;
        }

        public Criteria andFaultNumberEqualTo(Integer value) {
            addCriterion("fault_number =", value, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberNotEqualTo(Integer value) {
            addCriterion("fault_number <>", value, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberGreaterThan(Integer value) {
            addCriterion("fault_number >", value, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fault_number >=", value, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberLessThan(Integer value) {
            addCriterion("fault_number <", value, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberLessThanOrEqualTo(Integer value) {
            addCriterion("fault_number <=", value, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberIn(List<Integer> values) {
            addCriterion("fault_number in", values, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberNotIn(List<Integer> values) {
            addCriterion("fault_number not in", values, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberBetween(Integer value1, Integer value2) {
            addCriterion("fault_number between", value1, value2, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andFaultNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fault_number not between", value1, value2, "faultNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberIsNull() {
            addCriterion("event_number is null");
            return (Criteria) this;
        }

        public Criteria andEventNumberIsNotNull() {
            addCriterion("event_number is not null");
            return (Criteria) this;
        }

        public Criteria andEventNumberEqualTo(Integer value) {
            addCriterion("event_number =", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotEqualTo(Integer value) {
            addCriterion("event_number <>", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberGreaterThan(Integer value) {
            addCriterion("event_number >", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_number >=", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberLessThan(Integer value) {
            addCriterion("event_number <", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberLessThanOrEqualTo(Integer value) {
            addCriterion("event_number <=", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberIn(List<Integer> values) {
            addCriterion("event_number in", values, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotIn(List<Integer> values) {
            addCriterion("event_number not in", values, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberBetween(Integer value1, Integer value2) {
            addCriterion("event_number between", value1, value2, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("event_number not between", value1, value2, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberIsNull() {
            addCriterion("hidden_number is null");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberIsNotNull() {
            addCriterion("hidden_number is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberEqualTo(Integer value) {
            addCriterion("hidden_number =", value, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberNotEqualTo(Integer value) {
            addCriterion("hidden_number <>", value, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberGreaterThan(Integer value) {
            addCriterion("hidden_number >", value, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hidden_number >=", value, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberLessThan(Integer value) {
            addCriterion("hidden_number <", value, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberLessThanOrEqualTo(Integer value) {
            addCriterion("hidden_number <=", value, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberIn(List<Integer> values) {
            addCriterion("hidden_number in", values, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberNotIn(List<Integer> values) {
            addCriterion("hidden_number not in", values, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberBetween(Integer value1, Integer value2) {
            addCriterion("hidden_number between", value1, value2, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hidden_number not between", value1, value2, "hiddenNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberIsNull() {
            addCriterion("hidden_handle_number is null");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberIsNotNull() {
            addCriterion("hidden_handle_number is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberEqualTo(Integer value) {
            addCriterion("hidden_handle_number =", value, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberNotEqualTo(Integer value) {
            addCriterion("hidden_handle_number <>", value, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberGreaterThan(Integer value) {
            addCriterion("hidden_handle_number >", value, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hidden_handle_number >=", value, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberLessThan(Integer value) {
            addCriterion("hidden_handle_number <", value, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("hidden_handle_number <=", value, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberIn(List<Integer> values) {
            addCriterion("hidden_handle_number in", values, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberNotIn(List<Integer> values) {
            addCriterion("hidden_handle_number not in", values, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberBetween(Integer value1, Integer value2) {
            addCriterion("hidden_handle_number between", value1, value2, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andHiddenHandleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hidden_handle_number not between", value1, value2, "hiddenHandleNumber");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mIsNull() {
            addCriterion("fire_handle_in_15m is null");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mIsNotNull() {
            addCriterion("fire_handle_in_15m is not null");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mEqualTo(Integer value) {
            addCriterion("fire_handle_in_15m =", value, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mNotEqualTo(Integer value) {
            addCriterion("fire_handle_in_15m <>", value, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mGreaterThan(Integer value) {
            addCriterion("fire_handle_in_15m >", value, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mGreaterThanOrEqualTo(Integer value) {
            addCriterion("fire_handle_in_15m >=", value, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mLessThan(Integer value) {
            addCriterion("fire_handle_in_15m <", value, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mLessThanOrEqualTo(Integer value) {
            addCriterion("fire_handle_in_15m <=", value, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mIn(List<Integer> values) {
            addCriterion("fire_handle_in_15m in", values, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mNotIn(List<Integer> values) {
            addCriterion("fire_handle_in_15m not in", values, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mBetween(Integer value1, Integer value2) {
            addCriterion("fire_handle_in_15m between", value1, value2, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn15mNotBetween(Integer value1, Integer value2) {
            addCriterion("fire_handle_in_15m not between", value1, value2, "fireHandleIn15m");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hIsNull() {
            addCriterion("fire_handle_in_1h is null");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hIsNotNull() {
            addCriterion("fire_handle_in_1h is not null");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hEqualTo(Integer value) {
            addCriterion("fire_handle_in_1h =", value, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hNotEqualTo(Integer value) {
            addCriterion("fire_handle_in_1h <>", value, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hGreaterThan(Integer value) {
            addCriterion("fire_handle_in_1h >", value, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hGreaterThanOrEqualTo(Integer value) {
            addCriterion("fire_handle_in_1h >=", value, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hLessThan(Integer value) {
            addCriterion("fire_handle_in_1h <", value, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hLessThanOrEqualTo(Integer value) {
            addCriterion("fire_handle_in_1h <=", value, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hIn(List<Integer> values) {
            addCriterion("fire_handle_in_1h in", values, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hNotIn(List<Integer> values) {
            addCriterion("fire_handle_in_1h not in", values, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hBetween(Integer value1, Integer value2) {
            addCriterion("fire_handle_in_1h between", value1, value2, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1hNotBetween(Integer value1, Integer value2) {
            addCriterion("fire_handle_in_1h not between", value1, value2, "fireHandleIn1h");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dIsNull() {
            addCriterion("fire_handle_in_1d is null");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dIsNotNull() {
            addCriterion("fire_handle_in_1d is not null");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dEqualTo(Integer value) {
            addCriterion("fire_handle_in_1d =", value, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dNotEqualTo(Integer value) {
            addCriterion("fire_handle_in_1d <>", value, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dGreaterThan(Integer value) {
            addCriterion("fire_handle_in_1d >", value, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dGreaterThanOrEqualTo(Integer value) {
            addCriterion("fire_handle_in_1d >=", value, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dLessThan(Integer value) {
            addCriterion("fire_handle_in_1d <", value, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dLessThanOrEqualTo(Integer value) {
            addCriterion("fire_handle_in_1d <=", value, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dIn(List<Integer> values) {
            addCriterion("fire_handle_in_1d in", values, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dNotIn(List<Integer> values) {
            addCriterion("fire_handle_in_1d not in", values, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dBetween(Integer value1, Integer value2) {
            addCriterion("fire_handle_in_1d between", value1, value2, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleIn1dNotBetween(Integer value1, Integer value2) {
            addCriterion("fire_handle_in_1d not between", value1, value2, "fireHandleIn1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dIsNull() {
            addCriterion("fire_handle_after_1d is null");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dIsNotNull() {
            addCriterion("fire_handle_after_1d is not null");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dEqualTo(Integer value) {
            addCriterion("fire_handle_after_1d =", value, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dNotEqualTo(Integer value) {
            addCriterion("fire_handle_after_1d <>", value, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dGreaterThan(Integer value) {
            addCriterion("fire_handle_after_1d >", value, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dGreaterThanOrEqualTo(Integer value) {
            addCriterion("fire_handle_after_1d >=", value, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dLessThan(Integer value) {
            addCriterion("fire_handle_after_1d <", value, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dLessThanOrEqualTo(Integer value) {
            addCriterion("fire_handle_after_1d <=", value, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dIn(List<Integer> values) {
            addCriterion("fire_handle_after_1d in", values, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dNotIn(List<Integer> values) {
            addCriterion("fire_handle_after_1d not in", values, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dBetween(Integer value1, Integer value2) {
            addCriterion("fire_handle_after_1d between", value1, value2, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andFireHandleAfter1dNotBetween(Integer value1, Integer value2) {
            addCriterion("fire_handle_after_1d not between", value1, value2, "fireHandleAfter1d");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(Integer value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(Integer value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(Integer value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(Integer value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(Integer value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<Integer> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<Integer> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(Integer value1, Integer value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberIsNull() {
            addCriterion("phone_fail_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberIsNotNull() {
            addCriterion("phone_fail_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberEqualTo(Integer value) {
            addCriterion("phone_fail_number =", value, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberNotEqualTo(Integer value) {
            addCriterion("phone_fail_number <>", value, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberGreaterThan(Integer value) {
            addCriterion("phone_fail_number >", value, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_fail_number >=", value, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberLessThan(Integer value) {
            addCriterion("phone_fail_number <", value, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberLessThanOrEqualTo(Integer value) {
            addCriterion("phone_fail_number <=", value, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberIn(List<Integer> values) {
            addCriterion("phone_fail_number in", values, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberNotIn(List<Integer> values) {
            addCriterion("phone_fail_number not in", values, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberBetween(Integer value1, Integer value2) {
            addCriterion("phone_fail_number between", value1, value2, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneFailNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_fail_number not between", value1, value2, "phoneFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberIsNull() {
            addCriterion("message_number is null");
            return (Criteria) this;
        }

        public Criteria andMessageNumberIsNotNull() {
            addCriterion("message_number is not null");
            return (Criteria) this;
        }

        public Criteria andMessageNumberEqualTo(Integer value) {
            addCriterion("message_number =", value, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberNotEqualTo(Integer value) {
            addCriterion("message_number <>", value, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberGreaterThan(Integer value) {
            addCriterion("message_number >", value, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_number >=", value, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberLessThan(Integer value) {
            addCriterion("message_number <", value, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberLessThanOrEqualTo(Integer value) {
            addCriterion("message_number <=", value, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberIn(List<Integer> values) {
            addCriterion("message_number in", values, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberNotIn(List<Integer> values) {
            addCriterion("message_number not in", values, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberBetween(Integer value1, Integer value2) {
            addCriterion("message_number between", value1, value2, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("message_number not between", value1, value2, "messageNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberIsNull() {
            addCriterion("message_fail_number is null");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberIsNotNull() {
            addCriterion("message_fail_number is not null");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberEqualTo(Integer value) {
            addCriterion("message_fail_number =", value, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberNotEqualTo(Integer value) {
            addCriterion("message_fail_number <>", value, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberGreaterThan(Integer value) {
            addCriterion("message_fail_number >", value, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_fail_number >=", value, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberLessThan(Integer value) {
            addCriterion("message_fail_number <", value, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberLessThanOrEqualTo(Integer value) {
            addCriterion("message_fail_number <=", value, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberIn(List<Integer> values) {
            addCriterion("message_fail_number in", values, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberNotIn(List<Integer> values) {
            addCriterion("message_fail_number not in", values, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberBetween(Integer value1, Integer value2) {
            addCriterion("message_fail_number between", value1, value2, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andMessageFailNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("message_fail_number not between", value1, value2, "messageFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberIsNull() {
            addCriterion("app_push_number is null");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberIsNotNull() {
            addCriterion("app_push_number is not null");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberEqualTo(Integer value) {
            addCriterion("app_push_number =", value, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberNotEqualTo(Integer value) {
            addCriterion("app_push_number <>", value, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberGreaterThan(Integer value) {
            addCriterion("app_push_number >", value, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_push_number >=", value, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberLessThan(Integer value) {
            addCriterion("app_push_number <", value, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberLessThanOrEqualTo(Integer value) {
            addCriterion("app_push_number <=", value, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberIn(List<Integer> values) {
            addCriterion("app_push_number in", values, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberNotIn(List<Integer> values) {
            addCriterion("app_push_number not in", values, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberBetween(Integer value1, Integer value2) {
            addCriterion("app_push_number between", value1, value2, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("app_push_number not between", value1, value2, "appPushNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberIsNull() {
            addCriterion("app_push_fail_number is null");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberIsNotNull() {
            addCriterion("app_push_fail_number is not null");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberEqualTo(Integer value) {
            addCriterion("app_push_fail_number =", value, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberNotEqualTo(Integer value) {
            addCriterion("app_push_fail_number <>", value, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberGreaterThan(Integer value) {
            addCriterion("app_push_fail_number >", value, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_push_fail_number >=", value, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberLessThan(Integer value) {
            addCriterion("app_push_fail_number <", value, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberLessThanOrEqualTo(Integer value) {
            addCriterion("app_push_fail_number <=", value, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberIn(List<Integer> values) {
            addCriterion("app_push_fail_number in", values, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberNotIn(List<Integer> values) {
            addCriterion("app_push_fail_number not in", values, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberBetween(Integer value1, Integer value2) {
            addCriterion("app_push_fail_number between", value1, value2, "appPushFailNumber");
            return (Criteria) this;
        }

        public Criteria andAppPushFailNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("app_push_fail_number not between", value1, value2, "appPushFailNumber");
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
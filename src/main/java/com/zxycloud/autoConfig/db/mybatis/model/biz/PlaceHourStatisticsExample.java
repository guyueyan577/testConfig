package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class PlaceHourStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaceHourStatisticsExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNull() {
            addCriterion("segment1 is null");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNotNull() {
            addCriterion("segment1 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1EqualTo(Integer value) {
            addCriterion("segment1 =", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotEqualTo(Integer value) {
            addCriterion("segment1 <>", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThan(Integer value) {
            addCriterion("segment1 >", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment1 >=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThan(Integer value) {
            addCriterion("segment1 <", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThanOrEqualTo(Integer value) {
            addCriterion("segment1 <=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1In(List<Integer> values) {
            addCriterion("segment1 in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotIn(List<Integer> values) {
            addCriterion("segment1 not in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Between(Integer value1, Integer value2) {
            addCriterion("segment1 between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotBetween(Integer value1, Integer value2) {
            addCriterion("segment1 not between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNull() {
            addCriterion("segment2 is null");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNotNull() {
            addCriterion("segment2 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2EqualTo(Integer value) {
            addCriterion("segment2 =", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotEqualTo(Integer value) {
            addCriterion("segment2 <>", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThan(Integer value) {
            addCriterion("segment2 >", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment2 >=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThan(Integer value) {
            addCriterion("segment2 <", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThanOrEqualTo(Integer value) {
            addCriterion("segment2 <=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2In(List<Integer> values) {
            addCriterion("segment2 in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotIn(List<Integer> values) {
            addCriterion("segment2 not in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Between(Integer value1, Integer value2) {
            addCriterion("segment2 between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotBetween(Integer value1, Integer value2) {
            addCriterion("segment2 not between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNull() {
            addCriterion("segment3 is null");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNotNull() {
            addCriterion("segment3 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3EqualTo(Integer value) {
            addCriterion("segment3 =", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotEqualTo(Integer value) {
            addCriterion("segment3 <>", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThan(Integer value) {
            addCriterion("segment3 >", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment3 >=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThan(Integer value) {
            addCriterion("segment3 <", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThanOrEqualTo(Integer value) {
            addCriterion("segment3 <=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3In(List<Integer> values) {
            addCriterion("segment3 in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotIn(List<Integer> values) {
            addCriterion("segment3 not in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Between(Integer value1, Integer value2) {
            addCriterion("segment3 between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotBetween(Integer value1, Integer value2) {
            addCriterion("segment3 not between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNull() {
            addCriterion("segment4 is null");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNotNull() {
            addCriterion("segment4 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4EqualTo(Integer value) {
            addCriterion("segment4 =", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotEqualTo(Integer value) {
            addCriterion("segment4 <>", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThan(Integer value) {
            addCriterion("segment4 >", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment4 >=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThan(Integer value) {
            addCriterion("segment4 <", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThanOrEqualTo(Integer value) {
            addCriterion("segment4 <=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4In(List<Integer> values) {
            addCriterion("segment4 in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotIn(List<Integer> values) {
            addCriterion("segment4 not in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Between(Integer value1, Integer value2) {
            addCriterion("segment4 between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotBetween(Integer value1, Integer value2) {
            addCriterion("segment4 not between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNull() {
            addCriterion("segment5 is null");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNotNull() {
            addCriterion("segment5 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment5EqualTo(Integer value) {
            addCriterion("segment5 =", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotEqualTo(Integer value) {
            addCriterion("segment5 <>", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThan(Integer value) {
            addCriterion("segment5 >", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment5 >=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThan(Integer value) {
            addCriterion("segment5 <", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThanOrEqualTo(Integer value) {
            addCriterion("segment5 <=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5In(List<Integer> values) {
            addCriterion("segment5 in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotIn(List<Integer> values) {
            addCriterion("segment5 not in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Between(Integer value1, Integer value2) {
            addCriterion("segment5 between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotBetween(Integer value1, Integer value2) {
            addCriterion("segment5 not between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNull() {
            addCriterion("segment6 is null");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNotNull() {
            addCriterion("segment6 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment6EqualTo(Integer value) {
            addCriterion("segment6 =", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotEqualTo(Integer value) {
            addCriterion("segment6 <>", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThan(Integer value) {
            addCriterion("segment6 >", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment6 >=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThan(Integer value) {
            addCriterion("segment6 <", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThanOrEqualTo(Integer value) {
            addCriterion("segment6 <=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6In(List<Integer> values) {
            addCriterion("segment6 in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotIn(List<Integer> values) {
            addCriterion("segment6 not in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Between(Integer value1, Integer value2) {
            addCriterion("segment6 between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotBetween(Integer value1, Integer value2) {
            addCriterion("segment6 not between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNull() {
            addCriterion("segment7 is null");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNotNull() {
            addCriterion("segment7 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment7EqualTo(Integer value) {
            addCriterion("segment7 =", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotEqualTo(Integer value) {
            addCriterion("segment7 <>", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThan(Integer value) {
            addCriterion("segment7 >", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment7 >=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThan(Integer value) {
            addCriterion("segment7 <", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThanOrEqualTo(Integer value) {
            addCriterion("segment7 <=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7In(List<Integer> values) {
            addCriterion("segment7 in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotIn(List<Integer> values) {
            addCriterion("segment7 not in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Between(Integer value1, Integer value2) {
            addCriterion("segment7 between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotBetween(Integer value1, Integer value2) {
            addCriterion("segment7 not between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment8IsNull() {
            addCriterion("segment8 is null");
            return (Criteria) this;
        }

        public Criteria andSegment8IsNotNull() {
            addCriterion("segment8 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment8EqualTo(Integer value) {
            addCriterion("segment8 =", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotEqualTo(Integer value) {
            addCriterion("segment8 <>", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8GreaterThan(Integer value) {
            addCriterion("segment8 >", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment8 >=", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8LessThan(Integer value) {
            addCriterion("segment8 <", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8LessThanOrEqualTo(Integer value) {
            addCriterion("segment8 <=", value, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8In(List<Integer> values) {
            addCriterion("segment8 in", values, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotIn(List<Integer> values) {
            addCriterion("segment8 not in", values, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8Between(Integer value1, Integer value2) {
            addCriterion("segment8 between", value1, value2, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment8NotBetween(Integer value1, Integer value2) {
            addCriterion("segment8 not between", value1, value2, "segment8");
            return (Criteria) this;
        }

        public Criteria andSegment9IsNull() {
            addCriterion("segment9 is null");
            return (Criteria) this;
        }

        public Criteria andSegment9IsNotNull() {
            addCriterion("segment9 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment9EqualTo(Integer value) {
            addCriterion("segment9 =", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotEqualTo(Integer value) {
            addCriterion("segment9 <>", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9GreaterThan(Integer value) {
            addCriterion("segment9 >", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment9 >=", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9LessThan(Integer value) {
            addCriterion("segment9 <", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9LessThanOrEqualTo(Integer value) {
            addCriterion("segment9 <=", value, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9In(List<Integer> values) {
            addCriterion("segment9 in", values, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotIn(List<Integer> values) {
            addCriterion("segment9 not in", values, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9Between(Integer value1, Integer value2) {
            addCriterion("segment9 between", value1, value2, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment9NotBetween(Integer value1, Integer value2) {
            addCriterion("segment9 not between", value1, value2, "segment9");
            return (Criteria) this;
        }

        public Criteria andSegment10IsNull() {
            addCriterion("segment10 is null");
            return (Criteria) this;
        }

        public Criteria andSegment10IsNotNull() {
            addCriterion("segment10 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment10EqualTo(Integer value) {
            addCriterion("segment10 =", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotEqualTo(Integer value) {
            addCriterion("segment10 <>", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10GreaterThan(Integer value) {
            addCriterion("segment10 >", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment10 >=", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10LessThan(Integer value) {
            addCriterion("segment10 <", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10LessThanOrEqualTo(Integer value) {
            addCriterion("segment10 <=", value, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10In(List<Integer> values) {
            addCriterion("segment10 in", values, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotIn(List<Integer> values) {
            addCriterion("segment10 not in", values, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10Between(Integer value1, Integer value2) {
            addCriterion("segment10 between", value1, value2, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment10NotBetween(Integer value1, Integer value2) {
            addCriterion("segment10 not between", value1, value2, "segment10");
            return (Criteria) this;
        }

        public Criteria andSegment11IsNull() {
            addCriterion("segment11 is null");
            return (Criteria) this;
        }

        public Criteria andSegment11IsNotNull() {
            addCriterion("segment11 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment11EqualTo(Integer value) {
            addCriterion("segment11 =", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotEqualTo(Integer value) {
            addCriterion("segment11 <>", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11GreaterThan(Integer value) {
            addCriterion("segment11 >", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment11 >=", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11LessThan(Integer value) {
            addCriterion("segment11 <", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11LessThanOrEqualTo(Integer value) {
            addCriterion("segment11 <=", value, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11In(List<Integer> values) {
            addCriterion("segment11 in", values, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotIn(List<Integer> values) {
            addCriterion("segment11 not in", values, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11Between(Integer value1, Integer value2) {
            addCriterion("segment11 between", value1, value2, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment11NotBetween(Integer value1, Integer value2) {
            addCriterion("segment11 not between", value1, value2, "segment11");
            return (Criteria) this;
        }

        public Criteria andSegment12IsNull() {
            addCriterion("segment12 is null");
            return (Criteria) this;
        }

        public Criteria andSegment12IsNotNull() {
            addCriterion("segment12 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment12EqualTo(Integer value) {
            addCriterion("segment12 =", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotEqualTo(Integer value) {
            addCriterion("segment12 <>", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12GreaterThan(Integer value) {
            addCriterion("segment12 >", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12GreaterThanOrEqualTo(Integer value) {
            addCriterion("segment12 >=", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12LessThan(Integer value) {
            addCriterion("segment12 <", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12LessThanOrEqualTo(Integer value) {
            addCriterion("segment12 <=", value, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12In(List<Integer> values) {
            addCriterion("segment12 in", values, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotIn(List<Integer> values) {
            addCriterion("segment12 not in", values, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12Between(Integer value1, Integer value2) {
            addCriterion("segment12 between", value1, value2, "segment12");
            return (Criteria) this;
        }

        public Criteria andSegment12NotBetween(Integer value1, Integer value2) {
            addCriterion("segment12 not between", value1, value2, "segment12");
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
package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PushrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PushrecordExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateRemarkIsNull() {
            addCriterion("state_remark is null");
            return (Criteria) this;
        }

        public Criteria andStateRemarkIsNotNull() {
            addCriterion("state_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStateRemarkEqualTo(String value) {
            addCriterion("state_remark =", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkNotEqualTo(String value) {
            addCriterion("state_remark <>", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkGreaterThan(String value) {
            addCriterion("state_remark >", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("state_remark >=", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkLessThan(String value) {
            addCriterion("state_remark <", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkLessThanOrEqualTo(String value) {
            addCriterion("state_remark <=", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkLike(String value) {
            addCriterion("state_remark like", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkNotLike(String value) {
            addCriterion("state_remark not like", value, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkIn(List<String> values) {
            addCriterion("state_remark in", values, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkNotIn(List<String> values) {
            addCriterion("state_remark not in", values, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkBetween(String value1, String value2) {
            addCriterion("state_remark between", value1, value2, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateRemarkNotBetween(String value1, String value2) {
            addCriterion("state_remark not between", value1, value2, "stateRemark");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNull() {
            addCriterion("state_code is null");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNotNull() {
            addCriterion("state_code is not null");
            return (Criteria) this;
        }

        public Criteria andStateCodeEqualTo(String value) {
            addCriterion("state_code =", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotEqualTo(String value) {
            addCriterion("state_code <>", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThan(String value) {
            addCriterion("state_code >", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("state_code >=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThan(String value) {
            addCriterion("state_code <", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThanOrEqualTo(String value) {
            addCriterion("state_code <=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLike(String value) {
            addCriterion("state_code like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotLike(String value) {
            addCriterion("state_code not like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIn(List<String> values) {
            addCriterion("state_code in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotIn(List<String> values) {
            addCriterion("state_code not in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeBetween(String value1, String value2) {
            addCriterion("state_code between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotBetween(String value1, String value2) {
            addCriterion("state_code not between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdIsNull() {
            addCriterion("app_type_id is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdIsNotNull() {
            addCriterion("app_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdEqualTo(Integer value) {
            addCriterion("app_type_id =", value, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdNotEqualTo(Integer value) {
            addCriterion("app_type_id <>", value, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdGreaterThan(Integer value) {
            addCriterion("app_type_id >", value, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_type_id >=", value, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdLessThan(Integer value) {
            addCriterion("app_type_id <", value, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_type_id <=", value, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdIn(List<Integer> values) {
            addCriterion("app_type_id in", values, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdNotIn(List<Integer> values) {
            addCriterion("app_type_id not in", values, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("app_type_id between", value1, value2, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_type_id not between", value1, value2, "appTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNull() {
            addCriterion("request_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("request_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("request_id =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("request_id <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("request_id >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("request_id >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("request_id <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("request_id <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("request_id like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("request_id not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("request_id in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("request_id not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("request_id between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("request_id not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andCallSidIsNull() {
            addCriterion("call_sid is null");
            return (Criteria) this;
        }

        public Criteria andCallSidIsNotNull() {
            addCriterion("call_sid is not null");
            return (Criteria) this;
        }

        public Criteria andCallSidEqualTo(String value) {
            addCriterion("call_sid =", value, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidNotEqualTo(String value) {
            addCriterion("call_sid <>", value, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidGreaterThan(String value) {
            addCriterion("call_sid >", value, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidGreaterThanOrEqualTo(String value) {
            addCriterion("call_sid >=", value, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidLessThan(String value) {
            addCriterion("call_sid <", value, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidLessThanOrEqualTo(String value) {
            addCriterion("call_sid <=", value, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidLike(String value) {
            addCriterion("call_sid like", value, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidNotLike(String value) {
            addCriterion("call_sid not like", value, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidIn(List<String> values) {
            addCriterion("call_sid in", values, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidNotIn(List<String> values) {
            addCriterion("call_sid not in", values, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidBetween(String value1, String value2) {
            addCriterion("call_sid between", value1, value2, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallSidNotBetween(String value1, String value2) {
            addCriterion("call_sid not between", value1, value2, "callSid");
            return (Criteria) this;
        }

        public Criteria andCallTimeIsNull() {
            addCriterion("call_time is null");
            return (Criteria) this;
        }

        public Criteria andCallTimeIsNotNull() {
            addCriterion("call_time is not null");
            return (Criteria) this;
        }

        public Criteria andCallTimeEqualTo(Integer value) {
            addCriterion("call_time =", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotEqualTo(Integer value) {
            addCriterion("call_time <>", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeGreaterThan(Integer value) {
            addCriterion("call_time >", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_time >=", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeLessThan(Integer value) {
            addCriterion("call_time <", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeLessThanOrEqualTo(Integer value) {
            addCriterion("call_time <=", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeIn(List<Integer> values) {
            addCriterion("call_time in", values, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotIn(List<Integer> values) {
            addCriterion("call_time not in", values, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeBetween(Integer value1, Integer value2) {
            addCriterion("call_time between", value1, value2, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("call_time not between", value1, value2, "callTime");
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

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionIsNull() {
            addCriterion("hangup_direction is null");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionIsNotNull() {
            addCriterion("hangup_direction is not null");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionEqualTo(String value) {
            addCriterion("hangup_direction =", value, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionNotEqualTo(String value) {
            addCriterion("hangup_direction <>", value, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionGreaterThan(String value) {
            addCriterion("hangup_direction >", value, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("hangup_direction >=", value, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionLessThan(String value) {
            addCriterion("hangup_direction <", value, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionLessThanOrEqualTo(String value) {
            addCriterion("hangup_direction <=", value, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionLike(String value) {
            addCriterion("hangup_direction like", value, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionNotLike(String value) {
            addCriterion("hangup_direction not like", value, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionIn(List<String> values) {
            addCriterion("hangup_direction in", values, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionNotIn(List<String> values) {
            addCriterion("hangup_direction not in", values, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionBetween(String value1, String value2) {
            addCriterion("hangup_direction between", value1, value2, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andHangupDirectionNotBetween(String value1, String value2) {
            addCriterion("hangup_direction not between", value1, value2, "hangupDirection");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidIsNull() {
            addCriterion("device_guid is null");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidIsNotNull() {
            addCriterion("device_guid is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidEqualTo(String value) {
            addCriterion("device_guid =", value, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidNotEqualTo(String value) {
            addCriterion("device_guid <>", value, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidGreaterThan(String value) {
            addCriterion("device_guid >", value, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidGreaterThanOrEqualTo(String value) {
            addCriterion("device_guid >=", value, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidLessThan(String value) {
            addCriterion("device_guid <", value, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidLessThanOrEqualTo(String value) {
            addCriterion("device_guid <=", value, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidLike(String value) {
            addCriterion("device_guid like", value, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidNotLike(String value) {
            addCriterion("device_guid not like", value, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidIn(List<String> values) {
            addCriterion("device_guid in", values, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidNotIn(List<String> values) {
            addCriterion("device_guid not in", values, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidBetween(String value1, String value2) {
            addCriterion("device_guid between", value1, value2, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andDeviceGuidNotBetween(String value1, String value2) {
            addCriterion("device_guid not between", value1, value2, "deviceGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidIsNull() {
            addCriterion("place_guid is null");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidIsNotNull() {
            addCriterion("place_guid is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidEqualTo(String value) {
            addCriterion("place_guid =", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidNotEqualTo(String value) {
            addCriterion("place_guid <>", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidGreaterThan(String value) {
            addCriterion("place_guid >", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidGreaterThanOrEqualTo(String value) {
            addCriterion("place_guid >=", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidLessThan(String value) {
            addCriterion("place_guid <", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidLessThanOrEqualTo(String value) {
            addCriterion("place_guid <=", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidLike(String value) {
            addCriterion("place_guid like", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidNotLike(String value) {
            addCriterion("place_guid not like", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidIn(List<String> values) {
            addCriterion("place_guid in", values, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidNotIn(List<String> values) {
            addCriterion("place_guid not in", values, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidBetween(String value1, String value2) {
            addCriterion("place_guid between", value1, value2, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidNotBetween(String value1, String value2) {
            addCriterion("place_guid not between", value1, value2, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidIsNull() {
            addCriterion("project_guid is null");
            return (Criteria) this;
        }

        public Criteria andProjectGuidIsNotNull() {
            addCriterion("project_guid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGuidEqualTo(String value) {
            addCriterion("project_guid =", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotEqualTo(String value) {
            addCriterion("project_guid <>", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidGreaterThan(String value) {
            addCriterion("project_guid >", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidGreaterThanOrEqualTo(String value) {
            addCriterion("project_guid >=", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLessThan(String value) {
            addCriterion("project_guid <", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLessThanOrEqualTo(String value) {
            addCriterion("project_guid <=", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLike(String value) {
            addCriterion("project_guid like", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotLike(String value) {
            addCriterion("project_guid not like", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidIn(List<String> values) {
            addCriterion("project_guid in", values, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotIn(List<String> values) {
            addCriterion("project_guid not in", values, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidBetween(String value1, String value2) {
            addCriterion("project_guid between", value1, value2, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotBetween(String value1, String value2) {
            addCriterion("project_guid not between", value1, value2, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAlertIdIsNull() {
            addCriterion("alert_id is null");
            return (Criteria) this;
        }

        public Criteria andAlertIdIsNotNull() {
            addCriterion("alert_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlertIdEqualTo(String value) {
            addCriterion("alert_id =", value, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdNotEqualTo(String value) {
            addCriterion("alert_id <>", value, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdGreaterThan(String value) {
            addCriterion("alert_id >", value, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdGreaterThanOrEqualTo(String value) {
            addCriterion("alert_id >=", value, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdLessThan(String value) {
            addCriterion("alert_id <", value, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdLessThanOrEqualTo(String value) {
            addCriterion("alert_id <=", value, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdLike(String value) {
            addCriterion("alert_id like", value, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdNotLike(String value) {
            addCriterion("alert_id not like", value, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdIn(List<String> values) {
            addCriterion("alert_id in", values, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdNotIn(List<String> values) {
            addCriterion("alert_id not in", values, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdBetween(String value1, String value2) {
            addCriterion("alert_id between", value1, value2, "alertId");
            return (Criteria) this;
        }

        public Criteria andAlertIdNotBetween(String value1, String value2) {
            addCriterion("alert_id not between", value1, value2, "alertId");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPushIdIsNull() {
            addCriterion("push_id is null");
            return (Criteria) this;
        }

        public Criteria andPushIdIsNotNull() {
            addCriterion("push_id is not null");
            return (Criteria) this;
        }

        public Criteria andPushIdEqualTo(String value) {
            addCriterion("push_id =", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotEqualTo(String value) {
            addCriterion("push_id <>", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdGreaterThan(String value) {
            addCriterion("push_id >", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdGreaterThanOrEqualTo(String value) {
            addCriterion("push_id >=", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdLessThan(String value) {
            addCriterion("push_id <", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdLessThanOrEqualTo(String value) {
            addCriterion("push_id <=", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdLike(String value) {
            addCriterion("push_id like", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotLike(String value) {
            addCriterion("push_id not like", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdIn(List<String> values) {
            addCriterion("push_id in", values, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotIn(List<String> values) {
            addCriterion("push_id not in", values, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdBetween(String value1, String value2) {
            addCriterion("push_id between", value1, value2, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotBetween(String value1, String value2) {
            addCriterion("push_id not between", value1, value2, "pushId");
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
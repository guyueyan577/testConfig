package com.zxycloud.autoConfig.db.mybatis.model.projectpermission;

import java.util.ArrayList;
import java.util.List;

public class PVerficationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PVerficationExample() {
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

        public Criteria andVerificationNumberIsNull() {
            addCriterion("verification_number is null");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberIsNotNull() {
            addCriterion("verification_number is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberEqualTo(String value) {
            addCriterion("verification_number =", value, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberNotEqualTo(String value) {
            addCriterion("verification_number <>", value, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberGreaterThan(String value) {
            addCriterion("verification_number >", value, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("verification_number >=", value, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberLessThan(String value) {
            addCriterion("verification_number <", value, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberLessThanOrEqualTo(String value) {
            addCriterion("verification_number <=", value, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberLike(String value) {
            addCriterion("verification_number like", value, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberNotLike(String value) {
            addCriterion("verification_number not like", value, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberIn(List<String> values) {
            addCriterion("verification_number in", values, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberNotIn(List<String> values) {
            addCriterion("verification_number not in", values, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberBetween(String value1, String value2) {
            addCriterion("verification_number between", value1, value2, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationNumberNotBetween(String value1, String value2) {
            addCriterion("verification_number not between", value1, value2, "verificationNumber");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNull() {
            addCriterion("verification_code is null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNotNull() {
            addCriterion("verification_code is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeEqualTo(String value) {
            addCriterion("verification_code =", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotEqualTo(String value) {
            addCriterion("verification_code <>", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThan(String value) {
            addCriterion("verification_code >", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("verification_code >=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThan(String value) {
            addCriterion("verification_code <", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThanOrEqualTo(String value) {
            addCriterion("verification_code <=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLike(String value) {
            addCriterion("verification_code like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotLike(String value) {
            addCriterion("verification_code not like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIn(List<String> values) {
            addCriterion("verification_code in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotIn(List<String> values) {
            addCriterion("verification_code not in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeBetween(String value1, String value2) {
            addCriterion("verification_code between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotBetween(String value1, String value2) {
            addCriterion("verification_code not between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeIsNull() {
            addCriterion("verification_request_time is null");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeIsNotNull() {
            addCriterion("verification_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeEqualTo(Long value) {
            addCriterion("verification_request_time =", value, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeNotEqualTo(Long value) {
            addCriterion("verification_request_time <>", value, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeGreaterThan(Long value) {
            addCriterion("verification_request_time >", value, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("verification_request_time >=", value, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeLessThan(Long value) {
            addCriterion("verification_request_time <", value, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeLessThanOrEqualTo(Long value) {
            addCriterion("verification_request_time <=", value, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeIn(List<Long> values) {
            addCriterion("verification_request_time in", values, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeNotIn(List<Long> values) {
            addCriterion("verification_request_time not in", values, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeBetween(Long value1, Long value2) {
            addCriterion("verification_request_time between", value1, value2, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestTimeNotBetween(Long value1, Long value2) {
            addCriterion("verification_request_time not between", value1, value2, "verificationRequestTime");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateIsNull() {
            addCriterion("verification_request_state is null");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateIsNotNull() {
            addCriterion("verification_request_state is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateEqualTo(String value) {
            addCriterion("verification_request_state =", value, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateNotEqualTo(String value) {
            addCriterion("verification_request_state <>", value, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateGreaterThan(String value) {
            addCriterion("verification_request_state >", value, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateGreaterThanOrEqualTo(String value) {
            addCriterion("verification_request_state >=", value, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateLessThan(String value) {
            addCriterion("verification_request_state <", value, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateLessThanOrEqualTo(String value) {
            addCriterion("verification_request_state <=", value, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateLike(String value) {
            addCriterion("verification_request_state like", value, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateNotLike(String value) {
            addCriterion("verification_request_state not like", value, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateIn(List<String> values) {
            addCriterion("verification_request_state in", values, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateNotIn(List<String> values) {
            addCriterion("verification_request_state not in", values, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateBetween(String value1, String value2) {
            addCriterion("verification_request_state between", value1, value2, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationRequestStateNotBetween(String value1, String value2) {
            addCriterion("verification_request_state not between", value1, value2, "verificationRequestState");
            return (Criteria) this;
        }

        public Criteria andVerificationNumIsNull() {
            addCriterion("verification_num is null");
            return (Criteria) this;
        }

        public Criteria andVerificationNumIsNotNull() {
            addCriterion("verification_num is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationNumEqualTo(Integer value) {
            addCriterion("verification_num =", value, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumNotEqualTo(Integer value) {
            addCriterion("verification_num <>", value, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumGreaterThan(Integer value) {
            addCriterion("verification_num >", value, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("verification_num >=", value, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumLessThan(Integer value) {
            addCriterion("verification_num <", value, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumLessThanOrEqualTo(Integer value) {
            addCriterion("verification_num <=", value, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumIn(List<Integer> values) {
            addCriterion("verification_num in", values, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumNotIn(List<Integer> values) {
            addCriterion("verification_num not in", values, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumBetween(Integer value1, Integer value2) {
            addCriterion("verification_num between", value1, value2, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationNumNotBetween(Integer value1, Integer value2) {
            addCriterion("verification_num not between", value1, value2, "verificationNum");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeIsNull() {
            addCriterion("verification_type is null");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeIsNotNull() {
            addCriterion("verification_type is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeEqualTo(Integer value) {
            addCriterion("verification_type =", value, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeNotEqualTo(Integer value) {
            addCriterion("verification_type <>", value, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeGreaterThan(Integer value) {
            addCriterion("verification_type >", value, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("verification_type >=", value, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeLessThan(Integer value) {
            addCriterion("verification_type <", value, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("verification_type <=", value, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeIn(List<Integer> values) {
            addCriterion("verification_type in", values, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeNotIn(List<Integer> values) {
            addCriterion("verification_type not in", values, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeBetween(Integer value1, Integer value2) {
            addCriterion("verification_type between", value1, value2, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("verification_type not between", value1, value2, "verificationType");
            return (Criteria) this;
        }

        public Criteria andVerificationStateIsNull() {
            addCriterion("verification_state is null");
            return (Criteria) this;
        }

        public Criteria andVerificationStateIsNotNull() {
            addCriterion("verification_state is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationStateEqualTo(Integer value) {
            addCriterion("verification_state =", value, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateNotEqualTo(Integer value) {
            addCriterion("verification_state <>", value, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateGreaterThan(Integer value) {
            addCriterion("verification_state >", value, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("verification_state >=", value, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateLessThan(Integer value) {
            addCriterion("verification_state <", value, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateLessThanOrEqualTo(Integer value) {
            addCriterion("verification_state <=", value, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateIn(List<Integer> values) {
            addCriterion("verification_state in", values, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateNotIn(List<Integer> values) {
            addCriterion("verification_state not in", values, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateBetween(Integer value1, Integer value2) {
            addCriterion("verification_state between", value1, value2, "verificationState");
            return (Criteria) this;
        }

        public Criteria andVerificationStateNotBetween(Integer value1, Integer value2) {
            addCriterion("verification_state not between", value1, value2, "verificationState");
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
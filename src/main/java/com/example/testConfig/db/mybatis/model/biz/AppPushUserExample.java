package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppPushUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppPushUserExample() {
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

        public Criteria andTokenIdIsNull() {
            addCriterion("token_id is null");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("token_id is not null");
            return (Criteria) this;
        }

        public Criteria andTokenIdEqualTo(String value) {
            addCriterion("token_id =", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotEqualTo(String value) {
            addCriterion("token_id <>", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThan(String value) {
            addCriterion("token_id >", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(String value) {
            addCriterion("token_id >=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThan(String value) {
            addCriterion("token_id <", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(String value) {
            addCriterion("token_id <=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLike(String value) {
            addCriterion("token_id like", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotLike(String value) {
            addCriterion("token_id not like", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIn(List<String> values) {
            addCriterion("token_id in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotIn(List<String> values) {
            addCriterion("token_id not in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdBetween(String value1, String value2) {
            addCriterion("token_id between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotBetween(String value1, String value2) {
            addCriterion("token_id not between", value1, value2, "tokenId");
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

        public Criteria andServiceProviderIdIsNull() {
            addCriterion("service_provider_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdIsNotNull() {
            addCriterion("service_provider_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdEqualTo(Integer value) {
            addCriterion("service_provider_id =", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdNotEqualTo(Integer value) {
            addCriterion("service_provider_id <>", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdGreaterThan(Integer value) {
            addCriterion("service_provider_id >", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_provider_id >=", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdLessThan(Integer value) {
            addCriterion("service_provider_id <", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_provider_id <=", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdIn(List<Integer> values) {
            addCriterion("service_provider_id in", values, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdNotIn(List<Integer> values) {
            addCriterion("service_provider_id not in", values, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdBetween(Integer value1, Integer value2) {
            addCriterion("service_provider_id between", value1, value2, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_provider_id not between", value1, value2, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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
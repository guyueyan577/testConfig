package com.zxycloud.autoConfig.db.mybatis.model.permission;

import java.util.ArrayList;
import java.util.List;

public class ThirdCompanyAppkeyListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThirdCompanyAppkeyListExample() {
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

        public Criteria andAppkeyIsNull() {
            addCriterion("appkey is null");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNotNull() {
            addCriterion("appkey is not null");
            return (Criteria) this;
        }

        public Criteria andAppkeyEqualTo(String value) {
            addCriterion("appkey =", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotEqualTo(String value) {
            addCriterion("appkey <>", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThan(String value) {
            addCriterion("appkey >", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
            addCriterion("appkey >=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThan(String value) {
            addCriterion("appkey <", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThanOrEqualTo(String value) {
            addCriterion("appkey <=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLike(String value) {
            addCriterion("appkey like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotLike(String value) {
            addCriterion("appkey not like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyIn(List<String> values) {
            addCriterion("appkey in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotIn(List<String> values) {
            addCriterion("appkey not in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyBetween(String value1, String value2) {
            addCriterion("appkey between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotBetween(String value1, String value2) {
            addCriterion("appkey not between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andSecretIsNull() {
            addCriterion("secret is null");
            return (Criteria) this;
        }

        public Criteria andSecretIsNotNull() {
            addCriterion("secret is not null");
            return (Criteria) this;
        }

        public Criteria andSecretEqualTo(String value) {
            addCriterion("secret =", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotEqualTo(String value) {
            addCriterion("secret <>", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThan(String value) {
            addCriterion("secret >", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThanOrEqualTo(String value) {
            addCriterion("secret >=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThan(String value) {
            addCriterion("secret <", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThanOrEqualTo(String value) {
            addCriterion("secret <=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLike(String value) {
            addCriterion("secret like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotLike(String value) {
            addCriterion("secret not like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretIn(List<String> values) {
            addCriterion("secret in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotIn(List<String> values) {
            addCriterion("secret not in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretBetween(String value1, String value2) {
            addCriterion("secret between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotBetween(String value1, String value2) {
            addCriterion("secret not between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(String value) {
            addCriterion("platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(String value) {
            addCriterion("platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(String value) {
            addCriterion("platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(String value) {
            addCriterion("platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(String value) {
            addCriterion("platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLike(String value) {
            addCriterion("platform_id like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotLike(String value) {
            addCriterion("platform_id not like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<String> values) {
            addCriterion("platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<String> values) {
            addCriterion("platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(String value1, String value2) {
            addCriterion("platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(String value1, String value2) {
            addCriterion("platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIsNull() {
            addCriterion("platform_name is null");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIsNotNull() {
            addCriterion("platform_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformNameEqualTo(String value) {
            addCriterion("platform_name =", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotEqualTo(String value) {
            addCriterion("platform_name <>", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameGreaterThan(String value) {
            addCriterion("platform_name >", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("platform_name >=", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLessThan(String value) {
            addCriterion("platform_name <", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLessThanOrEqualTo(String value) {
            addCriterion("platform_name <=", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLike(String value) {
            addCriterion("platform_name like", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotLike(String value) {
            addCriterion("platform_name not like", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIn(List<String> values) {
            addCriterion("platform_name in", values, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotIn(List<String> values) {
            addCriterion("platform_name not in", values, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameBetween(String value1, String value2) {
            addCriterion("platform_name between", value1, value2, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotBetween(String value1, String value2) {
            addCriterion("platform_name not between", value1, value2, "platformName");
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

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
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

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
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
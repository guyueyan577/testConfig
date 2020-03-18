package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class PushStyleMetadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PushStyleMetadataExample() {
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

        public Criteria andPushCodeIsNull() {
            addCriterion("push_code is null");
            return (Criteria) this;
        }

        public Criteria andPushCodeIsNotNull() {
            addCriterion("push_code is not null");
            return (Criteria) this;
        }

        public Criteria andPushCodeEqualTo(Integer value) {
            addCriterion("push_code =", value, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeNotEqualTo(Integer value) {
            addCriterion("push_code <>", value, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeGreaterThan(Integer value) {
            addCriterion("push_code >", value, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_code >=", value, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeLessThan(Integer value) {
            addCriterion("push_code <", value, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeLessThanOrEqualTo(Integer value) {
            addCriterion("push_code <=", value, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeIn(List<Integer> values) {
            addCriterion("push_code in", values, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeNotIn(List<Integer> values) {
            addCriterion("push_code not in", values, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeBetween(Integer value1, Integer value2) {
            addCriterion("push_code between", value1, value2, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("push_code not between", value1, value2, "pushCode");
            return (Criteria) this;
        }

        public Criteria andPushNameIsNull() {
            addCriterion("push_name is null");
            return (Criteria) this;
        }

        public Criteria andPushNameIsNotNull() {
            addCriterion("push_name is not null");
            return (Criteria) this;
        }

        public Criteria andPushNameEqualTo(String value) {
            addCriterion("push_name =", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotEqualTo(String value) {
            addCriterion("push_name <>", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameGreaterThan(String value) {
            addCriterion("push_name >", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameGreaterThanOrEqualTo(String value) {
            addCriterion("push_name >=", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLessThan(String value) {
            addCriterion("push_name <", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLessThanOrEqualTo(String value) {
            addCriterion("push_name <=", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLike(String value) {
            addCriterion("push_name like", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotLike(String value) {
            addCriterion("push_name not like", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameIn(List<String> values) {
            addCriterion("push_name in", values, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotIn(List<String> values) {
            addCriterion("push_name not in", values, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameBetween(String value1, String value2) {
            addCriterion("push_name between", value1, value2, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotBetween(String value1, String value2) {
            addCriterion("push_name not between", value1, value2, "pushName");
            return (Criteria) this;
        }

        public Criteria andI18nIsNull() {
            addCriterion("i18n is null");
            return (Criteria) this;
        }

        public Criteria andI18nIsNotNull() {
            addCriterion("i18n is not null");
            return (Criteria) this;
        }

        public Criteria andI18nEqualTo(String value) {
            addCriterion("i18n =", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nNotEqualTo(String value) {
            addCriterion("i18n <>", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nGreaterThan(String value) {
            addCriterion("i18n >", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nGreaterThanOrEqualTo(String value) {
            addCriterion("i18n >=", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nLessThan(String value) {
            addCriterion("i18n <", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nLessThanOrEqualTo(String value) {
            addCriterion("i18n <=", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nLike(String value) {
            addCriterion("i18n like", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nNotLike(String value) {
            addCriterion("i18n not like", value, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nIn(List<String> values) {
            addCriterion("i18n in", values, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nNotIn(List<String> values) {
            addCriterion("i18n not in", values, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nBetween(String value1, String value2) {
            addCriterion("i18n between", value1, value2, "i18n");
            return (Criteria) this;
        }

        public Criteria andI18nNotBetween(String value1, String value2) {
            addCriterion("i18n not between", value1, value2, "i18n");
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
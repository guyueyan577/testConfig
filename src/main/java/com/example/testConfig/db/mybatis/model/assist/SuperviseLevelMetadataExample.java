package com.example.testConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class SuperviseLevelMetadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperviseLevelMetadataExample() {
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

        public Criteria andSuperviseLevelCodeIsNull() {
            addCriterion("supervise_level_code is null");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeIsNotNull() {
            addCriterion("supervise_level_code is not null");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeEqualTo(Integer value) {
            addCriterion("supervise_level_code =", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeNotEqualTo(Integer value) {
            addCriterion("supervise_level_code <>", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeGreaterThan(Integer value) {
            addCriterion("supervise_level_code >", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervise_level_code >=", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeLessThan(Integer value) {
            addCriterion("supervise_level_code <", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeLessThanOrEqualTo(Integer value) {
            addCriterion("supervise_level_code <=", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeIn(List<Integer> values) {
            addCriterion("supervise_level_code in", values, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeNotIn(List<Integer> values) {
            addCriterion("supervise_level_code not in", values, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeBetween(Integer value1, Integer value2) {
            addCriterion("supervise_level_code between", value1, value2, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("supervise_level_code not between", value1, value2, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameIsNull() {
            addCriterion("supervise_level_name is null");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameIsNotNull() {
            addCriterion("supervise_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameEqualTo(String value) {
            addCriterion("supervise_level_name =", value, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameNotEqualTo(String value) {
            addCriterion("supervise_level_name <>", value, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameGreaterThan(String value) {
            addCriterion("supervise_level_name >", value, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("supervise_level_name >=", value, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameLessThan(String value) {
            addCriterion("supervise_level_name <", value, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameLessThanOrEqualTo(String value) {
            addCriterion("supervise_level_name <=", value, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameLike(String value) {
            addCriterion("supervise_level_name like", value, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameNotLike(String value) {
            addCriterion("supervise_level_name not like", value, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameIn(List<String> values) {
            addCriterion("supervise_level_name in", values, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameNotIn(List<String> values) {
            addCriterion("supervise_level_name not in", values, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameBetween(String value1, String value2) {
            addCriterion("supervise_level_name between", value1, value2, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelNameNotBetween(String value1, String value2) {
            addCriterion("supervise_level_name not between", value1, value2, "superviseLevelName");
            return (Criteria) this;
        }

        public Criteria andI18nCodeIsNull() {
            addCriterion("i18n_code is null");
            return (Criteria) this;
        }

        public Criteria andI18nCodeIsNotNull() {
            addCriterion("i18n_code is not null");
            return (Criteria) this;
        }

        public Criteria andI18nCodeEqualTo(String value) {
            addCriterion("i18n_code =", value, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeNotEqualTo(String value) {
            addCriterion("i18n_code <>", value, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeGreaterThan(String value) {
            addCriterion("i18n_code >", value, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeGreaterThanOrEqualTo(String value) {
            addCriterion("i18n_code >=", value, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeLessThan(String value) {
            addCriterion("i18n_code <", value, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeLessThanOrEqualTo(String value) {
            addCriterion("i18n_code <=", value, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeLike(String value) {
            addCriterion("i18n_code like", value, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeNotLike(String value) {
            addCriterion("i18n_code not like", value, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeIn(List<String> values) {
            addCriterion("i18n_code in", values, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeNotIn(List<String> values) {
            addCriterion("i18n_code not in", values, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeBetween(String value1, String value2) {
            addCriterion("i18n_code between", value1, value2, "i18nCode");
            return (Criteria) this;
        }

        public Criteria andI18nCodeNotBetween(String value1, String value2) {
            addCriterion("i18n_code not between", value1, value2, "i18nCode");
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
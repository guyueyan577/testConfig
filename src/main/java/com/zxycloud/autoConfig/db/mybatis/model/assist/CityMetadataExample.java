package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class CityMetadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityMetadataExample() {
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

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeIsNull() {
            addCriterion("city_parent_code is null");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeIsNotNull() {
            addCriterion("city_parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeEqualTo(String value) {
            addCriterion("city_parent_code =", value, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeNotEqualTo(String value) {
            addCriterion("city_parent_code <>", value, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeGreaterThan(String value) {
            addCriterion("city_parent_code >", value, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_parent_code >=", value, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeLessThan(String value) {
            addCriterion("city_parent_code <", value, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeLessThanOrEqualTo(String value) {
            addCriterion("city_parent_code <=", value, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeLike(String value) {
            addCriterion("city_parent_code like", value, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeNotLike(String value) {
            addCriterion("city_parent_code not like", value, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeIn(List<String> values) {
            addCriterion("city_parent_code in", values, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeNotIn(List<String> values) {
            addCriterion("city_parent_code not in", values, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeBetween(String value1, String value2) {
            addCriterion("city_parent_code between", value1, value2, "cityParentCode");
            return (Criteria) this;
        }

        public Criteria andCityParentCodeNotBetween(String value1, String value2) {
            addCriterion("city_parent_code not between", value1, value2, "cityParentCode");
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
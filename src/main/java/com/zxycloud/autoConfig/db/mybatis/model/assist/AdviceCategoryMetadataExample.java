package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class AdviceCategoryMetadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdviceCategoryMetadataExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryIsNull() {
            addCriterion("advice_category is null");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryIsNotNull() {
            addCriterion("advice_category is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryEqualTo(Integer value) {
            addCriterion("advice_category =", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNotEqualTo(Integer value) {
            addCriterion("advice_category <>", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryGreaterThan(Integer value) {
            addCriterion("advice_category >", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("advice_category >=", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryLessThan(Integer value) {
            addCriterion("advice_category <", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("advice_category <=", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryIn(List<Integer> values) {
            addCriterion("advice_category in", values, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNotIn(List<Integer> values) {
            addCriterion("advice_category not in", values, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryBetween(Integer value1, Integer value2) {
            addCriterion("advice_category between", value1, value2, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("advice_category not between", value1, value2, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameIsNull() {
            addCriterion("advice_category_name is null");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameIsNotNull() {
            addCriterion("advice_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEqualTo(String value) {
            addCriterion("advice_category_name =", value, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameNotEqualTo(String value) {
            addCriterion("advice_category_name <>", value, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameGreaterThan(String value) {
            addCriterion("advice_category_name >", value, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("advice_category_name >=", value, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameLessThan(String value) {
            addCriterion("advice_category_name <", value, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("advice_category_name <=", value, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameLike(String value) {
            addCriterion("advice_category_name like", value, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameNotLike(String value) {
            addCriterion("advice_category_name not like", value, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameIn(List<String> values) {
            addCriterion("advice_category_name in", values, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameNotIn(List<String> values) {
            addCriterion("advice_category_name not in", values, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameBetween(String value1, String value2) {
            addCriterion("advice_category_name between", value1, value2, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameNotBetween(String value1, String value2) {
            addCriterion("advice_category_name not between", value1, value2, "adviceCategoryName");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnIsNull() {
            addCriterion("advice_category_name_en is null");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnIsNotNull() {
            addCriterion("advice_category_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnEqualTo(String value) {
            addCriterion("advice_category_name_en =", value, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnNotEqualTo(String value) {
            addCriterion("advice_category_name_en <>", value, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnGreaterThan(String value) {
            addCriterion("advice_category_name_en >", value, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("advice_category_name_en >=", value, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnLessThan(String value) {
            addCriterion("advice_category_name_en <", value, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnLessThanOrEqualTo(String value) {
            addCriterion("advice_category_name_en <=", value, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnLike(String value) {
            addCriterion("advice_category_name_en like", value, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnNotLike(String value) {
            addCriterion("advice_category_name_en not like", value, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnIn(List<String> values) {
            addCriterion("advice_category_name_en in", values, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnNotIn(List<String> values) {
            addCriterion("advice_category_name_en not in", values, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnBetween(String value1, String value2) {
            addCriterion("advice_category_name_en between", value1, value2, "adviceCategoryNameEn");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNameEnNotBetween(String value1, String value2) {
            addCriterion("advice_category_name_en not between", value1, value2, "adviceCategoryNameEn");
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
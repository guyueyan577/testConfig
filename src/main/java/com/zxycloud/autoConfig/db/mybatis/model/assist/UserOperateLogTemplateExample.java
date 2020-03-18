package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class UserOperateLogTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOperateLogTemplateExample() {
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

        public Criteria andOperateCodeIsNull() {
            addCriterion("operate_code is null");
            return (Criteria) this;
        }

        public Criteria andOperateCodeIsNotNull() {
            addCriterion("operate_code is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCodeEqualTo(Integer value) {
            addCriterion("operate_code =", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeNotEqualTo(Integer value) {
            addCriterion("operate_code <>", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeGreaterThan(Integer value) {
            addCriterion("operate_code >", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_code >=", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeLessThan(Integer value) {
            addCriterion("operate_code <", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeLessThanOrEqualTo(Integer value) {
            addCriterion("operate_code <=", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeIn(List<Integer> values) {
            addCriterion("operate_code in", values, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeNotIn(List<Integer> values) {
            addCriterion("operate_code not in", values, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeBetween(Integer value1, Integer value2) {
            addCriterion("operate_code between", value1, value2, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_code not between", value1, value2, "operateCode");
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

        public Criteria andTemplateIsNull() {
            addCriterion("template is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("template is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(String value) {
            addCriterion("template =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(String value) {
            addCriterion("template <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(String value) {
            addCriterion("template >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("template >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(String value) {
            addCriterion("template <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(String value) {
            addCriterion("template <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLike(String value) {
            addCriterion("template like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotLike(String value) {
            addCriterion("template not like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<String> values) {
            addCriterion("template in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<String> values) {
            addCriterion("template not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(String value1, String value2) {
            addCriterion("template between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(String value1, String value2) {
            addCriterion("template not between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andValueListIsNull() {
            addCriterion("value_list is null");
            return (Criteria) this;
        }

        public Criteria andValueListIsNotNull() {
            addCriterion("value_list is not null");
            return (Criteria) this;
        }

        public Criteria andValueListEqualTo(String value) {
            addCriterion("value_list =", value, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListNotEqualTo(String value) {
            addCriterion("value_list <>", value, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListGreaterThan(String value) {
            addCriterion("value_list >", value, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListGreaterThanOrEqualTo(String value) {
            addCriterion("value_list >=", value, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListLessThan(String value) {
            addCriterion("value_list <", value, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListLessThanOrEqualTo(String value) {
            addCriterion("value_list <=", value, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListLike(String value) {
            addCriterion("value_list like", value, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListNotLike(String value) {
            addCriterion("value_list not like", value, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListIn(List<String> values) {
            addCriterion("value_list in", values, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListNotIn(List<String> values) {
            addCriterion("value_list not in", values, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListBetween(String value1, String value2) {
            addCriterion("value_list between", value1, value2, "valueList");
            return (Criteria) this;
        }

        public Criteria andValueListNotBetween(String value1, String value2) {
            addCriterion("value_list not between", value1, value2, "valueList");
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
package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class FileTypeMetadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileTypeMetadataExample() {
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

        public Criteria andFileTypeCodeIsNull() {
            addCriterion("file_type_code is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeIsNotNull() {
            addCriterion("file_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeEqualTo(Integer value) {
            addCriterion("file_type_code =", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotEqualTo(Integer value) {
            addCriterion("file_type_code <>", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeGreaterThan(Integer value) {
            addCriterion("file_type_code >", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_type_code >=", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeLessThan(Integer value) {
            addCriterion("file_type_code <", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("file_type_code <=", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeIn(List<Integer> values) {
            addCriterion("file_type_code in", values, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotIn(List<Integer> values) {
            addCriterion("file_type_code not in", values, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("file_type_code between", value1, value2, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_type_code not between", value1, value2, "fileTypeCode");
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

        public Criteria andFileTypeNameIsNull() {
            addCriterion("file_type_name is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameIsNotNull() {
            addCriterion("file_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameEqualTo(String value) {
            addCriterion("file_type_name =", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameNotEqualTo(String value) {
            addCriterion("file_type_name <>", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameGreaterThan(String value) {
            addCriterion("file_type_name >", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_type_name >=", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameLessThan(String value) {
            addCriterion("file_type_name <", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameLessThanOrEqualTo(String value) {
            addCriterion("file_type_name <=", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameLike(String value) {
            addCriterion("file_type_name like", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameNotLike(String value) {
            addCriterion("file_type_name not like", value, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameIn(List<String> values) {
            addCriterion("file_type_name in", values, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameNotIn(List<String> values) {
            addCriterion("file_type_name not in", values, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameBetween(String value1, String value2) {
            addCriterion("file_type_name between", value1, value2, "fileTypeName");
            return (Criteria) this;
        }

        public Criteria andFileTypeNameNotBetween(String value1, String value2) {
            addCriterion("file_type_name not between", value1, value2, "fileTypeName");
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
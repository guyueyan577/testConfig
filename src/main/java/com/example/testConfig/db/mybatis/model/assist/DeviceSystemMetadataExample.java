package com.example.testConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class DeviceSystemMetadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceSystemMetadataExample() {
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

        public Criteria andDeviceSystemCodeIsNull() {
            addCriterion("device_system_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeIsNotNull() {
            addCriterion("device_system_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeEqualTo(Integer value) {
            addCriterion("device_system_code =", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeNotEqualTo(Integer value) {
            addCriterion("device_system_code <>", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeGreaterThan(Integer value) {
            addCriterion("device_system_code >", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_system_code >=", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeLessThan(Integer value) {
            addCriterion("device_system_code <", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_system_code <=", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeIn(List<Integer> values) {
            addCriterion("device_system_code in", values, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeNotIn(List<Integer> values) {
            addCriterion("device_system_code not in", values, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_system_code between", value1, value2, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_system_code not between", value1, value2, "deviceSystemCode");
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

        public Criteria andDeviceSystemNameIsNull() {
            addCriterion("device_system_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameIsNotNull() {
            addCriterion("device_system_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameEqualTo(String value) {
            addCriterion("device_system_name =", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameNotEqualTo(String value) {
            addCriterion("device_system_name <>", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameGreaterThan(String value) {
            addCriterion("device_system_name >", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_system_name >=", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameLessThan(String value) {
            addCriterion("device_system_name <", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameLessThanOrEqualTo(String value) {
            addCriterion("device_system_name <=", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameLike(String value) {
            addCriterion("device_system_name like", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameNotLike(String value) {
            addCriterion("device_system_name not like", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameIn(List<String> values) {
            addCriterion("device_system_name in", values, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameNotIn(List<String> values) {
            addCriterion("device_system_name not in", values, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameBetween(String value1, String value2) {
            addCriterion("device_system_name between", value1, value2, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameNotBetween(String value1, String value2) {
            addCriterion("device_system_name not between", value1, value2, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderIsNull() {
            addCriterion("device_type_order is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderIsNotNull() {
            addCriterion("device_type_order is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderEqualTo(String value) {
            addCriterion("device_type_order =", value, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderNotEqualTo(String value) {
            addCriterion("device_type_order <>", value, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderGreaterThan(String value) {
            addCriterion("device_type_order >", value, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderGreaterThanOrEqualTo(String value) {
            addCriterion("device_type_order >=", value, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderLessThan(String value) {
            addCriterion("device_type_order <", value, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderLessThanOrEqualTo(String value) {
            addCriterion("device_type_order <=", value, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderLike(String value) {
            addCriterion("device_type_order like", value, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderNotLike(String value) {
            addCriterion("device_type_order not like", value, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderIn(List<String> values) {
            addCriterion("device_type_order in", values, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderNotIn(List<String> values) {
            addCriterion("device_type_order not in", values, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderBetween(String value1, String value2) {
            addCriterion("device_type_order between", value1, value2, "deviceTypeOrder");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeOrderNotBetween(String value1, String value2) {
            addCriterion("device_type_order not between", value1, value2, "deviceTypeOrder");
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
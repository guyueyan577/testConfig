package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class DeviceAttributeSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceAttributeSetExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeIsNull() {
            addCriterion("device_attribute_set_type_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeIsNotNull() {
            addCriterion("device_attribute_set_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeEqualTo(Integer value) {
            addCriterion("device_attribute_set_type_code =", value, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeNotEqualTo(Integer value) {
            addCriterion("device_attribute_set_type_code <>", value, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeGreaterThan(Integer value) {
            addCriterion("device_attribute_set_type_code >", value, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_attribute_set_type_code >=", value, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeLessThan(Integer value) {
            addCriterion("device_attribute_set_type_code <", value, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_attribute_set_type_code <=", value, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeIn(List<Integer> values) {
            addCriterion("device_attribute_set_type_code in", values, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeNotIn(List<Integer> values) {
            addCriterion("device_attribute_set_type_code not in", values, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_attribute_set_type_code between", value1, value2, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_attribute_set_type_code not between", value1, value2, "deviceAttributeSetTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeIsNull() {
            addCriterion("device_attribute_set_value_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeIsNotNull() {
            addCriterion("device_attribute_set_value_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeEqualTo(Integer value) {
            addCriterion("device_attribute_set_value_code =", value, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeNotEqualTo(Integer value) {
            addCriterion("device_attribute_set_value_code <>", value, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeGreaterThan(Integer value) {
            addCriterion("device_attribute_set_value_code >", value, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_attribute_set_value_code >=", value, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeLessThan(Integer value) {
            addCriterion("device_attribute_set_value_code <", value, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_attribute_set_value_code <=", value, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeIn(List<Integer> values) {
            addCriterion("device_attribute_set_value_code in", values, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeNotIn(List<Integer> values) {
            addCriterion("device_attribute_set_value_code not in", values, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_attribute_set_value_code between", value1, value2, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_attribute_set_value_code not between", value1, value2, "deviceAttributeSetValueCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueIsNull() {
            addCriterion("device_attribute_set_value is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueIsNotNull() {
            addCriterion("device_attribute_set_value is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueEqualTo(String value) {
            addCriterion("device_attribute_set_value =", value, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueNotEqualTo(String value) {
            addCriterion("device_attribute_set_value <>", value, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueGreaterThan(String value) {
            addCriterion("device_attribute_set_value >", value, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueGreaterThanOrEqualTo(String value) {
            addCriterion("device_attribute_set_value >=", value, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueLessThan(String value) {
            addCriterion("device_attribute_set_value <", value, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueLessThanOrEqualTo(String value) {
            addCriterion("device_attribute_set_value <=", value, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueLike(String value) {
            addCriterion("device_attribute_set_value like", value, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueNotLike(String value) {
            addCriterion("device_attribute_set_value not like", value, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueIn(List<String> values) {
            addCriterion("device_attribute_set_value in", values, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueNotIn(List<String> values) {
            addCriterion("device_attribute_set_value not in", values, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueBetween(String value1, String value2) {
            addCriterion("device_attribute_set_value between", value1, value2, "deviceAttributeSetValue");
            return (Criteria) this;
        }

        public Criteria andDeviceAttributeSetValueNotBetween(String value1, String value2) {
            addCriterion("device_attribute_set_value not between", value1, value2, "deviceAttributeSetValue");
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
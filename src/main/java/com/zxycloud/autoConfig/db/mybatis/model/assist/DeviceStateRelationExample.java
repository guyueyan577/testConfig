package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class DeviceStateRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceStateRelationExample() {
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

        public Criteria andDeviceStateCodeIsNull() {
            addCriterion("device_state_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeIsNotNull() {
            addCriterion("device_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeEqualTo(Integer value) {
            addCriterion("device_state_code =", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeNotEqualTo(Integer value) {
            addCriterion("device_state_code <>", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeGreaterThan(Integer value) {
            addCriterion("device_state_code >", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_state_code >=", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeLessThan(Integer value) {
            addCriterion("device_state_code <", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_state_code <=", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeIn(List<Integer> values) {
            addCriterion("device_state_code in", values, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeNotIn(List<Integer> values) {
            addCriterion("device_state_code not in", values, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_state_code between", value1, value2, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_state_code not between", value1, value2, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameIsNull() {
            addCriterion("device_state_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameIsNotNull() {
            addCriterion("device_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameEqualTo(String value) {
            addCriterion("device_state_name =", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameNotEqualTo(String value) {
            addCriterion("device_state_name <>", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameGreaterThan(String value) {
            addCriterion("device_state_name >", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_state_name >=", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameLessThan(String value) {
            addCriterion("device_state_name <", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameLessThanOrEqualTo(String value) {
            addCriterion("device_state_name <=", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameLike(String value) {
            addCriterion("device_state_name like", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameNotLike(String value) {
            addCriterion("device_state_name not like", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameIn(List<String> values) {
            addCriterion("device_state_name in", values, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameNotIn(List<String> values) {
            addCriterion("device_state_name not in", values, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameBetween(String value1, String value2) {
            addCriterion("device_state_name between", value1, value2, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameNotBetween(String value1, String value2) {
            addCriterion("device_state_name not between", value1, value2, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeIsNull() {
            addCriterion("add_state_code is null");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeIsNotNull() {
            addCriterion("add_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeEqualTo(Integer value) {
            addCriterion("add_state_code =", value, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeNotEqualTo(Integer value) {
            addCriterion("add_state_code <>", value, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeGreaterThan(Integer value) {
            addCriterion("add_state_code >", value, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_state_code >=", value, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeLessThan(Integer value) {
            addCriterion("add_state_code <", value, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeLessThanOrEqualTo(Integer value) {
            addCriterion("add_state_code <=", value, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeIn(List<Integer> values) {
            addCriterion("add_state_code in", values, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeNotIn(List<Integer> values) {
            addCriterion("add_state_code not in", values, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeBetween(Integer value1, Integer value2) {
            addCriterion("add_state_code between", value1, value2, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andAddStateCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_state_code not between", value1, value2, "addStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeIsNull() {
            addCriterion("remove_state_code is null");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeIsNotNull() {
            addCriterion("remove_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeEqualTo(String value) {
            addCriterion("remove_state_code =", value, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeNotEqualTo(String value) {
            addCriterion("remove_state_code <>", value, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeGreaterThan(String value) {
            addCriterion("remove_state_code >", value, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("remove_state_code >=", value, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeLessThan(String value) {
            addCriterion("remove_state_code <", value, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeLessThanOrEqualTo(String value) {
            addCriterion("remove_state_code <=", value, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeLike(String value) {
            addCriterion("remove_state_code like", value, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeNotLike(String value) {
            addCriterion("remove_state_code not like", value, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeIn(List<String> values) {
            addCriterion("remove_state_code in", values, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeNotIn(List<String> values) {
            addCriterion("remove_state_code not in", values, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeBetween(String value1, String value2) {
            addCriterion("remove_state_code between", value1, value2, "removeStateCode");
            return (Criteria) this;
        }

        public Criteria andRemoveStateCodeNotBetween(String value1, String value2) {
            addCriterion("remove_state_code not between", value1, value2, "removeStateCode");
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
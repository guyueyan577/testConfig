package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class DeviceCollectInfomationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceCollectInfomationExample() {
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

        public Criteria andSensorTagCodeIsNull() {
            addCriterion("sensor_tag_code is null");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeIsNotNull() {
            addCriterion("sensor_tag_code is not null");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeEqualTo(Integer value) {
            addCriterion("sensor_tag_code =", value, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeNotEqualTo(Integer value) {
            addCriterion("sensor_tag_code <>", value, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeGreaterThan(Integer value) {
            addCriterion("sensor_tag_code >", value, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sensor_tag_code >=", value, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeLessThan(Integer value) {
            addCriterion("sensor_tag_code <", value, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeLessThanOrEqualTo(Integer value) {
            addCriterion("sensor_tag_code <=", value, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeIn(List<Integer> values) {
            addCriterion("sensor_tag_code in", values, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeNotIn(List<Integer> values) {
            addCriterion("sensor_tag_code not in", values, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeBetween(Integer value1, Integer value2) {
            addCriterion("sensor_tag_code between", value1, value2, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andSensorTagCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("sensor_tag_code not between", value1, value2, "sensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeIsNull() {
            addCriterion("user_sensor_tag_code is null");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeIsNotNull() {
            addCriterion("user_sensor_tag_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeEqualTo(Integer value) {
            addCriterion("user_sensor_tag_code =", value, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeNotEqualTo(Integer value) {
            addCriterion("user_sensor_tag_code <>", value, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeGreaterThan(Integer value) {
            addCriterion("user_sensor_tag_code >", value, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sensor_tag_code >=", value, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeLessThan(Integer value) {
            addCriterion("user_sensor_tag_code <", value, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeLessThanOrEqualTo(Integer value) {
            addCriterion("user_sensor_tag_code <=", value, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeIn(List<Integer> values) {
            addCriterion("user_sensor_tag_code in", values, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeNotIn(List<Integer> values) {
            addCriterion("user_sensor_tag_code not in", values, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeBetween(Integer value1, Integer value2) {
            addCriterion("user_sensor_tag_code between", value1, value2, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andUserSensorTagCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sensor_tag_code not between", value1, value2, "userSensorTagCode");
            return (Criteria) this;
        }

        public Criteria andMaxRangeIsNull() {
            addCriterion("max_range is null");
            return (Criteria) this;
        }

        public Criteria andMaxRangeIsNotNull() {
            addCriterion("max_range is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRangeEqualTo(Integer value) {
            addCriterion("max_range =", value, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeNotEqualTo(Integer value) {
            addCriterion("max_range <>", value, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeGreaterThan(Integer value) {
            addCriterion("max_range >", value, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_range >=", value, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeLessThan(Integer value) {
            addCriterion("max_range <", value, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeLessThanOrEqualTo(Integer value) {
            addCriterion("max_range <=", value, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeIn(List<Integer> values) {
            addCriterion("max_range in", values, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeNotIn(List<Integer> values) {
            addCriterion("max_range not in", values, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeBetween(Integer value1, Integer value2) {
            addCriterion("max_range between", value1, value2, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMaxRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_range not between", value1, value2, "maxRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeIsNull() {
            addCriterion("min_range is null");
            return (Criteria) this;
        }

        public Criteria andMinRangeIsNotNull() {
            addCriterion("min_range is not null");
            return (Criteria) this;
        }

        public Criteria andMinRangeEqualTo(Integer value) {
            addCriterion("min_range =", value, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeNotEqualTo(Integer value) {
            addCriterion("min_range <>", value, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeGreaterThan(Integer value) {
            addCriterion("min_range >", value, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_range >=", value, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeLessThan(Integer value) {
            addCriterion("min_range <", value, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeLessThanOrEqualTo(Integer value) {
            addCriterion("min_range <=", value, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeIn(List<Integer> values) {
            addCriterion("min_range in", values, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeNotIn(List<Integer> values) {
            addCriterion("min_range not in", values, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeBetween(Integer value1, Integer value2) {
            addCriterion("min_range between", value1, value2, "minRange");
            return (Criteria) this;
        }

        public Criteria andMinRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("min_range not between", value1, value2, "minRange");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmIsNull() {
            addCriterion("max_alarm is null");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmIsNotNull() {
            addCriterion("max_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmEqualTo(Integer value) {
            addCriterion("max_alarm =", value, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmNotEqualTo(Integer value) {
            addCriterion("max_alarm <>", value, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmGreaterThan(Integer value) {
            addCriterion("max_alarm >", value, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_alarm >=", value, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmLessThan(Integer value) {
            addCriterion("max_alarm <", value, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmLessThanOrEqualTo(Integer value) {
            addCriterion("max_alarm <=", value, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmIn(List<Integer> values) {
            addCriterion("max_alarm in", values, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmNotIn(List<Integer> values) {
            addCriterion("max_alarm not in", values, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmBetween(Integer value1, Integer value2) {
            addCriterion("max_alarm between", value1, value2, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMaxAlarmNotBetween(Integer value1, Integer value2) {
            addCriterion("max_alarm not between", value1, value2, "maxAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmIsNull() {
            addCriterion("min_alarm is null");
            return (Criteria) this;
        }

        public Criteria andMinAlarmIsNotNull() {
            addCriterion("min_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andMinAlarmEqualTo(Integer value) {
            addCriterion("min_alarm =", value, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmNotEqualTo(Integer value) {
            addCriterion("min_alarm <>", value, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmGreaterThan(Integer value) {
            addCriterion("min_alarm >", value, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_alarm >=", value, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmLessThan(Integer value) {
            addCriterion("min_alarm <", value, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmLessThanOrEqualTo(Integer value) {
            addCriterion("min_alarm <=", value, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmIn(List<Integer> values) {
            addCriterion("min_alarm in", values, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmNotIn(List<Integer> values) {
            addCriterion("min_alarm not in", values, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmBetween(Integer value1, Integer value2) {
            addCriterion("min_alarm between", value1, value2, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMinAlarmNotBetween(Integer value1, Integer value2) {
            addCriterion("min_alarm not between", value1, value2, "minAlarm");
            return (Criteria) this;
        }

        public Criteria andMultipleIsNull() {
            addCriterion("multiple is null");
            return (Criteria) this;
        }

        public Criteria andMultipleIsNotNull() {
            addCriterion("multiple is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleEqualTo(Integer value) {
            addCriterion("multiple =", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleNotEqualTo(Integer value) {
            addCriterion("multiple <>", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleGreaterThan(Integer value) {
            addCriterion("multiple >", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleGreaterThanOrEqualTo(Integer value) {
            addCriterion("multiple >=", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleLessThan(Integer value) {
            addCriterion("multiple <", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleLessThanOrEqualTo(Integer value) {
            addCriterion("multiple <=", value, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleIn(List<Integer> values) {
            addCriterion("multiple in", values, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleNotIn(List<Integer> values) {
            addCriterion("multiple not in", values, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleBetween(Integer value1, Integer value2) {
            addCriterion("multiple between", value1, value2, "multiple");
            return (Criteria) this;
        }

        public Criteria andMultipleNotBetween(Integer value1, Integer value2) {
            addCriterion("multiple not between", value1, value2, "multiple");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andErrorRangeIsNull() {
            addCriterion("error_range is null");
            return (Criteria) this;
        }

        public Criteria andErrorRangeIsNotNull() {
            addCriterion("error_range is not null");
            return (Criteria) this;
        }

        public Criteria andErrorRangeEqualTo(Integer value) {
            addCriterion("error_range =", value, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeNotEqualTo(Integer value) {
            addCriterion("error_range <>", value, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeGreaterThan(Integer value) {
            addCriterion("error_range >", value, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("error_range >=", value, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeLessThan(Integer value) {
            addCriterion("error_range <", value, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeLessThanOrEqualTo(Integer value) {
            addCriterion("error_range <=", value, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeIn(List<Integer> values) {
            addCriterion("error_range in", values, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeNotIn(List<Integer> values) {
            addCriterion("error_range not in", values, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeBetween(Integer value1, Integer value2) {
            addCriterion("error_range between", value1, value2, "errorRange");
            return (Criteria) this;
        }

        public Criteria andErrorRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("error_range not between", value1, value2, "errorRange");
            return (Criteria) this;
        }

        public Criteria andAlarmValueIsNull() {
            addCriterion("alarm_value is null");
            return (Criteria) this;
        }

        public Criteria andAlarmValueIsNotNull() {
            addCriterion("alarm_value is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmValueEqualTo(Integer value) {
            addCriterion("alarm_value =", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotEqualTo(Integer value) {
            addCriterion("alarm_value <>", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueGreaterThan(Integer value) {
            addCriterion("alarm_value >", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_value >=", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueLessThan(Integer value) {
            addCriterion("alarm_value <", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_value <=", value, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueIn(List<Integer> values) {
            addCriterion("alarm_value in", values, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotIn(List<Integer> values) {
            addCriterion("alarm_value not in", values, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueBetween(Integer value1, Integer value2) {
            addCriterion("alarm_value between", value1, value2, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andAlarmValueNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_value not between", value1, value2, "alarmValue");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodIsNull() {
            addCriterion("collect_period is null");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodIsNotNull() {
            addCriterion("collect_period is not null");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodEqualTo(Integer value) {
            addCriterion("collect_period =", value, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodNotEqualTo(Integer value) {
            addCriterion("collect_period <>", value, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodGreaterThan(Integer value) {
            addCriterion("collect_period >", value, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_period >=", value, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodLessThan(Integer value) {
            addCriterion("collect_period <", value, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("collect_period <=", value, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodIn(List<Integer> values) {
            addCriterion("collect_period in", values, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodNotIn(List<Integer> values) {
            addCriterion("collect_period not in", values, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodBetween(Integer value1, Integer value2) {
            addCriterion("collect_period between", value1, value2, "collectPeriod");
            return (Criteria) this;
        }

        public Criteria andCollectPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_period not between", value1, value2, "collectPeriod");
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

        public Criteria andDeviceStateGroupCodeIsNull() {
            addCriterion("device_state_group_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeIsNotNull() {
            addCriterion("device_state_group_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeEqualTo(Integer value) {
            addCriterion("device_state_group_code =", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeNotEqualTo(Integer value) {
            addCriterion("device_state_group_code <>", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeGreaterThan(Integer value) {
            addCriterion("device_state_group_code >", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_state_group_code >=", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeLessThan(Integer value) {
            addCriterion("device_state_group_code <", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_state_group_code <=", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeIn(List<Integer> values) {
            addCriterion("device_state_group_code in", values, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeNotIn(List<Integer> values) {
            addCriterion("device_state_group_code not in", values, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_state_group_code between", value1, value2, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_state_group_code not between", value1, value2, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNull() {
            addCriterion("collect_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("collect_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Long value) {
            addCriterion("collect_time =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Long value) {
            addCriterion("collect_time <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Long value) {
            addCriterion("collect_time >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("collect_time >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Long value) {
            addCriterion("collect_time <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Long value) {
            addCriterion("collect_time <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Long> values) {
            addCriterion("collect_time in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Long> values) {
            addCriterion("collect_time not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Long value1, Long value2) {
            addCriterion("collect_time between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Long value1, Long value2) {
            addCriterion("collect_time not between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectValueIsNull() {
            addCriterion("collect_value is null");
            return (Criteria) this;
        }

        public Criteria andCollectValueIsNotNull() {
            addCriterion("collect_value is not null");
            return (Criteria) this;
        }

        public Criteria andCollectValueEqualTo(Double value) {
            addCriterion("collect_value =", value, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueNotEqualTo(Double value) {
            addCriterion("collect_value <>", value, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueGreaterThan(Double value) {
            addCriterion("collect_value >", value, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueGreaterThanOrEqualTo(Double value) {
            addCriterion("collect_value >=", value, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueLessThan(Double value) {
            addCriterion("collect_value <", value, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueLessThanOrEqualTo(Double value) {
            addCriterion("collect_value <=", value, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueIn(List<Double> values) {
            addCriterion("collect_value in", values, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueNotIn(List<Double> values) {
            addCriterion("collect_value not in", values, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueBetween(Double value1, Double value2) {
            addCriterion("collect_value between", value1, value2, "collectValue");
            return (Criteria) this;
        }

        public Criteria andCollectValueNotBetween(Double value1, Double value2) {
            addCriterion("collect_value not between", value1, value2, "collectValue");
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

        public Criteria andStateDurationIsNull() {
            addCriterion("state_duration is null");
            return (Criteria) this;
        }

        public Criteria andStateDurationIsNotNull() {
            addCriterion("state_duration is not null");
            return (Criteria) this;
        }

        public Criteria andStateDurationEqualTo(Integer value) {
            addCriterion("state_duration =", value, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationNotEqualTo(Integer value) {
            addCriterion("state_duration <>", value, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationGreaterThan(Integer value) {
            addCriterion("state_duration >", value, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_duration >=", value, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationLessThan(Integer value) {
            addCriterion("state_duration <", value, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationLessThanOrEqualTo(Integer value) {
            addCriterion("state_duration <=", value, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationIn(List<Integer> values) {
            addCriterion("state_duration in", values, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationNotIn(List<Integer> values) {
            addCriterion("state_duration not in", values, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationBetween(Integer value1, Integer value2) {
            addCriterion("state_duration between", value1, value2, "stateDuration");
            return (Criteria) this;
        }

        public Criteria andStateDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("state_duration not between", value1, value2, "stateDuration");
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
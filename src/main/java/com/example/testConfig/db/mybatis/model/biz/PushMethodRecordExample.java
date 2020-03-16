package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class PushMethodRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PushMethodRecordExample() {
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

        public Criteria andPushMethodNameIsNull() {
            addCriterion("push_method_name is null");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameIsNotNull() {
            addCriterion("push_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameEqualTo(String value) {
            addCriterion("push_method_name =", value, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameNotEqualTo(String value) {
            addCriterion("push_method_name <>", value, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameGreaterThan(String value) {
            addCriterion("push_method_name >", value, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("push_method_name >=", value, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameLessThan(String value) {
            addCriterion("push_method_name <", value, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameLessThanOrEqualTo(String value) {
            addCriterion("push_method_name <=", value, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameLike(String value) {
            addCriterion("push_method_name like", value, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameNotLike(String value) {
            addCriterion("push_method_name not like", value, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameIn(List<String> values) {
            addCriterion("push_method_name in", values, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameNotIn(List<String> values) {
            addCriterion("push_method_name not in", values, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameBetween(String value1, String value2) {
            addCriterion("push_method_name between", value1, value2, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodNameNotBetween(String value1, String value2) {
            addCriterion("push_method_name not between", value1, value2, "pushMethodName");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeIsNull() {
            addCriterion("push_method_type is null");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeIsNotNull() {
            addCriterion("push_method_type is not null");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeEqualTo(Integer value) {
            addCriterion("push_method_type =", value, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeNotEqualTo(Integer value) {
            addCriterion("push_method_type <>", value, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeGreaterThan(Integer value) {
            addCriterion("push_method_type >", value, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_method_type >=", value, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeLessThan(Integer value) {
            addCriterion("push_method_type <", value, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeLessThanOrEqualTo(Integer value) {
            addCriterion("push_method_type <=", value, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeIn(List<Integer> values) {
            addCriterion("push_method_type in", values, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeNotIn(List<Integer> values) {
            addCriterion("push_method_type not in", values, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeBetween(Integer value1, Integer value2) {
            addCriterion("push_method_type between", value1, value2, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushMethodTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("push_method_type not between", value1, value2, "pushMethodType");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeIsNull() {
            addCriterion("push_interval_time is null");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeIsNotNull() {
            addCriterion("push_interval_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeEqualTo(Integer value) {
            addCriterion("push_interval_time =", value, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeNotEqualTo(Integer value) {
            addCriterion("push_interval_time <>", value, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeGreaterThan(Integer value) {
            addCriterion("push_interval_time >", value, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_interval_time >=", value, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeLessThan(Integer value) {
            addCriterion("push_interval_time <", value, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeLessThanOrEqualTo(Integer value) {
            addCriterion("push_interval_time <=", value, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeIn(List<Integer> values) {
            addCriterion("push_interval_time in", values, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeNotIn(List<Integer> values) {
            addCriterion("push_interval_time not in", values, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeBetween(Integer value1, Integer value2) {
            addCriterion("push_interval_time between", value1, value2, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPushIntervalTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("push_interval_time not between", value1, value2, "pushIntervalTime");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeIsNull() {
            addCriterion("place_push_style_code is null");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeIsNotNull() {
            addCriterion("place_push_style_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeEqualTo(Integer value) {
            addCriterion("place_push_style_code =", value, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeNotEqualTo(Integer value) {
            addCriterion("place_push_style_code <>", value, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeGreaterThan(Integer value) {
            addCriterion("place_push_style_code >", value, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("place_push_style_code >=", value, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeLessThan(Integer value) {
            addCriterion("place_push_style_code <", value, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeLessThanOrEqualTo(Integer value) {
            addCriterion("place_push_style_code <=", value, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeIn(List<Integer> values) {
            addCriterion("place_push_style_code in", values, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeNotIn(List<Integer> values) {
            addCriterion("place_push_style_code not in", values, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeBetween(Integer value1, Integer value2) {
            addCriterion("place_push_style_code between", value1, value2, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andPlacePushStyleCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("place_push_style_code not between", value1, value2, "placePushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeIsNull() {
            addCriterion("area_push_style_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeIsNotNull() {
            addCriterion("area_push_style_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeEqualTo(Integer value) {
            addCriterion("area_push_style_code =", value, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeNotEqualTo(Integer value) {
            addCriterion("area_push_style_code <>", value, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeGreaterThan(Integer value) {
            addCriterion("area_push_style_code >", value, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_push_style_code >=", value, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeLessThan(Integer value) {
            addCriterion("area_push_style_code <", value, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeLessThanOrEqualTo(Integer value) {
            addCriterion("area_push_style_code <=", value, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeIn(List<Integer> values) {
            addCriterion("area_push_style_code in", values, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeNotIn(List<Integer> values) {
            addCriterion("area_push_style_code not in", values, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeBetween(Integer value1, Integer value2) {
            addCriterion("area_push_style_code between", value1, value2, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andAreaPushStyleCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("area_push_style_code not between", value1, value2, "areaPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeIsNull() {
            addCriterion("project_push_style_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeIsNotNull() {
            addCriterion("project_push_style_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeEqualTo(Integer value) {
            addCriterion("project_push_style_code =", value, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeNotEqualTo(Integer value) {
            addCriterion("project_push_style_code <>", value, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeGreaterThan(Integer value) {
            addCriterion("project_push_style_code >", value, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_push_style_code >=", value, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeLessThan(Integer value) {
            addCriterion("project_push_style_code <", value, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeLessThanOrEqualTo(Integer value) {
            addCriterion("project_push_style_code <=", value, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeIn(List<Integer> values) {
            addCriterion("project_push_style_code in", values, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeNotIn(List<Integer> values) {
            addCriterion("project_push_style_code not in", values, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeBetween(Integer value1, Integer value2) {
            addCriterion("project_push_style_code between", value1, value2, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andProjectPushStyleCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_push_style_code not between", value1, value2, "projectPushStyleCode");
            return (Criteria) this;
        }

        public Criteria andOtherPushIsNull() {
            addCriterion("other_push is null");
            return (Criteria) this;
        }

        public Criteria andOtherPushIsNotNull() {
            addCriterion("other_push is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPushEqualTo(String value) {
            addCriterion("other_push =", value, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushNotEqualTo(String value) {
            addCriterion("other_push <>", value, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushGreaterThan(String value) {
            addCriterion("other_push >", value, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushGreaterThanOrEqualTo(String value) {
            addCriterion("other_push >=", value, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushLessThan(String value) {
            addCriterion("other_push <", value, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushLessThanOrEqualTo(String value) {
            addCriterion("other_push <=", value, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushLike(String value) {
            addCriterion("other_push like", value, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushNotLike(String value) {
            addCriterion("other_push not like", value, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushIn(List<String> values) {
            addCriterion("other_push in", values, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushNotIn(List<String> values) {
            addCriterion("other_push not in", values, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushBetween(String value1, String value2) {
            addCriterion("other_push between", value1, value2, "otherPush");
            return (Criteria) this;
        }

        public Criteria andOtherPushNotBetween(String value1, String value2) {
            addCriterion("other_push not between", value1, value2, "otherPush");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchIsNull() {
            addCriterion("push_phone_switch is null");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchIsNotNull() {
            addCriterion("push_phone_switch is not null");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchEqualTo(Boolean value) {
            addCriterion("push_phone_switch =", value, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchNotEqualTo(Boolean value) {
            addCriterion("push_phone_switch <>", value, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchGreaterThan(Boolean value) {
            addCriterion("push_phone_switch >", value, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("push_phone_switch >=", value, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchLessThan(Boolean value) {
            addCriterion("push_phone_switch <", value, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchLessThanOrEqualTo(Boolean value) {
            addCriterion("push_phone_switch <=", value, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchIn(List<Boolean> values) {
            addCriterion("push_phone_switch in", values, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchNotIn(List<Boolean> values) {
            addCriterion("push_phone_switch not in", values, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchBetween(Boolean value1, Boolean value2) {
            addCriterion("push_phone_switch between", value1, value2, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushPhoneSwitchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("push_phone_switch not between", value1, value2, "pushPhoneSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchIsNull() {
            addCriterion("push_sms_switch is null");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchIsNotNull() {
            addCriterion("push_sms_switch is not null");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchEqualTo(Boolean value) {
            addCriterion("push_sms_switch =", value, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchNotEqualTo(Boolean value) {
            addCriterion("push_sms_switch <>", value, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchGreaterThan(Boolean value) {
            addCriterion("push_sms_switch >", value, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("push_sms_switch >=", value, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchLessThan(Boolean value) {
            addCriterion("push_sms_switch <", value, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchLessThanOrEqualTo(Boolean value) {
            addCriterion("push_sms_switch <=", value, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchIn(List<Boolean> values) {
            addCriterion("push_sms_switch in", values, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchNotIn(List<Boolean> values) {
            addCriterion("push_sms_switch not in", values, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchBetween(Boolean value1, Boolean value2) {
            addCriterion("push_sms_switch between", value1, value2, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSmsSwitchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("push_sms_switch not between", value1, value2, "pushSmsSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchIsNull() {
            addCriterion("push_app_switch is null");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchIsNotNull() {
            addCriterion("push_app_switch is not null");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchEqualTo(Boolean value) {
            addCriterion("push_app_switch =", value, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchNotEqualTo(Boolean value) {
            addCriterion("push_app_switch <>", value, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchGreaterThan(Boolean value) {
            addCriterion("push_app_switch >", value, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("push_app_switch >=", value, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchLessThan(Boolean value) {
            addCriterion("push_app_switch <", value, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchLessThanOrEqualTo(Boolean value) {
            addCriterion("push_app_switch <=", value, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchIn(List<Boolean> values) {
            addCriterion("push_app_switch in", values, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchNotIn(List<Boolean> values) {
            addCriterion("push_app_switch not in", values, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchBetween(Boolean value1, Boolean value2) {
            addCriterion("push_app_switch between", value1, value2, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushAppSwitchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("push_app_switch not between", value1, value2, "pushAppSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchIsNull() {
            addCriterion("push_websocket_switch is null");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchIsNotNull() {
            addCriterion("push_websocket_switch is not null");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchEqualTo(Boolean value) {
            addCriterion("push_websocket_switch =", value, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchNotEqualTo(Boolean value) {
            addCriterion("push_websocket_switch <>", value, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchGreaterThan(Boolean value) {
            addCriterion("push_websocket_switch >", value, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("push_websocket_switch >=", value, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchLessThan(Boolean value) {
            addCriterion("push_websocket_switch <", value, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchLessThanOrEqualTo(Boolean value) {
            addCriterion("push_websocket_switch <=", value, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchIn(List<Boolean> values) {
            addCriterion("push_websocket_switch in", values, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchNotIn(List<Boolean> values) {
            addCriterion("push_websocket_switch not in", values, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchBetween(Boolean value1, Boolean value2) {
            addCriterion("push_websocket_switch between", value1, value2, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andPushWebsocketSwitchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("push_websocket_switch not between", value1, value2, "pushWebsocketSwitch");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeIsNull() {
            addCriterion("suitable_range is null");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeIsNotNull() {
            addCriterion("suitable_range is not null");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeEqualTo(Integer value) {
            addCriterion("suitable_range =", value, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeNotEqualTo(Integer value) {
            addCriterion("suitable_range <>", value, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeGreaterThan(Integer value) {
            addCriterion("suitable_range >", value, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("suitable_range >=", value, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeLessThan(Integer value) {
            addCriterion("suitable_range <", value, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeLessThanOrEqualTo(Integer value) {
            addCriterion("suitable_range <=", value, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeIn(List<Integer> values) {
            addCriterion("suitable_range in", values, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeNotIn(List<Integer> values) {
            addCriterion("suitable_range not in", values, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeBetween(Integer value1, Integer value2) {
            addCriterion("suitable_range between", value1, value2, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andSuitableRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("suitable_range not between", value1, value2, "suitableRange");
            return (Criteria) this;
        }

        public Criteria andRangeIdIsNull() {
            addCriterion("range_id is null");
            return (Criteria) this;
        }

        public Criteria andRangeIdIsNotNull() {
            addCriterion("range_id is not null");
            return (Criteria) this;
        }

        public Criteria andRangeIdEqualTo(String value) {
            addCriterion("range_id =", value, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdNotEqualTo(String value) {
            addCriterion("range_id <>", value, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdGreaterThan(String value) {
            addCriterion("range_id >", value, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("range_id >=", value, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdLessThan(String value) {
            addCriterion("range_id <", value, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdLessThanOrEqualTo(String value) {
            addCriterion("range_id <=", value, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdLike(String value) {
            addCriterion("range_id like", value, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdNotLike(String value) {
            addCriterion("range_id not like", value, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdIn(List<String> values) {
            addCriterion("range_id in", values, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdNotIn(List<String> values) {
            addCriterion("range_id not in", values, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdBetween(String value1, String value2) {
            addCriterion("range_id between", value1, value2, "rangeId");
            return (Criteria) this;
        }

        public Criteria andRangeIdNotBetween(String value1, String value2) {
            addCriterion("range_id not between", value1, value2, "rangeId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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
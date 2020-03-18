package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class ProjectServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectServiceExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeIsNull() {
            addCriterion("phone_notify_code is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeIsNotNull() {
            addCriterion("phone_notify_code is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeEqualTo(Integer value) {
            addCriterion("phone_notify_code =", value, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeNotEqualTo(Integer value) {
            addCriterion("phone_notify_code <>", value, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeGreaterThan(Integer value) {
            addCriterion("phone_notify_code >", value, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_notify_code >=", value, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeLessThan(Integer value) {
            addCriterion("phone_notify_code <", value, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeLessThanOrEqualTo(Integer value) {
            addCriterion("phone_notify_code <=", value, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeIn(List<Integer> values) {
            addCriterion("phone_notify_code in", values, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeNotIn(List<Integer> values) {
            addCriterion("phone_notify_code not in", values, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeBetween(Integer value1, Integer value2) {
            addCriterion("phone_notify_code between", value1, value2, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_notify_code not between", value1, value2, "phoneNotifyCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeIsNull() {
            addCriterion("phone_notify_code_alternative is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeIsNotNull() {
            addCriterion("phone_notify_code_alternative is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeEqualTo(Integer value) {
            addCriterion("phone_notify_code_alternative =", value, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeNotEqualTo(Integer value) {
            addCriterion("phone_notify_code_alternative <>", value, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeGreaterThan(Integer value) {
            addCriterion("phone_notify_code_alternative >", value, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_notify_code_alternative >=", value, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeLessThan(Integer value) {
            addCriterion("phone_notify_code_alternative <", value, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeLessThanOrEqualTo(Integer value) {
            addCriterion("phone_notify_code_alternative <=", value, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeIn(List<Integer> values) {
            addCriterion("phone_notify_code_alternative in", values, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeNotIn(List<Integer> values) {
            addCriterion("phone_notify_code_alternative not in", values, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeBetween(Integer value1, Integer value2) {
            addCriterion("phone_notify_code_alternative between", value1, value2, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifyCodeAlternativeNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_notify_code_alternative not between", value1, value2, "phoneNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeIsNull() {
            addCriterion("message_notify_code is null");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeIsNotNull() {
            addCriterion("message_notify_code is not null");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeEqualTo(Integer value) {
            addCriterion("message_notify_code =", value, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeNotEqualTo(Integer value) {
            addCriterion("message_notify_code <>", value, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeGreaterThan(Integer value) {
            addCriterion("message_notify_code >", value, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_notify_code >=", value, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeLessThan(Integer value) {
            addCriterion("message_notify_code <", value, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeLessThanOrEqualTo(Integer value) {
            addCriterion("message_notify_code <=", value, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeIn(List<Integer> values) {
            addCriterion("message_notify_code in", values, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeNotIn(List<Integer> values) {
            addCriterion("message_notify_code not in", values, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeBetween(Integer value1, Integer value2) {
            addCriterion("message_notify_code between", value1, value2, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("message_notify_code not between", value1, value2, "messageNotifyCode");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeIsNull() {
            addCriterion("message_notify_code_alternative is null");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeIsNotNull() {
            addCriterion("message_notify_code_alternative is not null");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeEqualTo(Integer value) {
            addCriterion("message_notify_code_alternative =", value, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeNotEqualTo(Integer value) {
            addCriterion("message_notify_code_alternative <>", value, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeGreaterThan(Integer value) {
            addCriterion("message_notify_code_alternative >", value, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_notify_code_alternative >=", value, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeLessThan(Integer value) {
            addCriterion("message_notify_code_alternative <", value, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeLessThanOrEqualTo(Integer value) {
            addCriterion("message_notify_code_alternative <=", value, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeIn(List<Integer> values) {
            addCriterion("message_notify_code_alternative in", values, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeNotIn(List<Integer> values) {
            addCriterion("message_notify_code_alternative not in", values, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeBetween(Integer value1, Integer value2) {
            addCriterion("message_notify_code_alternative between", value1, value2, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andMessageNotifyCodeAlternativeNotBetween(Integer value1, Integer value2) {
            addCriterion("message_notify_code_alternative not between", value1, value2, "messageNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeIsNull() {
            addCriterion("app_notify_code is null");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeIsNotNull() {
            addCriterion("app_notify_code is not null");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeEqualTo(Integer value) {
            addCriterion("app_notify_code =", value, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeNotEqualTo(Integer value) {
            addCriterion("app_notify_code <>", value, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeGreaterThan(Integer value) {
            addCriterion("app_notify_code >", value, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_notify_code >=", value, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeLessThan(Integer value) {
            addCriterion("app_notify_code <", value, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeLessThanOrEqualTo(Integer value) {
            addCriterion("app_notify_code <=", value, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeIn(List<Integer> values) {
            addCriterion("app_notify_code in", values, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeNotIn(List<Integer> values) {
            addCriterion("app_notify_code not in", values, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeBetween(Integer value1, Integer value2) {
            addCriterion("app_notify_code between", value1, value2, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("app_notify_code not between", value1, value2, "appNotifyCode");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeIsNull() {
            addCriterion("app_notify_code_alternative is null");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeIsNotNull() {
            addCriterion("app_notify_code_alternative is not null");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeEqualTo(Integer value) {
            addCriterion("app_notify_code_alternative =", value, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeNotEqualTo(Integer value) {
            addCriterion("app_notify_code_alternative <>", value, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeGreaterThan(Integer value) {
            addCriterion("app_notify_code_alternative >", value, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_notify_code_alternative >=", value, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeLessThan(Integer value) {
            addCriterion("app_notify_code_alternative <", value, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeLessThanOrEqualTo(Integer value) {
            addCriterion("app_notify_code_alternative <=", value, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeIn(List<Integer> values) {
            addCriterion("app_notify_code_alternative in", values, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeNotIn(List<Integer> values) {
            addCriterion("app_notify_code_alternative not in", values, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeBetween(Integer value1, Integer value2) {
            addCriterion("app_notify_code_alternative between", value1, value2, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andAppNotifyCodeAlternativeNotBetween(Integer value1, Integer value2) {
            addCriterion("app_notify_code_alternative not between", value1, value2, "appNotifyCodeAlternative");
            return (Criteria) this;
        }

        public Criteria andSetMealIdIsNull() {
            addCriterion("set_meal_id is null");
            return (Criteria) this;
        }

        public Criteria andSetMealIdIsNotNull() {
            addCriterion("set_meal_id is not null");
            return (Criteria) this;
        }

        public Criteria andSetMealIdEqualTo(String value) {
            addCriterion("set_meal_id =", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotEqualTo(String value) {
            addCriterion("set_meal_id <>", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdGreaterThan(String value) {
            addCriterion("set_meal_id >", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdGreaterThanOrEqualTo(String value) {
            addCriterion("set_meal_id >=", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdLessThan(String value) {
            addCriterion("set_meal_id <", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdLessThanOrEqualTo(String value) {
            addCriterion("set_meal_id <=", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdLike(String value) {
            addCriterion("set_meal_id like", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotLike(String value) {
            addCriterion("set_meal_id not like", value, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdIn(List<String> values) {
            addCriterion("set_meal_id in", values, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotIn(List<String> values) {
            addCriterion("set_meal_id not in", values, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdBetween(String value1, String value2) {
            addCriterion("set_meal_id between", value1, value2, "setMealId");
            return (Criteria) this;
        }

        public Criteria andSetMealIdNotBetween(String value1, String value2) {
            addCriterion("set_meal_id not between", value1, value2, "setMealId");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIsNull() {
            addCriterion("service_end_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIsNotNull() {
            addCriterion("service_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeEqualTo(Long value) {
            addCriterion("service_end_time =", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotEqualTo(Long value) {
            addCriterion("service_end_time <>", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeGreaterThan(Long value) {
            addCriterion("service_end_time >", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("service_end_time >=", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLessThan(Long value) {
            addCriterion("service_end_time <", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("service_end_time <=", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIn(List<Long> values) {
            addCriterion("service_end_time in", values, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotIn(List<Long> values) {
            addCriterion("service_end_time not in", values, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeBetween(Long value1, Long value2) {
            addCriterion("service_end_time between", value1, value2, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("service_end_time not between", value1, value2, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountIsNull() {
            addCriterion("max_phone_count is null");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountIsNotNull() {
            addCriterion("max_phone_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountEqualTo(Integer value) {
            addCriterion("max_phone_count =", value, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountNotEqualTo(Integer value) {
            addCriterion("max_phone_count <>", value, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountGreaterThan(Integer value) {
            addCriterion("max_phone_count >", value, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_phone_count >=", value, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountLessThan(Integer value) {
            addCriterion("max_phone_count <", value, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountLessThanOrEqualTo(Integer value) {
            addCriterion("max_phone_count <=", value, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountIn(List<Integer> values) {
            addCriterion("max_phone_count in", values, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountNotIn(List<Integer> values) {
            addCriterion("max_phone_count not in", values, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountBetween(Integer value1, Integer value2) {
            addCriterion("max_phone_count between", value1, value2, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxPhoneCountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_phone_count not between", value1, value2, "maxPhoneCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountIsNull() {
            addCriterion("max_message_count is null");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountIsNotNull() {
            addCriterion("max_message_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountEqualTo(Integer value) {
            addCriterion("max_message_count =", value, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountNotEqualTo(Integer value) {
            addCriterion("max_message_count <>", value, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountGreaterThan(Integer value) {
            addCriterion("max_message_count >", value, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_message_count >=", value, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountLessThan(Integer value) {
            addCriterion("max_message_count <", value, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountLessThanOrEqualTo(Integer value) {
            addCriterion("max_message_count <=", value, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountIn(List<Integer> values) {
            addCriterion("max_message_count in", values, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountNotIn(List<Integer> values) {
            addCriterion("max_message_count not in", values, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountBetween(Integer value1, Integer value2) {
            addCriterion("max_message_count between", value1, value2, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxMessageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_message_count not between", value1, value2, "maxMessageCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountIsNull() {
            addCriterion("max_push_count is null");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountIsNotNull() {
            addCriterion("max_push_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountEqualTo(Integer value) {
            addCriterion("max_push_count =", value, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountNotEqualTo(Integer value) {
            addCriterion("max_push_count <>", value, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountGreaterThan(Integer value) {
            addCriterion("max_push_count >", value, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_push_count >=", value, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountLessThan(Integer value) {
            addCriterion("max_push_count <", value, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountLessThanOrEqualTo(Integer value) {
            addCriterion("max_push_count <=", value, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountIn(List<Integer> values) {
            addCriterion("max_push_count in", values, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountNotIn(List<Integer> values) {
            addCriterion("max_push_count not in", values, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountBetween(Integer value1, Integer value2) {
            addCriterion("max_push_count between", value1, value2, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxPushCountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_push_count not between", value1, value2, "maxPushCount");
            return (Criteria) this;
        }

        public Criteria andMaxTypeIsNull() {
            addCriterion("max_type is null");
            return (Criteria) this;
        }

        public Criteria andMaxTypeIsNotNull() {
            addCriterion("max_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTypeEqualTo(Integer value) {
            addCriterion("max_type =", value, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeNotEqualTo(Integer value) {
            addCriterion("max_type <>", value, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeGreaterThan(Integer value) {
            addCriterion("max_type >", value, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_type >=", value, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeLessThan(Integer value) {
            addCriterion("max_type <", value, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeLessThanOrEqualTo(Integer value) {
            addCriterion("max_type <=", value, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeIn(List<Integer> values) {
            addCriterion("max_type in", values, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeNotIn(List<Integer> values) {
            addCriterion("max_type not in", values, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeBetween(Integer value1, Integer value2) {
            addCriterion("max_type between", value1, value2, "maxType");
            return (Criteria) this;
        }

        public Criteria andMaxTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_type not between", value1, value2, "maxType");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountIsNull() {
            addCriterion("remaining_phone_count is null");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountIsNotNull() {
            addCriterion("remaining_phone_count is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountEqualTo(Integer value) {
            addCriterion("remaining_phone_count =", value, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountNotEqualTo(Integer value) {
            addCriterion("remaining_phone_count <>", value, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountGreaterThan(Integer value) {
            addCriterion("remaining_phone_count >", value, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("remaining_phone_count >=", value, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountLessThan(Integer value) {
            addCriterion("remaining_phone_count <", value, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountLessThanOrEqualTo(Integer value) {
            addCriterion("remaining_phone_count <=", value, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountIn(List<Integer> values) {
            addCriterion("remaining_phone_count in", values, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountNotIn(List<Integer> values) {
            addCriterion("remaining_phone_count not in", values, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountBetween(Integer value1, Integer value2) {
            addCriterion("remaining_phone_count between", value1, value2, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingPhoneCountNotBetween(Integer value1, Integer value2) {
            addCriterion("remaining_phone_count not between", value1, value2, "remainingPhoneCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountIsNull() {
            addCriterion("remaining_message_count is null");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountIsNotNull() {
            addCriterion("remaining_message_count is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountEqualTo(Integer value) {
            addCriterion("remaining_message_count =", value, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountNotEqualTo(Integer value) {
            addCriterion("remaining_message_count <>", value, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountGreaterThan(Integer value) {
            addCriterion("remaining_message_count >", value, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("remaining_message_count >=", value, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountLessThan(Integer value) {
            addCriterion("remaining_message_count <", value, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountLessThanOrEqualTo(Integer value) {
            addCriterion("remaining_message_count <=", value, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountIn(List<Integer> values) {
            addCriterion("remaining_message_count in", values, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountNotIn(List<Integer> values) {
            addCriterion("remaining_message_count not in", values, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountBetween(Integer value1, Integer value2) {
            addCriterion("remaining_message_count between", value1, value2, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainingMessageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("remaining_message_count not between", value1, value2, "remainingMessageCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountIsNull() {
            addCriterion("remainint_app_count is null");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountIsNotNull() {
            addCriterion("remainint_app_count is not null");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountEqualTo(Integer value) {
            addCriterion("remainint_app_count =", value, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountNotEqualTo(Integer value) {
            addCriterion("remainint_app_count <>", value, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountGreaterThan(Integer value) {
            addCriterion("remainint_app_count >", value, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainint_app_count >=", value, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountLessThan(Integer value) {
            addCriterion("remainint_app_count <", value, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountLessThanOrEqualTo(Integer value) {
            addCriterion("remainint_app_count <=", value, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountIn(List<Integer> values) {
            addCriterion("remainint_app_count in", values, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountNotIn(List<Integer> values) {
            addCriterion("remainint_app_count not in", values, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountBetween(Integer value1, Integer value2) {
            addCriterion("remainint_app_count between", value1, value2, "remainintAppCount");
            return (Criteria) this;
        }

        public Criteria andRemainintAppCountNotBetween(Integer value1, Integer value2) {
            addCriterion("remainint_app_count not between", value1, value2, "remainintAppCount");
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

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andPhoneCountIsNull() {
            addCriterion("phone_count is null");
            return (Criteria) this;
        }

        public Criteria andPhoneCountIsNotNull() {
            addCriterion("phone_count is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneCountEqualTo(Long value) {
            addCriterion("phone_count =", value, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountNotEqualTo(Long value) {
            addCriterion("phone_count <>", value, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountGreaterThan(Long value) {
            addCriterion("phone_count >", value, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountGreaterThanOrEqualTo(Long value) {
            addCriterion("phone_count >=", value, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountLessThan(Long value) {
            addCriterion("phone_count <", value, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountLessThanOrEqualTo(Long value) {
            addCriterion("phone_count <=", value, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountIn(List<Long> values) {
            addCriterion("phone_count in", values, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountNotIn(List<Long> values) {
            addCriterion("phone_count not in", values, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountBetween(Long value1, Long value2) {
            addCriterion("phone_count between", value1, value2, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andPhoneCountNotBetween(Long value1, Long value2) {
            addCriterion("phone_count not between", value1, value2, "phoneCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountIsNull() {
            addCriterion("message_count is null");
            return (Criteria) this;
        }

        public Criteria andMessageCountIsNotNull() {
            addCriterion("message_count is not null");
            return (Criteria) this;
        }

        public Criteria andMessageCountEqualTo(Long value) {
            addCriterion("message_count =", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountNotEqualTo(Long value) {
            addCriterion("message_count <>", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountGreaterThan(Long value) {
            addCriterion("message_count >", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountGreaterThanOrEqualTo(Long value) {
            addCriterion("message_count >=", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountLessThan(Long value) {
            addCriterion("message_count <", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountLessThanOrEqualTo(Long value) {
            addCriterion("message_count <=", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountIn(List<Long> values) {
            addCriterion("message_count in", values, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountNotIn(List<Long> values) {
            addCriterion("message_count not in", values, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountBetween(Long value1, Long value2) {
            addCriterion("message_count between", value1, value2, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountNotBetween(Long value1, Long value2) {
            addCriterion("message_count not between", value1, value2, "messageCount");
            return (Criteria) this;
        }

        public Criteria andAppCountIsNull() {
            addCriterion("app_count is null");
            return (Criteria) this;
        }

        public Criteria andAppCountIsNotNull() {
            addCriterion("app_count is not null");
            return (Criteria) this;
        }

        public Criteria andAppCountEqualTo(Long value) {
            addCriterion("app_count =", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountNotEqualTo(Long value) {
            addCriterion("app_count <>", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountGreaterThan(Long value) {
            addCriterion("app_count >", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountGreaterThanOrEqualTo(Long value) {
            addCriterion("app_count >=", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountLessThan(Long value) {
            addCriterion("app_count <", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountLessThanOrEqualTo(Long value) {
            addCriterion("app_count <=", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountIn(List<Long> values) {
            addCriterion("app_count in", values, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountNotIn(List<Long> values) {
            addCriterion("app_count not in", values, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountBetween(Long value1, Long value2) {
            addCriterion("app_count between", value1, value2, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountNotBetween(Long value1, Long value2) {
            addCriterion("app_count not between", value1, value2, "appCount");
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
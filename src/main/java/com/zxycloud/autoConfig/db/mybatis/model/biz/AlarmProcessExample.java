package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class AlarmProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmProcessExample() {
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

        public Criteria andAlarmIdIsNull() {
            addCriterion("alarm_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIsNotNull() {
            addCriterion("alarm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdEqualTo(String value) {
            addCriterion("alarm_id =", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotEqualTo(String value) {
            addCriterion("alarm_id <>", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThan(String value) {
            addCriterion("alarm_id >", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_id >=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThan(String value) {
            addCriterion("alarm_id <", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThanOrEqualTo(String value) {
            addCriterion("alarm_id <=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLike(String value) {
            addCriterion("alarm_id like", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotLike(String value) {
            addCriterion("alarm_id not like", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIn(List<String> values) {
            addCriterion("alarm_id in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotIn(List<String> values) {
            addCriterion("alarm_id not in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdBetween(String value1, String value2) {
            addCriterion("alarm_id between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotBetween(String value1, String value2) {
            addCriterion("alarm_id not between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdIsNull() {
            addCriterion("process_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdIsNotNull() {
            addCriterion("process_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdEqualTo(String value) {
            addCriterion("process_user_id =", value, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdNotEqualTo(String value) {
            addCriterion("process_user_id <>", value, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdGreaterThan(String value) {
            addCriterion("process_user_id >", value, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_user_id >=", value, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdLessThan(String value) {
            addCriterion("process_user_id <", value, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdLessThanOrEqualTo(String value) {
            addCriterion("process_user_id <=", value, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdLike(String value) {
            addCriterion("process_user_id like", value, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdNotLike(String value) {
            addCriterion("process_user_id not like", value, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdIn(List<String> values) {
            addCriterion("process_user_id in", values, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdNotIn(List<String> values) {
            addCriterion("process_user_id not in", values, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdBetween(String value1, String value2) {
            addCriterion("process_user_id between", value1, value2, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserIdNotBetween(String value1, String value2) {
            addCriterion("process_user_id not between", value1, value2, "processUserId");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameIsNull() {
            addCriterion("process_user_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameIsNotNull() {
            addCriterion("process_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameEqualTo(String value) {
            addCriterion("process_user_name =", value, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameNotEqualTo(String value) {
            addCriterion("process_user_name <>", value, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameGreaterThan(String value) {
            addCriterion("process_user_name >", value, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_user_name >=", value, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameLessThan(String value) {
            addCriterion("process_user_name <", value, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameLessThanOrEqualTo(String value) {
            addCriterion("process_user_name <=", value, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameLike(String value) {
            addCriterion("process_user_name like", value, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameNotLike(String value) {
            addCriterion("process_user_name not like", value, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameIn(List<String> values) {
            addCriterion("process_user_name in", values, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameNotIn(List<String> values) {
            addCriterion("process_user_name not in", values, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameBetween(String value1, String value2) {
            addCriterion("process_user_name between", value1, value2, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserNameNotBetween(String value1, String value2) {
            addCriterion("process_user_name not between", value1, value2, "processUserName");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneIsNull() {
            addCriterion("process_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneIsNotNull() {
            addCriterion("process_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneEqualTo(String value) {
            addCriterion("process_user_phone =", value, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneNotEqualTo(String value) {
            addCriterion("process_user_phone <>", value, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneGreaterThan(String value) {
            addCriterion("process_user_phone >", value, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("process_user_phone >=", value, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneLessThan(String value) {
            addCriterion("process_user_phone <", value, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("process_user_phone <=", value, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneLike(String value) {
            addCriterion("process_user_phone like", value, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneNotLike(String value) {
            addCriterion("process_user_phone not like", value, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneIn(List<String> values) {
            addCriterion("process_user_phone in", values, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneNotIn(List<String> values) {
            addCriterion("process_user_phone not in", values, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneBetween(String value1, String value2) {
            addCriterion("process_user_phone between", value1, value2, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessUserPhoneNotBetween(String value1, String value2) {
            addCriterion("process_user_phone not between", value1, value2, "processUserPhone");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("process_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("process_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(Long value) {
            addCriterion("process_time =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(Long value) {
            addCriterion("process_time <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(Long value) {
            addCriterion("process_time >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_time >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(Long value) {
            addCriterion("process_time <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_time <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<Long> values) {
            addCriterion("process_time in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<Long> values) {
            addCriterion("process_time not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(Long value1, Long value2) {
            addCriterion("process_time between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_time not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIsNull() {
            addCriterion("process_type is null");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIsNotNull() {
            addCriterion("process_type is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTypeEqualTo(Integer value) {
            addCriterion("process_type =", value, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotEqualTo(Integer value) {
            addCriterion("process_type <>", value, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeGreaterThan(Integer value) {
            addCriterion("process_type >", value, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_type >=", value, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeLessThan(Integer value) {
            addCriterion("process_type <", value, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("process_type <=", value, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIn(List<Integer> values) {
            addCriterion("process_type in", values, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotIn(List<Integer> values) {
            addCriterion("process_type not in", values, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeBetween(Integer value1, Integer value2) {
            addCriterion("process_type between", value1, value2, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("process_type not between", value1, value2, "processTypeName");
            return (Criteria) this;
        }

        public Criteria andProcessExplainIsNull() {
            addCriterion("process_explain is null");
            return (Criteria) this;
        }

        public Criteria andProcessExplainIsNotNull() {
            addCriterion("process_explain is not null");
            return (Criteria) this;
        }

        public Criteria andProcessExplainEqualTo(String value) {
            addCriterion("process_explain =", value, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainNotEqualTo(String value) {
            addCriterion("process_explain <>", value, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainGreaterThan(String value) {
            addCriterion("process_explain >", value, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainGreaterThanOrEqualTo(String value) {
            addCriterion("process_explain >=", value, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainLessThan(String value) {
            addCriterion("process_explain <", value, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainLessThanOrEqualTo(String value) {
            addCriterion("process_explain <=", value, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainLike(String value) {
            addCriterion("process_explain like", value, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainNotLike(String value) {
            addCriterion("process_explain not like", value, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainIn(List<String> values) {
            addCriterion("process_explain in", values, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainNotIn(List<String> values) {
            addCriterion("process_explain not in", values, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainBetween(String value1, String value2) {
            addCriterion("process_explain between", value1, value2, "processExplain");
            return (Criteria) this;
        }

        public Criteria andProcessExplainNotBetween(String value1, String value2) {
            addCriterion("process_explain not between", value1, value2, "processExplain");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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
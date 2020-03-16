package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class HiddenProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiddenProcessExample() {
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

        public Criteria andHiddenIdIsNull() {
            addCriterion("hidden_id is null");
            return (Criteria) this;
        }

        public Criteria andHiddenIdIsNotNull() {
            addCriterion("hidden_id is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenIdEqualTo(String value) {
            addCriterion("hidden_id =", value, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdNotEqualTo(String value) {
            addCriterion("hidden_id <>", value, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdGreaterThan(String value) {
            addCriterion("hidden_id >", value, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdGreaterThanOrEqualTo(String value) {
            addCriterion("hidden_id >=", value, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdLessThan(String value) {
            addCriterion("hidden_id <", value, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdLessThanOrEqualTo(String value) {
            addCriterion("hidden_id <=", value, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdLike(String value) {
            addCriterion("hidden_id like", value, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdNotLike(String value) {
            addCriterion("hidden_id not like", value, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdIn(List<String> values) {
            addCriterion("hidden_id in", values, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdNotIn(List<String> values) {
            addCriterion("hidden_id not in", values, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdBetween(String value1, String value2) {
            addCriterion("hidden_id between", value1, value2, "hiddenId");
            return (Criteria) this;
        }

        public Criteria andHiddenIdNotBetween(String value1, String value2) {
            addCriterion("hidden_id not between", value1, value2, "hiddenId");
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

        public Criteria andProcessUserIsNull() {
            addCriterion("process_user is null");
            return (Criteria) this;
        }

        public Criteria andProcessUserIsNotNull() {
            addCriterion("process_user is not null");
            return (Criteria) this;
        }

        public Criteria andProcessUserEqualTo(String value) {
            addCriterion("process_user =", value, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserNotEqualTo(String value) {
            addCriterion("process_user <>", value, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserGreaterThan(String value) {
            addCriterion("process_user >", value, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserGreaterThanOrEqualTo(String value) {
            addCriterion("process_user >=", value, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserLessThan(String value) {
            addCriterion("process_user <", value, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserLessThanOrEqualTo(String value) {
            addCriterion("process_user <=", value, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserLike(String value) {
            addCriterion("process_user like", value, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserNotLike(String value) {
            addCriterion("process_user not like", value, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserIn(List<String> values) {
            addCriterion("process_user in", values, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserNotIn(List<String> values) {
            addCriterion("process_user not in", values, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserBetween(String value1, String value2) {
            addCriterion("process_user between", value1, value2, "processUser");
            return (Criteria) this;
        }

        public Criteria andProcessUserNotBetween(String value1, String value2) {
            addCriterion("process_user not between", value1, value2, "processUser");
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

        public Criteria andProcessResultIsNull() {
            addCriterion("process_result is null");
            return (Criteria) this;
        }

        public Criteria andProcessResultIsNotNull() {
            addCriterion("process_result is not null");
            return (Criteria) this;
        }

        public Criteria andProcessResultEqualTo(Integer value) {
            addCriterion("process_result =", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotEqualTo(Integer value) {
            addCriterion("process_result <>", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultGreaterThan(Integer value) {
            addCriterion("process_result >", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_result >=", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultLessThan(Integer value) {
            addCriterion("process_result <", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultLessThanOrEqualTo(Integer value) {
            addCriterion("process_result <=", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultIn(List<Integer> values) {
            addCriterion("process_result in", values, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotIn(List<Integer> values) {
            addCriterion("process_result not in", values, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultBetween(Integer value1, Integer value2) {
            addCriterion("process_result between", value1, value2, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotBetween(Integer value1, Integer value2) {
            addCriterion("process_result not between", value1, value2, "processResult");
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
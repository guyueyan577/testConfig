package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyPushExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThirdPartyPushExample() {
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

        public Criteria andProjectGuidIsNull() {
            addCriterion("project_guid is null");
            return (Criteria) this;
        }

        public Criteria andProjectGuidIsNotNull() {
            addCriterion("project_guid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGuidEqualTo(String value) {
            addCriterion("project_guid =", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotEqualTo(String value) {
            addCriterion("project_guid <>", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidGreaterThan(String value) {
            addCriterion("project_guid >", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidGreaterThanOrEqualTo(String value) {
            addCriterion("project_guid >=", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLessThan(String value) {
            addCriterion("project_guid <", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLessThanOrEqualTo(String value) {
            addCriterion("project_guid <=", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLike(String value) {
            addCriterion("project_guid like", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotLike(String value) {
            addCriterion("project_guid not like", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidIn(List<String> values) {
            addCriterion("project_guid in", values, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotIn(List<String> values) {
            addCriterion("project_guid not in", values, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidBetween(String value1, String value2) {
            addCriterion("project_guid between", value1, value2, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotBetween(String value1, String value2) {
            addCriterion("project_guid not between", value1, value2, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andPushUrlIsNull() {
            addCriterion("push_url is null");
            return (Criteria) this;
        }

        public Criteria andPushUrlIsNotNull() {
            addCriterion("push_url is not null");
            return (Criteria) this;
        }

        public Criteria andPushUrlEqualTo(String value) {
            addCriterion("push_url =", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotEqualTo(String value) {
            addCriterion("push_url <>", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlGreaterThan(String value) {
            addCriterion("push_url >", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlGreaterThanOrEqualTo(String value) {
            addCriterion("push_url >=", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLessThan(String value) {
            addCriterion("push_url <", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLessThanOrEqualTo(String value) {
            addCriterion("push_url <=", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlLike(String value) {
            addCriterion("push_url like", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotLike(String value) {
            addCriterion("push_url not like", value, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlIn(List<String> values) {
            addCriterion("push_url in", values, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotIn(List<String> values) {
            addCriterion("push_url not in", values, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlBetween(String value1, String value2) {
            addCriterion("push_url between", value1, value2, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andPushUrlNotBetween(String value1, String value2) {
            addCriterion("push_url not between", value1, value2, "pushUrl");
            return (Criteria) this;
        }

        public Criteria andUseAbleIsNull() {
            addCriterion("use_able is null");
            return (Criteria) this;
        }

        public Criteria andUseAbleIsNotNull() {
            addCriterion("use_able is not null");
            return (Criteria) this;
        }

        public Criteria andUseAbleEqualTo(Byte value) {
            addCriterion("use_able =", value, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleNotEqualTo(Byte value) {
            addCriterion("use_able <>", value, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleGreaterThan(Byte value) {
            addCriterion("use_able >", value, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_able >=", value, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleLessThan(Byte value) {
            addCriterion("use_able <", value, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleLessThanOrEqualTo(Byte value) {
            addCriterion("use_able <=", value, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleIn(List<Byte> values) {
            addCriterion("use_able in", values, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleNotIn(List<Byte> values) {
            addCriterion("use_able not in", values, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleBetween(Byte value1, Byte value2) {
            addCriterion("use_able between", value1, value2, "useAble");
            return (Criteria) this;
        }

        public Criteria andUseAbleNotBetween(Byte value1, Byte value2) {
            addCriterion("use_able not between", value1, value2, "useAble");
            return (Criteria) this;
        }

        public Criteria andProjectArgsIsNull() {
            addCriterion("project_args is null");
            return (Criteria) this;
        }

        public Criteria andProjectArgsIsNotNull() {
            addCriterion("project_args is not null");
            return (Criteria) this;
        }

        public Criteria andProjectArgsEqualTo(String value) {
            addCriterion("project_args =", value, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsNotEqualTo(String value) {
            addCriterion("project_args <>", value, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsGreaterThan(String value) {
            addCriterion("project_args >", value, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsGreaterThanOrEqualTo(String value) {
            addCriterion("project_args >=", value, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsLessThan(String value) {
            addCriterion("project_args <", value, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsLessThanOrEqualTo(String value) {
            addCriterion("project_args <=", value, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsLike(String value) {
            addCriterion("project_args like", value, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsNotLike(String value) {
            addCriterion("project_args not like", value, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsIn(List<String> values) {
            addCriterion("project_args in", values, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsNotIn(List<String> values) {
            addCriterion("project_args not in", values, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsBetween(String value1, String value2) {
            addCriterion("project_args between", value1, value2, "projectArgs");
            return (Criteria) this;
        }

        public Criteria andProjectArgsNotBetween(String value1, String value2) {
            addCriterion("project_args not between", value1, value2, "projectArgs");
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
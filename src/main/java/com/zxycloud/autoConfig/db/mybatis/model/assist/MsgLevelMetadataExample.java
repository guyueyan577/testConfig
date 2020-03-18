package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class MsgLevelMetadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgLevelMetadataExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIsNull() {
            addCriterion("msg_level is null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIsNotNull() {
            addCriterion("msg_level is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelEqualTo(Integer value) {
            addCriterion("msg_level =", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotEqualTo(Integer value) {
            addCriterion("msg_level <>", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelGreaterThan(Integer value) {
            addCriterion("msg_level >", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_level >=", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelLessThan(Integer value) {
            addCriterion("msg_level <", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelLessThanOrEqualTo(Integer value) {
            addCriterion("msg_level <=", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIn(List<Integer> values) {
            addCriterion("msg_level in", values, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotIn(List<Integer> values) {
            addCriterion("msg_level not in", values, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelBetween(Integer value1, Integer value2) {
            addCriterion("msg_level between", value1, value2, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_level not between", value1, value2, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameIsNull() {
            addCriterion("msg_level_name is null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameIsNotNull() {
            addCriterion("msg_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEqualTo(String value) {
            addCriterion("msg_level_name =", value, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameNotEqualTo(String value) {
            addCriterion("msg_level_name <>", value, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameGreaterThan(String value) {
            addCriterion("msg_level_name >", value, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("msg_level_name >=", value, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameLessThan(String value) {
            addCriterion("msg_level_name <", value, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameLessThanOrEqualTo(String value) {
            addCriterion("msg_level_name <=", value, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameLike(String value) {
            addCriterion("msg_level_name like", value, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameNotLike(String value) {
            addCriterion("msg_level_name not like", value, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameIn(List<String> values) {
            addCriterion("msg_level_name in", values, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameNotIn(List<String> values) {
            addCriterion("msg_level_name not in", values, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameBetween(String value1, String value2) {
            addCriterion("msg_level_name between", value1, value2, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameNotBetween(String value1, String value2) {
            addCriterion("msg_level_name not between", value1, value2, "msgLevelName");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnIsNull() {
            addCriterion("msg_level_name_en is null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnIsNotNull() {
            addCriterion("msg_level_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnEqualTo(String value) {
            addCriterion("msg_level_name_en =", value, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnNotEqualTo(String value) {
            addCriterion("msg_level_name_en <>", value, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnGreaterThan(String value) {
            addCriterion("msg_level_name_en >", value, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("msg_level_name_en >=", value, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnLessThan(String value) {
            addCriterion("msg_level_name_en <", value, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnLessThanOrEqualTo(String value) {
            addCriterion("msg_level_name_en <=", value, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnLike(String value) {
            addCriterion("msg_level_name_en like", value, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnNotLike(String value) {
            addCriterion("msg_level_name_en not like", value, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnIn(List<String> values) {
            addCriterion("msg_level_name_en in", values, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnNotIn(List<String> values) {
            addCriterion("msg_level_name_en not in", values, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnBetween(String value1, String value2) {
            addCriterion("msg_level_name_en between", value1, value2, "msgLevelNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNameEnNotBetween(String value1, String value2) {
            addCriterion("msg_level_name_en not between", value1, value2, "msgLevelNameEn");
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
package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class MsgFromMetadataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgFromMetadataExample() {
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

        public Criteria andMsgFromIsNull() {
            addCriterion("msg_from is null");
            return (Criteria) this;
        }

        public Criteria andMsgFromIsNotNull() {
            addCriterion("msg_from is not null");
            return (Criteria) this;
        }

        public Criteria andMsgFromEqualTo(Integer value) {
            addCriterion("msg_from =", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotEqualTo(Integer value) {
            addCriterion("msg_from <>", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromGreaterThan(Integer value) {
            addCriterion("msg_from >", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_from >=", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromLessThan(Integer value) {
            addCriterion("msg_from <", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromLessThanOrEqualTo(Integer value) {
            addCriterion("msg_from <=", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromIn(List<Integer> values) {
            addCriterion("msg_from in", values, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotIn(List<Integer> values) {
            addCriterion("msg_from not in", values, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromBetween(Integer value1, Integer value2) {
            addCriterion("msg_from between", value1, value2, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_from not between", value1, value2, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameIsNull() {
            addCriterion("msg_from_name is null");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameIsNotNull() {
            addCriterion("msg_from_name is not null");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEqualTo(String value) {
            addCriterion("msg_from_name =", value, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameNotEqualTo(String value) {
            addCriterion("msg_from_name <>", value, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameGreaterThan(String value) {
            addCriterion("msg_from_name >", value, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameGreaterThanOrEqualTo(String value) {
            addCriterion("msg_from_name >=", value, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameLessThan(String value) {
            addCriterion("msg_from_name <", value, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameLessThanOrEqualTo(String value) {
            addCriterion("msg_from_name <=", value, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameLike(String value) {
            addCriterion("msg_from_name like", value, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameNotLike(String value) {
            addCriterion("msg_from_name not like", value, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameIn(List<String> values) {
            addCriterion("msg_from_name in", values, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameNotIn(List<String> values) {
            addCriterion("msg_from_name not in", values, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameBetween(String value1, String value2) {
            addCriterion("msg_from_name between", value1, value2, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameNotBetween(String value1, String value2) {
            addCriterion("msg_from_name not between", value1, value2, "msgFromName");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnIsNull() {
            addCriterion("msg_from_name_en is null");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnIsNotNull() {
            addCriterion("msg_from_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnEqualTo(String value) {
            addCriterion("msg_from_name_en =", value, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnNotEqualTo(String value) {
            addCriterion("msg_from_name_en <>", value, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnGreaterThan(String value) {
            addCriterion("msg_from_name_en >", value, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("msg_from_name_en >=", value, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnLessThan(String value) {
            addCriterion("msg_from_name_en <", value, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnLessThanOrEqualTo(String value) {
            addCriterion("msg_from_name_en <=", value, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnLike(String value) {
            addCriterion("msg_from_name_en like", value, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnNotLike(String value) {
            addCriterion("msg_from_name_en not like", value, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnIn(List<String> values) {
            addCriterion("msg_from_name_en in", values, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnNotIn(List<String> values) {
            addCriterion("msg_from_name_en not in", values, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnBetween(String value1, String value2) {
            addCriterion("msg_from_name_en between", value1, value2, "msgFromNameEn");
            return (Criteria) this;
        }

        public Criteria andMsgFromNameEnNotBetween(String value1, String value2) {
            addCriterion("msg_from_name_en not between", value1, value2, "msgFromNameEn");
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
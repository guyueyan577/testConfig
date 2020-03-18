package com.zxycloud.autoConfig.db.mybatis.model.firepatrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MalRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MalRecordExample() {
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

        public Criteria andMalfunctionIdIsNull() {
            addCriterion("malfunction_id is null");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdIsNotNull() {
            addCriterion("malfunction_id is not null");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdEqualTo(String value) {
            addCriterion("malfunction_id =", value, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdNotEqualTo(String value) {
            addCriterion("malfunction_id <>", value, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdGreaterThan(String value) {
            addCriterion("malfunction_id >", value, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("malfunction_id >=", value, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdLessThan(String value) {
            addCriterion("malfunction_id <", value, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdLessThanOrEqualTo(String value) {
            addCriterion("malfunction_id <=", value, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdLike(String value) {
            addCriterion("malfunction_id like", value, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdNotLike(String value) {
            addCriterion("malfunction_id not like", value, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdIn(List<String> values) {
            addCriterion("malfunction_id in", values, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdNotIn(List<String> values) {
            addCriterion("malfunction_id not in", values, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdBetween(String value1, String value2) {
            addCriterion("malfunction_id between", value1, value2, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andMalfunctionIdNotBetween(String value1, String value2) {
            addCriterion("malfunction_id not between", value1, value2, "malfunctionId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdIsNull() {
            addCriterion("accendant_id is null");
            return (Criteria) this;
        }

        public Criteria andAccendantIdIsNotNull() {
            addCriterion("accendant_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccendantIdEqualTo(String value) {
            addCriterion("accendant_id =", value, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdNotEqualTo(String value) {
            addCriterion("accendant_id <>", value, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdGreaterThan(String value) {
            addCriterion("accendant_id >", value, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdGreaterThanOrEqualTo(String value) {
            addCriterion("accendant_id >=", value, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdLessThan(String value) {
            addCriterion("accendant_id <", value, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdLessThanOrEqualTo(String value) {
            addCriterion("accendant_id <=", value, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdLike(String value) {
            addCriterion("accendant_id like", value, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdNotLike(String value) {
            addCriterion("accendant_id not like", value, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdIn(List<String> values) {
            addCriterion("accendant_id in", values, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdNotIn(List<String> values) {
            addCriterion("accendant_id not in", values, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdBetween(String value1, String value2) {
            addCriterion("accendant_id between", value1, value2, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantIdNotBetween(String value1, String value2) {
            addCriterion("accendant_id not between", value1, value2, "accendantId");
            return (Criteria) this;
        }

        public Criteria andAccendantNameIsNull() {
            addCriterion("accendant_name is null");
            return (Criteria) this;
        }

        public Criteria andAccendantNameIsNotNull() {
            addCriterion("accendant_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccendantNameEqualTo(String value) {
            addCriterion("accendant_name =", value, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameNotEqualTo(String value) {
            addCriterion("accendant_name <>", value, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameGreaterThan(String value) {
            addCriterion("accendant_name >", value, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameGreaterThanOrEqualTo(String value) {
            addCriterion("accendant_name >=", value, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameLessThan(String value) {
            addCriterion("accendant_name <", value, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameLessThanOrEqualTo(String value) {
            addCriterion("accendant_name <=", value, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameLike(String value) {
            addCriterion("accendant_name like", value, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameNotLike(String value) {
            addCriterion("accendant_name not like", value, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameIn(List<String> values) {
            addCriterion("accendant_name in", values, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameNotIn(List<String> values) {
            addCriterion("accendant_name not in", values, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameBetween(String value1, String value2) {
            addCriterion("accendant_name between", value1, value2, "accendantName");
            return (Criteria) this;
        }

        public Criteria andAccendantNameNotBetween(String value1, String value2) {
            addCriterion("accendant_name not between", value1, value2, "accendantName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateIsNull() {
            addCriterion("dispose_state is null");
            return (Criteria) this;
        }

        public Criteria andDisposeStateIsNotNull() {
            addCriterion("dispose_state is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeStateEqualTo(Integer value) {
            addCriterion("dispose_state =", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNotEqualTo(Integer value) {
            addCriterion("dispose_state <>", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateGreaterThan(Integer value) {
            addCriterion("dispose_state >", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispose_state >=", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateLessThan(Integer value) {
            addCriterion("dispose_state <", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateLessThanOrEqualTo(Integer value) {
            addCriterion("dispose_state <=", value, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateIn(List<Integer> values) {
            addCriterion("dispose_state in", values, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNotIn(List<Integer> values) {
            addCriterion("dispose_state not in", values, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateBetween(Integer value1, Integer value2) {
            addCriterion("dispose_state between", value1, value2, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("dispose_state not between", value1, value2, "disposeState");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameIsNull() {
            addCriterion("dispose_state_name is null");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameIsNotNull() {
            addCriterion("dispose_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameEqualTo(String value) {
            addCriterion("dispose_state_name =", value, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameNotEqualTo(String value) {
            addCriterion("dispose_state_name <>", value, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameGreaterThan(String value) {
            addCriterion("dispose_state_name >", value, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_state_name >=", value, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameLessThan(String value) {
            addCriterion("dispose_state_name <", value, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameLessThanOrEqualTo(String value) {
            addCriterion("dispose_state_name <=", value, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameLike(String value) {
            addCriterion("dispose_state_name like", value, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameNotLike(String value) {
            addCriterion("dispose_state_name not like", value, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameIn(List<String> values) {
            addCriterion("dispose_state_name in", values, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameNotIn(List<String> values) {
            addCriterion("dispose_state_name not in", values, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameBetween(String value1, String value2) {
            addCriterion("dispose_state_name between", value1, value2, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDisposeStateNameNotBetween(String value1, String value2) {
            addCriterion("dispose_state_name not between", value1, value2, "disposeStateName");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
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
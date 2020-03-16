package com.example.testConfig.db.mybatis.model.projectpermission;

import java.util.ArrayList;
import java.util.List;

public class PUserThirdAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PUserThirdAccountExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIsNull() {
            addCriterion("third_account is null");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIsNotNull() {
            addCriterion("third_account is not null");
            return (Criteria) this;
        }

        public Criteria andThirdAccountEqualTo(String value) {
            addCriterion("third_account =", value, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountNotEqualTo(String value) {
            addCriterion("third_account <>", value, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountGreaterThan(String value) {
            addCriterion("third_account >", value, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountGreaterThanOrEqualTo(String value) {
            addCriterion("third_account >=", value, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountLessThan(String value) {
            addCriterion("third_account <", value, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountLessThanOrEqualTo(String value) {
            addCriterion("third_account <=", value, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountLike(String value) {
            addCriterion("third_account like", value, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountNotLike(String value) {
            addCriterion("third_account not like", value, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIn(List<String> values) {
            addCriterion("third_account in", values, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountNotIn(List<String> values) {
            addCriterion("third_account not in", values, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountBetween(String value1, String value2) {
            addCriterion("third_account between", value1, value2, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andThirdAccountNotBetween(String value1, String value2) {
            addCriterion("third_account not between", value1, value2, "thirdAccount");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNull() {
            addCriterion("type_code is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("type_code is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(Integer value) {
            addCriterion("type_code =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(Integer value) {
            addCriterion("type_code <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(Integer value) {
            addCriterion("type_code >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_code >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(Integer value) {
            addCriterion("type_code <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("type_code <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<Integer> values) {
            addCriterion("type_code in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<Integer> values) {
            addCriterion("type_code not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("type_code between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("type_code not between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdIsNull() {
            addCriterion("wechar_gzh_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdIsNotNull() {
            addCriterion("wechar_gzh_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdEqualTo(String value) {
            addCriterion("wechar_gzh_open_id =", value, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdNotEqualTo(String value) {
            addCriterion("wechar_gzh_open_id <>", value, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdGreaterThan(String value) {
            addCriterion("wechar_gzh_open_id >", value, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechar_gzh_open_id >=", value, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdLessThan(String value) {
            addCriterion("wechar_gzh_open_id <", value, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdLessThanOrEqualTo(String value) {
            addCriterion("wechar_gzh_open_id <=", value, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdLike(String value) {
            addCriterion("wechar_gzh_open_id like", value, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdNotLike(String value) {
            addCriterion("wechar_gzh_open_id not like", value, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdIn(List<String> values) {
            addCriterion("wechar_gzh_open_id in", values, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdNotIn(List<String> values) {
            addCriterion("wechar_gzh_open_id not in", values, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdBetween(String value1, String value2) {
            addCriterion("wechar_gzh_open_id between", value1, value2, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharGzhOpenIdNotBetween(String value1, String value2) {
            addCriterion("wechar_gzh_open_id not between", value1, value2, "wecharGzhOpenId");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidIsNull() {
            addCriterion("wechar_unionid is null");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidIsNotNull() {
            addCriterion("wechar_unionid is not null");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidEqualTo(String value) {
            addCriterion("wechar_unionid =", value, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidNotEqualTo(String value) {
            addCriterion("wechar_unionid <>", value, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidGreaterThan(String value) {
            addCriterion("wechar_unionid >", value, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("wechar_unionid >=", value, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidLessThan(String value) {
            addCriterion("wechar_unionid <", value, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidLessThanOrEqualTo(String value) {
            addCriterion("wechar_unionid <=", value, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidLike(String value) {
            addCriterion("wechar_unionid like", value, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidNotLike(String value) {
            addCriterion("wechar_unionid not like", value, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidIn(List<String> values) {
            addCriterion("wechar_unionid in", values, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidNotIn(List<String> values) {
            addCriterion("wechar_unionid not in", values, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidBetween(String value1, String value2) {
            addCriterion("wechar_unionid between", value1, value2, "wecharUnionid");
            return (Criteria) this;
        }

        public Criteria andWecharUnionidNotBetween(String value1, String value2) {
            addCriterion("wechar_unionid not between", value1, value2, "wecharUnionid");
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
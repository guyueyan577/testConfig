package com.zxycloud.autoConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class ChargesExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargesExtendExample() {
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

        public Criteria andChargesIdIsNull() {
            addCriterion("charges_id is null");
            return (Criteria) this;
        }

        public Criteria andChargesIdIsNotNull() {
            addCriterion("charges_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargesIdEqualTo(String value) {
            addCriterion("charges_id =", value, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdNotEqualTo(String value) {
            addCriterion("charges_id <>", value, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdGreaterThan(String value) {
            addCriterion("charges_id >", value, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdGreaterThanOrEqualTo(String value) {
            addCriterion("charges_id >=", value, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdLessThan(String value) {
            addCriterion("charges_id <", value, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdLessThanOrEqualTo(String value) {
            addCriterion("charges_id <=", value, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdLike(String value) {
            addCriterion("charges_id like", value, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdNotLike(String value) {
            addCriterion("charges_id not like", value, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdIn(List<String> values) {
            addCriterion("charges_id in", values, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdNotIn(List<String> values) {
            addCriterion("charges_id not in", values, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdBetween(String value1, String value2) {
            addCriterion("charges_id between", value1, value2, "chargesId");
            return (Criteria) this;
        }

        public Criteria andChargesIdNotBetween(String value1, String value2) {
            addCriterion("charges_id not between", value1, value2, "chargesId");
            return (Criteria) this;
        }

        public Criteria andMonthCountIsNull() {
            addCriterion("month_count is null");
            return (Criteria) this;
        }

        public Criteria andMonthCountIsNotNull() {
            addCriterion("month_count is not null");
            return (Criteria) this;
        }

        public Criteria andMonthCountEqualTo(Integer value) {
            addCriterion("month_count =", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountNotEqualTo(Integer value) {
            addCriterion("month_count <>", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountGreaterThan(Integer value) {
            addCriterion("month_count >", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_count >=", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountLessThan(Integer value) {
            addCriterion("month_count <", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountLessThanOrEqualTo(Integer value) {
            addCriterion("month_count <=", value, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountIn(List<Integer> values) {
            addCriterion("month_count in", values, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountNotIn(List<Integer> values) {
            addCriterion("month_count not in", values, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountBetween(Integer value1, Integer value2) {
            addCriterion("month_count between", value1, value2, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMonthCountNotBetween(Integer value1, Integer value2) {
            addCriterion("month_count not between", value1, value2, "monthCount");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
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
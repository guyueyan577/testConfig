package com.example.testConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class ManageCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageCompanyExample() {
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

        public Criteria andProducerCodeIsNull() {
            addCriterion("producer_code is null");
            return (Criteria) this;
        }

        public Criteria andProducerCodeIsNotNull() {
            addCriterion("producer_code is not null");
            return (Criteria) this;
        }

        public Criteria andProducerCodeEqualTo(String value) {
            addCriterion("producer_code =", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotEqualTo(String value) {
            addCriterion("producer_code <>", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeGreaterThan(String value) {
            addCriterion("producer_code >", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("producer_code >=", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeLessThan(String value) {
            addCriterion("producer_code <", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeLessThanOrEqualTo(String value) {
            addCriterion("producer_code <=", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeLike(String value) {
            addCriterion("producer_code like", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotLike(String value) {
            addCriterion("producer_code not like", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeIn(List<String> values) {
            addCriterion("producer_code in", values, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotIn(List<String> values) {
            addCriterion("producer_code not in", values, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeBetween(String value1, String value2) {
            addCriterion("producer_code between", value1, value2, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotBetween(String value1, String value2) {
            addCriterion("producer_code not between", value1, value2, "producerCode");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameIsNull() {
            addCriterion("company_contact_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameIsNotNull() {
            addCriterion("company_contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameEqualTo(String value) {
            addCriterion("company_contact_name =", value, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameNotEqualTo(String value) {
            addCriterion("company_contact_name <>", value, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameGreaterThan(String value) {
            addCriterion("company_contact_name >", value, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_contact_name >=", value, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameLessThan(String value) {
            addCriterion("company_contact_name <", value, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameLessThanOrEqualTo(String value) {
            addCriterion("company_contact_name <=", value, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameLike(String value) {
            addCriterion("company_contact_name like", value, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameNotLike(String value) {
            addCriterion("company_contact_name not like", value, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameIn(List<String> values) {
            addCriterion("company_contact_name in", values, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameNotIn(List<String> values) {
            addCriterion("company_contact_name not in", values, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameBetween(String value1, String value2) {
            addCriterion("company_contact_name between", value1, value2, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactNameNotBetween(String value1, String value2) {
            addCriterion("company_contact_name not between", value1, value2, "companyContactName");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelIsNull() {
            addCriterion("company_contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelIsNotNull() {
            addCriterion("company_contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelEqualTo(String value) {
            addCriterion("company_contact_tel =", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelNotEqualTo(String value) {
            addCriterion("company_contact_tel <>", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelGreaterThan(String value) {
            addCriterion("company_contact_tel >", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("company_contact_tel >=", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelLessThan(String value) {
            addCriterion("company_contact_tel <", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelLessThanOrEqualTo(String value) {
            addCriterion("company_contact_tel <=", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelLike(String value) {
            addCriterion("company_contact_tel like", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelNotLike(String value) {
            addCriterion("company_contact_tel not like", value, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelIn(List<String> values) {
            addCriterion("company_contact_tel in", values, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelNotIn(List<String> values) {
            addCriterion("company_contact_tel not in", values, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelBetween(String value1, String value2) {
            addCriterion("company_contact_tel between", value1, value2, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andCompanyContactTelNotBetween(String value1, String value2) {
            addCriterion("company_contact_tel not between", value1, value2, "companyContactTel");
            return (Criteria) this;
        }

        public Criteria andMqAddrIsNull() {
            addCriterion("mq_addr is null");
            return (Criteria) this;
        }

        public Criteria andMqAddrIsNotNull() {
            addCriterion("mq_addr is not null");
            return (Criteria) this;
        }

        public Criteria andMqAddrEqualTo(String value) {
            addCriterion("mq_addr =", value, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrNotEqualTo(String value) {
            addCriterion("mq_addr <>", value, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrGreaterThan(String value) {
            addCriterion("mq_addr >", value, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrGreaterThanOrEqualTo(String value) {
            addCriterion("mq_addr >=", value, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrLessThan(String value) {
            addCriterion("mq_addr <", value, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrLessThanOrEqualTo(String value) {
            addCriterion("mq_addr <=", value, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrLike(String value) {
            addCriterion("mq_addr like", value, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrNotLike(String value) {
            addCriterion("mq_addr not like", value, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrIn(List<String> values) {
            addCriterion("mq_addr in", values, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrNotIn(List<String> values) {
            addCriterion("mq_addr not in", values, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrBetween(String value1, String value2) {
            addCriterion("mq_addr between", value1, value2, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqAddrNotBetween(String value1, String value2) {
            addCriterion("mq_addr not between", value1, value2, "mqAddr");
            return (Criteria) this;
        }

        public Criteria andMqPortIsNull() {
            addCriterion("mq_port is null");
            return (Criteria) this;
        }

        public Criteria andMqPortIsNotNull() {
            addCriterion("mq_port is not null");
            return (Criteria) this;
        }

        public Criteria andMqPortEqualTo(Integer value) {
            addCriterion("mq_port =", value, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortNotEqualTo(Integer value) {
            addCriterion("mq_port <>", value, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortGreaterThan(Integer value) {
            addCriterion("mq_port >", value, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("mq_port >=", value, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortLessThan(Integer value) {
            addCriterion("mq_port <", value, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortLessThanOrEqualTo(Integer value) {
            addCriterion("mq_port <=", value, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortIn(List<Integer> values) {
            addCriterion("mq_port in", values, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortNotIn(List<Integer> values) {
            addCriterion("mq_port not in", values, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortBetween(Integer value1, Integer value2) {
            addCriterion("mq_port between", value1, value2, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqPortNotBetween(Integer value1, Integer value2) {
            addCriterion("mq_port not between", value1, value2, "mqPort");
            return (Criteria) this;
        }

        public Criteria andMqUsernameIsNull() {
            addCriterion("mq_username is null");
            return (Criteria) this;
        }

        public Criteria andMqUsernameIsNotNull() {
            addCriterion("mq_username is not null");
            return (Criteria) this;
        }

        public Criteria andMqUsernameEqualTo(String value) {
            addCriterion("mq_username =", value, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameNotEqualTo(String value) {
            addCriterion("mq_username <>", value, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameGreaterThan(String value) {
            addCriterion("mq_username >", value, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("mq_username >=", value, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameLessThan(String value) {
            addCriterion("mq_username <", value, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameLessThanOrEqualTo(String value) {
            addCriterion("mq_username <=", value, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameLike(String value) {
            addCriterion("mq_username like", value, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameNotLike(String value) {
            addCriterion("mq_username not like", value, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameIn(List<String> values) {
            addCriterion("mq_username in", values, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameNotIn(List<String> values) {
            addCriterion("mq_username not in", values, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameBetween(String value1, String value2) {
            addCriterion("mq_username between", value1, value2, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqUsernameNotBetween(String value1, String value2) {
            addCriterion("mq_username not between", value1, value2, "mqUsername");
            return (Criteria) this;
        }

        public Criteria andMqPasswordIsNull() {
            addCriterion("mq_password is null");
            return (Criteria) this;
        }

        public Criteria andMqPasswordIsNotNull() {
            addCriterion("mq_password is not null");
            return (Criteria) this;
        }

        public Criteria andMqPasswordEqualTo(String value) {
            addCriterion("mq_password =", value, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordNotEqualTo(String value) {
            addCriterion("mq_password <>", value, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordGreaterThan(String value) {
            addCriterion("mq_password >", value, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mq_password >=", value, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordLessThan(String value) {
            addCriterion("mq_password <", value, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordLessThanOrEqualTo(String value) {
            addCriterion("mq_password <=", value, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordLike(String value) {
            addCriterion("mq_password like", value, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordNotLike(String value) {
            addCriterion("mq_password not like", value, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordIn(List<String> values) {
            addCriterion("mq_password in", values, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordNotIn(List<String> values) {
            addCriterion("mq_password not in", values, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordBetween(String value1, String value2) {
            addCriterion("mq_password between", value1, value2, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andMqPasswordNotBetween(String value1, String value2) {
            addCriterion("mq_password not between", value1, value2, "mqPassword");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountIsNull() {
            addCriterion("project_admin_account is null");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountIsNotNull() {
            addCriterion("project_admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountEqualTo(String value) {
            addCriterion("project_admin_account =", value, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountNotEqualTo(String value) {
            addCriterion("project_admin_account <>", value, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountGreaterThan(String value) {
            addCriterion("project_admin_account >", value, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("project_admin_account >=", value, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountLessThan(String value) {
            addCriterion("project_admin_account <", value, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("project_admin_account <=", value, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountLike(String value) {
            addCriterion("project_admin_account like", value, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountNotLike(String value) {
            addCriterion("project_admin_account not like", value, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountIn(List<String> values) {
            addCriterion("project_admin_account in", values, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountNotIn(List<String> values) {
            addCriterion("project_admin_account not in", values, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountBetween(String value1, String value2) {
            addCriterion("project_admin_account between", value1, value2, "projectAdminAccount");
            return (Criteria) this;
        }

        public Criteria andProjectAdminAccountNotBetween(String value1, String value2) {
            addCriterion("project_admin_account not between", value1, value2, "projectAdminAccount");
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
package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class AgentBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentBaseExample() {
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

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeIsNull() {
            addCriterion("first_level_region_code is null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeIsNotNull() {
            addCriterion("first_level_region_code is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeEqualTo(String value) {
            addCriterion("first_level_region_code =", value, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeNotEqualTo(String value) {
            addCriterion("first_level_region_code <>", value, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeGreaterThan(String value) {
            addCriterion("first_level_region_code >", value, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("first_level_region_code >=", value, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeLessThan(String value) {
            addCriterion("first_level_region_code <", value, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("first_level_region_code <=", value, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeLike(String value) {
            addCriterion("first_level_region_code like", value, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeNotLike(String value) {
            addCriterion("first_level_region_code not like", value, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeIn(List<String> values) {
            addCriterion("first_level_region_code in", values, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeNotIn(List<String> values) {
            addCriterion("first_level_region_code not in", values, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeBetween(String value1, String value2) {
            addCriterion("first_level_region_code between", value1, value2, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFirstLevelRegionCodeNotBetween(String value1, String value2) {
            addCriterion("first_level_region_code not between", value1, value2, "firstLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeIsNull() {
            addCriterion("second_level_region_code is null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeIsNotNull() {
            addCriterion("second_level_region_code is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeEqualTo(String value) {
            addCriterion("second_level_region_code =", value, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeNotEqualTo(String value) {
            addCriterion("second_level_region_code <>", value, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeGreaterThan(String value) {
            addCriterion("second_level_region_code >", value, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("second_level_region_code >=", value, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeLessThan(String value) {
            addCriterion("second_level_region_code <", value, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("second_level_region_code <=", value, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeLike(String value) {
            addCriterion("second_level_region_code like", value, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeNotLike(String value) {
            addCriterion("second_level_region_code not like", value, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeIn(List<String> values) {
            addCriterion("second_level_region_code in", values, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeNotIn(List<String> values) {
            addCriterion("second_level_region_code not in", values, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeBetween(String value1, String value2) {
            addCriterion("second_level_region_code between", value1, value2, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andSecondLevelRegionCodeNotBetween(String value1, String value2) {
            addCriterion("second_level_region_code not between", value1, value2, "secondLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeIsNull() {
            addCriterion("third_level_region_code is null");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeIsNotNull() {
            addCriterion("third_level_region_code is not null");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeEqualTo(String value) {
            addCriterion("third_level_region_code =", value, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeNotEqualTo(String value) {
            addCriterion("third_level_region_code <>", value, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeGreaterThan(String value) {
            addCriterion("third_level_region_code >", value, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("third_level_region_code >=", value, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeLessThan(String value) {
            addCriterion("third_level_region_code <", value, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("third_level_region_code <=", value, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeLike(String value) {
            addCriterion("third_level_region_code like", value, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeNotLike(String value) {
            addCriterion("third_level_region_code not like", value, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeIn(List<String> values) {
            addCriterion("third_level_region_code in", values, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeNotIn(List<String> values) {
            addCriterion("third_level_region_code not in", values, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeBetween(String value1, String value2) {
            addCriterion("third_level_region_code between", value1, value2, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andThirdLevelRegionCodeNotBetween(String value1, String value2) {
            addCriterion("third_level_region_code not between", value1, value2, "thirdLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("postal_code is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("postal_code =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("postal_code <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("postal_code >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postal_code >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("postal_code <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("postal_code <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("postal_code like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("postal_code not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("postal_code in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("postal_code not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("postal_code between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("postal_code not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNull() {
            addCriterion("principal_name is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNotNull() {
            addCriterion("principal_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameEqualTo(String value) {
            addCriterion("principal_name =", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotEqualTo(String value) {
            addCriterion("principal_name <>", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThan(String value) {
            addCriterion("principal_name >", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThanOrEqualTo(String value) {
            addCriterion("principal_name >=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThan(String value) {
            addCriterion("principal_name <", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThanOrEqualTo(String value) {
            addCriterion("principal_name <=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLike(String value) {
            addCriterion("principal_name like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotLike(String value) {
            addCriterion("principal_name not like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIn(List<String> values) {
            addCriterion("principal_name in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotIn(List<String> values) {
            addCriterion("principal_name not in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameBetween(String value1, String value2) {
            addCriterion("principal_name between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotBetween(String value1, String value2) {
            addCriterion("principal_name not between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberIsNull() {
            addCriterion("principal_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberIsNotNull() {
            addCriterion("principal_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberEqualTo(String value) {
            addCriterion("principal_phone_number =", value, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberNotEqualTo(String value) {
            addCriterion("principal_phone_number <>", value, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberGreaterThan(String value) {
            addCriterion("principal_phone_number >", value, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("principal_phone_number >=", value, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberLessThan(String value) {
            addCriterion("principal_phone_number <", value, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("principal_phone_number <=", value, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberLike(String value) {
            addCriterion("principal_phone_number like", value, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberNotLike(String value) {
            addCriterion("principal_phone_number not like", value, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberIn(List<String> values) {
            addCriterion("principal_phone_number in", values, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberNotIn(List<String> values) {
            addCriterion("principal_phone_number not in", values, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberBetween(String value1, String value2) {
            addCriterion("principal_phone_number between", value1, value2, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("principal_phone_number not between", value1, value2, "principalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_id like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_id not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Boolean value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Boolean value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Boolean value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Boolean value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Boolean> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Boolean> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAuditMethodIsNull() {
            addCriterion("audit_method is null");
            return (Criteria) this;
        }

        public Criteria andAuditMethodIsNotNull() {
            addCriterion("audit_method is not null");
            return (Criteria) this;
        }

        public Criteria andAuditMethodEqualTo(Integer value) {
            addCriterion("audit_method =", value, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodNotEqualTo(Integer value) {
            addCriterion("audit_method <>", value, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodGreaterThan(Integer value) {
            addCriterion("audit_method >", value, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_method >=", value, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodLessThan(Integer value) {
            addCriterion("audit_method <", value, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodLessThanOrEqualTo(Integer value) {
            addCriterion("audit_method <=", value, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodIn(List<Integer> values) {
            addCriterion("audit_method in", values, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodNotIn(List<Integer> values) {
            addCriterion("audit_method not in", values, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodBetween(Integer value1, Integer value2) {
            addCriterion("audit_method between", value1, value2, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_method not between", value1, value2, "auditMethod");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentIsNull() {
            addCriterion("audit_payment is null");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentIsNotNull() {
            addCriterion("audit_payment is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentEqualTo(Double value) {
            addCriterion("audit_payment =", value, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentNotEqualTo(Double value) {
            addCriterion("audit_payment <>", value, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentGreaterThan(Double value) {
            addCriterion("audit_payment >", value, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("audit_payment >=", value, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentLessThan(Double value) {
            addCriterion("audit_payment <", value, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentLessThanOrEqualTo(Double value) {
            addCriterion("audit_payment <=", value, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentIn(List<Double> values) {
            addCriterion("audit_payment in", values, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentNotIn(List<Double> values) {
            addCriterion("audit_payment not in", values, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentBetween(Double value1, Double value2) {
            addCriterion("audit_payment between", value1, value2, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditPaymentNotBetween(Double value1, Double value2) {
            addCriterion("audit_payment not between", value1, value2, "auditPayment");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNull() {
            addCriterion("audit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNotNull() {
            addCriterion("audit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdEqualTo(String value) {
            addCriterion("audit_user_id =", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotEqualTo(String value) {
            addCriterion("audit_user_id <>", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThan(String value) {
            addCriterion("audit_user_id >", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user_id >=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThan(String value) {
            addCriterion("audit_user_id <", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThanOrEqualTo(String value) {
            addCriterion("audit_user_id <=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLike(String value) {
            addCriterion("audit_user_id like", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotLike(String value) {
            addCriterion("audit_user_id not like", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIn(List<String> values) {
            addCriterion("audit_user_id in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotIn(List<String> values) {
            addCriterion("audit_user_id not in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdBetween(String value1, String value2) {
            addCriterion("audit_user_id between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotBetween(String value1, String value2) {
            addCriterion("audit_user_id not between", value1, value2, "auditUserId");
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
package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class ProjectBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectBaseExample() {
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

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("agent_id like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("agent_id not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andFourLevelRegionCodeIsNull() {
            addCriterion("four_level_region_code is null");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeIsNotNull() {
            addCriterion("four_level_region_code is not null");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeEqualTo(String value) {
            addCriterion("four_level_region_code =", value, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeNotEqualTo(String value) {
            addCriterion("four_level_region_code <>", value, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeGreaterThan(String value) {
            addCriterion("four_level_region_code >", value, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("four_level_region_code >=", value, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeLessThan(String value) {
            addCriterion("four_level_region_code <", value, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("four_level_region_code <=", value, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeLike(String value) {
            addCriterion("four_level_region_code like", value, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeNotLike(String value) {
            addCriterion("four_level_region_code not like", value, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeIn(List<String> values) {
            addCriterion("four_level_region_code in", values, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeNotIn(List<String> values) {
            addCriterion("four_level_region_code not in", values, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeBetween(String value1, String value2) {
            addCriterion("four_level_region_code between", value1, value2, "fourLevelRegionCode");
            return (Criteria) this;
        }

        public Criteria andFourLevelRegionCodeNotBetween(String value1, String value2) {
            addCriterion("four_level_region_code not between", value1, value2, "fourLevelRegionCode");
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

        public Criteria andDutyPhoneNumberIsNull() {
            addCriterion("duty_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberIsNotNull() {
            addCriterion("duty_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberEqualTo(String value) {
            addCriterion("duty_phone_number =", value, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberNotEqualTo(String value) {
            addCriterion("duty_phone_number <>", value, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberGreaterThan(String value) {
            addCriterion("duty_phone_number >", value, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("duty_phone_number >=", value, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberLessThan(String value) {
            addCriterion("duty_phone_number <", value, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("duty_phone_number <=", value, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberLike(String value) {
            addCriterion("duty_phone_number like", value, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberNotLike(String value) {
            addCriterion("duty_phone_number not like", value, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberIn(List<String> values) {
            addCriterion("duty_phone_number in", values, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberNotIn(List<String> values) {
            addCriterion("duty_phone_number not in", values, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberBetween(String value1, String value2) {
            addCriterion("duty_phone_number between", value1, value2, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDutyPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("duty_phone_number not between", value1, value2, "dutyPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeIsNull() {
            addCriterion("gcj02_latitude is null");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeIsNotNull() {
            addCriterion("gcj02_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeEqualTo(Double value) {
            addCriterion("gcj02_latitude =", value, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeNotEqualTo(Double value) {
            addCriterion("gcj02_latitude <>", value, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeGreaterThan(Double value) {
            addCriterion("gcj02_latitude >", value, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("gcj02_latitude >=", value, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeLessThan(Double value) {
            addCriterion("gcj02_latitude <", value, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeLessThanOrEqualTo(Double value) {
            addCriterion("gcj02_latitude <=", value, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeIn(List<Double> values) {
            addCriterion("gcj02_latitude in", values, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeNotIn(List<Double> values) {
            addCriterion("gcj02_latitude not in", values, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeBetween(Double value1, Double value2) {
            addCriterion("gcj02_latitude between", value1, value2, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LatitudeNotBetween(Double value1, Double value2) {
            addCriterion("gcj02_latitude not between", value1, value2, "gcj02Latitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeIsNull() {
            addCriterion("gcj02_longitude is null");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeIsNotNull() {
            addCriterion("gcj02_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeEqualTo(Double value) {
            addCriterion("gcj02_longitude =", value, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeNotEqualTo(Double value) {
            addCriterion("gcj02_longitude <>", value, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeGreaterThan(Double value) {
            addCriterion("gcj02_longitude >", value, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("gcj02_longitude >=", value, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeLessThan(Double value) {
            addCriterion("gcj02_longitude <", value, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeLessThanOrEqualTo(Double value) {
            addCriterion("gcj02_longitude <=", value, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeIn(List<Double> values) {
            addCriterion("gcj02_longitude in", values, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeNotIn(List<Double> values) {
            addCriterion("gcj02_longitude not in", values, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeBetween(Double value1, Double value2) {
            addCriterion("gcj02_longitude between", value1, value2, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andGcj02LongitudeNotBetween(Double value1, Double value2) {
            addCriterion("gcj02_longitude not between", value1, value2, "gcj02Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeIsNull() {
            addCriterion("wgs84_latitude is null");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeIsNotNull() {
            addCriterion("wgs84_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeEqualTo(Double value) {
            addCriterion("wgs84_latitude =", value, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeNotEqualTo(Double value) {
            addCriterion("wgs84_latitude <>", value, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeGreaterThan(Double value) {
            addCriterion("wgs84_latitude >", value, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("wgs84_latitude >=", value, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeLessThan(Double value) {
            addCriterion("wgs84_latitude <", value, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeLessThanOrEqualTo(Double value) {
            addCriterion("wgs84_latitude <=", value, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeIn(List<Double> values) {
            addCriterion("wgs84_latitude in", values, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeNotIn(List<Double> values) {
            addCriterion("wgs84_latitude not in", values, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeBetween(Double value1, Double value2) {
            addCriterion("wgs84_latitude between", value1, value2, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LatitudeNotBetween(Double value1, Double value2) {
            addCriterion("wgs84_latitude not between", value1, value2, "wgs84Latitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeIsNull() {
            addCriterion("wgs84_longitude is null");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeIsNotNull() {
            addCriterion("wgs84_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeEqualTo(Double value) {
            addCriterion("wgs84_longitude =", value, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeNotEqualTo(Double value) {
            addCriterion("wgs84_longitude <>", value, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeGreaterThan(Double value) {
            addCriterion("wgs84_longitude >", value, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("wgs84_longitude >=", value, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeLessThan(Double value) {
            addCriterion("wgs84_longitude <", value, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeLessThanOrEqualTo(Double value) {
            addCriterion("wgs84_longitude <=", value, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeIn(List<Double> values) {
            addCriterion("wgs84_longitude in", values, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeNotIn(List<Double> values) {
            addCriterion("wgs84_longitude not in", values, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeBetween(Double value1, Double value2) {
            addCriterion("wgs84_longitude between", value1, value2, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andWgs84LongitudeNotBetween(Double value1, Double value2) {
            addCriterion("wgs84_longitude not between", value1, value2, "wgs84Longitude");
            return (Criteria) this;
        }

        public Criteria andProjectStateIsNull() {
            addCriterion("project_state is null");
            return (Criteria) this;
        }

        public Criteria andProjectStateIsNotNull() {
            addCriterion("project_state is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStateEqualTo(Integer value) {
            addCriterion("project_state =", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateNotEqualTo(Integer value) {
            addCriterion("project_state <>", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateGreaterThan(Integer value) {
            addCriterion("project_state >", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_state >=", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateLessThan(Integer value) {
            addCriterion("project_state <", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateLessThanOrEqualTo(Integer value) {
            addCriterion("project_state <=", value, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateIn(List<Integer> values) {
            addCriterion("project_state in", values, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateNotIn(List<Integer> values) {
            addCriterion("project_state not in", values, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateBetween(Integer value1, Integer value2) {
            addCriterion("project_state between", value1, value2, "projectState");
            return (Criteria) this;
        }

        public Criteria andProjectStateNotBetween(Integer value1, Integer value2) {
            addCriterion("project_state not between", value1, value2, "projectState");
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

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(Integer value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(Integer value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(Integer value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(Integer value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(Integer value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<Integer> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<Integer> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(Integer value1, Integer value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionIsNull() {
            addCriterion("project_monitor_region is null");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionIsNotNull() {
            addCriterion("project_monitor_region is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionEqualTo(String value) {
            addCriterion("project_monitor_region =", value, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionNotEqualTo(String value) {
            addCriterion("project_monitor_region <>", value, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionGreaterThan(String value) {
            addCriterion("project_monitor_region >", value, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionGreaterThanOrEqualTo(String value) {
            addCriterion("project_monitor_region >=", value, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionLessThan(String value) {
            addCriterion("project_monitor_region <", value, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionLessThanOrEqualTo(String value) {
            addCriterion("project_monitor_region <=", value, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionLike(String value) {
            addCriterion("project_monitor_region like", value, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionNotLike(String value) {
            addCriterion("project_monitor_region not like", value, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionIn(List<String> values) {
            addCriterion("project_monitor_region in", values, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionNotIn(List<String> values) {
            addCriterion("project_monitor_region not in", values, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionBetween(String value1, String value2) {
            addCriterion("project_monitor_region between", value1, value2, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorRegionNotBetween(String value1, String value2) {
            addCriterion("project_monitor_region not between", value1, value2, "projectMonitorRegion");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(Integer value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(Integer value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(Integer value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(Integer value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(Integer value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(Integer value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<Integer> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<Integer> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(Integer value1, Integer value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(Integer value1, Integer value2) {
            addCriterion("property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedIsNull() {
            addCriterion("phone_notified is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedIsNotNull() {
            addCriterion("phone_notified is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedEqualTo(Boolean value) {
            addCriterion("phone_notified =", value, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedNotEqualTo(Boolean value) {
            addCriterion("phone_notified <>", value, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedGreaterThan(Boolean value) {
            addCriterion("phone_notified >", value, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("phone_notified >=", value, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedLessThan(Boolean value) {
            addCriterion("phone_notified <", value, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("phone_notified <=", value, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedIn(List<Boolean> values) {
            addCriterion("phone_notified in", values, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedNotIn(List<Boolean> values) {
            addCriterion("phone_notified not in", values, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("phone_notified between", value1, value2, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andPhoneNotifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("phone_notified not between", value1, value2, "phoneNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedIsNull() {
            addCriterion("message_notified is null");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedIsNotNull() {
            addCriterion("message_notified is not null");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedEqualTo(Boolean value) {
            addCriterion("message_notified =", value, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedNotEqualTo(Boolean value) {
            addCriterion("message_notified <>", value, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedGreaterThan(Boolean value) {
            addCriterion("message_notified >", value, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("message_notified >=", value, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedLessThan(Boolean value) {
            addCriterion("message_notified <", value, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("message_notified <=", value, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedIn(List<Boolean> values) {
            addCriterion("message_notified in", values, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedNotIn(List<Boolean> values) {
            addCriterion("message_notified not in", values, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("message_notified between", value1, value2, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andMessageNotifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("message_notified not between", value1, value2, "messageNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedIsNull() {
            addCriterion("app_notified is null");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedIsNotNull() {
            addCriterion("app_notified is not null");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedEqualTo(Boolean value) {
            addCriterion("app_notified =", value, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedNotEqualTo(Boolean value) {
            addCriterion("app_notified <>", value, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedGreaterThan(Boolean value) {
            addCriterion("app_notified >", value, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("app_notified >=", value, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedLessThan(Boolean value) {
            addCriterion("app_notified <", value, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("app_notified <=", value, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedIn(List<Boolean> values) {
            addCriterion("app_notified in", values, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedNotIn(List<Boolean> values) {
            addCriterion("app_notified not in", values, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("app_notified between", value1, value2, "appNotified");
            return (Criteria) this;
        }

        public Criteria andAppNotifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("app_notified not between", value1, value2, "appNotified");
            return (Criteria) this;
        }

        public Criteria andPushSwitchIsNull() {
            addCriterion("push_switch is null");
            return (Criteria) this;
        }

        public Criteria andPushSwitchIsNotNull() {
            addCriterion("push_switch is not null");
            return (Criteria) this;
        }

        public Criteria andPushSwitchEqualTo(Boolean value) {
            addCriterion("push_switch =", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchNotEqualTo(Boolean value) {
            addCriterion("push_switch <>", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchGreaterThan(Boolean value) {
            addCriterion("push_switch >", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("push_switch >=", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchLessThan(Boolean value) {
            addCriterion("push_switch <", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchLessThanOrEqualTo(Boolean value) {
            addCriterion("push_switch <=", value, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchIn(List<Boolean> values) {
            addCriterion("push_switch in", values, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchNotIn(List<Boolean> values) {
            addCriterion("push_switch not in", values, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchBetween(Boolean value1, Boolean value2) {
            addCriterion("push_switch between", value1, value2, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andPushSwitchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("push_switch not between", value1, value2, "pushSwitch");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdIsNull() {
            addCriterion("workflow_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdIsNotNull() {
            addCriterion("workflow_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdEqualTo(String value) {
            addCriterion("workflow_id =", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotEqualTo(String value) {
            addCriterion("workflow_id <>", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdGreaterThan(String value) {
            addCriterion("workflow_id >", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdGreaterThanOrEqualTo(String value) {
            addCriterion("workflow_id >=", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdLessThan(String value) {
            addCriterion("workflow_id <", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdLessThanOrEqualTo(String value) {
            addCriterion("workflow_id <=", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdLike(String value) {
            addCriterion("workflow_id like", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotLike(String value) {
            addCriterion("workflow_id not like", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdIn(List<String> values) {
            addCriterion("workflow_id in", values, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotIn(List<String> values) {
            addCriterion("workflow_id not in", values, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdBetween(String value1, String value2) {
            addCriterion("workflow_id between", value1, value2, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotBetween(String value1, String value2) {
            addCriterion("workflow_id not between", value1, value2, "workflowId");
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

        public Criteria andServiceStartTimeIsNull() {
            addCriterion("service_start_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeIsNotNull() {
            addCriterion("service_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeEqualTo(Long value) {
            addCriterion("service_start_time =", value, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeNotEqualTo(Long value) {
            addCriterion("service_start_time <>", value, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeGreaterThan(Long value) {
            addCriterion("service_start_time >", value, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("service_start_time >=", value, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeLessThan(Long value) {
            addCriterion("service_start_time <", value, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("service_start_time <=", value, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeIn(List<Long> values) {
            addCriterion("service_start_time in", values, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeNotIn(List<Long> values) {
            addCriterion("service_start_time not in", values, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeBetween(Long value1, Long value2) {
            addCriterion("service_start_time between", value1, value2, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("service_start_time not between", value1, value2, "serviceStartTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIsNull() {
            addCriterion("service_end_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIsNotNull() {
            addCriterion("service_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeEqualTo(Long value) {
            addCriterion("service_end_time =", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotEqualTo(Long value) {
            addCriterion("service_end_time <>", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeGreaterThan(Long value) {
            addCriterion("service_end_time >", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("service_end_time >=", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLessThan(Long value) {
            addCriterion("service_end_time <", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("service_end_time <=", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIn(List<Long> values) {
            addCriterion("service_end_time in", values, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotIn(List<Long> values) {
            addCriterion("service_end_time not in", values, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeBetween(Long value1, Long value2) {
            addCriterion("service_end_time between", value1, value2, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("service_end_time not between", value1, value2, "serviceEndTime");
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

        public Criteria andPersonalProjectIsNull() {
            addCriterion("personal_project is null");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectIsNotNull() {
            addCriterion("personal_project is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectEqualTo(Boolean value) {
            addCriterion("personal_project =", value, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectNotEqualTo(Boolean value) {
            addCriterion("personal_project <>", value, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectGreaterThan(Boolean value) {
            addCriterion("personal_project >", value, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("personal_project >=", value, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectLessThan(Boolean value) {
            addCriterion("personal_project <", value, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectLessThanOrEqualTo(Boolean value) {
            addCriterion("personal_project <=", value, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectIn(List<Boolean> values) {
            addCriterion("personal_project in", values, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectNotIn(List<Boolean> values) {
            addCriterion("personal_project not in", values, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectBetween(Boolean value1, Boolean value2) {
            addCriterion("personal_project between", value1, value2, "personalProject");
            return (Criteria) this;
        }

        public Criteria andPersonalProjectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("personal_project not between", value1, value2, "personalProject");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIsNull() {
            addCriterion("project_source is null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIsNotNull() {
            addCriterion("project_source is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceEqualTo(Integer value) {
            addCriterion("project_source =", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotEqualTo(Integer value) {
            addCriterion("project_source <>", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceGreaterThan(Integer value) {
            addCriterion("project_source >", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_source >=", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceLessThan(Integer value) {
            addCriterion("project_source <", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceLessThanOrEqualTo(Integer value) {
            addCriterion("project_source <=", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIn(List<Integer> values) {
            addCriterion("project_source in", values, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotIn(List<Integer> values) {
            addCriterion("project_source not in", values, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceBetween(Integer value1, Integer value2) {
            addCriterion("project_source between", value1, value2, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("project_source not between", value1, value2, "projectSource");
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
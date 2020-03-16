package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class ProjectExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExtendExample() {
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

        public Criteria andManageTitleIsNull() {
            addCriterion("manage_title is null");
            return (Criteria) this;
        }

        public Criteria andManageTitleIsNotNull() {
            addCriterion("manage_title is not null");
            return (Criteria) this;
        }

        public Criteria andManageTitleEqualTo(String value) {
            addCriterion("manage_title =", value, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleNotEqualTo(String value) {
            addCriterion("manage_title <>", value, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleGreaterThan(String value) {
            addCriterion("manage_title >", value, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("manage_title >=", value, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleLessThan(String value) {
            addCriterion("manage_title <", value, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleLessThanOrEqualTo(String value) {
            addCriterion("manage_title <=", value, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleLike(String value) {
            addCriterion("manage_title like", value, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleNotLike(String value) {
            addCriterion("manage_title not like", value, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleIn(List<String> values) {
            addCriterion("manage_title in", values, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleNotIn(List<String> values) {
            addCriterion("manage_title not in", values, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleBetween(String value1, String value2) {
            addCriterion("manage_title between", value1, value2, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andManageTitleNotBetween(String value1, String value2) {
            addCriterion("manage_title not between", value1, value2, "manageTitle");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("organization_code =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("organization_code <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("organization_code >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("organization_code <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("organization_code <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("organization_code like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("organization_code not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("organization_code in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("organization_code not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("organization_code between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("organization_code not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameIsNull() {
            addCriterion("security_charge_person_name is null");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameIsNotNull() {
            addCriterion("security_charge_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameEqualTo(String value) {
            addCriterion("security_charge_person_name =", value, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameNotEqualTo(String value) {
            addCriterion("security_charge_person_name <>", value, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameGreaterThan(String value) {
            addCriterion("security_charge_person_name >", value, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("security_charge_person_name >=", value, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameLessThan(String value) {
            addCriterion("security_charge_person_name <", value, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameLessThanOrEqualTo(String value) {
            addCriterion("security_charge_person_name <=", value, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameLike(String value) {
            addCriterion("security_charge_person_name like", value, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameNotLike(String value) {
            addCriterion("security_charge_person_name not like", value, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameIn(List<String> values) {
            addCriterion("security_charge_person_name in", values, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameNotIn(List<String> values) {
            addCriterion("security_charge_person_name not in", values, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameBetween(String value1, String value2) {
            addCriterion("security_charge_person_name between", value1, value2, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonNameNotBetween(String value1, String value2) {
            addCriterion("security_charge_person_name not between", value1, value2, "securityChargePersonName");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneIsNull() {
            addCriterion("security_charge_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneIsNotNull() {
            addCriterion("security_charge_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneEqualTo(String value) {
            addCriterion("security_charge_person_phone =", value, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneNotEqualTo(String value) {
            addCriterion("security_charge_person_phone <>", value, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneGreaterThan(String value) {
            addCriterion("security_charge_person_phone >", value, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("security_charge_person_phone >=", value, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneLessThan(String value) {
            addCriterion("security_charge_person_phone <", value, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("security_charge_person_phone <=", value, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneLike(String value) {
            addCriterion("security_charge_person_phone like", value, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneNotLike(String value) {
            addCriterion("security_charge_person_phone not like", value, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneIn(List<String> values) {
            addCriterion("security_charge_person_phone in", values, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneNotIn(List<String> values) {
            addCriterion("security_charge_person_phone not in", values, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneBetween(String value1, String value2) {
            addCriterion("security_charge_person_phone between", value1, value2, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonPhoneNotBetween(String value1, String value2) {
            addCriterion("security_charge_person_phone not between", value1, value2, "securityChargePersonPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardIsNull() {
            addCriterion("security_charge_person_card is null");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardIsNotNull() {
            addCriterion("security_charge_person_card is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardEqualTo(String value) {
            addCriterion("security_charge_person_card =", value, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardNotEqualTo(String value) {
            addCriterion("security_charge_person_card <>", value, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardGreaterThan(String value) {
            addCriterion("security_charge_person_card >", value, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardGreaterThanOrEqualTo(String value) {
            addCriterion("security_charge_person_card >=", value, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardLessThan(String value) {
            addCriterion("security_charge_person_card <", value, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardLessThanOrEqualTo(String value) {
            addCriterion("security_charge_person_card <=", value, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardLike(String value) {
            addCriterion("security_charge_person_card like", value, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardNotLike(String value) {
            addCriterion("security_charge_person_card not like", value, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardIn(List<String> values) {
            addCriterion("security_charge_person_card in", values, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardNotIn(List<String> values) {
            addCriterion("security_charge_person_card not in", values, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardBetween(String value1, String value2) {
            addCriterion("security_charge_person_card between", value1, value2, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityChargePersonCardNotBetween(String value1, String value2) {
            addCriterion("security_charge_person_card not between", value1, value2, "securityChargePersonCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameIsNull() {
            addCriterion("security_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameIsNotNull() {
            addCriterion("security_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameEqualTo(String value) {
            addCriterion("security_manager_name =", value, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameNotEqualTo(String value) {
            addCriterion("security_manager_name <>", value, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameGreaterThan(String value) {
            addCriterion("security_manager_name >", value, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("security_manager_name >=", value, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameLessThan(String value) {
            addCriterion("security_manager_name <", value, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameLessThanOrEqualTo(String value) {
            addCriterion("security_manager_name <=", value, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameLike(String value) {
            addCriterion("security_manager_name like", value, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameNotLike(String value) {
            addCriterion("security_manager_name not like", value, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameIn(List<String> values) {
            addCriterion("security_manager_name in", values, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameNotIn(List<String> values) {
            addCriterion("security_manager_name not in", values, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameBetween(String value1, String value2) {
            addCriterion("security_manager_name between", value1, value2, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerNameNotBetween(String value1, String value2) {
            addCriterion("security_manager_name not between", value1, value2, "securityManagerName");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneIsNull() {
            addCriterion("security_manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneIsNotNull() {
            addCriterion("security_manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneEqualTo(String value) {
            addCriterion("security_manager_phone =", value, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneNotEqualTo(String value) {
            addCriterion("security_manager_phone <>", value, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneGreaterThan(String value) {
            addCriterion("security_manager_phone >", value, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("security_manager_phone >=", value, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneLessThan(String value) {
            addCriterion("security_manager_phone <", value, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("security_manager_phone <=", value, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneLike(String value) {
            addCriterion("security_manager_phone like", value, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneNotLike(String value) {
            addCriterion("security_manager_phone not like", value, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneIn(List<String> values) {
            addCriterion("security_manager_phone in", values, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneNotIn(List<String> values) {
            addCriterion("security_manager_phone not in", values, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneBetween(String value1, String value2) {
            addCriterion("security_manager_phone between", value1, value2, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("security_manager_phone not between", value1, value2, "securityManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardIsNull() {
            addCriterion("security_manager_card is null");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardIsNotNull() {
            addCriterion("security_manager_card is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardEqualTo(String value) {
            addCriterion("security_manager_card =", value, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardNotEqualTo(String value) {
            addCriterion("security_manager_card <>", value, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardGreaterThan(String value) {
            addCriterion("security_manager_card >", value, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardGreaterThanOrEqualTo(String value) {
            addCriterion("security_manager_card >=", value, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardLessThan(String value) {
            addCriterion("security_manager_card <", value, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardLessThanOrEqualTo(String value) {
            addCriterion("security_manager_card <=", value, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardLike(String value) {
            addCriterion("security_manager_card like", value, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardNotLike(String value) {
            addCriterion("security_manager_card not like", value, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardIn(List<String> values) {
            addCriterion("security_manager_card in", values, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardNotIn(List<String> values) {
            addCriterion("security_manager_card not in", values, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardBetween(String value1, String value2) {
            addCriterion("security_manager_card between", value1, value2, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andSecurityManagerCardNotBetween(String value1, String value2) {
            addCriterion("security_manager_card not between", value1, value2, "securityManagerCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameIsNull() {
            addCriterion("legal_representative_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameIsNotNull() {
            addCriterion("legal_representative_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameEqualTo(String value) {
            addCriterion("legal_representative_name =", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameNotEqualTo(String value) {
            addCriterion("legal_representative_name <>", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameGreaterThan(String value) {
            addCriterion("legal_representative_name >", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_name >=", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameLessThan(String value) {
            addCriterion("legal_representative_name <", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_name <=", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameLike(String value) {
            addCriterion("legal_representative_name like", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameNotLike(String value) {
            addCriterion("legal_representative_name not like", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameIn(List<String> values) {
            addCriterion("legal_representative_name in", values, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameNotIn(List<String> values) {
            addCriterion("legal_representative_name not in", values, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameBetween(String value1, String value2) {
            addCriterion("legal_representative_name between", value1, value2, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameNotBetween(String value1, String value2) {
            addCriterion("legal_representative_name not between", value1, value2, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIsNull() {
            addCriterion("legal_representative_phone is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIsNotNull() {
            addCriterion("legal_representative_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneEqualTo(String value) {
            addCriterion("legal_representative_phone =", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotEqualTo(String value) {
            addCriterion("legal_representative_phone <>", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneGreaterThan(String value) {
            addCriterion("legal_representative_phone >", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_phone >=", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLessThan(String value) {
            addCriterion("legal_representative_phone <", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_phone <=", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLike(String value) {
            addCriterion("legal_representative_phone like", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotLike(String value) {
            addCriterion("legal_representative_phone not like", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIn(List<String> values) {
            addCriterion("legal_representative_phone in", values, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotIn(List<String> values) {
            addCriterion("legal_representative_phone not in", values, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneBetween(String value1, String value2) {
            addCriterion("legal_representative_phone between", value1, value2, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotBetween(String value1, String value2) {
            addCriterion("legal_representative_phone not between", value1, value2, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardIsNull() {
            addCriterion("legal_representative_card is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardIsNotNull() {
            addCriterion("legal_representative_card is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardEqualTo(String value) {
            addCriterion("legal_representative_card =", value, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNotEqualTo(String value) {
            addCriterion("legal_representative_card <>", value, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardGreaterThan(String value) {
            addCriterion("legal_representative_card >", value, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_card >=", value, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardLessThan(String value) {
            addCriterion("legal_representative_card <", value, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_card <=", value, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardLike(String value) {
            addCriterion("legal_representative_card like", value, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNotLike(String value) {
            addCriterion("legal_representative_card not like", value, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardIn(List<String> values) {
            addCriterion("legal_representative_card in", values, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNotIn(List<String> values) {
            addCriterion("legal_representative_card not in", values, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardBetween(String value1, String value2) {
            addCriterion("legal_representative_card between", value1, value2, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNotBetween(String value1, String value2) {
            addCriterion("legal_representative_card not between", value1, value2, "legalRepresentativeCard");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameIsNull() {
            addCriterion("jurisdiction_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameIsNotNull() {
            addCriterion("jurisdiction_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameEqualTo(String value) {
            addCriterion("jurisdiction_unit_name =", value, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameNotEqualTo(String value) {
            addCriterion("jurisdiction_unit_name <>", value, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameGreaterThan(String value) {
            addCriterion("jurisdiction_unit_name >", value, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("jurisdiction_unit_name >=", value, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameLessThan(String value) {
            addCriterion("jurisdiction_unit_name <", value, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameLessThanOrEqualTo(String value) {
            addCriterion("jurisdiction_unit_name <=", value, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameLike(String value) {
            addCriterion("jurisdiction_unit_name like", value, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameNotLike(String value) {
            addCriterion("jurisdiction_unit_name not like", value, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameIn(List<String> values) {
            addCriterion("jurisdiction_unit_name in", values, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameNotIn(List<String> values) {
            addCriterion("jurisdiction_unit_name not in", values, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameBetween(String value1, String value2) {
            addCriterion("jurisdiction_unit_name between", value1, value2, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUnitNameNotBetween(String value1, String value2) {
            addCriterion("jurisdiction_unit_name not between", value1, value2, "jurisdictionUnitName");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeIsNull() {
            addCriterion("economic_ownership_code is null");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeIsNotNull() {
            addCriterion("economic_ownership_code is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeEqualTo(Integer value) {
            addCriterion("economic_ownership_code =", value, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeNotEqualTo(Integer value) {
            addCriterion("economic_ownership_code <>", value, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeGreaterThan(Integer value) {
            addCriterion("economic_ownership_code >", value, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("economic_ownership_code >=", value, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeLessThan(Integer value) {
            addCriterion("economic_ownership_code <", value, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeLessThanOrEqualTo(Integer value) {
            addCriterion("economic_ownership_code <=", value, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeIn(List<Integer> values) {
            addCriterion("economic_ownership_code in", values, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeNotIn(List<Integer> values) {
            addCriterion("economic_ownership_code not in", values, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeBetween(Integer value1, Integer value2) {
            addCriterion("economic_ownership_code between", value1, value2, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andEconomicOwnershipCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("economic_ownership_code not between", value1, value2, "economicOwnershipCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeIsNull() {
            addCriterion("supervise_level_code is null");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeIsNotNull() {
            addCriterion("supervise_level_code is not null");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeEqualTo(Integer value) {
            addCriterion("supervise_level_code =", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeNotEqualTo(Integer value) {
            addCriterion("supervise_level_code <>", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeGreaterThan(Integer value) {
            addCriterion("supervise_level_code >", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervise_level_code >=", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeLessThan(Integer value) {
            addCriterion("supervise_level_code <", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeLessThanOrEqualTo(Integer value) {
            addCriterion("supervise_level_code <=", value, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeIn(List<Integer> values) {
            addCriterion("supervise_level_code in", values, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeNotIn(List<Integer> values) {
            addCriterion("supervise_level_code not in", values, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeBetween(Integer value1, Integer value2) {
            addCriterion("supervise_level_code between", value1, value2, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseLevelCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("supervise_level_code not between", value1, value2, "superviseLevelCode");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameIsNull() {
            addCriterion("full_parttime_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameIsNotNull() {
            addCriterion("full_parttime_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameEqualTo(String value) {
            addCriterion("full_parttime_manager_name =", value, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameNotEqualTo(String value) {
            addCriterion("full_parttime_manager_name <>", value, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameGreaterThan(String value) {
            addCriterion("full_parttime_manager_name >", value, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_parttime_manager_name >=", value, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameLessThan(String value) {
            addCriterion("full_parttime_manager_name <", value, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameLessThanOrEqualTo(String value) {
            addCriterion("full_parttime_manager_name <=", value, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameLike(String value) {
            addCriterion("full_parttime_manager_name like", value, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameNotLike(String value) {
            addCriterion("full_parttime_manager_name not like", value, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameIn(List<String> values) {
            addCriterion("full_parttime_manager_name in", values, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameNotIn(List<String> values) {
            addCriterion("full_parttime_manager_name not in", values, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameBetween(String value1, String value2) {
            addCriterion("full_parttime_manager_name between", value1, value2, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerNameNotBetween(String value1, String value2) {
            addCriterion("full_parttime_manager_name not between", value1, value2, "fullParttimeManagerName");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneIsNull() {
            addCriterion("full_parttime_manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneIsNotNull() {
            addCriterion("full_parttime_manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneEqualTo(String value) {
            addCriterion("full_parttime_manager_phone =", value, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneNotEqualTo(String value) {
            addCriterion("full_parttime_manager_phone <>", value, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneGreaterThan(String value) {
            addCriterion("full_parttime_manager_phone >", value, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("full_parttime_manager_phone >=", value, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneLessThan(String value) {
            addCriterion("full_parttime_manager_phone <", value, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("full_parttime_manager_phone <=", value, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneLike(String value) {
            addCriterion("full_parttime_manager_phone like", value, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneNotLike(String value) {
            addCriterion("full_parttime_manager_phone not like", value, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneIn(List<String> values) {
            addCriterion("full_parttime_manager_phone in", values, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneNotIn(List<String> values) {
            addCriterion("full_parttime_manager_phone not in", values, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneBetween(String value1, String value2) {
            addCriterion("full_parttime_manager_phone between", value1, value2, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("full_parttime_manager_phone not between", value1, value2, "fullParttimeManagerPhone");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardIsNull() {
            addCriterion("full_parttime_manager_card is null");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardIsNotNull() {
            addCriterion("full_parttime_manager_card is not null");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardEqualTo(String value) {
            addCriterion("full_parttime_manager_card =", value, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardNotEqualTo(String value) {
            addCriterion("full_parttime_manager_card <>", value, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardGreaterThan(String value) {
            addCriterion("full_parttime_manager_card >", value, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardGreaterThanOrEqualTo(String value) {
            addCriterion("full_parttime_manager_card >=", value, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardLessThan(String value) {
            addCriterion("full_parttime_manager_card <", value, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardLessThanOrEqualTo(String value) {
            addCriterion("full_parttime_manager_card <=", value, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardLike(String value) {
            addCriterion("full_parttime_manager_card like", value, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardNotLike(String value) {
            addCriterion("full_parttime_manager_card not like", value, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardIn(List<String> values) {
            addCriterion("full_parttime_manager_card in", values, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardNotIn(List<String> values) {
            addCriterion("full_parttime_manager_card not in", values, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardBetween(String value1, String value2) {
            addCriterion("full_parttime_manager_card between", value1, value2, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andFullParttimeManagerCardNotBetween(String value1, String value2) {
            addCriterion("full_parttime_manager_card not between", value1, value2, "fullParttimeManagerCard");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameIsNull() {
            addCriterion("super_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameIsNotNull() {
            addCriterion("super_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameEqualTo(String value) {
            addCriterion("super_unit_name =", value, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameNotEqualTo(String value) {
            addCriterion("super_unit_name <>", value, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameGreaterThan(String value) {
            addCriterion("super_unit_name >", value, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("super_unit_name >=", value, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameLessThan(String value) {
            addCriterion("super_unit_name <", value, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameLessThanOrEqualTo(String value) {
            addCriterion("super_unit_name <=", value, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameLike(String value) {
            addCriterion("super_unit_name like", value, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameNotLike(String value) {
            addCriterion("super_unit_name not like", value, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameIn(List<String> values) {
            addCriterion("super_unit_name in", values, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameNotIn(List<String> values) {
            addCriterion("super_unit_name not in", values, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameBetween(String value1, String value2) {
            addCriterion("super_unit_name between", value1, value2, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andSuperUnitNameNotBetween(String value1, String value2) {
            addCriterion("super_unit_name not between", value1, value2, "superUnitName");
            return (Criteria) this;
        }

        public Criteria andStaffCountIsNull() {
            addCriterion("staff_count is null");
            return (Criteria) this;
        }

        public Criteria andStaffCountIsNotNull() {
            addCriterion("staff_count is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCountEqualTo(Long value) {
            addCriterion("staff_count =", value, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountNotEqualTo(Long value) {
            addCriterion("staff_count <>", value, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountGreaterThan(Long value) {
            addCriterion("staff_count >", value, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountGreaterThanOrEqualTo(Long value) {
            addCriterion("staff_count >=", value, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountLessThan(Long value) {
            addCriterion("staff_count <", value, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountLessThanOrEqualTo(Long value) {
            addCriterion("staff_count <=", value, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountIn(List<Long> values) {
            addCriterion("staff_count in", values, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountNotIn(List<Long> values) {
            addCriterion("staff_count not in", values, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountBetween(Long value1, Long value2) {
            addCriterion("staff_count between", value1, value2, "staffCount");
            return (Criteria) this;
        }

        public Criteria andStaffCountNotBetween(Long value1, Long value2) {
            addCriterion("staff_count not between", value1, value2, "staffCount");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIsNull() {
            addCriterion("fixed_assets is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIsNotNull() {
            addCriterion("fixed_assets is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsEqualTo(Long value) {
            addCriterion("fixed_assets =", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotEqualTo(Long value) {
            addCriterion("fixed_assets <>", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsGreaterThan(Long value) {
            addCriterion("fixed_assets >", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsGreaterThanOrEqualTo(Long value) {
            addCriterion("fixed_assets >=", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsLessThan(Long value) {
            addCriterion("fixed_assets <", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsLessThanOrEqualTo(Long value) {
            addCriterion("fixed_assets <=", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIn(List<Long> values) {
            addCriterion("fixed_assets in", values, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotIn(List<Long> values) {
            addCriterion("fixed_assets not in", values, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsBetween(Long value1, Long value2) {
            addCriterion("fixed_assets between", value1, value2, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotBetween(Long value1, Long value2) {
            addCriterion("fixed_assets not between", value1, value2, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyIsNull() {
            addCriterion("maintenance_company is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyIsNotNull() {
            addCriterion("maintenance_company is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyEqualTo(String value) {
            addCriterion("maintenance_company =", value, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyNotEqualTo(String value) {
            addCriterion("maintenance_company <>", value, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyGreaterThan(String value) {
            addCriterion("maintenance_company >", value, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("maintenance_company >=", value, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyLessThan(String value) {
            addCriterion("maintenance_company <", value, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyLessThanOrEqualTo(String value) {
            addCriterion("maintenance_company <=", value, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyLike(String value) {
            addCriterion("maintenance_company like", value, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyNotLike(String value) {
            addCriterion("maintenance_company not like", value, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyIn(List<String> values) {
            addCriterion("maintenance_company in", values, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyNotIn(List<String> values) {
            addCriterion("maintenance_company not in", values, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyBetween(String value1, String value2) {
            addCriterion("maintenance_company between", value1, value2, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceCompanyNotBetween(String value1, String value2) {
            addCriterion("maintenance_company not between", value1, value2, "maintenanceCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyIsNull() {
            addCriterion("construction_company is null");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyIsNotNull() {
            addCriterion("construction_company is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyEqualTo(String value) {
            addCriterion("construction_company =", value, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyNotEqualTo(String value) {
            addCriterion("construction_company <>", value, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyGreaterThan(String value) {
            addCriterion("construction_company >", value, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("construction_company >=", value, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyLessThan(String value) {
            addCriterion("construction_company <", value, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyLessThanOrEqualTo(String value) {
            addCriterion("construction_company <=", value, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyLike(String value) {
            addCriterion("construction_company like", value, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyNotLike(String value) {
            addCriterion("construction_company not like", value, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyIn(List<String> values) {
            addCriterion("construction_company in", values, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyNotIn(List<String> values) {
            addCriterion("construction_company not in", values, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyBetween(String value1, String value2) {
            addCriterion("construction_company between", value1, value2, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionCompanyNotBetween(String value1, String value2) {
            addCriterion("construction_company not between", value1, value2, "constructionCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyIsNull() {
            addCriterion("sale_company is null");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyIsNotNull() {
            addCriterion("sale_company is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyEqualTo(String value) {
            addCriterion("sale_company =", value, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyNotEqualTo(String value) {
            addCriterion("sale_company <>", value, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyGreaterThan(String value) {
            addCriterion("sale_company >", value, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("sale_company >=", value, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyLessThan(String value) {
            addCriterion("sale_company <", value, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyLessThanOrEqualTo(String value) {
            addCriterion("sale_company <=", value, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyLike(String value) {
            addCriterion("sale_company like", value, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyNotLike(String value) {
            addCriterion("sale_company not like", value, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyIn(List<String> values) {
            addCriterion("sale_company in", values, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyNotIn(List<String> values) {
            addCriterion("sale_company not in", values, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyBetween(String value1, String value2) {
            addCriterion("sale_company between", value1, value2, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andSaleCompanyNotBetween(String value1, String value2) {
            addCriterion("sale_company not between", value1, value2, "saleCompany");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNull() {
            addCriterion("industry_code is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNotNull() {
            addCriterion("industry_code is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeEqualTo(Integer value) {
            addCriterion("industry_code =", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotEqualTo(Integer value) {
            addCriterion("industry_code <>", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThan(Integer value) {
            addCriterion("industry_code >", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_code >=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThan(Integer value) {
            addCriterion("industry_code <", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThanOrEqualTo(Integer value) {
            addCriterion("industry_code <=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIn(List<Integer> values) {
            addCriterion("industry_code in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotIn(List<Integer> values) {
            addCriterion("industry_code not in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeBetween(Integer value1, Integer value2) {
            addCriterion("industry_code between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_code not between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeIsNull() {
            addCriterion("supervise_type_code is null");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeIsNotNull() {
            addCriterion("supervise_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeEqualTo(Integer value) {
            addCriterion("supervise_type_code =", value, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeNotEqualTo(Integer value) {
            addCriterion("supervise_type_code <>", value, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeGreaterThan(Integer value) {
            addCriterion("supervise_type_code >", value, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervise_type_code >=", value, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeLessThan(Integer value) {
            addCriterion("supervise_type_code <", value, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("supervise_type_code <=", value, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeIn(List<Integer> values) {
            addCriterion("supervise_type_code in", values, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeNotIn(List<Integer> values) {
            addCriterion("supervise_type_code not in", values, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("supervise_type_code between", value1, value2, "superviseTypeCode");
            return (Criteria) this;
        }

        public Criteria andSuperviseTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("supervise_type_code not between", value1, value2, "superviseTypeCode");
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
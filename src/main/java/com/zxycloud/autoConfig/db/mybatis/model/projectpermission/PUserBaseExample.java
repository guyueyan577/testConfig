package com.zxycloud.autoConfig.db.mybatis.model.projectpermission;

import java.util.ArrayList;
import java.util.List;

public class PUserBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PUserBaseExample() {
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

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andParentAccountIsNull() {
            addCriterion("parent_account is null");
            return (Criteria) this;
        }

        public Criteria andParentAccountIsNotNull() {
            addCriterion("parent_account is not null");
            return (Criteria) this;
        }

        public Criteria andParentAccountEqualTo(String value) {
            addCriterion("parent_account =", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountNotEqualTo(String value) {
            addCriterion("parent_account <>", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountGreaterThan(String value) {
            addCriterion("parent_account >", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountGreaterThanOrEqualTo(String value) {
            addCriterion("parent_account >=", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountLessThan(String value) {
            addCriterion("parent_account <", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountLessThanOrEqualTo(String value) {
            addCriterion("parent_account <=", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountLike(String value) {
            addCriterion("parent_account like", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountNotLike(String value) {
            addCriterion("parent_account not like", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountIn(List<String> values) {
            addCriterion("parent_account in", values, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountNotIn(List<String> values) {
            addCriterion("parent_account not in", values, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountBetween(String value1, String value2) {
            addCriterion("parent_account between", value1, value2, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountNotBetween(String value1, String value2) {
            addCriterion("parent_account not between", value1, value2, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNull() {
            addCriterion("role_code is null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNotNull() {
            addCriterion("role_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeEqualTo(Integer value) {
            addCriterion("role_code =", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotEqualTo(Integer value) {
            addCriterion("role_code <>", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThan(Integer value) {
            addCriterion("role_code >", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_code >=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThan(Integer value) {
            addCriterion("role_code <", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThanOrEqualTo(Integer value) {
            addCriterion("role_code <=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIn(List<Integer> values) {
            addCriterion("role_code in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotIn(List<Integer> values) {
            addCriterion("role_code not in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeBetween(Integer value1, Integer value2) {
            addCriterion("role_code between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("role_code not between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andBindingUserIsNull() {
            addCriterion("binding_user is null");
            return (Criteria) this;
        }

        public Criteria andBindingUserIsNotNull() {
            addCriterion("binding_user is not null");
            return (Criteria) this;
        }

        public Criteria andBindingUserEqualTo(String value) {
            addCriterion("binding_user =", value, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserNotEqualTo(String value) {
            addCriterion("binding_user <>", value, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserGreaterThan(String value) {
            addCriterion("binding_user >", value, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserGreaterThanOrEqualTo(String value) {
            addCriterion("binding_user >=", value, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserLessThan(String value) {
            addCriterion("binding_user <", value, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserLessThanOrEqualTo(String value) {
            addCriterion("binding_user <=", value, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserLike(String value) {
            addCriterion("binding_user like", value, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserNotLike(String value) {
            addCriterion("binding_user not like", value, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserIn(List<String> values) {
            addCriterion("binding_user in", values, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserNotIn(List<String> values) {
            addCriterion("binding_user not in", values, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserBetween(String value1, String value2) {
            addCriterion("binding_user between", value1, value2, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andBindingUserNotBetween(String value1, String value2) {
            addCriterion("binding_user not between", value1, value2, "bindingUser");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andChangepasswordIsNull() {
            addCriterion("changepassword is null");
            return (Criteria) this;
        }

        public Criteria andChangepasswordIsNotNull() {
            addCriterion("changepassword is not null");
            return (Criteria) this;
        }

        public Criteria andChangepasswordEqualTo(Boolean value) {
            addCriterion("changepassword =", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordNotEqualTo(Boolean value) {
            addCriterion("changepassword <>", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordGreaterThan(Boolean value) {
            addCriterion("changepassword >", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordGreaterThanOrEqualTo(Boolean value) {
            addCriterion("changepassword >=", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordLessThan(Boolean value) {
            addCriterion("changepassword <", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordLessThanOrEqualTo(Boolean value) {
            addCriterion("changepassword <=", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordIn(List<Boolean> values) {
            addCriterion("changepassword in", values, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordNotIn(List<Boolean> values) {
            addCriterion("changepassword not in", values, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordBetween(Boolean value1, Boolean value2) {
            addCriterion("changepassword between", value1, value2, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordNotBetween(Boolean value1, Boolean value2) {
            addCriterion("changepassword not between", value1, value2, "changepassword");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusEqualTo(Boolean value) {
            addCriterion("account_status =", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotEqualTo(Boolean value) {
            addCriterion("account_status <>", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThan(Boolean value) {
            addCriterion("account_status >", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("account_status >=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThan(Boolean value) {
            addCriterion("account_status <", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("account_status <=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIn(List<Boolean> values) {
            addCriterion("account_status in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotIn(List<Boolean> values) {
            addCriterion("account_status not in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("account_status between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("account_status not between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andLoginIsNull() {
            addCriterion("login is null");
            return (Criteria) this;
        }

        public Criteria andLoginIsNotNull() {
            addCriterion("login is not null");
            return (Criteria) this;
        }

        public Criteria andLoginEqualTo(Boolean value) {
            addCriterion("login =", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotEqualTo(Boolean value) {
            addCriterion("login <>", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThan(Boolean value) {
            addCriterion("login >", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("login >=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThan(Boolean value) {
            addCriterion("login <", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThanOrEqualTo(Boolean value) {
            addCriterion("login <=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginIn(List<Boolean> values) {
            addCriterion("login in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotIn(List<Boolean> values) {
            addCriterion("login not in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginBetween(Boolean value1, Boolean value2) {
            addCriterion("login between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("login not between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andThemeIdIsNull() {
            addCriterion("theme_id is null");
            return (Criteria) this;
        }

        public Criteria andThemeIdIsNotNull() {
            addCriterion("theme_id is not null");
            return (Criteria) this;
        }

        public Criteria andThemeIdEqualTo(Integer value) {
            addCriterion("theme_id =", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotEqualTo(Integer value) {
            addCriterion("theme_id <>", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdGreaterThan(Integer value) {
            addCriterion("theme_id >", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("theme_id >=", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdLessThan(Integer value) {
            addCriterion("theme_id <", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdLessThanOrEqualTo(Integer value) {
            addCriterion("theme_id <=", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdIn(List<Integer> values) {
            addCriterion("theme_id in", values, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotIn(List<Integer> values) {
            addCriterion("theme_id not in", values, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdBetween(Integer value1, Integer value2) {
            addCriterion("theme_id between", value1, value2, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("theme_id not between", value1, value2, "themeId");
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

        public Criteria andCopyrightInformationIsNull() {
            addCriterion("copyright_information is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationIsNotNull() {
            addCriterion("copyright_information is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationEqualTo(String value) {
            addCriterion("copyright_information =", value, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationNotEqualTo(String value) {
            addCriterion("copyright_information <>", value, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationGreaterThan(String value) {
            addCriterion("copyright_information >", value, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationGreaterThanOrEqualTo(String value) {
            addCriterion("copyright_information >=", value, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationLessThan(String value) {
            addCriterion("copyright_information <", value, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationLessThanOrEqualTo(String value) {
            addCriterion("copyright_information <=", value, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationLike(String value) {
            addCriterion("copyright_information like", value, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationNotLike(String value) {
            addCriterion("copyright_information not like", value, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationIn(List<String> values) {
            addCriterion("copyright_information in", values, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationNotIn(List<String> values) {
            addCriterion("copyright_information not in", values, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationBetween(String value1, String value2) {
            addCriterion("copyright_information between", value1, value2, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andCopyrightInformationNotBetween(String value1, String value2) {
            addCriterion("copyright_information not between", value1, value2, "copyrightInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationIsNull() {
            addCriterion("title_information is null");
            return (Criteria) this;
        }

        public Criteria andTitleInformationIsNotNull() {
            addCriterion("title_information is not null");
            return (Criteria) this;
        }

        public Criteria andTitleInformationEqualTo(String value) {
            addCriterion("title_information =", value, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationNotEqualTo(String value) {
            addCriterion("title_information <>", value, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationGreaterThan(String value) {
            addCriterion("title_information >", value, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationGreaterThanOrEqualTo(String value) {
            addCriterion("title_information >=", value, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationLessThan(String value) {
            addCriterion("title_information <", value, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationLessThanOrEqualTo(String value) {
            addCriterion("title_information <=", value, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationLike(String value) {
            addCriterion("title_information like", value, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationNotLike(String value) {
            addCriterion("title_information not like", value, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationIn(List<String> values) {
            addCriterion("title_information in", values, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationNotIn(List<String> values) {
            addCriterion("title_information not in", values, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationBetween(String value1, String value2) {
            addCriterion("title_information between", value1, value2, "titleInformation");
            return (Criteria) this;
        }

        public Criteria andTitleInformationNotBetween(String value1, String value2) {
            addCriterion("title_information not between", value1, value2, "titleInformation");
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

        public Criteria andPrivacyAgreementIsNull() {
            addCriterion("privacy_agreement is null");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementIsNotNull() {
            addCriterion("privacy_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementEqualTo(Boolean value) {
            addCriterion("privacy_agreement =", value, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementNotEqualTo(Boolean value) {
            addCriterion("privacy_agreement <>", value, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementGreaterThan(Boolean value) {
            addCriterion("privacy_agreement >", value, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementGreaterThanOrEqualTo(Boolean value) {
            addCriterion("privacy_agreement >=", value, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementLessThan(Boolean value) {
            addCriterion("privacy_agreement <", value, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementLessThanOrEqualTo(Boolean value) {
            addCriterion("privacy_agreement <=", value, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementIn(List<Boolean> values) {
            addCriterion("privacy_agreement in", values, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementNotIn(List<Boolean> values) {
            addCriterion("privacy_agreement not in", values, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementBetween(Boolean value1, Boolean value2) {
            addCriterion("privacy_agreement between", value1, value2, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPrivacyAgreementNotBetween(Boolean value1, Boolean value2) {
            addCriterion("privacy_agreement not between", value1, value2, "privacyAgreement");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountIsNull() {
            addCriterion("personal_account is null");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountIsNotNull() {
            addCriterion("personal_account is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountEqualTo(Boolean value) {
            addCriterion("personal_account =", value, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountNotEqualTo(Boolean value) {
            addCriterion("personal_account <>", value, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountGreaterThan(Boolean value) {
            addCriterion("personal_account >", value, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("personal_account >=", value, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountLessThan(Boolean value) {
            addCriterion("personal_account <", value, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountLessThanOrEqualTo(Boolean value) {
            addCriterion("personal_account <=", value, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountIn(List<Boolean> values) {
            addCriterion("personal_account in", values, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountNotIn(List<Boolean> values) {
            addCriterion("personal_account not in", values, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountBetween(Boolean value1, Boolean value2) {
            addCriterion("personal_account between", value1, value2, "personalAccount");
            return (Criteria) this;
        }

        public Criteria andPersonalAccountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("personal_account not between", value1, value2, "personalAccount");
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
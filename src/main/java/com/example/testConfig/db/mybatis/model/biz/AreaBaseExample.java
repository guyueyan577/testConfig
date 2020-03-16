package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class AreaBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaBaseExample() {
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

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
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

        public Criteria andFirstLevelAreaIdIsNull() {
            addCriterion("first_level_area_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdIsNotNull() {
            addCriterion("first_level_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdEqualTo(String value) {
            addCriterion("first_level_area_id =", value, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdNotEqualTo(String value) {
            addCriterion("first_level_area_id <>", value, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdGreaterThan(String value) {
            addCriterion("first_level_area_id >", value, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_level_area_id >=", value, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdLessThan(String value) {
            addCriterion("first_level_area_id <", value, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdLessThanOrEqualTo(String value) {
            addCriterion("first_level_area_id <=", value, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdLike(String value) {
            addCriterion("first_level_area_id like", value, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdNotLike(String value) {
            addCriterion("first_level_area_id not like", value, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdIn(List<String> values) {
            addCriterion("first_level_area_id in", values, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdNotIn(List<String> values) {
            addCriterion("first_level_area_id not in", values, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdBetween(String value1, String value2) {
            addCriterion("first_level_area_id between", value1, value2, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelAreaIdNotBetween(String value1, String value2) {
            addCriterion("first_level_area_id not between", value1, value2, "firstLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdIsNull() {
            addCriterion("second_level_area_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdIsNotNull() {
            addCriterion("second_level_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdEqualTo(String value) {
            addCriterion("second_level_area_id =", value, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdNotEqualTo(String value) {
            addCriterion("second_level_area_id <>", value, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdGreaterThan(String value) {
            addCriterion("second_level_area_id >", value, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_level_area_id >=", value, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdLessThan(String value) {
            addCriterion("second_level_area_id <", value, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdLessThanOrEqualTo(String value) {
            addCriterion("second_level_area_id <=", value, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdLike(String value) {
            addCriterion("second_level_area_id like", value, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdNotLike(String value) {
            addCriterion("second_level_area_id not like", value, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdIn(List<String> values) {
            addCriterion("second_level_area_id in", values, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdNotIn(List<String> values) {
            addCriterion("second_level_area_id not in", values, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdBetween(String value1, String value2) {
            addCriterion("second_level_area_id between", value1, value2, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelAreaIdNotBetween(String value1, String value2) {
            addCriterion("second_level_area_id not between", value1, value2, "secondLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdIsNull() {
            addCriterion("parent_area_id is null");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdIsNotNull() {
            addCriterion("parent_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdEqualTo(String value) {
            addCriterion("parent_area_id =", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdNotEqualTo(String value) {
            addCriterion("parent_area_id <>", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdGreaterThan(String value) {
            addCriterion("parent_area_id >", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_area_id >=", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdLessThan(String value) {
            addCriterion("parent_area_id <", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdLessThanOrEqualTo(String value) {
            addCriterion("parent_area_id <=", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdLike(String value) {
            addCriterion("parent_area_id like", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdNotLike(String value) {
            addCriterion("parent_area_id not like", value, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdIn(List<String> values) {
            addCriterion("parent_area_id in", values, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdNotIn(List<String> values) {
            addCriterion("parent_area_id not in", values, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdBetween(String value1, String value2) {
            addCriterion("parent_area_id between", value1, value2, "parentAreaId");
            return (Criteria) this;
        }

        public Criteria andParentAreaIdNotBetween(String value1, String value2) {
            addCriterion("parent_area_id not between", value1, value2, "parentAreaId");
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

        public Criteria andSubAreaTypeIsNull() {
            addCriterion("sub_area_type is null");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeIsNotNull() {
            addCriterion("sub_area_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeEqualTo(Integer value) {
            addCriterion("sub_area_type =", value, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeNotEqualTo(Integer value) {
            addCriterion("sub_area_type <>", value, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeGreaterThan(Integer value) {
            addCriterion("sub_area_type >", value, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_area_type >=", value, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeLessThan(Integer value) {
            addCriterion("sub_area_type <", value, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sub_area_type <=", value, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeIn(List<Integer> values) {
            addCriterion("sub_area_type in", values, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeNotIn(List<Integer> values) {
            addCriterion("sub_area_type not in", values, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeBetween(Integer value1, Integer value2) {
            addCriterion("sub_area_type between", value1, value2, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andSubAreaTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_area_type not between", value1, value2, "subAreaType");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIsNull() {
            addCriterion("area_address is null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIsNotNull() {
            addCriterion("area_address is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAddressEqualTo(String value) {
            addCriterion("area_address =", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNotEqualTo(String value) {
            addCriterion("area_address <>", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressGreaterThan(String value) {
            addCriterion("area_address >", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("area_address >=", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressLessThan(String value) {
            addCriterion("area_address <", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressLessThanOrEqualTo(String value) {
            addCriterion("area_address <=", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressLike(String value) {
            addCriterion("area_address like", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNotLike(String value) {
            addCriterion("area_address not like", value, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressIn(List<String> values) {
            addCriterion("area_address in", values, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNotIn(List<String> values) {
            addCriterion("area_address not in", values, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressBetween(String value1, String value2) {
            addCriterion("area_address between", value1, value2, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaAddressNotBetween(String value1, String value2) {
            addCriterion("area_address not between", value1, value2, "areaAddress");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionIsNull() {
            addCriterion("area_manage_region is null");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionIsNotNull() {
            addCriterion("area_manage_region is not null");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionEqualTo(String value) {
            addCriterion("area_manage_region =", value, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionNotEqualTo(String value) {
            addCriterion("area_manage_region <>", value, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionGreaterThan(String value) {
            addCriterion("area_manage_region >", value, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionGreaterThanOrEqualTo(String value) {
            addCriterion("area_manage_region >=", value, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionLessThan(String value) {
            addCriterion("area_manage_region <", value, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionLessThanOrEqualTo(String value) {
            addCriterion("area_manage_region <=", value, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionLike(String value) {
            addCriterion("area_manage_region like", value, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionNotLike(String value) {
            addCriterion("area_manage_region not like", value, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionIn(List<String> values) {
            addCriterion("area_manage_region in", values, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionNotIn(List<String> values) {
            addCriterion("area_manage_region not in", values, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionBetween(String value1, String value2) {
            addCriterion("area_manage_region between", value1, value2, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaManageRegionNotBetween(String value1, String value2) {
            addCriterion("area_manage_region not between", value1, value2, "areaManageRegion");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameIsNull() {
            addCriterion("area_principal_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameIsNotNull() {
            addCriterion("area_principal_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameEqualTo(String value) {
            addCriterion("area_principal_name =", value, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameNotEqualTo(String value) {
            addCriterion("area_principal_name <>", value, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameGreaterThan(String value) {
            addCriterion("area_principal_name >", value, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_principal_name >=", value, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameLessThan(String value) {
            addCriterion("area_principal_name <", value, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameLessThanOrEqualTo(String value) {
            addCriterion("area_principal_name <=", value, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameLike(String value) {
            addCriterion("area_principal_name like", value, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameNotLike(String value) {
            addCriterion("area_principal_name not like", value, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameIn(List<String> values) {
            addCriterion("area_principal_name in", values, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameNotIn(List<String> values) {
            addCriterion("area_principal_name not in", values, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameBetween(String value1, String value2) {
            addCriterion("area_principal_name between", value1, value2, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalNameNotBetween(String value1, String value2) {
            addCriterion("area_principal_name not between", value1, value2, "areaPrincipalName");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberIsNull() {
            addCriterion("area_principal_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberIsNotNull() {
            addCriterion("area_principal_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberEqualTo(String value) {
            addCriterion("area_principal_phone_number =", value, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberNotEqualTo(String value) {
            addCriterion("area_principal_phone_number <>", value, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberGreaterThan(String value) {
            addCriterion("area_principal_phone_number >", value, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("area_principal_phone_number >=", value, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberLessThan(String value) {
            addCriterion("area_principal_phone_number <", value, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("area_principal_phone_number <=", value, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberLike(String value) {
            addCriterion("area_principal_phone_number like", value, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberNotLike(String value) {
            addCriterion("area_principal_phone_number not like", value, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberIn(List<String> values) {
            addCriterion("area_principal_phone_number in", values, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberNotIn(List<String> values) {
            addCriterion("area_principal_phone_number not in", values, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberBetween(String value1, String value2) {
            addCriterion("area_principal_phone_number between", value1, value2, "areaPrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAreaPrincipalPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("area_principal_phone_number not between", value1, value2, "areaPrincipalPhoneNumber");
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
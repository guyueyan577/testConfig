package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class PlaceBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaceBaseExample() {
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

        public Criteria andPlaceNameIsNull() {
            addCriterion("place_name is null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNotNull() {
            addCriterion("place_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameEqualTo(String value) {
            addCriterion("place_name =", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotEqualTo(String value) {
            addCriterion("place_name <>", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThan(String value) {
            addCriterion("place_name >", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("place_name >=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThan(String value) {
            addCriterion("place_name <", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThanOrEqualTo(String value) {
            addCriterion("place_name <=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLike(String value) {
            addCriterion("place_name like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotLike(String value) {
            addCriterion("place_name not like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIn(List<String> values) {
            addCriterion("place_name in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotIn(List<String> values) {
            addCriterion("place_name not in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameBetween(String value1, String value2) {
            addCriterion("place_name between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotBetween(String value1, String value2) {
            addCriterion("place_name not between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressIsNull() {
            addCriterion("place_address is null");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressIsNotNull() {
            addCriterion("place_address is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressEqualTo(String value) {
            addCriterion("place_address =", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotEqualTo(String value) {
            addCriterion("place_address <>", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressGreaterThan(String value) {
            addCriterion("place_address >", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("place_address >=", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLessThan(String value) {
            addCriterion("place_address <", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLessThanOrEqualTo(String value) {
            addCriterion("place_address <=", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLike(String value) {
            addCriterion("place_address like", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotLike(String value) {
            addCriterion("place_address not like", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressIn(List<String> values) {
            addCriterion("place_address in", values, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotIn(List<String> values) {
            addCriterion("place_address not in", values, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressBetween(String value1, String value2) {
            addCriterion("place_address between", value1, value2, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotBetween(String value1, String value2) {
            addCriterion("place_address not between", value1, value2, "placeAddress");
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

        public Criteria andThirdLevelAreaIdIsNull() {
            addCriterion("third_level_area_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdIsNotNull() {
            addCriterion("third_level_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdEqualTo(String value) {
            addCriterion("third_level_area_id =", value, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdNotEqualTo(String value) {
            addCriterion("third_level_area_id <>", value, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdGreaterThan(String value) {
            addCriterion("third_level_area_id >", value, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_level_area_id >=", value, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdLessThan(String value) {
            addCriterion("third_level_area_id <", value, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdLessThanOrEqualTo(String value) {
            addCriterion("third_level_area_id <=", value, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdLike(String value) {
            addCriterion("third_level_area_id like", value, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdNotLike(String value) {
            addCriterion("third_level_area_id not like", value, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdIn(List<String> values) {
            addCriterion("third_level_area_id in", values, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdNotIn(List<String> values) {
            addCriterion("third_level_area_id not in", values, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdBetween(String value1, String value2) {
            addCriterion("third_level_area_id between", value1, value2, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelAreaIdNotBetween(String value1, String value2) {
            addCriterion("third_level_area_id not between", value1, value2, "thirdLevelAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdIsNull() {
            addCriterion("belong_area_id is null");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdIsNotNull() {
            addCriterion("belong_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdEqualTo(String value) {
            addCriterion("belong_area_id =", value, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdNotEqualTo(String value) {
            addCriterion("belong_area_id <>", value, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdGreaterThan(String value) {
            addCriterion("belong_area_id >", value, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("belong_area_id >=", value, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdLessThan(String value) {
            addCriterion("belong_area_id <", value, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdLessThanOrEqualTo(String value) {
            addCriterion("belong_area_id <=", value, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdLike(String value) {
            addCriterion("belong_area_id like", value, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdNotLike(String value) {
            addCriterion("belong_area_id not like", value, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdIn(List<String> values) {
            addCriterion("belong_area_id in", values, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdNotIn(List<String> values) {
            addCriterion("belong_area_id not in", values, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdBetween(String value1, String value2) {
            addCriterion("belong_area_id between", value1, value2, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andBelongAreaIdNotBetween(String value1, String value2) {
            addCriterion("belong_area_id not between", value1, value2, "belongAreaId");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberIsNull() {
            addCriterion("place_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberIsNotNull() {
            addCriterion("place_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberEqualTo(String value) {
            addCriterion("place_phone_number =", value, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberNotEqualTo(String value) {
            addCriterion("place_phone_number <>", value, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberGreaterThan(String value) {
            addCriterion("place_phone_number >", value, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("place_phone_number >=", value, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberLessThan(String value) {
            addCriterion("place_phone_number <", value, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("place_phone_number <=", value, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberLike(String value) {
            addCriterion("place_phone_number like", value, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberNotLike(String value) {
            addCriterion("place_phone_number not like", value, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberIn(List<String> values) {
            addCriterion("place_phone_number in", values, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberNotIn(List<String> values) {
            addCriterion("place_phone_number not in", values, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberBetween(String value1, String value2) {
            addCriterion("place_phone_number between", value1, value2, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePhoneNumberNotBetween(String value1, String value2) {
            addCriterion("place_phone_number not between", value1, value2, "placePhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameIsNull() {
            addCriterion("place_principal_name is null");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameIsNotNull() {
            addCriterion("place_principal_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameEqualTo(String value) {
            addCriterion("place_principal_name =", value, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameNotEqualTo(String value) {
            addCriterion("place_principal_name <>", value, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameGreaterThan(String value) {
            addCriterion("place_principal_name >", value, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameGreaterThanOrEqualTo(String value) {
            addCriterion("place_principal_name >=", value, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameLessThan(String value) {
            addCriterion("place_principal_name <", value, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameLessThanOrEqualTo(String value) {
            addCriterion("place_principal_name <=", value, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameLike(String value) {
            addCriterion("place_principal_name like", value, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameNotLike(String value) {
            addCriterion("place_principal_name not like", value, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameIn(List<String> values) {
            addCriterion("place_principal_name in", values, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameNotIn(List<String> values) {
            addCriterion("place_principal_name not in", values, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameBetween(String value1, String value2) {
            addCriterion("place_principal_name between", value1, value2, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalNameNotBetween(String value1, String value2) {
            addCriterion("place_principal_name not between", value1, value2, "placeAdminName");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberIsNull() {
            addCriterion("place_principal_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberIsNotNull() {
            addCriterion("place_principal_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberEqualTo(String value) {
            addCriterion("place_principal_phone_number =", value, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberNotEqualTo(String value) {
            addCriterion("place_principal_phone_number <>", value, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberGreaterThan(String value) {
            addCriterion("place_principal_phone_number >", value, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("place_principal_phone_number >=", value, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberLessThan(String value) {
            addCriterion("place_principal_phone_number <", value, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("place_principal_phone_number <=", value, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberLike(String value) {
            addCriterion("place_principal_phone_number like", value, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberNotLike(String value) {
            addCriterion("place_principal_phone_number not like", value, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberIn(List<String> values) {
            addCriterion("place_principal_phone_number in", values, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberNotIn(List<String> values) {
            addCriterion("place_principal_phone_number not in", values, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberBetween(String value1, String value2) {
            addCriterion("place_principal_phone_number between", value1, value2, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlacePrincipalPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("place_principal_phone_number not between", value1, value2, "placePrincipalPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdIsNull() {
            addCriterion("place_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdIsNotNull() {
            addCriterion("place_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdEqualTo(String value) {
            addCriterion("place_admin_id =", value, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdNotEqualTo(String value) {
            addCriterion("place_admin_id <>", value, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdGreaterThan(String value) {
            addCriterion("place_admin_id >", value, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("place_admin_id >=", value, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdLessThan(String value) {
            addCriterion("place_admin_id <", value, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdLessThanOrEqualTo(String value) {
            addCriterion("place_admin_id <=", value, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdLike(String value) {
            addCriterion("place_admin_id like", value, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdNotLike(String value) {
            addCriterion("place_admin_id not like", value, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdIn(List<String> values) {
            addCriterion("place_admin_id in", values, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdNotIn(List<String> values) {
            addCriterion("place_admin_id not in", values, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdBetween(String value1, String value2) {
            addCriterion("place_admin_id between", value1, value2, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceAdminIdNotBetween(String value1, String value2) {
            addCriterion("place_admin_id not between", value1, value2, "placeAdminId");
            return (Criteria) this;
        }

        public Criteria andPlaceStateIsNull() {
            addCriterion("place_state is null");
            return (Criteria) this;
        }

        public Criteria andPlaceStateIsNotNull() {
            addCriterion("place_state is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceStateEqualTo(Integer value) {
            addCriterion("place_state =", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateNotEqualTo(Integer value) {
            addCriterion("place_state <>", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateGreaterThan(Integer value) {
            addCriterion("place_state >", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("place_state >=", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateLessThan(Integer value) {
            addCriterion("place_state <", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateLessThanOrEqualTo(Integer value) {
            addCriterion("place_state <=", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateIn(List<Integer> values) {
            addCriterion("place_state in", values, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateNotIn(List<Integer> values) {
            addCriterion("place_state not in", values, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateBetween(Integer value1, Integer value2) {
            addCriterion("place_state between", value1, value2, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateNotBetween(Integer value1, Integer value2) {
            addCriterion("place_state not between", value1, value2, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeIsNull() {
            addCriterion("place_business_scope is null");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeIsNotNull() {
            addCriterion("place_business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeEqualTo(String value) {
            addCriterion("place_business_scope =", value, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeNotEqualTo(String value) {
            addCriterion("place_business_scope <>", value, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeGreaterThan(String value) {
            addCriterion("place_business_scope >", value, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("place_business_scope >=", value, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeLessThan(String value) {
            addCriterion("place_business_scope <", value, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("place_business_scope <=", value, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeLike(String value) {
            addCriterion("place_business_scope like", value, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeNotLike(String value) {
            addCriterion("place_business_scope not like", value, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeIn(List<String> values) {
            addCriterion("place_business_scope in", values, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeNotIn(List<String> values) {
            addCriterion("place_business_scope not in", values, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeBetween(String value1, String value2) {
            addCriterion("place_business_scope between", value1, value2, "placeBusinessScope");
            return (Criteria) this;
        }

        public Criteria andPlaceBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("place_business_scope not between", value1, value2, "placeBusinessScope");
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
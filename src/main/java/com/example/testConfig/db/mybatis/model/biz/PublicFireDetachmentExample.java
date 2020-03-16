package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class PublicFireDetachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicFireDetachmentExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Double value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Double value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Double value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Double value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Double value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Double> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Double> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Double value1, Double value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Double value1, Double value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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
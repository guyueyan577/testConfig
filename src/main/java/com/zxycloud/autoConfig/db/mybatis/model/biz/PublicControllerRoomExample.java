package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class PublicControllerRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicControllerRoomExample() {
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

        public Criteria andControllerRoomAddressIsNull() {
            addCriterion("controller_room_address is null");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressIsNotNull() {
            addCriterion("controller_room_address is not null");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressEqualTo(String value) {
            addCriterion("controller_room_address =", value, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressNotEqualTo(String value) {
            addCriterion("controller_room_address <>", value, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressGreaterThan(String value) {
            addCriterion("controller_room_address >", value, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressGreaterThanOrEqualTo(String value) {
            addCriterion("controller_room_address >=", value, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressLessThan(String value) {
            addCriterion("controller_room_address <", value, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressLessThanOrEqualTo(String value) {
            addCriterion("controller_room_address <=", value, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressLike(String value) {
            addCriterion("controller_room_address like", value, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressNotLike(String value) {
            addCriterion("controller_room_address not like", value, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressIn(List<String> values) {
            addCriterion("controller_room_address in", values, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressNotIn(List<String> values) {
            addCriterion("controller_room_address not in", values, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressBetween(String value1, String value2) {
            addCriterion("controller_room_address between", value1, value2, "controllerRoomAddress");
            return (Criteria) this;
        }

        public Criteria andControllerRoomAddressNotBetween(String value1, String value2) {
            addCriterion("controller_room_address not between", value1, value2, "controllerRoomAddress");
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
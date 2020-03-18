package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class DeviceRunningStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceRunningStateExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("message_id like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("message_id not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
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

        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(String value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(String value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(String value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(String value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLike(String value) {
            addCriterion("place_id like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotLike(String value) {
            addCriterion("place_id not like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<String> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<String> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(String value1, String value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(String value1, String value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
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

        public Criteria andAdapterIdIsNull() {
            addCriterion("adapter_id is null");
            return (Criteria) this;
        }

        public Criteria andAdapterIdIsNotNull() {
            addCriterion("adapter_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdapterIdEqualTo(String value) {
            addCriterion("adapter_id =", value, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdNotEqualTo(String value) {
            addCriterion("adapter_id <>", value, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdGreaterThan(String value) {
            addCriterion("adapter_id >", value, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdGreaterThanOrEqualTo(String value) {
            addCriterion("adapter_id >=", value, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdLessThan(String value) {
            addCriterion("adapter_id <", value, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdLessThanOrEqualTo(String value) {
            addCriterion("adapter_id <=", value, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdLike(String value) {
            addCriterion("adapter_id like", value, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdNotLike(String value) {
            addCriterion("adapter_id not like", value, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdIn(List<String> values) {
            addCriterion("adapter_id in", values, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdNotIn(List<String> values) {
            addCriterion("adapter_id not in", values, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdBetween(String value1, String value2) {
            addCriterion("adapter_id between", value1, value2, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterIdNotBetween(String value1, String value2) {
            addCriterion("adapter_id not between", value1, value2, "adapterId");
            return (Criteria) this;
        }

        public Criteria andAdapterNameIsNull() {
            addCriterion("adapter_name is null");
            return (Criteria) this;
        }

        public Criteria andAdapterNameIsNotNull() {
            addCriterion("adapter_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdapterNameEqualTo(String value) {
            addCriterion("adapter_name =", value, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameNotEqualTo(String value) {
            addCriterion("adapter_name <>", value, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameGreaterThan(String value) {
            addCriterion("adapter_name >", value, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameGreaterThanOrEqualTo(String value) {
            addCriterion("adapter_name >=", value, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameLessThan(String value) {
            addCriterion("adapter_name <", value, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameLessThanOrEqualTo(String value) {
            addCriterion("adapter_name <=", value, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameLike(String value) {
            addCriterion("adapter_name like", value, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameNotLike(String value) {
            addCriterion("adapter_name not like", value, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameIn(List<String> values) {
            addCriterion("adapter_name in", values, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameNotIn(List<String> values) {
            addCriterion("adapter_name not in", values, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameBetween(String value1, String value2) {
            addCriterion("adapter_name between", value1, value2, "adapterName");
            return (Criteria) this;
        }

        public Criteria andAdapterNameNotBetween(String value1, String value2) {
            addCriterion("adapter_name not between", value1, value2, "adapterName");
            return (Criteria) this;
        }

        public Criteria andControllerAddrIsNull() {
            addCriterion("controller_addr is null");
            return (Criteria) this;
        }

        public Criteria andControllerAddrIsNotNull() {
            addCriterion("controller_addr is not null");
            return (Criteria) this;
        }

        public Criteria andControllerAddrEqualTo(Integer value) {
            addCriterion("controller_addr =", value, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrNotEqualTo(Integer value) {
            addCriterion("controller_addr <>", value, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrGreaterThan(Integer value) {
            addCriterion("controller_addr >", value, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrGreaterThanOrEqualTo(Integer value) {
            addCriterion("controller_addr >=", value, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrLessThan(Integer value) {
            addCriterion("controller_addr <", value, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrLessThanOrEqualTo(Integer value) {
            addCriterion("controller_addr <=", value, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrIn(List<Integer> values) {
            addCriterion("controller_addr in", values, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrNotIn(List<Integer> values) {
            addCriterion("controller_addr not in", values, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrBetween(Integer value1, Integer value2) {
            addCriterion("controller_addr between", value1, value2, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andControllerAddrNotBetween(Integer value1, Integer value2) {
            addCriterion("controller_addr not between", value1, value2, "controllerAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeIsNull() {
            addCriterion("device_system_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeIsNotNull() {
            addCriterion("device_system_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeEqualTo(Integer value) {
            addCriterion("device_system_code =", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeNotEqualTo(Integer value) {
            addCriterion("device_system_code <>", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeGreaterThan(Integer value) {
            addCriterion("device_system_code >", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_system_code >=", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeLessThan(Integer value) {
            addCriterion("device_system_code <", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_system_code <=", value, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeIn(List<Integer> values) {
            addCriterion("device_system_code in", values, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeNotIn(List<Integer> values) {
            addCriterion("device_system_code not in", values, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_system_code between", value1, value2, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_system_code not between", value1, value2, "deviceSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeIsNull() {
            addCriterion("device_state_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeIsNotNull() {
            addCriterion("device_state_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeEqualTo(Integer value) {
            addCriterion("device_state_code =", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeNotEqualTo(Integer value) {
            addCriterion("device_state_code <>", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeGreaterThan(Integer value) {
            addCriterion("device_state_code >", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_state_code >=", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeLessThan(Integer value) {
            addCriterion("device_state_code <", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_state_code <=", value, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeIn(List<Integer> values) {
            addCriterion("device_state_code in", values, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeNotIn(List<Integer> values) {
            addCriterion("device_state_code not in", values, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_state_code between", value1, value2, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_state_code not between", value1, value2, "deviceStateCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameIsNull() {
            addCriterion("device_state_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameIsNotNull() {
            addCriterion("device_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameEqualTo(String value) {
            addCriterion("device_state_name =", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameNotEqualTo(String value) {
            addCriterion("device_state_name <>", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameGreaterThan(String value) {
            addCriterion("device_state_name >", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_state_name >=", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameLessThan(String value) {
            addCriterion("device_state_name <", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameLessThanOrEqualTo(String value) {
            addCriterion("device_state_name <=", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameLike(String value) {
            addCriterion("device_state_name like", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameNotLike(String value) {
            addCriterion("device_state_name not like", value, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameIn(List<String> values) {
            addCriterion("device_state_name in", values, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameNotIn(List<String> values) {
            addCriterion("device_state_name not in", values, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameBetween(String value1, String value2) {
            addCriterion("device_state_name between", value1, value2, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNameNotBetween(String value1, String value2) {
            addCriterion("device_state_name not between", value1, value2, "deviceStateName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeIsNull() {
            addCriterion("device_state_group_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeIsNotNull() {
            addCriterion("device_state_group_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeEqualTo(Integer value) {
            addCriterion("device_state_group_code =", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeNotEqualTo(Integer value) {
            addCriterion("device_state_group_code <>", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeGreaterThan(Integer value) {
            addCriterion("device_state_group_code >", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_state_group_code >=", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeLessThan(Integer value) {
            addCriterion("device_state_group_code <", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_state_group_code <=", value, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeIn(List<Integer> values) {
            addCriterion("device_state_group_code in", values, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeNotIn(List<Integer> values) {
            addCriterion("device_state_group_code not in", values, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_state_group_code between", value1, value2, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_state_group_code not between", value1, value2, "deviceStateGroupCode");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameIsNull() {
            addCriterion("device_state_group_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameIsNotNull() {
            addCriterion("device_state_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameEqualTo(String value) {
            addCriterion("device_state_group_name =", value, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameNotEqualTo(String value) {
            addCriterion("device_state_group_name <>", value, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameGreaterThan(String value) {
            addCriterion("device_state_group_name >", value, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_state_group_name >=", value, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameLessThan(String value) {
            addCriterion("device_state_group_name <", value, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameLessThanOrEqualTo(String value) {
            addCriterion("device_state_group_name <=", value, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameLike(String value) {
            addCriterion("device_state_group_name like", value, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameNotLike(String value) {
            addCriterion("device_state_group_name not like", value, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameIn(List<String> values) {
            addCriterion("device_state_group_name in", values, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameNotIn(List<String> values) {
            addCriterion("device_state_group_name not in", values, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameBetween(String value1, String value2) {
            addCriterion("device_state_group_name between", value1, value2, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGroupNameNotBetween(String value1, String value2) {
            addCriterion("device_state_group_name not between", value1, value2, "deviceStateGroupName");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIsNull() {
            addCriterion("happen_time is null");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIsNotNull() {
            addCriterion("happen_time is not null");
            return (Criteria) this;
        }

        public Criteria andHappenTimeEqualTo(Long value) {
            addCriterion("happen_time =", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotEqualTo(Long value) {
            addCriterion("happen_time <>", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeGreaterThan(Long value) {
            addCriterion("happen_time >", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("happen_time >=", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeLessThan(Long value) {
            addCriterion("happen_time <", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeLessThanOrEqualTo(Long value) {
            addCriterion("happen_time <=", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIn(List<Long> values) {
            addCriterion("happen_time in", values, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotIn(List<Long> values) {
            addCriterion("happen_time not in", values, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeBetween(Long value1, Long value2) {
            addCriterion("happen_time between", value1, value2, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotBetween(Long value1, Long value2) {
            addCriterion("happen_time not between", value1, value2, "happenTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Long value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Long value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Long value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Long value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Long value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Long> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Long> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Long value1, Long value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Long value1, Long value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
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
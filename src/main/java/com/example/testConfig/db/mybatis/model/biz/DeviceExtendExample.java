package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class DeviceExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExtendExample() {
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

        public Criteria andDeviceModelIsNull() {
            addCriterion("device_model is null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNotNull() {
            addCriterion("device_model is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelEqualTo(String value) {
            addCriterion("device_model =", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotEqualTo(String value) {
            addCriterion("device_model <>", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThan(String value) {
            addCriterion("device_model >", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThanOrEqualTo(String value) {
            addCriterion("device_model >=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThan(String value) {
            addCriterion("device_model <", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThanOrEqualTo(String value) {
            addCriterion("device_model <=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLike(String value) {
            addCriterion("device_model like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotLike(String value) {
            addCriterion("device_model not like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIn(List<String> values) {
            addCriterion("device_model in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotIn(List<String> values) {
            addCriterion("device_model not in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelBetween(String value1, String value2) {
            addCriterion("device_model between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotBetween(String value1, String value2) {
            addCriterion("device_model not between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeIsNull() {
            addCriterion("device_area_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeIsNotNull() {
            addCriterion("device_area_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeEqualTo(String value) {
            addCriterion("device_area_code =", value, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeNotEqualTo(String value) {
            addCriterion("device_area_code <>", value, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeGreaterThan(String value) {
            addCriterion("device_area_code >", value, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_area_code >=", value, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeLessThan(String value) {
            addCriterion("device_area_code <", value, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("device_area_code <=", value, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeLike(String value) {
            addCriterion("device_area_code like", value, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeNotLike(String value) {
            addCriterion("device_area_code not like", value, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeIn(List<String> values) {
            addCriterion("device_area_code in", values, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeNotIn(List<String> values) {
            addCriterion("device_area_code not in", values, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeBetween(String value1, String value2) {
            addCriterion("device_area_code between", value1, value2, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaCodeNotBetween(String value1, String value2) {
            addCriterion("device_area_code not between", value1, value2, "deviceAreaCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeIsNull() {
            addCriterion("device_item_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeIsNotNull() {
            addCriterion("device_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeEqualTo(String value) {
            addCriterion("device_item_code =", value, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeNotEqualTo(String value) {
            addCriterion("device_item_code <>", value, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeGreaterThan(String value) {
            addCriterion("device_item_code >", value, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_item_code >=", value, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeLessThan(String value) {
            addCriterion("device_item_code <", value, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeLessThanOrEqualTo(String value) {
            addCriterion("device_item_code <=", value, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeLike(String value) {
            addCriterion("device_item_code like", value, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeNotLike(String value) {
            addCriterion("device_item_code not like", value, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeIn(List<String> values) {
            addCriterion("device_item_code in", values, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeNotIn(List<String> values) {
            addCriterion("device_item_code not in", values, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeBetween(String value1, String value2) {
            addCriterion("device_item_code between", value1, value2, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceItemCodeNotBetween(String value1, String value2) {
            addCriterion("device_item_code not between", value1, value2, "deviceItemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdIsNull() {
            addCriterion("device_install_person_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdIsNotNull() {
            addCriterion("device_install_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdEqualTo(String value) {
            addCriterion("device_install_person_id =", value, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdNotEqualTo(String value) {
            addCriterion("device_install_person_id <>", value, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdGreaterThan(String value) {
            addCriterion("device_install_person_id >", value, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_install_person_id >=", value, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdLessThan(String value) {
            addCriterion("device_install_person_id <", value, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdLessThanOrEqualTo(String value) {
            addCriterion("device_install_person_id <=", value, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdLike(String value) {
            addCriterion("device_install_person_id like", value, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdNotLike(String value) {
            addCriterion("device_install_person_id not like", value, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdIn(List<String> values) {
            addCriterion("device_install_person_id in", values, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdNotIn(List<String> values) {
            addCriterion("device_install_person_id not in", values, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdBetween(String value1, String value2) {
            addCriterion("device_install_person_id between", value1, value2, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallPersonIdNotBetween(String value1, String value2) {
            addCriterion("device_install_person_id not between", value1, value2, "deviceInstallPersonId");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionIsNull() {
            addCriterion("device_install_description is null");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionIsNotNull() {
            addCriterion("device_install_description is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionEqualTo(String value) {
            addCriterion("device_install_description =", value, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionNotEqualTo(String value) {
            addCriterion("device_install_description <>", value, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionGreaterThan(String value) {
            addCriterion("device_install_description >", value, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("device_install_description >=", value, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionLessThan(String value) {
            addCriterion("device_install_description <", value, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionLessThanOrEqualTo(String value) {
            addCriterion("device_install_description <=", value, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionLike(String value) {
            addCriterion("device_install_description like", value, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionNotLike(String value) {
            addCriterion("device_install_description not like", value, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionIn(List<String> values) {
            addCriterion("device_install_description in", values, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionNotIn(List<String> values) {
            addCriterion("device_install_description not in", values, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionBetween(String value1, String value2) {
            addCriterion("device_install_description between", value1, value2, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallDescriptionNotBetween(String value1, String value2) {
            addCriterion("device_install_description not between", value1, value2, "deviceInstallDescription");
            return (Criteria) this;
        }

        public Criteria andCameraIdIsNull() {
            addCriterion("camera_id is null");
            return (Criteria) this;
        }

        public Criteria andCameraIdIsNotNull() {
            addCriterion("camera_id is not null");
            return (Criteria) this;
        }

        public Criteria andCameraIdEqualTo(String value) {
            addCriterion("camera_id =", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotEqualTo(String value) {
            addCriterion("camera_id <>", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdGreaterThan(String value) {
            addCriterion("camera_id >", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdGreaterThanOrEqualTo(String value) {
            addCriterion("camera_id >=", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdLessThan(String value) {
            addCriterion("camera_id <", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdLessThanOrEqualTo(String value) {
            addCriterion("camera_id <=", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdLike(String value) {
            addCriterion("camera_id like", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotLike(String value) {
            addCriterion("camera_id not like", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdIn(List<String> values) {
            addCriterion("camera_id in", values, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotIn(List<String> values) {
            addCriterion("camera_id not in", values, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdBetween(String value1, String value2) {
            addCriterion("camera_id between", value1, value2, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotBetween(String value1, String value2) {
            addCriterion("camera_id not between", value1, value2, "cameraId");
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

        public Criteria andCalibrationValueIsNull() {
            addCriterion("calibration_value is null");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueIsNotNull() {
            addCriterion("calibration_value is not null");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueEqualTo(String value) {
            addCriterion("calibration_value =", value, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueNotEqualTo(String value) {
            addCriterion("calibration_value <>", value, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueGreaterThan(String value) {
            addCriterion("calibration_value >", value, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueGreaterThanOrEqualTo(String value) {
            addCriterion("calibration_value >=", value, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueLessThan(String value) {
            addCriterion("calibration_value <", value, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueLessThanOrEqualTo(String value) {
            addCriterion("calibration_value <=", value, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueLike(String value) {
            addCriterion("calibration_value like", value, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueNotLike(String value) {
            addCriterion("calibration_value not like", value, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueIn(List<String> values) {
            addCriterion("calibration_value in", values, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueNotIn(List<String> values) {
            addCriterion("calibration_value not in", values, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueBetween(String value1, String value2) {
            addCriterion("calibration_value between", value1, value2, "calibrationValue");
            return (Criteria) this;
        }

        public Criteria andCalibrationValueNotBetween(String value1, String value2) {
            addCriterion("calibration_value not between", value1, value2, "calibrationValue");
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
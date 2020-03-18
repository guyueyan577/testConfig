package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class DeviceNetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceNetExample() {
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

        public Criteria andImsiIsNull() {
            addCriterion("imsi is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("imsi is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("imsi =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("imsi <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("imsi >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("imsi >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("imsi <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("imsi <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("imsi like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("imsi not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("imsi in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("imsi not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("imsi between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("imsi not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andIccidIsNull() {
            addCriterion("iccid is null");
            return (Criteria) this;
        }

        public Criteria andIccidIsNotNull() {
            addCriterion("iccid is not null");
            return (Criteria) this;
        }

        public Criteria andIccidEqualTo(String value) {
            addCriterion("iccid =", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotEqualTo(String value) {
            addCriterion("iccid <>", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThan(String value) {
            addCriterion("iccid >", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThanOrEqualTo(String value) {
            addCriterion("iccid >=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThan(String value) {
            addCriterion("iccid <", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThanOrEqualTo(String value) {
            addCriterion("iccid <=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLike(String value) {
            addCriterion("iccid like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotLike(String value) {
            addCriterion("iccid not like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidIn(List<String> values) {
            addCriterion("iccid in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotIn(List<String> values) {
            addCriterion("iccid not in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidBetween(String value1, String value2) {
            addCriterion("iccid between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotBetween(String value1, String value2) {
            addCriterion("iccid not between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNull() {
            addCriterion("software_version is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIsNotNull() {
            addCriterion("software_version is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionEqualTo(String value) {
            addCriterion("software_version =", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotEqualTo(String value) {
            addCriterion("software_version <>", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThan(String value) {
            addCriterion("software_version >", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("software_version >=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThan(String value) {
            addCriterion("software_version <", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLessThanOrEqualTo(String value) {
            addCriterion("software_version <=", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionLike(String value) {
            addCriterion("software_version like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotLike(String value) {
            addCriterion("software_version not like", value, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionIn(List<String> values) {
            addCriterion("software_version in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotIn(List<String> values) {
            addCriterion("software_version not in", values, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionBetween(String value1, String value2) {
            addCriterion("software_version between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andSoftwareVersionNotBetween(String value1, String value2) {
            addCriterion("software_version not between", value1, value2, "softwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIsNull() {
            addCriterion("hardware_version is null");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIsNotNull() {
            addCriterion("hardware_version is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionEqualTo(String value) {
            addCriterion("hardware_version =", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotEqualTo(String value) {
            addCriterion("hardware_version <>", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionGreaterThan(String value) {
            addCriterion("hardware_version >", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("hardware_version >=", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLessThan(String value) {
            addCriterion("hardware_version <", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLessThanOrEqualTo(String value) {
            addCriterion("hardware_version <=", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionLike(String value) {
            addCriterion("hardware_version like", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotLike(String value) {
            addCriterion("hardware_version not like", value, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionIn(List<String> values) {
            addCriterion("hardware_version in", values, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotIn(List<String> values) {
            addCriterion("hardware_version not in", values, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionBetween(String value1, String value2) {
            addCriterion("hardware_version between", value1, value2, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andHardwareVersionNotBetween(String value1, String value2) {
            addCriterion("hardware_version not between", value1, value2, "hardwareVersion");
            return (Criteria) this;
        }

        public Criteria andSignalSourceIsNull() {
            addCriterion("signal_source is null");
            return (Criteria) this;
        }

        public Criteria andSignalSourceIsNotNull() {
            addCriterion("signal_source is not null");
            return (Criteria) this;
        }

        public Criteria andSignalSourceEqualTo(String value) {
            addCriterion("signal_source =", value, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceNotEqualTo(String value) {
            addCriterion("signal_source <>", value, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceGreaterThan(String value) {
            addCriterion("signal_source >", value, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceGreaterThanOrEqualTo(String value) {
            addCriterion("signal_source >=", value, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceLessThan(String value) {
            addCriterion("signal_source <", value, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceLessThanOrEqualTo(String value) {
            addCriterion("signal_source <=", value, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceLike(String value) {
            addCriterion("signal_source like", value, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceNotLike(String value) {
            addCriterion("signal_source not like", value, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceIn(List<String> values) {
            addCriterion("signal_source in", values, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceNotIn(List<String> values) {
            addCriterion("signal_source not in", values, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceBetween(String value1, String value2) {
            addCriterion("signal_source between", value1, value2, "signalSource");
            return (Criteria) this;
        }

        public Criteria andSignalSourceNotBetween(String value1, String value2) {
            addCriterion("signal_source not between", value1, value2, "signalSource");
            return (Criteria) this;
        }

        public Criteria andConnectStatusIsNull() {
            addCriterion("connect_status is null");
            return (Criteria) this;
        }

        public Criteria andConnectStatusIsNotNull() {
            addCriterion("connect_status is not null");
            return (Criteria) this;
        }

        public Criteria andConnectStatusEqualTo(Boolean value) {
            addCriterion("connect_status =", value, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusNotEqualTo(Boolean value) {
            addCriterion("connect_status <>", value, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusGreaterThan(Boolean value) {
            addCriterion("connect_status >", value, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("connect_status >=", value, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusLessThan(Boolean value) {
            addCriterion("connect_status <", value, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("connect_status <=", value, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusIn(List<Boolean> values) {
            addCriterion("connect_status in", values, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusNotIn(List<Boolean> values) {
            addCriterion("connect_status not in", values, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("connect_status between", value1, value2, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andConnectStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("connect_status not between", value1, value2, "connectStatus");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeIsNull() {
            addCriterion("last_connect_time is null");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeIsNotNull() {
            addCriterion("last_connect_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeEqualTo(Long value) {
            addCriterion("last_connect_time =", value, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeNotEqualTo(Long value) {
            addCriterion("last_connect_time <>", value, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeGreaterThan(Long value) {
            addCriterion("last_connect_time >", value, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_connect_time >=", value, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeLessThan(Long value) {
            addCriterion("last_connect_time <", value, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_connect_time <=", value, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeIn(List<Long> values) {
            addCriterion("last_connect_time in", values, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeNotIn(List<Long> values) {
            addCriterion("last_connect_time not in", values, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeBetween(Long value1, Long value2) {
            addCriterion("last_connect_time between", value1, value2, "lastConnectTime");
            return (Criteria) this;
        }

        public Criteria andLastConnectTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_connect_time not between", value1, value2, "lastConnectTime");
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
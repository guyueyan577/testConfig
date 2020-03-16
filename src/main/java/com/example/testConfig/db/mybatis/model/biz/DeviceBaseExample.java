package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class DeviceBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceBaseExample() {
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

        public Criteria andDeviceFlagIsNull() {
            addCriterion("device_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagIsNotNull() {
            addCriterion("device_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagEqualTo(Integer value) {
            addCriterion("device_flag =", value, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagNotEqualTo(Integer value) {
            addCriterion("device_flag <>", value, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagGreaterThan(Integer value) {
            addCriterion("device_flag >", value, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_flag >=", value, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagLessThan(Integer value) {
            addCriterion("device_flag <", value, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagLessThanOrEqualTo(Integer value) {
            addCriterion("device_flag <=", value, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagIn(List<Integer> values) {
            addCriterion("device_flag in", values, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagNotIn(List<Integer> values) {
            addCriterion("device_flag not in", values, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagBetween(Integer value1, Integer value2) {
            addCriterion("device_flag between", value1, value2, "deviceFlag");
            return (Criteria) this;
        }

        public Criteria andDeviceFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("device_flag not between", value1, value2, "deviceFlag");
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

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNull() {
            addCriterion("device_number is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNotNull() {
            addCriterion("device_number is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberEqualTo(String value) {
            addCriterion("device_number =", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotEqualTo(String value) {
            addCriterion("device_number <>", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThan(String value) {
            addCriterion("device_number >", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("device_number >=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThan(String value) {
            addCriterion("device_number <", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("device_number <=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLike(String value) {
            addCriterion("device_number like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotLike(String value) {
            addCriterion("device_number not like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIn(List<String> values) {
            addCriterion("device_number in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotIn(List<String> values) {
            addCriterion("device_number not in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberBetween(String value1, String value2) {
            addCriterion("device_number between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("device_number not between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeIsNull() {
            addCriterion("device_type_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeIsNotNull() {
            addCriterion("device_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeEqualTo(Integer value) {
            addCriterion("device_type_code =", value, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeNotEqualTo(Integer value) {
            addCriterion("device_type_code <>", value, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeGreaterThan(Integer value) {
            addCriterion("device_type_code >", value, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_type_code >=", value, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeLessThan(Integer value) {
            addCriterion("device_type_code <", value, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_type_code <=", value, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeIn(List<Integer> values) {
            addCriterion("device_type_code in", values, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeNotIn(List<Integer> values) {
            addCriterion("device_type_code not in", values, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_type_code between", value1, value2, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_type_code not between", value1, value2, "deviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameIsNull() {
            addCriterion("device_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameIsNotNull() {
            addCriterion("device_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameEqualTo(String value) {
            addCriterion("device_type_name =", value, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameNotEqualTo(String value) {
            addCriterion("device_type_name <>", value, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameGreaterThan(String value) {
            addCriterion("device_type_name >", value, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_type_name >=", value, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameLessThan(String value) {
            addCriterion("device_type_name <", value, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameLessThanOrEqualTo(String value) {
            addCriterion("device_type_name <=", value, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameLike(String value) {
            addCriterion("device_type_name like", value, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameNotLike(String value) {
            addCriterion("device_type_name not like", value, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameIn(List<String> values) {
            addCriterion("device_type_name in", values, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameNotIn(List<String> values) {
            addCriterion("device_type_name not in", values, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameBetween(String value1, String value2) {
            addCriterion("device_type_name between", value1, value2, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNameNotBetween(String value1, String value2) {
            addCriterion("device_type_name not between", value1, value2, "deviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeIsNull() {
            addCriterion("user_device_type_code is null");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeIsNotNull() {
            addCriterion("user_device_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeEqualTo(Integer value) {
            addCriterion("user_device_type_code =", value, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeNotEqualTo(Integer value) {
            addCriterion("user_device_type_code <>", value, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeGreaterThan(Integer value) {
            addCriterion("user_device_type_code >", value, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_device_type_code >=", value, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeLessThan(Integer value) {
            addCriterion("user_device_type_code <", value, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("user_device_type_code <=", value, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeIn(List<Integer> values) {
            addCriterion("user_device_type_code in", values, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeNotIn(List<Integer> values) {
            addCriterion("user_device_type_code not in", values, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("user_device_type_code between", value1, value2, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_device_type_code not between", value1, value2, "userDeviceTypeCode");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameIsNull() {
            addCriterion("user_device_type_name is null");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameIsNotNull() {
            addCriterion("user_device_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameEqualTo(String value) {
            addCriterion("user_device_type_name =", value, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameNotEqualTo(String value) {
            addCriterion("user_device_type_name <>", value, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameGreaterThan(String value) {
            addCriterion("user_device_type_name >", value, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_device_type_name >=", value, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameLessThan(String value) {
            addCriterion("user_device_type_name <", value, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameLessThanOrEqualTo(String value) {
            addCriterion("user_device_type_name <=", value, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameLike(String value) {
            addCriterion("user_device_type_name like", value, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameNotLike(String value) {
            addCriterion("user_device_type_name not like", value, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameIn(List<String> values) {
            addCriterion("user_device_type_name in", values, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameNotIn(List<String> values) {
            addCriterion("user_device_type_name not in", values, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameBetween(String value1, String value2) {
            addCriterion("user_device_type_name between", value1, value2, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andUserDeviceTypeNameNotBetween(String value1, String value2) {
            addCriterion("user_device_type_name not between", value1, value2, "userDeviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeIsNull() {
            addCriterion("device_vendor_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeIsNotNull() {
            addCriterion("device_vendor_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeEqualTo(Integer value) {
            addCriterion("device_vendor_code =", value, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeNotEqualTo(Integer value) {
            addCriterion("device_vendor_code <>", value, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeGreaterThan(Integer value) {
            addCriterion("device_vendor_code >", value, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_vendor_code >=", value, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeLessThan(Integer value) {
            addCriterion("device_vendor_code <", value, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_vendor_code <=", value, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeIn(List<Integer> values) {
            addCriterion("device_vendor_code in", values, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeNotIn(List<Integer> values) {
            addCriterion("device_vendor_code not in", values, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_vendor_code between", value1, value2, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_vendor_code not between", value1, value2, "deviceVendorCode");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameIsNull() {
            addCriterion("device_vendor_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameIsNotNull() {
            addCriterion("device_vendor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameEqualTo(String value) {
            addCriterion("device_vendor_name =", value, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameNotEqualTo(String value) {
            addCriterion("device_vendor_name <>", value, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameGreaterThan(String value) {
            addCriterion("device_vendor_name >", value, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_vendor_name >=", value, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameLessThan(String value) {
            addCriterion("device_vendor_name <", value, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameLessThanOrEqualTo(String value) {
            addCriterion("device_vendor_name <=", value, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameLike(String value) {
            addCriterion("device_vendor_name like", value, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameNotLike(String value) {
            addCriterion("device_vendor_name not like", value, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameIn(List<String> values) {
            addCriterion("device_vendor_name in", values, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameNotIn(List<String> values) {
            addCriterion("device_vendor_name not in", values, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameBetween(String value1, String value2) {
            addCriterion("device_vendor_name between", value1, value2, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNameNotBetween(String value1, String value2) {
            addCriterion("device_vendor_name not between", value1, value2, "deviceVendorName");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeIsNull() {
            addCriterion("device_produce_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeIsNotNull() {
            addCriterion("device_produce_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeEqualTo(Long value) {
            addCriterion("device_produce_time =", value, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeNotEqualTo(Long value) {
            addCriterion("device_produce_time <>", value, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeGreaterThan(Long value) {
            addCriterion("device_produce_time >", value, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("device_produce_time >=", value, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeLessThan(Long value) {
            addCriterion("device_produce_time <", value, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeLessThanOrEqualTo(Long value) {
            addCriterion("device_produce_time <=", value, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeIn(List<Long> values) {
            addCriterion("device_produce_time in", values, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeNotIn(List<Long> values) {
            addCriterion("device_produce_time not in", values, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeBetween(Long value1, Long value2) {
            addCriterion("device_produce_time between", value1, value2, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceProduceTimeNotBetween(Long value1, Long value2) {
            addCriterion("device_produce_time not between", value1, value2, "deviceProduceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeIsNull() {
            addCriterion("device_commission_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeIsNotNull() {
            addCriterion("device_commission_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeEqualTo(Long value) {
            addCriterion("device_commission_time =", value, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeNotEqualTo(Long value) {
            addCriterion("device_commission_time <>", value, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeGreaterThan(Long value) {
            addCriterion("device_commission_time >", value, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("device_commission_time >=", value, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeLessThan(Long value) {
            addCriterion("device_commission_time <", value, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeLessThanOrEqualTo(Long value) {
            addCriterion("device_commission_time <=", value, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeIn(List<Long> values) {
            addCriterion("device_commission_time in", values, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeNotIn(List<Long> values) {
            addCriterion("device_commission_time not in", values, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeBetween(Long value1, Long value2) {
            addCriterion("device_commission_time between", value1, value2, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceCommissionTimeNotBetween(Long value1, Long value2) {
            addCriterion("device_commission_time not between", value1, value2, "deviceCommissionTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeIsNull() {
            addCriterion("device_use_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeIsNotNull() {
            addCriterion("device_use_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeEqualTo(Long value) {
            addCriterion("device_use_end_time =", value, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeNotEqualTo(Long value) {
            addCriterion("device_use_end_time <>", value, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeGreaterThan(Long value) {
            addCriterion("device_use_end_time >", value, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("device_use_end_time >=", value, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeLessThan(Long value) {
            addCriterion("device_use_end_time <", value, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("device_use_end_time <=", value, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeIn(List<Long> values) {
            addCriterion("device_use_end_time in", values, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeNotIn(List<Long> values) {
            addCriterion("device_use_end_time not in", values, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeBetween(Long value1, Long value2) {
            addCriterion("device_use_end_time between", value1, value2, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceUseEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("device_use_end_time not between", value1, value2, "deviceUseEndTime");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationIsNull() {
            addCriterion("device_install_location is null");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationIsNotNull() {
            addCriterion("device_install_location is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationEqualTo(String value) {
            addCriterion("device_install_location =", value, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationNotEqualTo(String value) {
            addCriterion("device_install_location <>", value, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationGreaterThan(String value) {
            addCriterion("device_install_location >", value, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationGreaterThanOrEqualTo(String value) {
            addCriterion("device_install_location >=", value, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationLessThan(String value) {
            addCriterion("device_install_location <", value, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationLessThanOrEqualTo(String value) {
            addCriterion("device_install_location <=", value, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationLike(String value) {
            addCriterion("device_install_location like", value, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationNotLike(String value) {
            addCriterion("device_install_location not like", value, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationIn(List<String> values) {
            addCriterion("device_install_location in", values, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationNotIn(List<String> values) {
            addCriterion("device_install_location not in", values, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationBetween(String value1, String value2) {
            addCriterion("device_install_location between", value1, value2, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceInstallLocationNotBetween(String value1, String value2) {
            addCriterion("device_install_location not between", value1, value2, "deviceInstallLocation");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeIsNull() {
            addCriterion("device_unit_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeIsNotNull() {
            addCriterion("device_unit_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeEqualTo(String value) {
            addCriterion("device_unit_type =", value, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeNotEqualTo(String value) {
            addCriterion("device_unit_type <>", value, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeGreaterThan(String value) {
            addCriterion("device_unit_type >", value, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_unit_type >=", value, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeLessThan(String value) {
            addCriterion("device_unit_type <", value, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("device_unit_type <=", value, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeLike(String value) {
            addCriterion("device_unit_type like", value, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeNotLike(String value) {
            addCriterion("device_unit_type not like", value, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeIn(List<String> values) {
            addCriterion("device_unit_type in", values, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeNotIn(List<String> values) {
            addCriterion("device_unit_type not in", values, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeBetween(String value1, String value2) {
            addCriterion("device_unit_type between", value1, value2, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceUnitTypeNotBetween(String value1, String value2) {
            addCriterion("device_unit_type not between", value1, value2, "deviceUnitType");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdIsNull() {
            addCriterion("device_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdIsNotNull() {
            addCriterion("device_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdEqualTo(String value) {
            addCriterion("device_parent_id =", value, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdNotEqualTo(String value) {
            addCriterion("device_parent_id <>", value, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdGreaterThan(String value) {
            addCriterion("device_parent_id >", value, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_parent_id >=", value, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdLessThan(String value) {
            addCriterion("device_parent_id <", value, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdLessThanOrEqualTo(String value) {
            addCriterion("device_parent_id <=", value, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdLike(String value) {
            addCriterion("device_parent_id like", value, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdNotLike(String value) {
            addCriterion("device_parent_id not like", value, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdIn(List<String> values) {
            addCriterion("device_parent_id in", values, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdNotIn(List<String> values) {
            addCriterion("device_parent_id not in", values, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdBetween(String value1, String value2) {
            addCriterion("device_parent_id between", value1, value2, "deviceParentId");
            return (Criteria) this;
        }

        public Criteria andDeviceParentIdNotBetween(String value1, String value2) {
            addCriterion("device_parent_id not between", value1, value2, "deviceParentId");
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

        public Criteria andDeviceSystemNameIsNull() {
            addCriterion("device_system_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameIsNotNull() {
            addCriterion("device_system_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameEqualTo(String value) {
            addCriterion("device_system_name =", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameNotEqualTo(String value) {
            addCriterion("device_system_name <>", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameGreaterThan(String value) {
            addCriterion("device_system_name >", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_system_name >=", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameLessThan(String value) {
            addCriterion("device_system_name <", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameLessThanOrEqualTo(String value) {
            addCriterion("device_system_name <=", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameLike(String value) {
            addCriterion("device_system_name like", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameNotLike(String value) {
            addCriterion("device_system_name not like", value, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameIn(List<String> values) {
            addCriterion("device_system_name in", values, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameNotIn(List<String> values) {
            addCriterion("device_system_name not in", values, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameBetween(String value1, String value2) {
            addCriterion("device_system_name between", value1, value2, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSystemNameNotBetween(String value1, String value2) {
            addCriterion("device_system_name not between", value1, value2, "deviceSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeIsNull() {
            addCriterion("device_sub_system_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeIsNotNull() {
            addCriterion("device_sub_system_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeEqualTo(Integer value) {
            addCriterion("device_sub_system_code =", value, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeNotEqualTo(Integer value) {
            addCriterion("device_sub_system_code <>", value, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeGreaterThan(Integer value) {
            addCriterion("device_sub_system_code >", value, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_sub_system_code >=", value, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeLessThan(Integer value) {
            addCriterion("device_sub_system_code <", value, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeLessThanOrEqualTo(Integer value) {
            addCriterion("device_sub_system_code <=", value, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeIn(List<Integer> values) {
            addCriterion("device_sub_system_code in", values, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeNotIn(List<Integer> values) {
            addCriterion("device_sub_system_code not in", values, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeBetween(Integer value1, Integer value2) {
            addCriterion("device_sub_system_code between", value1, value2, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_sub_system_code not between", value1, value2, "deviceSubSystemCode");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameIsNull() {
            addCriterion("device_sub_system_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameIsNotNull() {
            addCriterion("device_sub_system_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameEqualTo(String value) {
            addCriterion("device_sub_system_name =", value, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameNotEqualTo(String value) {
            addCriterion("device_sub_system_name <>", value, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameGreaterThan(String value) {
            addCriterion("device_sub_system_name >", value, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_sub_system_name >=", value, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameLessThan(String value) {
            addCriterion("device_sub_system_name <", value, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameLessThanOrEqualTo(String value) {
            addCriterion("device_sub_system_name <=", value, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameLike(String value) {
            addCriterion("device_sub_system_name like", value, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameNotLike(String value) {
            addCriterion("device_sub_system_name not like", value, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameIn(List<String> values) {
            addCriterion("device_sub_system_name in", values, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameNotIn(List<String> values) {
            addCriterion("device_sub_system_name not in", values, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameBetween(String value1, String value2) {
            addCriterion("device_sub_system_name between", value1, value2, "deviceSubSystemName");
            return (Criteria) this;
        }

        public Criteria andDeviceSubSystemNameNotBetween(String value1, String value2) {
            addCriterion("device_sub_system_name not between", value1, value2, "deviceSubSystemName");
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

        public Criteria andLayerImageXIsNull() {
            addCriterion("layer_image_x is null");
            return (Criteria) this;
        }

        public Criteria andLayerImageXIsNotNull() {
            addCriterion("layer_image_x is not null");
            return (Criteria) this;
        }

        public Criteria andLayerImageXEqualTo(Double value) {
            addCriterion("layer_image_x =", value, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXNotEqualTo(Double value) {
            addCriterion("layer_image_x <>", value, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXGreaterThan(Double value) {
            addCriterion("layer_image_x >", value, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXGreaterThanOrEqualTo(Double value) {
            addCriterion("layer_image_x >=", value, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXLessThan(Double value) {
            addCriterion("layer_image_x <", value, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXLessThanOrEqualTo(Double value) {
            addCriterion("layer_image_x <=", value, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXIn(List<Double> values) {
            addCriterion("layer_image_x in", values, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXNotIn(List<Double> values) {
            addCriterion("layer_image_x not in", values, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXBetween(Double value1, Double value2) {
            addCriterion("layer_image_x between", value1, value2, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageXNotBetween(Double value1, Double value2) {
            addCriterion("layer_image_x not between", value1, value2, "layerImageX");
            return (Criteria) this;
        }

        public Criteria andLayerImageYIsNull() {
            addCriterion("layer_image_y is null");
            return (Criteria) this;
        }

        public Criteria andLayerImageYIsNotNull() {
            addCriterion("layer_image_y is not null");
            return (Criteria) this;
        }

        public Criteria andLayerImageYEqualTo(Double value) {
            addCriterion("layer_image_y =", value, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYNotEqualTo(Double value) {
            addCriterion("layer_image_y <>", value, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYGreaterThan(Double value) {
            addCriterion("layer_image_y >", value, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYGreaterThanOrEqualTo(Double value) {
            addCriterion("layer_image_y >=", value, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYLessThan(Double value) {
            addCriterion("layer_image_y <", value, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYLessThanOrEqualTo(Double value) {
            addCriterion("layer_image_y <=", value, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYIn(List<Double> values) {
            addCriterion("layer_image_y in", values, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYNotIn(List<Double> values) {
            addCriterion("layer_image_y not in", values, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYBetween(Double value1, Double value2) {
            addCriterion("layer_image_y between", value1, value2, "layerImageY");
            return (Criteria) this;
        }

        public Criteria andLayerImageYNotBetween(Double value1, Double value2) {
            addCriterion("layer_image_y not between", value1, value2, "layerImageY");
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

        public Criteria andImportantIsNull() {
            addCriterion("important is null");
            return (Criteria) this;
        }

        public Criteria andImportantIsNotNull() {
            addCriterion("important is not null");
            return (Criteria) this;
        }

        public Criteria andImportantEqualTo(Boolean value) {
            addCriterion("important =", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotEqualTo(Boolean value) {
            addCriterion("important <>", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThan(Boolean value) {
            addCriterion("important >", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThanOrEqualTo(Boolean value) {
            addCriterion("important >=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThan(Boolean value) {
            addCriterion("important <", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThanOrEqualTo(Boolean value) {
            addCriterion("important <=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantIn(List<Boolean> values) {
            addCriterion("important in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotIn(List<Boolean> values) {
            addCriterion("important not in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantBetween(Boolean value1, Boolean value2) {
            addCriterion("important between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotBetween(Boolean value1, Boolean value2) {
            addCriterion("important not between", value1, value2, "important");
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

        public Criteria andPersonalDeviceIsNull() {
            addCriterion("personal_device is null");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceIsNotNull() {
            addCriterion("personal_device is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceEqualTo(Boolean value) {
            addCriterion("personal_device =", value, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceNotEqualTo(Boolean value) {
            addCriterion("personal_device <>", value, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceGreaterThan(Boolean value) {
            addCriterion("personal_device >", value, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("personal_device >=", value, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceLessThan(Boolean value) {
            addCriterion("personal_device <", value, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceLessThanOrEqualTo(Boolean value) {
            addCriterion("personal_device <=", value, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceIn(List<Boolean> values) {
            addCriterion("personal_device in", values, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceNotIn(List<Boolean> values) {
            addCriterion("personal_device not in", values, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceBetween(Boolean value1, Boolean value2) {
            addCriterion("personal_device between", value1, value2, "personalDevice");
            return (Criteria) this;
        }

        public Criteria andPersonalDeviceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("personal_device not between", value1, value2, "personalDevice");
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
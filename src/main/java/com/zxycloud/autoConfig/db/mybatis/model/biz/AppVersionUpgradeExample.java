package com.zxycloud.autoConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppVersionUpgradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppVersionUpgradeExample() {
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

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("app_type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("app_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(Integer value) {
            addCriterion("app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(Integer value) {
            addCriterion("app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(Integer value) {
            addCriterion("app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(Integer value) {
            addCriterion("app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(Integer value) {
            addCriterion("app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<Integer> values) {
            addCriterion("app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<Integer> values) {
            addCriterion("app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(Integer value1, Integer value2) {
            addCriterion("app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("app_version is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("app_version is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("app_version =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("app_version <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("app_version >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("app_version >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("app_version <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("app_version <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("app_version like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("app_version not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("app_version in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("app_version not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("app_version between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("app_version not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppPathIsNull() {
            addCriterion("app_path is null");
            return (Criteria) this;
        }

        public Criteria andAppPathIsNotNull() {
            addCriterion("app_path is not null");
            return (Criteria) this;
        }

        public Criteria andAppPathEqualTo(String value) {
            addCriterion("app_path =", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathNotEqualTo(String value) {
            addCriterion("app_path <>", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathGreaterThan(String value) {
            addCriterion("app_path >", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathGreaterThanOrEqualTo(String value) {
            addCriterion("app_path >=", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathLessThan(String value) {
            addCriterion("app_path <", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathLessThanOrEqualTo(String value) {
            addCriterion("app_path <=", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathLike(String value) {
            addCriterion("app_path like", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathNotLike(String value) {
            addCriterion("app_path not like", value, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathIn(List<String> values) {
            addCriterion("app_path in", values, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathNotIn(List<String> values) {
            addCriterion("app_path not in", values, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathBetween(String value1, String value2) {
            addCriterion("app_path between", value1, value2, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppPathNotBetween(String value1, String value2) {
            addCriterion("app_path not between", value1, value2, "appPath");
            return (Criteria) this;
        }

        public Criteria andAppSystemIsNull() {
            addCriterion("app_system is null");
            return (Criteria) this;
        }

        public Criteria andAppSystemIsNotNull() {
            addCriterion("app_system is not null");
            return (Criteria) this;
        }

        public Criteria andAppSystemEqualTo(String value) {
            addCriterion("app_system =", value, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemNotEqualTo(String value) {
            addCriterion("app_system <>", value, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemGreaterThan(String value) {
            addCriterion("app_system >", value, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemGreaterThanOrEqualTo(String value) {
            addCriterion("app_system >=", value, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemLessThan(String value) {
            addCriterion("app_system <", value, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemLessThanOrEqualTo(String value) {
            addCriterion("app_system <=", value, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemLike(String value) {
            addCriterion("app_system like", value, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemNotLike(String value) {
            addCriterion("app_system not like", value, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemIn(List<String> values) {
            addCriterion("app_system in", values, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemNotIn(List<String> values) {
            addCriterion("app_system not in", values, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemBetween(String value1, String value2) {
            addCriterion("app_system between", value1, value2, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppSystemNotBetween(String value1, String value2) {
            addCriterion("app_system not between", value1, value2, "appSystem");
            return (Criteria) this;
        }

        public Criteria andAppForceIsNull() {
            addCriterion("app_force is null");
            return (Criteria) this;
        }

        public Criteria andAppForceIsNotNull() {
            addCriterion("app_force is not null");
            return (Criteria) this;
        }

        public Criteria andAppForceEqualTo(Integer value) {
            addCriterion("app_force =", value, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceNotEqualTo(Integer value) {
            addCriterion("app_force <>", value, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceGreaterThan(Integer value) {
            addCriterion("app_force >", value, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_force >=", value, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceLessThan(Integer value) {
            addCriterion("app_force <", value, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceLessThanOrEqualTo(Integer value) {
            addCriterion("app_force <=", value, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceIn(List<Integer> values) {
            addCriterion("app_force in", values, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceNotIn(List<Integer> values) {
            addCriterion("app_force not in", values, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceBetween(Integer value1, Integer value2) {
            addCriterion("app_force between", value1, value2, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppForceNotBetween(Integer value1, Integer value2) {
            addCriterion("app_force not between", value1, value2, "appForce");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeIsNull() {
            addCriterion("app_upload_time is null");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeIsNotNull() {
            addCriterion("app_upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeEqualTo(Date value) {
            addCriterion("app_upload_time =", value, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeNotEqualTo(Date value) {
            addCriterion("app_upload_time <>", value, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeGreaterThan(Date value) {
            addCriterion("app_upload_time >", value, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("app_upload_time >=", value, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeLessThan(Date value) {
            addCriterion("app_upload_time <", value, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("app_upload_time <=", value, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeIn(List<Date> values) {
            addCriterion("app_upload_time in", values, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeNotIn(List<Date> values) {
            addCriterion("app_upload_time not in", values, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeBetween(Date value1, Date value2) {
            addCriterion("app_upload_time between", value1, value2, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("app_upload_time not between", value1, value2, "appUploadTime");
            return (Criteria) this;
        }

        public Criteria andAppMd5IsNull() {
            addCriterion("app_md5 is null");
            return (Criteria) this;
        }

        public Criteria andAppMd5IsNotNull() {
            addCriterion("app_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andAppMd5EqualTo(String value) {
            addCriterion("app_md5 =", value, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5NotEqualTo(String value) {
            addCriterion("app_md5 <>", value, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5GreaterThan(String value) {
            addCriterion("app_md5 >", value, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5GreaterThanOrEqualTo(String value) {
            addCriterion("app_md5 >=", value, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5LessThan(String value) {
            addCriterion("app_md5 <", value, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5LessThanOrEqualTo(String value) {
            addCriterion("app_md5 <=", value, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5Like(String value) {
            addCriterion("app_md5 like", value, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5NotLike(String value) {
            addCriterion("app_md5 not like", value, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5In(List<String> values) {
            addCriterion("app_md5 in", values, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5NotIn(List<String> values) {
            addCriterion("app_md5 not in", values, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5Between(String value1, String value2) {
            addCriterion("app_md5 between", value1, value2, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppMd5NotBetween(String value1, String value2) {
            addCriterion("app_md5 not between", value1, value2, "appMd5");
            return (Criteria) this;
        }

        public Criteria andAppSizeIsNull() {
            addCriterion("app_size is null");
            return (Criteria) this;
        }

        public Criteria andAppSizeIsNotNull() {
            addCriterion("app_size is not null");
            return (Criteria) this;
        }

        public Criteria andAppSizeEqualTo(String value) {
            addCriterion("app_size =", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeNotEqualTo(String value) {
            addCriterion("app_size <>", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeGreaterThan(String value) {
            addCriterion("app_size >", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeGreaterThanOrEqualTo(String value) {
            addCriterion("app_size >=", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeLessThan(String value) {
            addCriterion("app_size <", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeLessThanOrEqualTo(String value) {
            addCriterion("app_size <=", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeLike(String value) {
            addCriterion("app_size like", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeNotLike(String value) {
            addCriterion("app_size not like", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeIn(List<String> values) {
            addCriterion("app_size in", values, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeNotIn(List<String> values) {
            addCriterion("app_size not in", values, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeBetween(String value1, String value2) {
            addCriterion("app_size between", value1, value2, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeNotBetween(String value1, String value2) {
            addCriterion("app_size not between", value1, value2, "appSize");
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
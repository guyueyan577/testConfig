package com.example.testConfig.db.mybatis.model.assist;

import java.util.ArrayList;
import java.util.List;

public class FileUploadInfomationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileUploadInfomationExample() {
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

        public Criteria andModuleCodeIsNull() {
            addCriterion("module_code is null");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIsNotNull() {
            addCriterion("module_code is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCodeEqualTo(Integer value) {
            addCriterion("module_code =", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotEqualTo(Integer value) {
            addCriterion("module_code <>", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeGreaterThan(Integer value) {
            addCriterion("module_code >", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_code >=", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLessThan(Integer value) {
            addCriterion("module_code <", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLessThanOrEqualTo(Integer value) {
            addCriterion("module_code <=", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIn(List<Integer> values) {
            addCriterion("module_code in", values, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotIn(List<Integer> values) {
            addCriterion("module_code not in", values, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeBetween(Integer value1, Integer value2) {
            addCriterion("module_code between", value1, value2, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("module_code not between", value1, value2, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeIsNull() {
            addCriterion("file_type_code is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeIsNotNull() {
            addCriterion("file_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeEqualTo(Integer value) {
            addCriterion("file_type_code =", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotEqualTo(Integer value) {
            addCriterion("file_type_code <>", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeGreaterThan(Integer value) {
            addCriterion("file_type_code >", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_type_code >=", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeLessThan(Integer value) {
            addCriterion("file_type_code <", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("file_type_code <=", value, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeIn(List<Integer> values) {
            addCriterion("file_type_code in", values, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotIn(List<Integer> values) {
            addCriterion("file_type_code not in", values, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("file_type_code between", value1, value2, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_type_code not between", value1, value2, "fileTypeCode");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
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

        public Criteria andSortScortIsNull() {
            addCriterion("sort_scort is null");
            return (Criteria) this;
        }

        public Criteria andSortScortIsNotNull() {
            addCriterion("sort_scort is not null");
            return (Criteria) this;
        }

        public Criteria andSortScortEqualTo(Integer value) {
            addCriterion("sort_scort =", value, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortNotEqualTo(Integer value) {
            addCriterion("sort_scort <>", value, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortGreaterThan(Integer value) {
            addCriterion("sort_scort >", value, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_scort >=", value, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortLessThan(Integer value) {
            addCriterion("sort_scort <", value, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortLessThanOrEqualTo(Integer value) {
            addCriterion("sort_scort <=", value, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortIn(List<Integer> values) {
            addCriterion("sort_scort in", values, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortNotIn(List<Integer> values) {
            addCriterion("sort_scort not in", values, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortBetween(Integer value1, Integer value2) {
            addCriterion("sort_scort between", value1, value2, "sortScort");
            return (Criteria) this;
        }

        public Criteria andSortScortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_scort not between", value1, value2, "sortScort");
            return (Criteria) this;
        }

        public Criteria andBindingIdIsNull() {
            addCriterion("binding_id is null");
            return (Criteria) this;
        }

        public Criteria andBindingIdIsNotNull() {
            addCriterion("binding_id is not null");
            return (Criteria) this;
        }

        public Criteria andBindingIdEqualTo(String value) {
            addCriterion("binding_id =", value, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdNotEqualTo(String value) {
            addCriterion("binding_id <>", value, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdGreaterThan(String value) {
            addCriterion("binding_id >", value, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdGreaterThanOrEqualTo(String value) {
            addCriterion("binding_id >=", value, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdLessThan(String value) {
            addCriterion("binding_id <", value, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdLessThanOrEqualTo(String value) {
            addCriterion("binding_id <=", value, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdLike(String value) {
            addCriterion("binding_id like", value, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdNotLike(String value) {
            addCriterion("binding_id not like", value, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdIn(List<String> values) {
            addCriterion("binding_id in", values, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdNotIn(List<String> values) {
            addCriterion("binding_id not in", values, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdBetween(String value1, String value2) {
            addCriterion("binding_id between", value1, value2, "bindingId");
            return (Criteria) this;
        }

        public Criteria andBindingIdNotBetween(String value1, String value2) {
            addCriterion("binding_id not between", value1, value2, "bindingId");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeIsNull() {
            addCriterion("file_url_type is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeIsNotNull() {
            addCriterion("file_url_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeEqualTo(Integer value) {
            addCriterion("file_url_type =", value, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeNotEqualTo(Integer value) {
            addCriterion("file_url_type <>", value, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeGreaterThan(Integer value) {
            addCriterion("file_url_type >", value, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_url_type >=", value, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeLessThan(Integer value) {
            addCriterion("file_url_type <", value, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeLessThanOrEqualTo(Integer value) {
            addCriterion("file_url_type <=", value, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeIn(List<Integer> values) {
            addCriterion("file_url_type in", values, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeNotIn(List<Integer> values) {
            addCriterion("file_url_type not in", values, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeBetween(Integer value1, Integer value2) {
            addCriterion("file_url_type between", value1, value2, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andFileUrlTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_url_type not between", value1, value2, "fileUrlType");
            return (Criteria) this;
        }

        public Criteria andImgWidthIsNull() {
            addCriterion("img_width is null");
            return (Criteria) this;
        }

        public Criteria andImgWidthIsNotNull() {
            addCriterion("img_width is not null");
            return (Criteria) this;
        }

        public Criteria andImgWidthEqualTo(Double value) {
            addCriterion("img_width =", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotEqualTo(Double value) {
            addCriterion("img_width <>", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthGreaterThan(Double value) {
            addCriterion("img_width >", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("img_width >=", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthLessThan(Double value) {
            addCriterion("img_width <", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthLessThanOrEqualTo(Double value) {
            addCriterion("img_width <=", value, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthIn(List<Double> values) {
            addCriterion("img_width in", values, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotIn(List<Double> values) {
            addCriterion("img_width not in", values, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthBetween(Double value1, Double value2) {
            addCriterion("img_width between", value1, value2, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgWidthNotBetween(Double value1, Double value2) {
            addCriterion("img_width not between", value1, value2, "imgWidth");
            return (Criteria) this;
        }

        public Criteria andImgHeightIsNull() {
            addCriterion("img_height is null");
            return (Criteria) this;
        }

        public Criteria andImgHeightIsNotNull() {
            addCriterion("img_height is not null");
            return (Criteria) this;
        }

        public Criteria andImgHeightEqualTo(Double value) {
            addCriterion("img_height =", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotEqualTo(Double value) {
            addCriterion("img_height <>", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightGreaterThan(Double value) {
            addCriterion("img_height >", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("img_height >=", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightLessThan(Double value) {
            addCriterion("img_height <", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightLessThanOrEqualTo(Double value) {
            addCriterion("img_height <=", value, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightIn(List<Double> values) {
            addCriterion("img_height in", values, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotIn(List<Double> values) {
            addCriterion("img_height not in", values, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightBetween(Double value1, Double value2) {
            addCriterion("img_height between", value1, value2, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andImgHeightNotBetween(Double value1, Double value2) {
            addCriterion("img_height not between", value1, value2, "imgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlIsNull() {
            addCriterion("thumb_img_url is null");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlIsNotNull() {
            addCriterion("thumb_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlEqualTo(String value) {
            addCriterion("thumb_img_url =", value, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlNotEqualTo(String value) {
            addCriterion("thumb_img_url <>", value, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlGreaterThan(String value) {
            addCriterion("thumb_img_url >", value, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_img_url >=", value, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlLessThan(String value) {
            addCriterion("thumb_img_url <", value, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlLessThanOrEqualTo(String value) {
            addCriterion("thumb_img_url <=", value, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlLike(String value) {
            addCriterion("thumb_img_url like", value, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlNotLike(String value) {
            addCriterion("thumb_img_url not like", value, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlIn(List<String> values) {
            addCriterion("thumb_img_url in", values, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlNotIn(List<String> values) {
            addCriterion("thumb_img_url not in", values, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlBetween(String value1, String value2) {
            addCriterion("thumb_img_url between", value1, value2, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgUrlNotBetween(String value1, String value2) {
            addCriterion("thumb_img_url not between", value1, value2, "thumbImgUrl");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthIsNull() {
            addCriterion("thumb_img_width is null");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthIsNotNull() {
            addCriterion("thumb_img_width is not null");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthEqualTo(Double value) {
            addCriterion("thumb_img_width =", value, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthNotEqualTo(Double value) {
            addCriterion("thumb_img_width <>", value, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthGreaterThan(Double value) {
            addCriterion("thumb_img_width >", value, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("thumb_img_width >=", value, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthLessThan(Double value) {
            addCriterion("thumb_img_width <", value, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthLessThanOrEqualTo(Double value) {
            addCriterion("thumb_img_width <=", value, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthIn(List<Double> values) {
            addCriterion("thumb_img_width in", values, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthNotIn(List<Double> values) {
            addCriterion("thumb_img_width not in", values, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthBetween(Double value1, Double value2) {
            addCriterion("thumb_img_width between", value1, value2, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgWidthNotBetween(Double value1, Double value2) {
            addCriterion("thumb_img_width not between", value1, value2, "thumbImgWidth");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightIsNull() {
            addCriterion("thumb_img_height is null");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightIsNotNull() {
            addCriterion("thumb_img_height is not null");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightEqualTo(Double value) {
            addCriterion("thumb_img_height =", value, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightNotEqualTo(Double value) {
            addCriterion("thumb_img_height <>", value, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightGreaterThan(Double value) {
            addCriterion("thumb_img_height >", value, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("thumb_img_height >=", value, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightLessThan(Double value) {
            addCriterion("thumb_img_height <", value, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightLessThanOrEqualTo(Double value) {
            addCriterion("thumb_img_height <=", value, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightIn(List<Double> values) {
            addCriterion("thumb_img_height in", values, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightNotIn(List<Double> values) {
            addCriterion("thumb_img_height not in", values, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightBetween(Double value1, Double value2) {
            addCriterion("thumb_img_height between", value1, value2, "thumbImgHeight");
            return (Criteria) this;
        }

        public Criteria andThumbImgHeightNotBetween(Double value1, Double value2) {
            addCriterion("thumb_img_height not between", value1, value2, "thumbImgHeight");
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
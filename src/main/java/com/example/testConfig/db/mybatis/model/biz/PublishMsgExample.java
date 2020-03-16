package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.List;

public class PublishMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublishMsgExample() {
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

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(Integer value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(Integer value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(Integer value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(Integer value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<Integer> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<Integer> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(Integer value1, Integer value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNull() {
            addCriterion("msg_title is null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNotNull() {
            addCriterion("msg_title is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleEqualTo(String value) {
            addCriterion("msg_title =", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotEqualTo(String value) {
            addCriterion("msg_title <>", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThan(String value) {
            addCriterion("msg_title >", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("msg_title >=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThan(String value) {
            addCriterion("msg_title <", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("msg_title <=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLike(String value) {
            addCriterion("msg_title like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotLike(String value) {
            addCriterion("msg_title not like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIn(List<String> values) {
            addCriterion("msg_title in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotIn(List<String> values) {
            addCriterion("msg_title not in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleBetween(String value1, String value2) {
            addCriterion("msg_title between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotBetween(String value1, String value2) {
            addCriterion("msg_title not between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Long value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Long value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Long value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Long value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Long value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Long> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Long> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Long value1, Long value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Long value1, Long value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Long> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Long> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Long value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Long value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Long value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Long value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Long value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Long> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Long> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Long value1, Long value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Long value1, Long value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishStateIsNull() {
            addCriterion("publish_state is null");
            return (Criteria) this;
        }

        public Criteria andPublishStateIsNotNull() {
            addCriterion("publish_state is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStateEqualTo(Integer value) {
            addCriterion("publish_state =", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateNotEqualTo(Integer value) {
            addCriterion("publish_state <>", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateGreaterThan(Integer value) {
            addCriterion("publish_state >", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_state >=", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateLessThan(Integer value) {
            addCriterion("publish_state <", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateLessThanOrEqualTo(Integer value) {
            addCriterion("publish_state <=", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateIn(List<Integer> values) {
            addCriterion("publish_state in", values, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateNotIn(List<Integer> values) {
            addCriterion("publish_state not in", values, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateBetween(Integer value1, Integer value2) {
            addCriterion("publish_state between", value1, value2, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_state not between", value1, value2, "publishState");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceIsNull() {
            addCriterion("system_advice is null");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceIsNotNull() {
            addCriterion("system_advice is not null");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceEqualTo(Integer value) {
            addCriterion("system_advice =", value, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceNotEqualTo(Integer value) {
            addCriterion("system_advice <>", value, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceGreaterThan(Integer value) {
            addCriterion("system_advice >", value, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_advice >=", value, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceLessThan(Integer value) {
            addCriterion("system_advice <", value, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceLessThanOrEqualTo(Integer value) {
            addCriterion("system_advice <=", value, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceIn(List<Integer> values) {
            addCriterion("system_advice in", values, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceNotIn(List<Integer> values) {
            addCriterion("system_advice not in", values, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceBetween(Integer value1, Integer value2) {
            addCriterion("system_advice between", value1, value2, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andSystemAdviceNotBetween(Integer value1, Integer value2) {
            addCriterion("system_advice not between", value1, value2, "systemAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceIsNull() {
            addCriterion("channel_advice is null");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceIsNotNull() {
            addCriterion("channel_advice is not null");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceEqualTo(Integer value) {
            addCriterion("channel_advice =", value, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceNotEqualTo(Integer value) {
            addCriterion("channel_advice <>", value, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceGreaterThan(Integer value) {
            addCriterion("channel_advice >", value, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_advice >=", value, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceLessThan(Integer value) {
            addCriterion("channel_advice <", value, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceLessThanOrEqualTo(Integer value) {
            addCriterion("channel_advice <=", value, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceIn(List<Integer> values) {
            addCriterion("channel_advice in", values, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceNotIn(List<Integer> values) {
            addCriterion("channel_advice not in", values, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceBetween(Integer value1, Integer value2) {
            addCriterion("channel_advice between", value1, value2, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andChannelAdviceNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_advice not between", value1, value2, "channelAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceIsNull() {
            addCriterion("project_advice is null");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceIsNotNull() {
            addCriterion("project_advice is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceEqualTo(Integer value) {
            addCriterion("project_advice =", value, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceNotEqualTo(Integer value) {
            addCriterion("project_advice <>", value, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceGreaterThan(Integer value) {
            addCriterion("project_advice >", value, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_advice >=", value, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceLessThan(Integer value) {
            addCriterion("project_advice <", value, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceLessThanOrEqualTo(Integer value) {
            addCriterion("project_advice <=", value, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceIn(List<Integer> values) {
            addCriterion("project_advice in", values, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceNotIn(List<Integer> values) {
            addCriterion("project_advice not in", values, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceBetween(Integer value1, Integer value2) {
            addCriterion("project_advice between", value1, value2, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andProjectAdviceNotBetween(Integer value1, Integer value2) {
            addCriterion("project_advice not between", value1, value2, "projectAdvice");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIsNull() {
            addCriterion("msg_level is null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIsNotNull() {
            addCriterion("msg_level is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelEqualTo(Integer value) {
            addCriterion("msg_level =", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotEqualTo(Integer value) {
            addCriterion("msg_level <>", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelGreaterThan(Integer value) {
            addCriterion("msg_level >", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_level >=", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelLessThan(Integer value) {
            addCriterion("msg_level <", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelLessThanOrEqualTo(Integer value) {
            addCriterion("msg_level <=", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIn(List<Integer> values) {
            addCriterion("msg_level in", values, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotIn(List<Integer> values) {
            addCriterion("msg_level not in", values, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelBetween(Integer value1, Integer value2) {
            addCriterion("msg_level between", value1, value2, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_level not between", value1, value2, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }
        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(String value) {
            addCriterion("creater_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(String value) {
            addCriterion("creater_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(String value) {
            addCriterion("creater_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("creater_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(String value) {
            addCriterion("creater_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(String value) {
            addCriterion("creater_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLike(String value) {
            addCriterion("creater_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotLike(String value) {
            addCriterion("creater_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<String> values) {
            addCriterion("creater_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<String> values) {
            addCriterion("creater_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(String value1, String value2) {
            addCriterion("creater_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(String value1, String value2) {
            addCriterion("creater_id not between", value1, value2, "createId");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Long value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Long value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Long value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Long value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Long value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Long> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Long> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Long value1, Long value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Long value1, Long value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
        public Criteria andMsgFromIsNull() {
            addCriterion("msg_from is null");
            return (Criteria) this;
        }

        public Criteria andMsgFromIsNotNull() {
            addCriterion("msg_from is not null");
            return (Criteria) this;
        }

        public Criteria andMsgFromEqualTo(Integer value) {
            addCriterion("msg_from =", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotEqualTo(Integer value) {
            addCriterion("msg_from <>", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromGreaterThan(Integer value) {
            addCriterion("msg_from >", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_from >=", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromLessThan(Integer value) {
            addCriterion("msg_from <", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromLessThanOrEqualTo(Integer value) {
            addCriterion("msg_from <=", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromIn(List<Integer> values) {
            addCriterion("msg_from in", values, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotIn(List<Integer> values) {
            addCriterion("msg_from not in", values, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromBetween(Integer value1, Integer value2) {
            addCriterion("msg_from between", value1, value2, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_from not between", value1, value2, "msgFrom");
            return (Criteria) this;
        }
        public Criteria andAdviceCategoryIsNull() {
            addCriterion("advice_category is null");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryIsNotNull() {
            addCriterion("advice_category is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryEqualTo(Integer value) {
            addCriterion("advice_category =", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNotEqualTo(Integer value) {
            addCriterion("advice_category <>", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryGreaterThan(Integer value) {
            addCriterion("advice_category >", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("advice_category >=", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryLessThan(Integer value) {
            addCriterion("advice_category <", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("advice_category <=", value, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryIn(List<Integer> values) {
            addCriterion("advice_category in", values, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNotIn(List<Integer> values) {
            addCriterion("advice_category not in", values, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryBetween(Integer value1, Integer value2) {
            addCriterion("advice_category between", value1, value2, "adviceCategory");
            return (Criteria) this;
        }

        public Criteria andAdviceCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("advice_category not between", value1, value2, "adviceCategory");
            return (Criteria) this;
        }
        public Criteria andDescribesIsNull() {
            addCriterion("describes is null");
            return (Criteria) this;
        }

        public Criteria andDescribesIsNotNull() {
            addCriterion("describes is not null");
            return (Criteria) this;
        }

        public Criteria andDescribesEqualTo(String value) {
            addCriterion("describes =", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotEqualTo(String value) {
            addCriterion("describes <>", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThan(String value) {
            addCriterion("describes >", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesGreaterThanOrEqualTo(String value) {
            addCriterion("describes >=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThan(String value) {
            addCriterion("describes <", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesLessThanOrEqualTo(String value) {
            addCriterion("describes <=", value, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesIn(List<String> values) {
            addCriterion("describes in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribesNotIn(List<String> values) {
            addCriterion("describes not in", values, "describes");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
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
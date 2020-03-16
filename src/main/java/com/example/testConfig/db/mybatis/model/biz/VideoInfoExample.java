package com.example.testConfig.db.mybatis.model.biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoInfoExample() {
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

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNull() {
            addCriterion("protocol is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("protocol is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(String value) {
            addCriterion("protocol =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(String value) {
            addCriterion("protocol <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(String value) {
            addCriterion("protocol >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("protocol >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(String value) {
            addCriterion("protocol <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(String value) {
            addCriterion("protocol <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLike(String value) {
            addCriterion("protocol like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotLike(String value) {
            addCriterion("protocol not like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<String> values) {
            addCriterion("protocol in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<String> values) {
            addCriterion("protocol not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(String value1, String value2) {
            addCriterion("protocol between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(String value1, String value2) {
            addCriterion("protocol not between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andStreamNameIsNull() {
            addCriterion("stream_name is null");
            return (Criteria) this;
        }

        public Criteria andStreamNameIsNotNull() {
            addCriterion("stream_name is not null");
            return (Criteria) this;
        }

        public Criteria andStreamNameEqualTo(String value) {
            addCriterion("stream_name =", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameNotEqualTo(String value) {
            addCriterion("stream_name <>", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameGreaterThan(String value) {
            addCriterion("stream_name >", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameGreaterThanOrEqualTo(String value) {
            addCriterion("stream_name >=", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameLessThan(String value) {
            addCriterion("stream_name <", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameLessThanOrEqualTo(String value) {
            addCriterion("stream_name <=", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameLike(String value) {
            addCriterion("stream_name like", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameNotLike(String value) {
            addCriterion("stream_name not like", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameIn(List<String> values) {
            addCriterion("stream_name in", values, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameNotIn(List<String> values) {
            addCriterion("stream_name not in", values, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameBetween(String value1, String value2) {
            addCriterion("stream_name between", value1, value2, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameNotBetween(String value1, String value2) {
            addCriterion("stream_name not between", value1, value2, "streamName");
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

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andPubUrlIsNull() {
            addCriterion("pub_url is null");
            return (Criteria) this;
        }

        public Criteria andPubUrlIsNotNull() {
            addCriterion("pub_url is not null");
            return (Criteria) this;
        }

        public Criteria andPubUrlEqualTo(String value) {
            addCriterion("pub_url =", value, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlNotEqualTo(String value) {
            addCriterion("pub_url <>", value, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlGreaterThan(String value) {
            addCriterion("pub_url >", value, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pub_url >=", value, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlLessThan(String value) {
            addCriterion("pub_url <", value, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlLessThanOrEqualTo(String value) {
            addCriterion("pub_url <=", value, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlLike(String value) {
            addCriterion("pub_url like", value, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlNotLike(String value) {
            addCriterion("pub_url not like", value, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlIn(List<String> values) {
            addCriterion("pub_url in", values, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlNotIn(List<String> values) {
            addCriterion("pub_url not in", values, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlBetween(String value1, String value2) {
            addCriterion("pub_url between", value1, value2, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andPubUrlNotBetween(String value1, String value2) {
            addCriterion("pub_url not between", value1, value2, "pubUrl");
            return (Criteria) this;
        }

        public Criteria andSourceAddrIsNull() {
            addCriterion("source_addr is null");
            return (Criteria) this;
        }

        public Criteria andSourceAddrIsNotNull() {
            addCriterion("source_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSourceAddrEqualTo(String value) {
            addCriterion("source_addr =", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrNotEqualTo(String value) {
            addCriterion("source_addr <>", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrGreaterThan(String value) {
            addCriterion("source_addr >", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("source_addr >=", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrLessThan(String value) {
            addCriterion("source_addr <", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrLessThanOrEqualTo(String value) {
            addCriterion("source_addr <=", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrLike(String value) {
            addCriterion("source_addr like", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrNotLike(String value) {
            addCriterion("source_addr not like", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrIn(List<String> values) {
            addCriterion("source_addr in", values, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrNotIn(List<String> values) {
            addCriterion("source_addr not in", values, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrBetween(String value1, String value2) {
            addCriterion("source_addr between", value1, value2, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrNotBetween(String value1, String value2) {
            addCriterion("source_addr not between", value1, value2, "sourceAddr");
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

        public Criteria andProjectGuidIsNull() {
            addCriterion("project_guid is null");
            return (Criteria) this;
        }

        public Criteria andProjectGuidIsNotNull() {
            addCriterion("project_guid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGuidEqualTo(String value) {
            addCriterion("project_guid =", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotEqualTo(String value) {
            addCriterion("project_guid <>", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidGreaterThan(String value) {
            addCriterion("project_guid >", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidGreaterThanOrEqualTo(String value) {
            addCriterion("project_guid >=", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLessThan(String value) {
            addCriterion("project_guid <", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLessThanOrEqualTo(String value) {
            addCriterion("project_guid <=", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidLike(String value) {
            addCriterion("project_guid like", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotLike(String value) {
            addCriterion("project_guid not like", value, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidIn(List<String> values) {
            addCriterion("project_guid in", values, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotIn(List<String> values) {
            addCriterion("project_guid not in", values, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidBetween(String value1, String value2) {
            addCriterion("project_guid between", value1, value2, "projectGuid");
            return (Criteria) this;
        }

        public Criteria andProjectGuidNotBetween(String value1, String value2) {
            addCriterion("project_guid not between", value1, value2, "projectGuid");
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

        public Criteria andZoneGuidIsNull() {
            addCriterion("zone_guid is null");
            return (Criteria) this;
        }

        public Criteria andZoneGuidIsNotNull() {
            addCriterion("zone_guid is not null");
            return (Criteria) this;
        }

        public Criteria andZoneGuidEqualTo(String value) {
            addCriterion("zone_guid =", value, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidNotEqualTo(String value) {
            addCriterion("zone_guid <>", value, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidGreaterThan(String value) {
            addCriterion("zone_guid >", value, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidGreaterThanOrEqualTo(String value) {
            addCriterion("zone_guid >=", value, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidLessThan(String value) {
            addCriterion("zone_guid <", value, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidLessThanOrEqualTo(String value) {
            addCriterion("zone_guid <=", value, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidLike(String value) {
            addCriterion("zone_guid like", value, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidNotLike(String value) {
            addCriterion("zone_guid not like", value, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidIn(List<String> values) {
            addCriterion("zone_guid in", values, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidNotIn(List<String> values) {
            addCriterion("zone_guid not in", values, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidBetween(String value1, String value2) {
            addCriterion("zone_guid between", value1, value2, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneGuidNotBetween(String value1, String value2) {
            addCriterion("zone_guid not between", value1, value2, "zoneGuid");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNull() {
            addCriterion("zone_name is null");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNotNull() {
            addCriterion("zone_name is not null");
            return (Criteria) this;
        }

        public Criteria andZoneNameEqualTo(String value) {
            addCriterion("zone_name =", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotEqualTo(String value) {
            addCriterion("zone_name <>", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThan(String value) {
            addCriterion("zone_name >", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("zone_name >=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThan(String value) {
            addCriterion("zone_name <", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThanOrEqualTo(String value) {
            addCriterion("zone_name <=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLike(String value) {
            addCriterion("zone_name like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotLike(String value) {
            addCriterion("zone_name not like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameIn(List<String> values) {
            addCriterion("zone_name in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotIn(List<String> values) {
            addCriterion("zone_name not in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameBetween(String value1, String value2) {
            addCriterion("zone_name between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotBetween(String value1, String value2) {
            addCriterion("zone_name not between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidIsNull() {
            addCriterion("place_guid is null");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidIsNotNull() {
            addCriterion("place_guid is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidEqualTo(String value) {
            addCriterion("place_guid =", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidNotEqualTo(String value) {
            addCriterion("place_guid <>", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidGreaterThan(String value) {
            addCriterion("place_guid >", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidGreaterThanOrEqualTo(String value) {
            addCriterion("place_guid >=", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidLessThan(String value) {
            addCriterion("place_guid <", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidLessThanOrEqualTo(String value) {
            addCriterion("place_guid <=", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidLike(String value) {
            addCriterion("place_guid like", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidNotLike(String value) {
            addCriterion("place_guid not like", value, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidIn(List<String> values) {
            addCriterion("place_guid in", values, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidNotIn(List<String> values) {
            addCriterion("place_guid not in", values, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidBetween(String value1, String value2) {
            addCriterion("place_guid between", value1, value2, "placeGuid");
            return (Criteria) this;
        }

        public Criteria andPlaceGuidNotBetween(String value1, String value2) {
            addCriterion("place_guid not between", value1, value2, "placeGuid");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPubTokenIsNull() {
            addCriterion("pub_token is null");
            return (Criteria) this;
        }

        public Criteria andPubTokenIsNotNull() {
            addCriterion("pub_token is not null");
            return (Criteria) this;
        }

        public Criteria andPubTokenEqualTo(String value) {
            addCriterion("pub_token =", value, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenNotEqualTo(String value) {
            addCriterion("pub_token <>", value, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenGreaterThan(String value) {
            addCriterion("pub_token >", value, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenGreaterThanOrEqualTo(String value) {
            addCriterion("pub_token >=", value, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenLessThan(String value) {
            addCriterion("pub_token <", value, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenLessThanOrEqualTo(String value) {
            addCriterion("pub_token <=", value, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenLike(String value) {
            addCriterion("pub_token like", value, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenNotLike(String value) {
            addCriterion("pub_token not like", value, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenIn(List<String> values) {
            addCriterion("pub_token in", values, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenNotIn(List<String> values) {
            addCriterion("pub_token not in", values, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenBetween(String value1, String value2) {
            addCriterion("pub_token between", value1, value2, "pubToken");
            return (Criteria) this;
        }

        public Criteria andPubTokenNotBetween(String value1, String value2) {
            addCriterion("pub_token not between", value1, value2, "pubToken");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
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
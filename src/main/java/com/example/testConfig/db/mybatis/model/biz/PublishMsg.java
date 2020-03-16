package com.example.testConfig.db.mybatis.model.biz;

public class PublishMsg {
    private String id;

    private Integer msgType;

    private String msgTitle;

    private Long beginTime;

    private Long endTime;

    private Long publishTime;

    private Integer publishState;

    private Integer systemAdvice;

    private Integer channelAdvice;

    private Integer projectAdvice;

    private Integer msgLevel;

    private String creater;
    
    private String createrId;

    private Long createTime;

    private Long modifyTime;

    private String content;
    private String annexPath;
    
    private Integer msgFrom;
    
    private Integer adviceCategory;
    
    private String describes;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getPublishState() {
        return publishState;
    }

    public void setPublishState(Integer publishState) {
        this.publishState = publishState;
    }

    public Integer getSystemAdvice() {
        return systemAdvice;
    }

    public void setSystemAdvice(Integer systemAdvice) {
        this.systemAdvice = systemAdvice;
    }

    public Integer getChannelAdvice() {
        return channelAdvice;
    }

    public void setChannelAdvice(Integer channelAdvice) {
        this.channelAdvice = channelAdvice;
    }

    public Integer getProjectAdvice() {
        return projectAdvice;
    }

    public void setProjectAdvice(Integer projectAdvice) {
        this.projectAdvice = projectAdvice;
    }

    public Integer getMsgLevel() {
        return msgLevel;
    }

    public void setMsgLevel(Integer msgLevel) {
        this.msgLevel = msgLevel;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	public String getCreaterId() {
		return createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	public String getAnnexPath() {
		return annexPath;
	}

	public void setAnnexPath(String annexPath) {
		this.annexPath = annexPath;
	}

	public Integer getMsgFrom() {
		return msgFrom;
	}

	public void setMsgFrom(Integer msgFrom) {
		this.msgFrom = msgFrom;
	}

	public Integer getAdviceCategory() {
		return adviceCategory;
	}

	public void setAdviceCategory(Integer adviceCategory) {
		this.adviceCategory = adviceCategory;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}
    
    
}
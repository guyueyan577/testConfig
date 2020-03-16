package com.example.testConfig.db.mybatis.model.biz;

public class MessagePermissionScope {
    private String id;

    private String messageId;

    private String bindingRelation;

    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public String getBindingRelation() {
        return bindingRelation;
    }

    public void setBindingRelation(String bindingRelation) {
        this.bindingRelation = bindingRelation == null ? null : bindingRelation.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
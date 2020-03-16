package com.example.testConfig.db.mybatis.model.biz;

import java.util.List;

public class HiddenRecord {
    private String id;

    private String title;

    private String projectId;

    private String projectName;

    private String principalUserId;

    private String principalUserName;

    private Integer principalUserRole;

    private String adapterName;

    private String deviceId;
    
    private String hiddenAddress;

    private String deviceTypeName;

    private String patrolTaskId;

    private Integer sourceCode;

    private String description;

    private Integer hiddenLevel;

    private String createUserId;

    private String createUserName;

    private String processUser;

    private String processUserName;

    private Long processTime;

    private Integer processResult;

    private Long createTime;

    private Double gcj02Latitude;

    private Double gcj02Longitude;

    private Double wgs84Latitude;

    private Double wgs84Longitude;

    private String areaId;

    private String placeId;

    private String placeName;
    
    private String userId;
    
    private String taskPointId;
    
    private String patrolPointName;
    
    private List<String> projectIdLists;
    
    private List<String> bindingIdList;
    
    /**
     * 分配顺序 (1项目 234片区 5场所)
     */
    private Integer orderNumber;
    
    
    private List<Integer> sourceCodeList;
	
	private List<Integer> hiddenLevelList;
	
	private List<Integer> processResultList;
    
    
	 
    public List<Integer> getSourceCodeList() {
		return sourceCodeList;
	}

	public void setSourceCodeList(List<Integer> sourceCodeList) {
		this.sourceCodeList = sourceCodeList;
	}

	public List<Integer> getHiddenLevelList() {
		return hiddenLevelList;
	}

	public void setHiddenLevelList(List<Integer> hiddenLevelList) {
		this.hiddenLevelList = hiddenLevelList;
	}

	public List<Integer> getProcessResultList() {
		return processResultList;
	}

	public void setProcessResultList(List<Integer> processResultList) {
		this.processResultList = processResultList;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}


	public List<String> getBindingIdList() {
		return bindingIdList;
	}

	public void setBindingIdList(List<String> bindingIdList) {
		this.bindingIdList = bindingIdList;
	}

	public String getTaskPointId() {
		return taskPointId;
	}

	public void setTaskPointId(String taskPointId) {
		this.taskPointId = taskPointId;
	}

	public String getPatrolPointName() {
		return patrolPointName;
	}

	public void setPatrolPointName(String patrolPointName) {
		this.patrolPointName = patrolPointName;
	}

	public List<String> getProjectIdLists() {
		return projectIdLists;
	}

	public void setProjectIdLists(List<String> projectIdLists) {
		this.projectIdLists = projectIdLists;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHiddenAddress() {
		return hiddenAddress;
	}

	public void setHiddenAddress(String hiddenAddress) {
		this.hiddenAddress = hiddenAddress;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getPrincipalUserId() {
        return principalUserId;
    }

    public void setPrincipalUserId(String principalUserId) {
        this.principalUserId = principalUserId == null ? null : principalUserId.trim();
    }

    public String getPrincipalUserName() {
        return principalUserName;
    }

    public void setPrincipalUserName(String principalUserName) {
        this.principalUserName = principalUserName == null ? null : principalUserName.trim();
    }

    public Integer getPrincipalUserRole() {
        return principalUserRole;
    }

    public void setPrincipalUserRole(Integer principalUserRole) {
        this.principalUserRole = principalUserRole;
    }

    public String getAdapterName() {
        return adapterName;
    }

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName == null ? null : adapterName.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName == null ? null : deviceTypeName.trim();
    }

    public String getPatrolTaskId() {
        return patrolTaskId;
    }

    public void setPatrolTaskId(String patrolTaskId) {
        this.patrolTaskId = patrolTaskId == null ? null : patrolTaskId.trim();
    }

    public Integer getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(Integer sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getHiddenLevel() {
        return hiddenLevel;
    }

    public void setHiddenLevel(Integer hiddenLevel) {
        this.hiddenLevel = hiddenLevel;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public String getProcessUser() {
        return processUser;
    }

    public void setProcessUser(String processUser) {
        this.processUser = processUser == null ? null : processUser.trim();
    }

    public String getProcessUserName() {
        return processUserName;
    }

    public void setProcessUserName(String processUserName) {
        this.processUserName = processUserName == null ? null : processUserName.trim();
    }

    public Long getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Long processTime) {
        this.processTime = processTime;
    }

    public Integer getProcessResult() {
        return processResult;
    }

    public void setProcessResult(Integer processResult) {
        this.processResult = processResult;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Double getGcj02Latitude() {
        return gcj02Latitude;
    }

    public void setGcj02Latitude(Double gcj02Latitude) {
        this.gcj02Latitude = gcj02Latitude;
    }

    public Double getGcj02Longitude() {
        return gcj02Longitude;
    }

    public void setGcj02Longitude(Double gcj02Longitude) {
        this.gcj02Longitude = gcj02Longitude;
    }

    public Double getWgs84Latitude() {
        return wgs84Latitude;
    }

    public void setWgs84Latitude(Double wgs84Latitude) {
        this.wgs84Latitude = wgs84Latitude;
    }

    public Double getWgs84Longitude() {
        return wgs84Longitude;
    }

    public void setWgs84Longitude(Double wgs84Longitude) {
        this.wgs84Longitude = wgs84Longitude;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId == null ? null : placeId.trim();
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }
}
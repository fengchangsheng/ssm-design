package com.lugi.common.model;

import java.util.UUID;

/**
 * 抽象的实体条件类型
 */
@SuppressWarnings("serial")
public class AbstractCriteria implements java.io.Serializable{
	/**
     * 为当前登录的用户标识ID，此属性为系统数据过滤为主要条件，暂时替代为随机数
     */
    public Long getCurrentAuthUserId() {
        return UUID.randomUUID().timestamp();
    }
    
    private Long currentCommunityId;

    public Long getCurrentCommunityId() {
        return currentCommunityId;
    }

    public void setCurrentCommunityId(Long currentCommunityId) {
        this.currentCommunityId = currentCommunityId;
    }
    
    public Long currentOrganId;

	public Long getCurrentOrganId() {
		return currentOrganId;
	}

	public void setCurrentOrganId(Long currentOrganId) {
		this.currentOrganId = currentOrganId;
	}
}

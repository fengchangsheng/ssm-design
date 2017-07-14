package com.lugi.common.model;

/**
 * 抽象的实体类
 */
@SuppressWarnings("serial")
public class AbstractModel implements java.io.Serializable {
	/**
	 * 版本控制
	 */
	private Integer version;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}

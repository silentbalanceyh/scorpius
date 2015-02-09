package com.sco.design.adapter;

import java.io.Serializable;

public class OLogModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1104202101366331998L;

	@Override
	public String toString() {
		return "OLogModel [logContent=" + logContent + ", logId=" + logId
				+ ", operateTime=" + operateTime + ", operateUser="
				+ operateUser + "]";
	}

	private String logId;
	
	private String operateUser;
	
	private String operateTime;
	
	private String logContent;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}
}

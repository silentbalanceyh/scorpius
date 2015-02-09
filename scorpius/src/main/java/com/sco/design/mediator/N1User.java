package com.sco.design.mediator;

public class N1User {
	private String userId;
	private String userName;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public boolean dimission(){
		N1DepUserMediatorImpl mediator = N1DepUserMediatorImpl.getInstance();
		mediator.deleteUser(userId);
		
		return true;
	}
}

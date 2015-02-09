package com.sco.design.mediator;

public class N1Dep {
	private String depId;
	
	private String depName;

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	public boolean deleteDep(){
		N1DepUserMediatorImpl mediator =
			N1DepUserMediatorImpl.getInstance();
		mediator.deleteDep(depId);
		return true;
	}
}

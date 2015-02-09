package com.sco.design.mediator;

public abstract class SColleague {
	private SMediator mediator;
	
	public SColleague(SMediator mediator){
		this.mediator = mediator;
	}
	
	public SMediator getMediator(){
		return this.mediator;
	}
}

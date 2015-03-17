package com.sco.design.mediator;

public class SConcreteColleagueB extends SColleague{
	public SConcreteColleagueB(SMediator mediator){
		super(mediator);
	}
	
	public void someOperation(){
		getMediator().changed(this);
	}
}

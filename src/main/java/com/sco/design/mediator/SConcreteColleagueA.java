package com.sco.design.mediator;

public class SConcreteColleagueA extends SColleague{

	public SConcreteColleagueA(SMediator mediator) {
		super(mediator);
	}
	
	public void someOperation(){
		getMediator().changed(this);
	}
}

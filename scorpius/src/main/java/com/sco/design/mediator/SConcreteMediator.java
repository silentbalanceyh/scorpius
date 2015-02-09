package com.sco.design.mediator;

public class SConcreteMediator implements SMediator{

	@SuppressWarnings("unused")
	private SConcreteColleagueA colleagueA;
	
	@SuppressWarnings("unused")
	private SConcreteColleagueB colleagueB;
	
	public void setColleagueA(SConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}

	public void setColleagueB(SConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}

	public void changed(SColleague colleague) {
		
	}

}
